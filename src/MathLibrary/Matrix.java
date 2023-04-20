package MathLibrary;

import java.security.SecureRandom;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.DoubleFunction;

public class Matrix implements Iterable<Double[]> {
    private Double[][] data;

    public Iterator<Double[]> iterator() {
        return new Matrix.CustomIterator();
    }

    class CustomIterator implements Iterator<Double[]> {
        int current = 0;

        public boolean hasNext() {
            return current < data.length;
        }

        public Double[] next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[current++];
        }
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

    public boolean equals(Matrix matrix) {
        return equals(this, matrix);
    }

    public boolean equals(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getNumCols() != matrix2.getNumCols() || matrix1.getNumRows() != matrix2.getNumRows())
            return false;
        for (int i = 0; i < matrix1.getNumRows(); i++)
            for (int j = 0; j < matrix1.getNumCols(); j++)
                if (matrix1.get(i, j).compareTo(matrix2.get(i, j)) != 0)
                    return false;
        return true;
    }

    public boolean equals(Matrix matrix, double err) {
        return equals(this, matrix, err);
    }

    public boolean equals(Matrix matrix1, Matrix matrix2, double err) {
        if (matrix1.getNumCols() != matrix2.getNumCols() || matrix1.getNumRows() != matrix2.getNumRows())
            return false;
        for (int i = 0; i < matrix1.getNumRows(); i++)
            for (int j = 0; j < matrix1.getNumCols(); j++)
                if (Math.abs(matrix1.get(i, j) - matrix2.get(i, j)) > err)
                    return false;
        return true;
    }

    public <N extends Number> Matrix(N[][] data) throws NullPointerException, ArithmeticException {
        if (data == null || data.length == 0 || data[0] == null || data[0].length == 0)
            throw new NullPointerException("Cannot create matrix with width or height equal zero");
        this.data = new Double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null)
                throw new ArithmeticException("One of elements is null");
            if (data[i].length != data[0].length)
                throw new ArithmeticException("Cannot create matrix of different length of rows");

            for (int j = 0; j < data[i].length; j++) {
                this.data[i][j] = data[i][j].doubleValue();
            }
        }
    }

    public static Matrix getRandomMatrix(Integer x, Integer y) {
        SecureRandom rand = new SecureRandom();
        Double[][] random = new Double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                random[i][j] = rand.nextDouble();
            }
        }
        return new Matrix(random);
    }

    public <N extends Number> void set(Integer row, Integer col, N value) throws IndexOutOfBoundsException {
        if (row >= this.getNumRows() || col >= this.getNumCols() || col < 0 || row < 0)
            throw new IndexOutOfBoundsException("Index out of bound");
        data[row][col] = value.doubleValue();
    }

    public Double[][] getData() {
        return data;
    }

    public int getNumCols() {
        return data[0].length;
    }

    public int getNumRows() {
        return data.length;
    }

    public Double get(int i, int j) throws IndexOutOfBoundsException {
        if (i < this.getNumRows() && j < this.getNumCols() && i >= 0 && j >= 0)
            return data[i][j];
        else
            throw new IndexOutOfBoundsException("Index is out of range");
    }

    @SuppressWarnings("unused")
    public Double get(Matrix matrix, int i, int j) throws IndexOutOfBoundsException {
        return matrix.get(i, j);
    }

    public void add(Matrix matrix) throws ArithmeticException {
        data = add(this, matrix).getData();
    }

    public void subtract(Matrix matrix) throws ArithmeticException {
        data = subtract(this, matrix).getData();
    }

    public <N extends Number> void multiplyByScalar(N scalar) throws ArithmeticException {
        data = multiplyByScalar(this, scalar).getData();
    }

    public void multiply(Matrix matrix) throws ArithmeticException {
        data = multiply(this, matrix).getData();
    }

    public Double determinant() throws ArithmeticException {
        return determinant(this);
    }

    public Double trace() throws ArithmeticException {
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
    public <N extends Number> void set(Matrix matrix, Integer row, Integer col, N value) throws IndexOutOfBoundsException {
        matrix.set(row, col, value);
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2) throws ArithmeticException {
        if (matrix1.getNumRows() == matrix2.getNumRows() && matrix1.getNumCols() == matrix2.getNumCols()) {
            Double[][] result = new Double[matrix1.getNumRows()][matrix1.getNumCols()];
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix1.getNumCols(); j++) {
                    result[i][j] = matrix1.get(i, j) + matrix2.get(i, j);
                }
            }
            return new Matrix(result);
        } else
            throw new ArithmeticException("Cannot add : matrices height and width are different");
    }

    public static Matrix subtract(Matrix matrix1, Matrix matrix2) throws ArithmeticException {
        if (matrix1.getNumRows() == matrix2.getNumRows() && matrix1.getNumCols() == matrix2.getNumCols()) {
            Double[][] result = new Double[matrix1.getNumRows()][matrix1.getNumCols()];
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix1.getNumCols(); j++) {
                    result[i][j] = matrix1.get(i, j) - matrix2.get(i, j);
                }
            }
            return new Matrix(result);
        } else
            throw new ArithmeticException("Cannot subtract : matrices height and width are different");
    }

    public static <N extends Number> Matrix multiplyByScalar(Matrix matrix, N scalar) throws ArithmeticException {
        Double[][] result = new Double[matrix.getNumRows()][matrix.getNumCols()];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                result[i][j] = (matrix.get(i, j) * scalar.doubleValue()) + 0.0;
            }
        }
        return new Matrix(result);
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2) throws ArithmeticException {
        if (matrix1.getNumCols() == matrix2.getNumRows()) {
            Double[][] result = new Double[matrix1.getNumRows()][matrix2.getNumCols()];
            for (int i = 0; i < matrix1.getNumRows(); i++) {
                for (int j = 0; j < matrix2.getNumCols(); j++) {
                    result[i][j] = 0.0;
                    for (int k = 0; k < matrix1.getNumCols(); k++) {
                        result[i][j] += matrix1.get(i, k) * matrix2.get(k, j);
                    }
                }
            }
            return new Matrix(result);
        } else
            throw new ArithmeticException("Cannot multiply : the number of rows in matrix 2 is unequal to the number of columns in matrix 1 ");
    }

    public static Double determinant(Matrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols()) {
            Double result = 0.0;
            if (matrix.getNumRows() == 1) {
                result = matrix.get(0, 0);
            } else if (matrix.getNumRows() == 2) {
                result = matrix.get(0, 0) * matrix.get(1, 1) - matrix.get(0, 1) * matrix.get(1, 0);
            } else {
                for (int i = 0; i < matrix.getNumRows(); i++) {
                    result += Math.pow(-1, i) * matrix.get(0, i) * determinant(minor(matrix, 0, i));
                }
            }
            return result;
        } else {
            throw new ArithmeticException("Cannot calculate the determinant: matrix is not n by n ");
        }
    }

    public static Matrix minor(Matrix matrix, int rowToBeExcluded, int columnToBeExcluded) throws IndexOutOfBoundsException {
        if (rowToBeExcluded < matrix.getNumRows() && columnToBeExcluded < matrix.getNumCols()) {
            Double[][] minor = new Double[matrix.getNumRows() - 1][matrix.getNumCols() - 1];
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
            return new Matrix(minor);
        } else {
            throw new IndexOutOfBoundsException("Cannot create a minor: row or column to be excluded is out of bounds");
        }
    }

    public static Double trace(Matrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols()) {
            Double result = 0.0;
            for (int i = 0; i < matrix.getNumRows(); i++)
                result += matrix.get(i, i);
            return result;
        } else
            throw new ArithmeticException("Cannot calculate the trace: matrix is not n by n");

    }

    public static Matrix transpose(Matrix matrix) {
        Double[][] result = new Double[matrix.getNumCols()][matrix.getNumRows()];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                result[j][i] = matrix.get(i, j);
            }
        }
        return new Matrix(result);
    }

    public static Matrix inverse(Matrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols() && determinant(matrix).compareTo(0.0) != 0)
            return multiplyByScalar(transpose(algebraicComplement(matrix)), 1 / determinant(matrix));
        else
            throw new ArithmeticException("Cannot inverse matrix: the determinant is equal to 0");
    }

    public static Matrix algebraicComplement(Matrix matrix) throws ArithmeticException {
        if (matrix.getNumRows() == matrix.getNumCols()) {
            Double[][] result = new Double[matrix.getNumRows()][matrix.getNumCols()];
            for (int i = 0; i < matrix.getNumRows(); i++) {
                for (int j = 0; j < matrix.getNumCols(); j++) {
                    result[i][j] = (Math.pow(-1.0, i + j + 2) * determinant(minor(matrix, i, j))) + 0.0;
                }
            }
            return new Matrix(result);
        } else
            throw new ArithmeticException("Cannot calculate algebraic complement: matrix is not n by n");
    }

    public static Matrix removeCol(Matrix matrix, Integer columnToBeExcluded) throws IndexOutOfBoundsException {
        if (columnToBeExcluded >= matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot create a minor: column to be excluded is out of bounds");
        Double[][] minor = new Double[matrix.getData().length][matrix.getData()[0].length - 1];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                if (j < columnToBeExcluded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (j > columnToBeExcluded)
                    minor[i][j - 1] = matrix.getData()[i][j];
            }
        }
        return new Matrix(minor);
    }

    public void removeCol(Integer colToBeExcluded) throws IndexOutOfBoundsException {
        this.data = removeCol(this, colToBeExcluded).getData();
    }

    public static Matrix removeRow(Matrix matrix, Integer rowToBeExcluded) throws IndexOutOfBoundsException {
        if (rowToBeExcluded >= matrix.getNumRows())
            throw new IndexOutOfBoundsException("Cannot create a minor: row to be excluded is out of bounds");
        Double[][] minor = new Double[matrix.getData().length - 1][matrix.getData()[0].length];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                if (i < rowToBeExcluded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (i > rowToBeExcluded)
                    minor[i - 1][j] = matrix.getData()[i][j];
            }
        }
        return new Matrix(minor);
    }

    public void removeRow(Integer rowToBeExcluded) throws IndexOutOfBoundsException {
        this.data = removeRow(this, rowToBeExcluded).getData();
    }

    public static Double sumOfElements(Matrix matrix) {
        double sum = 0.0;
        for (Double[] row : matrix.getData()) {
            for (Double element : row) {
                sum += element;
            }
        }
        return sum;
    }

    public Double sumOfElements() {
        return sumOfElements(this);
    }

    public static Matrix addCol(Matrix matrix, Integer columnToBeAdded) throws IndexOutOfBoundsException {
        if (columnToBeAdded > matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot add a column: inappropriate index");
        Double[][] minor = new Double[matrix.getData().length][matrix.getData()[0].length + 1];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols() + 1; j++) {
                if (j < columnToBeAdded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (j > columnToBeAdded)
                    minor[i][j] = matrix.getData()[i][j - 1];
                else
                    minor[i][j] = 0.0;
            }
        }
        return new Matrix(minor);
    }

    public void addCol(Integer colToBeAdded) throws IndexOutOfBoundsException {
        this.data = Matrix.addCol(this, colToBeAdded).getData();
    }

    public static Matrix addRow(Matrix matrix, Integer rowToBeAdded) throws IndexOutOfBoundsException {
        if (rowToBeAdded > matrix.getNumCols())
            throw new IndexOutOfBoundsException("Cannot add a column: inappropriate index");
        Double[][] minor = new Double[matrix.getData().length + 1][matrix.getData()[0].length];
        for (int i = 0; i < matrix.getNumRows() + 1; i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                if (i < rowToBeAdded)
                    minor[i][j] = matrix.getData()[i][j];
                else if (i > rowToBeAdded)
                    minor[i][j] = matrix.getData()[i - 1][j];
                else
                    minor[i][j] = 0.0;
            }
        }
        return new Matrix(minor);
    }

    public void addRow(Integer rowToBeAdded) throws IndexOutOfBoundsException {
        this.data = Matrix.addRow(this, rowToBeAdded).getData();
    }

    public void useOperation(DoubleFunction<Double> operation) {
        for (int i = 0; i < this.getNumRows(); i++) {
            for (int j = 0; j < this.getNumCols(); j++) {
                data[i][j] = operation.apply(data[i][j]);
            }
        }
    }

    public static Matrix useOperation(Matrix matrix, DoubleFunction<Double> operation) {
        Double[][] data = new Double[matrix.getNumRows()][matrix.getNumCols()];
        for (int i = 0; i < matrix.getNumRows(); i++) {
            for (int j = 0; j < matrix.getNumCols(); j++) {
                data[i][j] = operation.apply(matrix.get(i, j));
            }
        }
        return new Matrix(data);
    }
}

