package MathLibrary;

import java.security.SecureRandom;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.DoubleFunction;

public class Vector implements Iterable<Double> {
    private Double[] data;

    public Iterator<Double> iterator() {
        return new CustomIterator();
    }

    class CustomIterator implements Iterator<Double> {
        int current = 0;

        public boolean hasNext() {
            return current < data.length;
        }

        public Double next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[current++];
        }
    }

    public boolean equals(Vector vector) {
        return equals(this, vector);
    }

    public static boolean equals(Vector vector1, Vector vector2) {
        for (int i = 0; i < vector1.getDimension(); i++) {
            if (vector1.get(i).compareTo(vector2.get(i)) != 0)
                return false;
        }
        return true;
    }

    @SuppressWarnings("unused")
    public boolean equals(Vector vector, double err) {
        return equals(this, vector, err);
    }

    public static boolean equals(Vector vector1, Vector vector2, double err) {
        for (int i = 0; i < vector1.getDimension(); i++) {
            if (Math.abs(vector1.get(i) - vector2.get(i)) > err)
                return false;
        }
        return true;
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

    public <N extends Number> Vector(N[] data) throws NullPointerException {
        if (data == null || data.length == 0 || data[0] == null)
            throw new NullPointerException("Data cannot be null");
        this.data = new Double[data.length];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i].doubleValue();
        }
    }

    public <N extends Number> Vector(N[] values, boolean isPolar) {
        if (isPolar) {
            if (values.length == 2) {
                double X = values[0].doubleValue() * Math.cos(Math.toRadians(values[1].doubleValue()));
                double Y = values[0].doubleValue() * Math.sin(Math.toRadians(values[1].doubleValue()));
                this.data = new Double[]{X, Y};
            } else {
                throw new ArithmeticException("3D vector not supported");
            }
        } else {
            this.data = new Double[values.length];
            for (int i = 0; i < values.length; i++) {
                this.data[i] = values[i].doubleValue();
            }
        }
    }

    public <N extends Number> void set(Integer dim, N value) throws IndexOutOfBoundsException {
        if (dim >= this.getDimension() || dim < 0)
            throw new IndexOutOfBoundsException("Index out of bound");
        data[dim] = value.doubleValue();
    }

    @SuppressWarnings("unused")
    public <N extends Number> void set(Vector vector, Integer dim, N value) throws IndexOutOfBoundsException {
        vector.set(dim, value);
    }

    public Double get(int i) throws IndexOutOfBoundsException {
        if (i < this.getDimension() && i >= 0)
            return data[i];
        else
            throw new IndexOutOfBoundsException("Index is out of range");
    }

    @SuppressWarnings("unused")
    public Double get(Vector vector, int i) throws IndexOutOfBoundsException {
        return vector.get(i);
    }

    public int getDimension() {
        return data.length;
    }

    public void add(Vector vecToAdd) {
        data = add(this, vecToAdd).getRect();
    }

    public void subtract(Vector vecToAdd) {
        data = subtract(this, vecToAdd).getRect();
    }

    public void multiplyByScalar(Double scalar) {
        data = multiplyByScalar(this, scalar).getRect();
    }

    public void opposite() {
        data = opposite(this).getRect();
    }

    public Double[] getPolar() {
        double degree = Math.toDegrees(Math.atan2(data[1], data[0]));
        if (degree < 0)
            degree += 360;
        return (new Double[]{length(this), degree});
    }

    public Double[] getRect() {
        return data;
    }

    public Double length() {
        return length(this);
    }

    public Double dotProduct(Vector vector) {
        return dotProduct(this, vector);
    }

    public void crossProduct(Vector vector) {
        data = crossProduct(this, vector).getRect();
    }

    public boolean isPerpendicular(Vector vector) {
        return isPerpendicular(this, vector);
    }

    public boolean isParallel(Vector vector) {
        return isParallel(this, vector);
    }

    public static Vector add(Vector vector1, Vector vector2) throws ArithmeticException {
        if (vector1.getDimension() == vector2.getDimension()) {
            Double[] result = new Double[vector1.getDimension()];
            for (int i = 0; i < vector1.getDimension(); i++) {
                result[i] = vector1.getRect()[i] + vector2.getRect()[i];
            }
            return new Vector(result);
        } else
            throw new ArithmeticException("Vectors are not the same size");
    }

    public static Vector subtract(Vector vector1, Vector vector2) throws ArithmeticException {
        if (vector1.getDimension() == vector2.getDimension()) {
            Double[] result = new Double[vector1.getDimension()];
            for (int i = 0; i < vector1.getDimension(); i++) {
                result[i] = vector1.getRect()[i] - vector2.getRect()[i];
            }
            return new Vector(result);
        } else
            throw new ArithmeticException("Vectors are not the same size");
    }

    public static <N extends Number> Vector multiplyByScalar(Vector vector, N scalar) {
        Double[] result = new Double[vector.getDimension()];
        for (int i = 0; i < vector.getDimension(); i++) {
            result[i] = (vector.getRect()[i] * scalar.doubleValue()) + 0.0;
        }
        return new Vector(result);
    }

    public static Vector opposite(Vector vector) {
        Double[] result = new Double[vector.getDimension()];
        for (int i = 0; i < vector.getDimension(); i++) {
            result[i] = 0 - vector.getRect()[i];
        }
        return new Vector(result);
    }

    public static Double length(Vector vector) throws ArithmeticException {
        if (vector.getDimension() > 0) {
            double result = 0.0;
            for (int i = 0; i < vector.getDimension(); i++) {
                result += vector.getRect()[i] * vector.getRect()[i];
            }
            result = Math.sqrt(result);
            return result;
        } else
            throw new ArithmeticException("You cannot calculate the length of null vector");
    }

    public static Double dotProduct(Vector vector1, Vector vector2) throws ArithmeticException {
        if (vector1.getDimension() == vector2.getDimension()) {
            double result = 0;
            for (int i = 0; i < vector1.getDimension(); i++) {
                result += vector1.getRect()[i] * vector2.getRect()[i];
            }
            return result;
        } else
            throw new ArithmeticException("Vectors are not the same dimensions");
    }

    public static Vector crossProduct(Vector vector1, Vector vector2) throws ArithmeticException {
        if (vector1.getDimension() == 3 && vector2.getDimension() == 3) {
            double X = (vector1.getRect()[1] * vector2.getRect()[2] - vector1.getRect()[2] * vector2.getRect()[1]) + 0.0;
            double Y = (vector1.getRect()[2] * vector2.getRect()[0] - vector1.getRect()[0] * vector2.getRect()[2]) + 0.0;
            double Z = (vector1.getRect()[0] * vector2.getRect()[1] - vector1.getRect()[1] * vector2.getRect()[0]) + 0.0;
            return new Vector(new Double[]{X, Y, Z});
        } else
            throw new ArithmeticException("Wrong dimensions");
    }

    public static boolean isPerpendicular(Vector vector1, Vector vector2) {
        if (vector1.length() == 0 || vector2.length() == 0)
            throw new ArithmeticException("One or both vectors are zero vectors");
        if (vector1.getDimension() == 0 || vector2.getDimension() == 0)
            return false;
        if (vector1.getDimension() != vector2.getDimension())
            return false;
        double dotProduct = 0;
        for (int i = 0; i < vector1.getDimension(); i++)
            dotProduct += vector1.getRect()[i] * vector2.getRect()[i];
        return dotProduct == 0;
    }

    public static boolean isParallel(Vector vector1, Vector vector2) {
        if (vector1.length() == 0 || vector2.length() == 0)
            throw new ArithmeticException("One or both vectors are zero vectors");
        if (vector1.getDimension() != vector2.getDimension())
            return false;
        double ratio = vector1.getRect()[0] / vector2.getRect()[0];
        for (int i = 1; i < vector1.getDimension(); i++) {
            if (vector1.getRect()[i] / vector2.getRect()[i] != ratio)
                return false;
        }
        return true;
    }

    public void useOperation(DoubleFunction<Double> operation) {
        for (int i = 0; i < this.getDimension(); i++) {
                data[i] = operation.apply(data[i]);
        }
    }

    public static Vector useOperation(Vector vector, DoubleFunction<Double> operation) {
        Double[] data = new Double[vector.getDimension()];
        for (int i = 0; i < vector.getDimension(); i++) {
                data[i] = operation.apply(vector.get(i));
        }
        return new Vector(data);
    }

    public static Vector getRandomVector(Integer dim) {
        SecureRandom rand = new SecureRandom();
        Double[] random = new Double[dim];
        for (int i = 0; i < dim; i++) {
                random[i] = rand.nextDouble();
        }
        return new Vector(random);
    }
}
