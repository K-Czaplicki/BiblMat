package MathLibrary;

import java.math.BigDecimal;
import java.math.MathContext;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BigMatrix implements Iterable<BigDecimal[]> {
    private BigDecimal[][] data;

    @FunctionalInterface
    public interface BigDecimalFunction {
        BigDecimal apply(BigDecimal number);
    }

    public Iterator<BigDecimal[]> iterator() {
        return new BigMatrix.CustomIterator();
    }

    class CustomIterator implements Iterator<BigDecimal[]> {
        int current = 0;

        public boolean hasNext() {
            return current < data.length;
        }

        public BigDecimal[] next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[current++];
        }
    }

    public boolean equals(BigMatrix matrix) {
        return equals(this, matrix);
    }

    public static boolean equals(BigMatrix matrix1, BigMatrix matrix2) {
        if (matrix1.getNumCols() != matrix2.getNumCols() || matrix1.getNumRows() != matrix2.getNumRows())
            return false;
        for (int i = 0; i < matrix1.getNumRows(); i++)
            for (int j = 0; j < matrix1.getNumCols(); j++)
                if (matrix1.get(i, j).compareTo(matrix2.get(i, j)) != 0)
                    return false;
        return true;
    }

    public static boolean equals(BigMatrix matrix1, BigMatrix matrix2, double err) {
        if (matrix1.getNumCols() != matrix2.getNumCols() || matrix1.getNumRows() != matrix2.getNumRows())
            return false;
        for (int i = 0; i < matrix1.getNumRows(); i++)
            for (int j = 0; j < matrix1.getNumCols(); j++)
                if (matrix1.get(i, j).subtract(matrix2.get(i, j)).abs().compareTo(BigDecimal.valueOf(err)) > 0)
                    return false;
        return true;
    }

    public boolean equals(BigMatrix matrix, double err) {
        return equals(this, matrix, err);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.getNumRows(); i++) {
            for (int j = 0; j < this.getNumCols(); j++) {
                stringBuilder.append(this.getData()[i][j]);
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public BigMatrix(BigDecimal[][] data) throws NullPointerException, ArithmeticException {
        if (data == null || data.length == 0 || data[0] == null || data[0].length == 0)
            throw new NullPointerException("Cannot create matrix with width or height equal zero");
        this.data = new BigDecimal[data.length][data[0].length];
        for (BigDecimal[] one : data) {
            if (one == null)
                throw new ArithmeticException("One of elements is null");
            if (data[0].length != one.length)
                throw new ArithmeticException("Cannot create matrix of different length of rows");

            this.data = data;
        }
    }

    public void set(Integer row, Integer col, BigDecimal value) throws IndexOutOfBoundsException {
        if (row >= this.getNumRows() || col >= this.getNumCols() || col < 0 || row < 0)
            throw new IndexOutOfBoundsException("Index out of bound");
        data[row][col] = value;
    }

    public BigDecimal[][] getData() {
        return data;
    }

    public int getNumCols() {
        return data[0].length;
    }

    public int getNumRows() {
        return data.length;
    }

    public BigDecimal get(int i, int j) throws IndexOutOfBoundsException {
        if (i < this.getNumRows() && j < this.getNumCols() && i >= 0 && j >= 0)
            return data[i][j];
        else
            throw new IndexOutOfBoundsException("Index is out of range");
    }

    @SuppressWarnings("unused")
    public BigDecimal get(BigMatrix matrix, int i, int j) throws IndexOutOfBoundsException {
        return matrix.get(i, j);
    }

    public void add(BigMatrix matrix) throws ArithmeticException {
        data = add(this, matrix).getData();
    }

    public void subtract(BigMatrix matrix) throws ArithmeticException {
        data = subtract(this, matrix).getData();
    }

    public void multiplyByScalar(BigDecimal scalar) throws ArithmeticException {
        data = multiplyByScalar(this, scalar).getData();
    }

    public void multiply(BigMatrix matrix) throws ArithmeticException {
        data = multiply(this, matrix).getData();
    }

    public BigDecimal determinant() throws ArithmeticException {
        return determinant(this);
    }

    public BigDecimal trace() throws ArithmeticException {
        return trace(this);
    }

    public void transpose() throws ArithmeticException {
        data = transpose(this).getData();
    }

    public void inverse() throws ArithmeticException {
        data = inverse(this).getData();
    }

    public void minor(int rowToBeExcluded, int columnToBeExcluded) throws IndexOutOfBoundsException {
        data = minor(this, rowToBeExcluded, columnToBeExcluded).getData();
    }

    public void algebraicComplement() throws ArithmeticException {
        data = algebraicComplement(this).getData();
    }

    @SuppressWarnings("unused")
    public void set(BigMatrix matrix, Integer row, Integer col, BigDecimal value) throws IndexOutOfBoundsException {
        matrix.set(row, col, value);
    }

    public static BigMatrix add(BigMatrix matrix1, BigMatrix matrix2) throws ArithmeticException {
        if (matrix1.getNumRows() == matrix2.getNumRows() && matrix1.getNumCols() == matrix2.getNumCols()) {
            BigDecimal[][] result = new BigDecimal[matrix1.getNumRows()][matrix1.getNumCols()];
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix1.getNumCols(); j++) {
                    result[i][j] = matrix1.get(i, j).add(matrix2.get(i, j));
                }
            }
            return new BigMatrix(result);
        } else
            throw new ArithmeticException("Cannot add : matrices height and width are different");
    }

    public static BigMatrix subtract(BigMatrix matrix1, BigMatrix matrix2) throws ArithmeticException {
        if (matrix1.getNumRows() == matrix2.getNumRows() && matrix1.getNumCols() == matrix2.getNumCols()) {
            BigDecimal[][] result = new BigDecimal[matrix1.getNumRows()][matrix1.getNumCols()];
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix1.getNumCols(); j++) {
                    result[i][j] = matrix1.get(i, j).subtract(matrix2.get(i, j));
                }
            }
            return new BigMatrix(result);
        } else
            throw new ArithmeticException("Cannot subtract : matrices height and width are different");
    }

    public static BigMatrix multiplyByScalar(BigMatrix matrix, BigDecimal scalar) throws ArithmeticException {
        BigDecimal[][] result = new BigDecimal[matrix.getNumRows()][matrix.getNumCols()];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                result[i][j] = (matrix.get(i, j).multiply(scalar));
            }
        }
        return new BigMatrix(result);
    }

    public static BigMatrix multiply(BigMatrix matrix1, BigMatrix matrix2) throws ArithmeticException {
        if (matrix1.getNumCols() == matrix2.getNumRows()) {
            BigDecimal[][] result = new BigDecimal[matrix1.getNumRows()][matrix2.getNumCols()];
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix2.getNumCols(); j++) {
                    result[i][j] = BigDecimal.valueOf(0.0);
                    for (int k = 0; k < matrix1.getNumCols(); k++) {
                        result[i][j] = result[i][j].add(matrix1.get(i, k).multiply(matrix2.get(k, j)));
                    }
                }
            }
            return new BigMatrix(result);
        } else
            throw new ArithmeticException("Cannot multiply : the number of rows in matrix 2 is unequal to the number of columns in matrix 1 ");
    }

    public static BigDecimal determinant(BigMatrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols()) {
            BigDecimal result = BigDecimal.valueOf(0.0);
            if (matrix.getNumRows() == 1) {
                result = matrix.get(0, 0);
            } else if (matrix.getNumRows() == 2) {
                result = matrix.get(0, 0).multiply(matrix.get(1, 1)).subtract(matrix.get(0, 1).multiply(matrix.get(1, 0)));
            } else {
                for (int i = 0; i < matrix.getNumRows(); i++) {
                    result = result.add(matrix.get(0, i).multiply(determinant(minor(matrix, 0, i))).multiply(BigDecimal.valueOf(Math.pow(-1, i))));
                }
            }
            return result;
        } else {
            throw new ArithmeticException("Cannot calculate the determinant: matrix is not n by n ");
        }
    }

    public static BigMatrix minor(BigMatrix matrix, int rowToBeExcluded, int columnToBeExcluded) throws IndexOutOfBoundsException {
        if (rowToBeExcluded < matrix.getNumRows() && columnToBeExcluded < matrix.getNumCols()) {
            BigDecimal[][] minor = new BigDecimal[matrix.getNumRows() - 1][matrix.getNumCols() - 1];
            for (int i = 0; i < matrix.getNumRows(); i++) {
                for (int j = 0; j < matrix.getNumCols(); j++) {
                    if (i != rowToBeExcluded && j != columnToBeExcluded) {
                        if (i < rowToBeExcluded) {
                            if (j < columnToBeExcluded)
                                minor[i][j] = matrix.getData()[i][j];
                            else
                                minor[i][j - 1] = matrix.getData()[i][j];
                        } else {
                            if (j < columnToBeExcluded)
                                minor[i - 1][j] = matrix.getData()[i][j];
                            else
                                minor[i - 1][j - 1] = matrix.getData()[i][j];
                        }
                    }
                }
            }
            return new BigMatrix(minor);
        } else {
            throw new IndexOutOfBoundsException("Cannot create a minor: row or column to be excluded is out of bounds");
        }
    }

    public static BigDecimal trace(BigMatrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols()) {
            BigDecimal result = BigDecimal.valueOf(0);
            for (int i = 0; i < matrix.getNumRows(); i++)
                result = result.add(matrix.get(i, i));
            return result;
        } else
            throw new ArithmeticException("Cannot calculate the trace: matrix is not n by n");

    }

    public static BigMatrix transpose(BigMatrix matrix) {
        BigDecimal[][] result = new BigDecimal[matrix.getNumCols()][matrix.getNumRows()];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                result[j][i] = matrix.get(i, j);
            }
        }
        return new BigMatrix(result);
    }

    public static BigMatrix inverse(BigMatrix matrix) throws ArithmeticException {
        MathContext mc = new MathContext(50);
        if (matrix.getNumRows() == matrix.getNumCols() && determinant(matrix).compareTo(BigDecimal.valueOf(0)) != 0)
            return multiplyByScalar(transpose(algebraicComplement(matrix)), BigDecimal.valueOf(1).divide(determinant(matrix), mc));
        else
            throw new ArithmeticException("Cannot inverse matrix: the determinant is equal to 0");
    }

    public static BigMatrix algebraicComplement(BigMatrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols()) {
            BigDecimal[][] result = new BigDecimal[matrix.getNumRows()][matrix.getNumCols()];
            for (int i = 0; i < matrix.getNumRows(); i++) {
                for (int j = 0; j < matrix.getNumCols(); j++) {
                    result[i][j] = BigDecimal.valueOf(Math.pow(-1.0, i + j + 2)).multiply(determinant(minor(matrix, i, j)));
                }
            }
            return new BigMatrix(result);
        } else
            throw new ArithmeticException("Cannot calculate algebraic complement: matrix is not n by n");
    }

    public static BigMatrix removeCol(BigMatrix matrix, Integer columnToBeExcluded) throws IndexOutOfBoundsException {
        if (columnToBeExcluded >= matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot create a minor: column to be excluded is out of bounds");
        BigDecimal[][] minor = new BigDecimal[matrix.getData().length][matrix.getData()[0].length - 1];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                if (j < columnToBeExcluded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (j > columnToBeExcluded)
                    minor[i][j - 1] = matrix.getData()[i][j];
            }
        }
        return new BigMatrix(minor);
    }

    public void removeCol(Integer colToBeExcluded) throws IndexOutOfBoundsException {
        this.data = removeCol(this, colToBeExcluded).getData();
    }

    public static BigMatrix removeRow(BigMatrix matrix, Integer rowToBeExcluded) throws IndexOutOfBoundsException {
        if (rowToBeExcluded >= matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot create a minor: row to be excluded is out of bounds");
        BigDecimal[][] minor = new BigDecimal[matrix.getData().length - 1][matrix.getData()[0].length];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                if (i < rowToBeExcluded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (i > rowToBeExcluded)
                    minor[i - 1][j] = matrix.getData()[i][j];
            }
        }
        return new BigMatrix(minor);
    }

    public void removeRow(Integer rowToBeExcluded) throws IndexOutOfBoundsException {
        this.data = removeRow(this, rowToBeExcluded).getData();
    }

    public static BigDecimal sumOfElements(BigMatrix matrix) {
        BigDecimal sum = BigDecimal.valueOf(0.0);
        for (BigDecimal[] row : matrix.getData()) {
            for (BigDecimal element : row) {
                sum = sum.add(element);
            }
        }
        return sum;
    }

    public BigDecimal sumOfElements() {
        return sumOfElements(this);
    }

    public static BigMatrix addCol(BigMatrix matrix, Integer columnToBeAdded) throws IndexOutOfBoundsException {
        if (columnToBeAdded > matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot add a column: inappropriate index");
        BigDecimal[][] minor = new BigDecimal[matrix.getData().length][matrix.getData()[0].length + 1];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols() + 1; j++) {
                if (j < columnToBeAdded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (j > columnToBeAdded)
                    minor[i][j] = matrix.getData()[i][j - 1];
                else
                    minor[i][j] = BigDecimal.valueOf(0.0);
            }
        }
        return new BigMatrix(minor);
    }

    public void addCol(Integer colToBeAdded) throws IndexOutOfBoundsException {
        this.data = BigMatrix.addCol(this, colToBeAdded).getData();
    }

    public static BigMatrix addRow(BigMatrix matrix, Integer rowToBeAdded) throws IndexOutOfBoundsException {
        if (rowToBeAdded > matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot add a column: inappropriate index");
        BigDecimal[][] minor = new BigDecimal[matrix.getData().length + 1][matrix.getData()[0].length];
        for (int i = 0; i < matrix.getNumRows() + 1; i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                if (i < rowToBeAdded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (i > rowToBeAdded)
                    minor[i][j] = matrix.getData()[i - 1][j];
                else
                    minor[i][j] = BigDecimal.valueOf(0.0);
            }
        }
        return new BigMatrix(minor);
    }

    public void addRow(Integer rowToBeAdded) throws IndexOutOfBoundsException {
        this.data = BigMatrix.addRow(this, rowToBeAdded).getData();
    }

    @SuppressWarnings("unused")
    public static BigMatrix getRandomMatrix(Integer x, Integer y) {
        SecureRandom rand = new SecureRandom();
        BigDecimal[][] random = new BigDecimal[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                random[i][j] = BigDecimal.valueOf(rand.nextDouble());
            }
        }
        return new BigMatrix(random);
    }

    public void useOperation(BigDecimalFunction operation) {
        for (int i = 0; i < this.getNumRows(); i++) {
            for (int j = 0; j < this.getNumCols(); j++) {
                data[i][j] = operation.apply(data[i][j]);
            }
        }
    }

    public static BigMatrix useOperation(BigMatrix matrix, BigDecimalFunction operation) {
        BigDecimal[][] data = new BigDecimal[matrix.getNumRows()][matrix.getNumCols()];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                data[i][j] = operation.apply(matrix.get(i, j));
            }
        }
        return new BigMatrix(data);
    }

}

