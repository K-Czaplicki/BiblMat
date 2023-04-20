package MathLibrary;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BigVector implements Iterable<BigDecimal> {
    private BigDecimal[] data;

    @FunctionalInterface
    public interface BigDecimalFunction {
        BigDecimal apply(BigDecimal number);
    }

    public Iterator<BigDecimal> iterator() {
        return new CustomIterator();
    }

    class CustomIterator implements Iterator<BigDecimal> {
        int current = 0;

        public boolean hasNext() {
            return current < data.length;
        }

        public BigDecimal next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[current++];
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.getDimension(); i++) {
            stringBuilder.append(this.getRect()[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public boolean equals(BigVector vector) {
        return equals(this, vector);
    }

    public static boolean equals(BigVector vector1, BigVector vector2) {
        if (vector1.getDimension() != vector2.getDimension())
            return false;
        for (int i = 0; i < vector1.getDimension(); i++) {
            if (vector1.get(i).compareTo(vector2.get(i)) != 0)
                return false;
        }
        return true;
    }

    public boolean equals(BigVector vector, double err) {
        return equals(this, vector, err);
    }

    public static boolean equals(BigVector vector1, BigVector vector2, double err) {
        if (vector1.getDimension() != vector2.getDimension())
            return false;
        for (int i = 0; i < vector1.getDimension(); i++) {
            if (vector1.get(i).subtract(vector2.get(i)).abs().compareTo(BigDecimal.valueOf(err)) > 0)
                return false;
        }
        return true;
    }

    public BigVector(BigDecimal[] data) throws NullPointerException {
        if (data == null || data.length == 0 || data[0] == null)
            throw new NullPointerException("Data cannot be null");
        this.data = data;
    }

    public BigVector(BigDecimal[] values, boolean isPolar) throws IllegalArgumentException {
        if (values == null)
            throw new IllegalArgumentException("Data cannot be null");
        if (values[1].compareTo(BigDecimal.valueOf(Double.MAX_VALUE)) > 0)
            throw new IllegalArgumentException("Angle is too big, remember, that this method reduces accuracy");
        if (isPolar) {
            if (values.length == 2) {
                BigDecimal X = values[0].multiply(BigDecimal.valueOf(Math.round(Math.cos(Math.toRadians(values[1].doubleValue())))));
                BigDecimal Y = values[0].multiply(BigDecimal.valueOf(Math.round(Math.sin(Math.toRadians(values[1].doubleValue())))));
                this.data = new BigDecimal[]{X, Y};
            } else
                throw new ArithmeticException("3D vector not supported");
        } else
            this.data = values;
    }

    public void set(Integer dim, BigDecimal value) throws IndexOutOfBoundsException {
        if (dim.compareTo(this.getDimension()) >= 0 || dim < 0)
            throw new IndexOutOfBoundsException("Index out of bound");
        data[dim] = value;
    }

    @SuppressWarnings("unused")
    public void set(BigVector vector, Integer dim, BigDecimal value) throws IndexOutOfBoundsException {
        vector.set(dim, value);
    }

    public BigDecimal get(Integer i) throws IndexOutOfBoundsException {
        if (i.compareTo(this.getDimension()) < 0 && i.compareTo(0) >= 0)
            return data[i];
        else
            throw new IndexOutOfBoundsException("Index is out of range");
    }

    @SuppressWarnings("unused")
    public BigDecimal get(BigVector vector, Integer i) throws IndexOutOfBoundsException {
        return vector.get(i);
    }

    public int getDimension() {
        return data.length;
    }

    public void add(BigVector vecToAdd) {
        data = add(this, vecToAdd).getRect();
    }

    public void subtract(BigVector vecToAdd) {
        data = subtract(this, vecToAdd).getRect();
    }

    public void multiplyByScalar(BigDecimal scalar) {
        data = multiplyByScalar(this, scalar).getRect();
    }

    public void opposite() {
        data = opposite(this).getRect();
    }

    public BigDecimal[] getPolar() {
        BigDecimal degree = new BigDecimal(String.valueOf(Math.toDegrees(Math.atan2(data[1].doubleValue(), data[0].doubleValue()))));
        if (degree.compareTo(new BigDecimal(0)) < 0)
            degree = degree.add(new BigDecimal(360));
        return (new BigDecimal[]{length(this), degree});
    }

    public BigDecimal[] getRect() {
        return data;
    }

    public BigDecimal length() {
        return length(this);
    }

    public BigDecimal dotProduct(BigVector vector) {
        return dotProduct(this, vector);
    }

    public void crossProduct(BigVector vector) {
        data = crossProduct(this, vector).getRect();
    }

    public boolean isPerpendicular(BigVector vector) {
        return isPerpendicular(this, vector);
    }

    public boolean isParallel(BigVector vector) {
        return isParallel(this, vector);
    }

    public static BigVector add(BigVector vector1, BigVector vector2) throws ArithmeticException {
        if (vector1.getDimension() == vector2.getDimension()) {
            BigDecimal[] result = new BigDecimal[vector1.getDimension()];
            for (int i = 0; i < vector1.getDimension(); i++) {
                result[i] = vector1.getRect()[i].add(vector2.getRect()[i]);
            }
            return new BigVector(result);
        } else
            throw new ArithmeticException("Vectors are not the same size");
    }

    public static BigVector subtract(BigVector vector1, BigVector vector2) throws ArithmeticException {
        if (vector1.getDimension() == vector2.getDimension()) {
            BigDecimal[] result = new BigDecimal[vector1.getDimension()];
            for (int i = 0; vector1.getDimension() > i; i++) {
                result[i] = vector1.getRect()[i].subtract(vector2.getRect()[i]);
            }
            return new BigVector(result);
        } else
            throw new ArithmeticException("Vectors are not the same size");
    }

    public static BigVector multiplyByScalar(BigVector vector, BigDecimal scalar) {
        BigDecimal[] result = new BigDecimal[vector.getDimension()];
        for (int i = 0; vector.getDimension() > i; i++) {
            result[i] = vector.getRect()[i].multiply(scalar);
        }
        return new BigVector(result);
    }

    public static BigVector opposite(BigVector vector) {
        BigDecimal[] result = new BigDecimal[vector.getDimension()];
        for (int i = 0; vector.getDimension() > i; i++) {
            result[i] = vector.getRect()[i].negate();
        }
        return new BigVector(result);
    }

    public static BigDecimal length(BigVector vector) throws ArithmeticException {
        if (vector.getDimension() > 0) {
            BigDecimal result = new BigDecimal("0.0");
            for (int i = 0; i < vector.getDimension(); i++) {
                result = result.add(vector.getRect()[i].multiply(vector.getRect()[i]));
            }
            result = BigDecimal.valueOf(Math.sqrt(result.doubleValue()));
            return result;
        } else
            throw new ArithmeticException("You cannot calculate the length of null vector");
    }

    public static BigDecimal dotProduct(BigVector vector1, BigVector vector2) throws ArithmeticException {
        if (vector1.getDimension() == vector2.getDimension()) {
            BigDecimal result = new BigDecimal(0);
            for (int i = 0; i < vector1.getDimension(); i++) {
                result = result.add(vector1.getRect()[i].multiply(vector2.getRect()[i]));
            }
            return result;
        } else
            throw new ArithmeticException("Vectors are not the same dimensions");
    }

    public static BigVector crossProduct(BigVector vector1, BigVector vector2) throws ArithmeticException {
        if (vector1.getDimension() == 3 && vector2.getDimension() == 3) {
            BigDecimal X = (vector1.getRect()[1].multiply(vector2.getRect()[2]).subtract(vector1.getRect()[2].multiply(vector2.getRect()[1])));
            BigDecimal Y = (vector1.getRect()[2].multiply(vector2.getRect()[0]).subtract(vector1.getRect()[0].multiply(vector2.getRect()[2])));
            BigDecimal Z = (vector1.getRect()[0].multiply(vector2.getRect()[1]).subtract(vector1.getRect()[1].multiply(vector2.getRect()[0])));
            return new BigVector(new BigDecimal[]{X, Y, Z});
        } else
            throw new ArithmeticException("Wrong dimensions");
    }

    public static boolean isPerpendicular(BigVector vector1, BigVector vector2) {
        if (vector1.length().compareTo(BigDecimal.valueOf(0)) == 0 || vector2.length().compareTo(BigDecimal.valueOf(0)) == 0)
            throw new ArithmeticException("One or both vectors are zero vectors");
        if (vector1.getDimension() == 0 || vector2.getDimension() == 0)
            return false;
        if (vector1.getDimension() != vector2.getDimension())
            return false;
        BigDecimal dotProduct = BigDecimal.valueOf(0);
        for (int i = 0; i < vector1.getDimension(); i++)
            dotProduct = dotProduct.add(vector1.getRect()[i].multiply(vector2.getRect()[i]));
        return dotProduct.compareTo(BigDecimal.valueOf(0)) == 0;
    }

    public static boolean isParallel(BigVector vector1, BigVector vector2) {
        if (vector1.length().compareTo(new BigDecimal(0)) == 0 || vector2.length().compareTo(new BigDecimal(0)) == 0)
            throw new ArithmeticException("One or both vectors are zero vectors");
        if (vector1.getDimension() != vector2.getDimension())
            return false;
        MathContext mc = new MathContext(50);
        BigDecimal ratio = vector1.getRect()[0].divide(vector2.getRect()[0], mc);
        for (int i = 1; i < vector1.getDimension(); i++) {
            if (vector1.getRect()[i].divide(vector2.getRect()[i], mc).compareTo(ratio) != 0)
                return false;
        }
        return true;
    }

    public void useOperation(BigVector.BigDecimalFunction operation) {
        for (int i = 0; i < this.getDimension(); i++) {
                data[i] = operation.apply(data[i]);
        }
    }

    public static BigVector useOperation(BigVector vector, BigVector.BigDecimalFunction operation) {
        BigDecimal[] data = new BigDecimal[vector.getDimension()];
        for (int i = 0; i < vector.getDimension(); i++) {
                data[i] = operation.apply(vector.get(i));
        }
        return new BigVector(data);
    }
}
