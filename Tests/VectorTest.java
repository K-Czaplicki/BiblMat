import MathLibrary.Vector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    private Vector vec1;
    private Vector vec2;
    private Vector vec3;
    private Vector vec4;
    private Vector vec5;
    private Vector vec6;
    private Vector vec7;
    private Vector vec8;
    private Vector vec9;
    private Vector vec10;
    private Vector vec11;

    private Vector vPol1;
    private Vector vPol2;
    private Vector vPol3;
    private Vector vPol4;
    private Vector vPol5;
    private Vector vPol6;

    @BeforeEach
    void init() {
        vec1 = new Vector(new Integer[]{0, 1});
        vec2 = new Vector(new Integer[]{1, 0});
        vec3 = new Vector(new Double[]{-0.5, 1.5});
        vec4 = new Vector(new Number[]{1.25, -3});
        vec5 = new Vector(new Double[]{1.0, 2.0, 3.0});
        vec6 = new Vector(new Double[]{4.0, 5.0, 6.0});
        vec7 = new Vector(new Double[]{1.0, 2.0, 3.0, 4.0});
        vec8 = new Vector(new Double[]{5.0, 6.0, 7.0});
        vec9 = new Vector(new Double[]{0.0, 0.0, 0.0});
        vec10 = new Vector(new Double[]{-1.0, -2.0, -3.0});
        vec11 = new Vector(new Double[]{-4.0, -5.0, -6.0});

        vPol1 = new Vector(new Number[]{0, 0}, true);
        vPol2 = new Vector(new Number[]{3, 0}, true);
        vPol3 = new Vector(new Number[]{3, 90}, true);
        vPol4 = new Vector(new Number[]{3, 180}, true);
        vPol5 = new Vector(new Number[]{3, 270}, true);
        vPol6 = new Vector(new Number[]{23489832.9999999999, 2702323.234234324}, false);
    }

    @DisplayName("Equals")
    @Test
    void equals() {
        Vector result = new Vector(new Integer[]{0, 1});
        assertTrue(vec1.equals(result));
    }

    @DisplayName("Add")
    @Test
    void add() {

        // Test that the method correctly adds two vectors of the same size, two dimensions
        Vector result = new Vector(new Double[]{1.0, 1.0});
        assertTrue(Vector.add(vec1, vec2).equals(result));

        // Test that the method correctly handles the case where some elements of the input vectors are negative and some are positive
        Vector result2 = new Vector(new Double[]{0.75, -1.5});
        assertTrue(Vector.add(vec3, vec4).equals(result2));

        // Test that the method correctly adds two vectors of the same size, three dimensions
        Vector result3 = new Vector(new Double[]{5.0, 7.0, 9.0});
        assertTrue(Vector.add(vec5, vec6).equals(result3));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> Vector.add(vec7, vec8));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        Vector result4 = new Vector(new Double[]{0.0, 0.0, 0.0});
        assertTrue(Vector.add(vec9, vec9).equals(result4));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        Vector result5 = new Vector(new Double[]{-5.0, -7.0, -9.0});
        assertTrue(Vector.add(vec11, vec10).equals(result5));
    }

    @DisplayName("Add, objects")
    @Test
    void add2() {

        // Test that the method correctly adds two vectors of the same size, two dimensions
        Vector result = new Vector(new Double[]{1.0, 1.0});
        vec1.add(vec2);
        assertTrue(result.equals(vec1));

        // Test that the method correctly handles the case where some elements of the input vectors are negative and some are positive
        Vector result2 = new Vector(new Double[]{0.75, -1.5});
        vec3.add(vec4);
        assertTrue(result2.equals(vec3));

        // Test that the method correctly adds two vectors of the same size, three dimensions
        Vector result3 = new Vector(new Double[]{5.0, 7.0, 9.0});
        vec5.add(vec6);
        assertTrue(result3.equals(vec5));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> vec7.add(vec8));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        Vector result4 = new Vector(new Double[]{0.0, 0.0, 0.0});
        vec9.add(vec9);
        assertTrue(result4.equals(vec9));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        Vector result5 = new Vector(new Double[]{-5.0, -7.0, -9.0});
        vec10.add(vec11);
        assertTrue(result5.equals(vec10));
    }

    @DisplayName("Subtract")
    @Test
    void subtract() {
        // Test that the method correctly adds two vectors of the same size, two dimensions
        Vector result = new Vector(new Double[]{-1.0, 1.0});
        assertTrue(Vector.subtract(vec1, vec2).equals(result));

        // Test that the method correctly handles the case where some elements of the input vectors are negative and some are positive
        Vector result2 = new Vector(new Double[]{-1.75, 4.5});
        assertTrue(Vector.subtract(vec3, vec4).equals(result2));

        // Test that the method correctly subtracts two vectors of the same size, three dimensions
        Vector result3 = new Vector(new Double[]{-3.0, -3.0, -3.0});
        assertTrue(Vector.subtract(vec5, vec6).equals(result3));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> Vector.subtract(vec8, vec7));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        assertTrue(Vector.subtract(vec9, vec9).equals(vec9));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        Vector result4 = new Vector(new Double[]{-3.0, -3.0, -3.0});
        assertTrue(Vector.subtract(vec11, vec10).equals(result4));
    }

    @DisplayName("Subtract, objects")
    @Test
    void subtract2() {
        // Test that the method correctly adds two vectors of the same size, two dimensions
        Vector result = new Vector(new Double[]{-1.0, 1.0});
        vec1.subtract(vec2);
        assertTrue(result.equals(vec1));

        // Test that the method correctly handles the case where some elements of the input vectors are negative and some are positive
        Vector result2 = new Vector(new Double[]{-1.75, 4.5});
        vec3.subtract(vec4);
        assertTrue(result2.equals(vec3));

        // Test that the method correctly subtracts two vectors of the same size
        Vector result3 = new Vector(new Double[]{-3.0, -3.0, -3.0});
        vec5.subtract(vec6);
        assertTrue(result3.equals(vec5));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> vec7.subtract(vec8));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        Vector result4 = new Vector(new Double[]{0.0, 0.0, 0.0});
        vec9.subtract(vec9);
        assertTrue(result4.equals(vec9));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        Vector result5 = new Vector(new Double[]{-3.0, -3.0, -3.0});
        vec11.subtract(vec10);
        assertTrue(result5.equals(vec11));
    }

    @DisplayName("Multiply by scalar")
    @Test
    void multiplyByScalar() {

        // Test that the method correctly multiplies by positive scalar
        double K = 2.0;
        Vector result = new Vector(new Double[]{0.0, 2.0});
        assertTrue(Math.abs(result.getRect()[0] - Vector.multiplyByScalar(vec1, K).getRect()[0]) < 0.000001 && Math.abs(result.getRect()[1] - Vector.multiplyByScalar(vec1, K).getRect()[1]) < 0.000001);

        // Test that the method correctly multiplies by negative scalar
        double L = -2.0;
        Vector result2 = new Vector(new Double[]{-2.0, 0.0});
        assertTrue(Math.abs(result2.getRect()[0] - Vector.multiplyByScalar(vec2, L).getRect()[0]) < 0.000001 && Math.abs(result2.getRect()[1] - Vector.multiplyByScalar(vec2, L).getRect()[1]) < 0.000001);

        //
        double M = 2.5001;
        Vector result3 = new Vector(new Double[]{-1.25005, 3.75015});
        assertTrue(Math.abs(result3.getRect()[0] - Vector.multiplyByScalar(vec3, M).getRect()[0]) < 0.000001 && Math.abs(result3.getRect()[1] - Vector.multiplyByScalar(vec3, M).getRect()[1]) < 0.000001);

        //
        double N = 0.0;
        Vector result4 = new Vector(new Double[]{0.0, 0.0});
        assertTrue(Math.abs(result4.getRect()[0] - Vector.multiplyByScalar(vec4, N).getRect()[0]) < 0.000001 && Math.abs(result4.getRect()[1] - Vector.multiplyByScalar(vec4, N).getRect()[1]) < 0.000001);

        //
        double Z = 7.0;
        Vector result5 = new Vector(new Double[]{-7.0, -14.0, -21.0});
        assertTrue(Math.abs(result5.getRect()[0] - Vector.multiplyByScalar(vec10, Z).getRect()[0]) < 0.000001 && Math.abs(result5.getRect()[1] - Vector.multiplyByScalar(vec10, Z).getRect()[1]) < 0.000001);
    }

    @DisplayName("Multiply by scalar, objects")
    @Test
    void multiplyByScalar2() {

        // Test that the method correctly multiplies by positive scalar
        double K = 2.0;
        Vector result = new Vector(new Double[]{0.0, 2.0});
        vec1.multiplyByScalar(K);
        assertTrue(Math.abs(result.getRect()[0] - vec1.getRect()[0]) < 0.000001 && Math.abs(result.getRect()[1] - vec1.getRect()[1]) < 0.000001);

        // Test that the method correctly multiplies by negative scalar
        double L = -2.0;
        Vector result2 = new Vector(new Double[]{-2.0, 0.0});
        vec2.multiplyByScalar(L);
        assertTrue(Math.abs(result2.getRect()[0] - vec2.getRect()[0]) < 0.000001 && Math.abs(result2.getRect()[1] - vec2.getRect()[1]) < 0.000001);

        //
        double M = 2.5001;
        Vector result3 = new Vector(new Double[]{-1.25005, 3.75015});
        vec3.multiplyByScalar(M);
        assertTrue(Math.abs(result3.getRect()[0] - vec3.getRect()[0]) < 0.000001 && Math.abs(result3.getRect()[1] - vec3.getRect()[1]) < 0.000001);

        //
        double N = 0.0;
        Vector result4 = new Vector(new Double[]{0.0, 0.0});
        vec4.multiplyByScalar(N);
        assertTrue(Math.abs(result4.getRect()[0] - vec4.getRect()[0]) < 0.000001 && Math.abs(result4.getRect()[1] - vec4.getRect()[1]) < 0.000001);

        //
        double Z = 7.0;
        Vector result5 = new Vector(new Double[]{-7.0, -14.0, -21.0});
        vec10.multiplyByScalar(Z);
        assertTrue(Math.abs(result5.getRect()[0] - vec10.getRect()[0]) < 0.000001 && Math.abs(result5.getRect()[1] - vec10.getRect()[1]) < 0.000001);
    }

    @DisplayName("Opposite vector")
    @Test
    void opposite() {

        // Test that the method correctly creates an opposite vector, two dimensions
        Vector result = new Vector(new Double[]{0.0, -1.0});
        assertTrue(Vector.opposite(vec1).equals(result));

        // Test that the method correctly handles the case where elements of input vector are all zero
        Vector result2 = new Vector(new Double[]{0.0, 0.0, 0.0});
        assertTrue(Vector.opposite(vec9).equals(result2));

        // Test
        Vector result3 = new Vector(new Double[]{0.5, -1.5});
        assertTrue(Vector.opposite(vec3).equals(result3));

        //
        Vector result4 = new Vector(new Double[]{4.0, 5.0, 6.0});
        assertTrue(Vector.opposite(vec11).equals(result4));
    }

    @DisplayName("Opposite vector, objects")
    @Test
    void opposite2() {
        Vector result = new Vector(new Double[]{0.0, -1.0});
        vec1.opposite();
        assertTrue(result.equals(vec1));

        Vector result2 = new Vector(new Double[]{0.0, 0.0, 0.0});
        vec2.opposite();
        assertTrue(result2.equals(vec9));

        Vector result3 = new Vector(new Double[]{-4.0, -5.0, -6.0});
        vec6.opposite();
        assertTrue(result3.equals(vec6));

        Vector result4 = new Vector(new Double[]{-1.25, 3.0});
        vec4.opposite();
        assertTrue(result4.equals(vec4));
    }

    @DisplayName("Length")
    @Test
    void length() {
        Double value1 = 1.0;
        assertEquals(value1, Vector.length(vec1));

        Double value2 = Math.sqrt(2.5);
        assertEquals(value2, Vector.length(vec3));

        Double value3 = 0.0;
        assertEquals(value3, Vector.length(vec9));

        Double value4 = Math.sqrt(14);
        assertEquals(value4, Vector.length(vec5));

        Double value5 = Math.sqrt(110);
        assertEquals(value5, Vector.length(vec8));
    }

    @DisplayName("Length, objects")
    @Test
    void length2() {
        Double value1 = 1.0;
        assertEquals(vec1.length(), value1);

        Double value2 = Math.sqrt(2.5);
        assertEquals(vec3.length(), value2);

        Double value3 = 0.0;
        assertEquals(vec9.length(), value3);

        Double value4 = Math.sqrt(14);
        assertEquals(vec5.length(), value4);

        Double value5 = Math.sqrt(110);
        assertEquals(vec8.length(), value5);
    }

    @DisplayName("Get polar vector")
    @Test
    void getPolar() {
        Double[] result = new Double[]{1.0, 90.0};
        assertArrayEquals(result, vec1.getPolar());

        Double[] result2 = {1.0, 0.0};
        assertArrayEquals(result2, vec2.getPolar());

        Double[] result3 = {Math.sqrt(2.5), 108.43494882292202};
        assertArrayEquals(result3, vec3.getPolar());

        Double[] result4 = {3.25, 292.6198649480404};
        assertArrayEquals(result4, vec4.getPolar());

        Double[] result5 = {Math.sqrt(14), 63.43494882292201};
        assertArrayEquals(result5, vec5.getPolar());
    }

    @DisplayName("Write polar vector")
    @Test
    void writePolar() {

        Double[] result1 = {0.0, 0.0};
        assertTrue(Math.abs(result1[0] - vPol1.getRect()[0]) < 0.000001 && Math.abs(result1[1] - vPol1.getRect()[1]) < 0.000001);

        Double[] result2 = {3.0, 0.0};
        assertTrue(Math.abs(result2[0] - vPol2.getRect()[0]) < 0.000001 && Math.abs(result2[1] - vPol2.getRect()[1]) < 0.000001);

        Double[] result3 = {0.0, 3.0};
        assertTrue(Math.abs(result3[0] - vPol3.getRect()[0]) < 0.000001 && Math.abs(result3[1] - vPol3.getRect()[1]) < 0.000001);

        Double[] result4 = {-3.0, 0.0};
        assertTrue(Math.abs(result4[0] - vPol4.getRect()[0]) < 0.000001 && Math.abs(result4[1] - vPol4.getRect()[1]) < 0.000001);

        Double[] result5 = {0.0, -3.0};
        assertTrue(Math.abs(result5[0] - vPol5.getRect()[0]) < 0.000001 && Math.abs(result5[1] - vPol5.getRect()[1]) < 0.000001);

        Double[] result = {23489832.9999999999, 2702323.234234324};
        assertTrue(Math.abs(vPol6.getRect()[0] - result[0]) < 0.000001 && Math.abs(vPol6.getRect()[1] - result[1]) < 0.000001);
    }

    @DisplayName("Is perpendicular")
    @Test
    void isPerpendicular() {

        Vector vector1 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector2 = new Vector(new Double[]{-2.0, 1.0, 0.0});
        assertTrue(Vector.isPerpendicular(vector1, vector2));

        Vector vector3 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector4 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertFalse(Vector.isPerpendicular(vector3, vector4));

        Vector vector5 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector vector6 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertThrows(ArithmeticException.class, () -> Vector.isPerpendicular(vector5, vector6));

        Vector vector7 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector8 = new Vector(new Double[]{1.0, 2.0});
        assertFalse(Vector.isPerpendicular(vector7, vector8));
    }

    @DisplayName("Is perpendicular, objects")
    @Test
    void isPerpendicular2() {
        Vector vector1 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector2 = new Vector(new Double[]{-2.0, 1.0, 0.0});
        assertTrue(vector1.isPerpendicular(vector2));

        Vector vector3 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector4 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertFalse(vector3.isPerpendicular(vector4));

        Vector vector5 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector vector6 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertThrows(ArithmeticException.class, () -> vector5.isPerpendicular(vector6));

        Vector vector7 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector8 = new Vector(new Double[]{1.0, 2.0});
        assertFalse(vector7.isPerpendicular(vector8));
    }

    @DisplayName("Is parallel")
    @Test
    void isParallel() {
        Vector vector1 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector vector2 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertThrows(ArithmeticException.class, () -> Vector.isParallel(vector1, vector2));
        assertThrows(ArithmeticException.class, () -> Vector.isParallel(vector2, vector1));

        Vector vector3D = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector4D = new Vector(new Double[]{1.0, 2.0, 3.0, 4.0});
        assertFalse(Vector.isParallel(vector3D, vector4D));

        Vector vector5 = new Vector(new Double[]{2.0, 4.0, 6.0});
        Vector vector6 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertTrue(Vector.isParallel(vector5, vector6));

        Vector vector7 = new Vector(new Double[]{2.0, 4.0, 6.0});
        Vector vector8 = new Vector(new Double[]{1.0, 2.0, 4.0});
        assertFalse(Vector.isParallel(vector7, vector8));

        Vector vector9 = new Vector(new Double[]{2.0, 4.0});
        Vector vector10 = new Vector(new Double[]{-2.0, -4.0});
        assertTrue(Vector.isParallel(vector9, vector10));
    }

    @DisplayName("Is parallel, objects")
    @Test
    void isParallel2() {
        Vector vector1 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector vector2 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertThrows(ArithmeticException.class, () -> vector1.isParallel(vector2));
        assertThrows(ArithmeticException.class, () -> vector2.isParallel(vector1));

        Vector vector3D = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector4D = new Vector(new Double[]{1.0, 2.0, 3.0, 4.0});
        assertFalse(vector3D.isParallel(vector4D));

        Vector vector5 = new Vector(new Double[]{2.0, 4.0, 6.0});
        Vector vector6 = new Vector(new Double[]{1.0, 2.0, 3.0});
        assertTrue(vector5.isParallel(vector6));

        Vector vector7 = new Vector(new Double[]{2.0, 4.0, 6.0});
        Vector vector8 = new Vector(new Double[]{1.0, 2.0, 4.0});
        assertFalse(vector7.isParallel(vector8));

        Vector vector9 = new Vector(new Double[]{2.0, 4.0});
        Vector vector10 = new Vector(new Double[]{-2.0, -4.0});
        assertTrue(vector9.isParallel(vector10));
    }

    @DisplayName("Dot product")
    @Test
    void dotProduct() {
        Vector vector1 = new Vector(new Double[]{0.0, 0.0});
        Vector vector2 = new Vector(new Double[]{0.0, 0.0});
        Double result1 = 0.0;
        assertEquals(Vector.dotProduct(vector1, vector2), result1);

        Vector vector3 = new Vector(new Double[]{0.0, 0.0});
        Vector vector4 = new Vector(new Double[]{10.0, 15.0});
        Double result2 = 0.0;
        assertEquals(Vector.dotProduct(vector3, vector4), result2);

        Vector vector5 = new Vector(new Double[]{1928.0, -1928.0});
        Vector vector6 = new Vector(new Double[]{-1928.0, 1928.0});
        Double result3 = -7434368.0;
        assertEquals(Vector.dotProduct(vector5, vector6), result3);

        Vector vector7 = new Vector(new Double[]{1928.0, -1928.0, 29983.0});
        Vector vector8 = new Vector(new Double[]{-29983.0, 1928.0, -1928.0});
        Double result4 = -119331632.0;
        assertEquals(Vector.dotProduct(vector7, vector8), result4);

        Vector vector9 = new Vector(new Double[]{5.0, 10.0, 15.0});
        Vector vector10 = new Vector(new Double[]{-5.0, -10.0, -15.0});
        Double result5 = -350.0;
        assertEquals(Vector.dotProduct(vector9, vector10), result5);
    }

    @DisplayName("Dot product, objects")
    @Test
    void dotProduct2() {
        Vector vector1 = new Vector(new Double[]{0.0, 0.0});
        Vector vector2 = new Vector(new Double[]{0.0, 0.0});
        Double result1 = 0.0;
        assertEquals(vector1.dotProduct(vector2), result1);

        Vector vector3 = new Vector(new Double[]{0.0, 0.0});
        Vector vector4 = new Vector(new Double[]{10.0, 15.0});
        Double result2 = 0.0;
        assertEquals(vector3.dotProduct(vector4), result2);

        Vector vector5 = new Vector(new Double[]{1928.0, -1928.0});
        Vector vector6 = new Vector(new Double[]{-1928.0, 1928.0});
        Double result3 = -7434368.0;
        assertEquals(vector5.dotProduct(vector6), result3);

        Vector vector7 = new Vector(new Double[]{1928.0, -1928.0, 29983.0});
        Vector vector8 = new Vector(new Double[]{-29983.0, 1928.0, -1928.0});
        Double result4 = -119331632.0;
        assertEquals(vector7.dotProduct(vector8), result4);

        Vector vector9 = new Vector(new Double[]{5.0, 10.0, 15.0});
        Vector vector10 = new Vector(new Double[]{-5.0, -10.0, -15.0});
        Double result5 = -350.0;
        assertEquals(vector9.dotProduct(vector10), result5);
    }

    @DisplayName("Cross product")
    @Test
    void crossProduct() {
        Vector vector1 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector vector2 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector result = new Vector(new Double[]{0.0, 0.0, 0.0});
        assertTrue(Vector.crossProduct(vector1, vector2).equals(result));

        Vector vector3 = new Vector(new Double[]{1928.0, -1928.0, 29983.0});
        Vector vector4 = new Vector(new Double[]{-29983.0, 1928.0, -1928.0});
        Vector result2 = new Vector(new Double[]{-54090040.0, -895263105.0, -54090040.0});
        assertTrue(Vector.crossProduct(vector3, vector4).equals(result2));

        Vector vector5 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector6 = new Vector(new Double[]{-3.0, -2.0, -1.0});
        Vector result3 = new Vector(new Double[]{4.0, -8.0, 4.0});
        assertTrue(Vector.crossProduct(vector5, vector6).equals(result3));

        Vector vector7 = new Vector(new Double[]{100.0, 100.0, 100.0});
        Vector vector8 = new Vector(new Double[]{-100.0, -100.0, -100.0});
        Vector result4 = new Vector(new Double[]{0.0, 0.0, 0.0});
        assertTrue(Vector.crossProduct(vector7, vector8).equals(result4));

        Vector vector9 = new Vector(new Double[]{-1005.0, -100.0, -10000.0});
        Vector vector10 = new Vector(new Double[]{10000.0, 100.0, 1005.0});
        Vector result5 = new Vector(new Double[]{899500.0, -98989975.0, 899500.0});
        assertTrue(Vector.crossProduct(vector9, vector10).equals(result5));
    }

    @DisplayName("Cross product, objects")
    @Test
    void crossProduct2() {
        Vector vector1 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector vector2 = new Vector(new Double[]{0.0, 0.0, 0.0});
        Vector result = new Vector(new Double[]{0.0, 0.0, 0.0});
        vector1.crossProduct(vector2);
        assertTrue(vector1.equals(result));

        Vector vector3 = new Vector(new Double[]{1928.0, -1928.0, 29983.0});
        Vector vector4 = new Vector(new Double[]{-29983.0, 1928.0, -1928.0});
        Vector result2 = new Vector(new Double[]{-54090040.0, -895263105.0, -54090040.0});
        vector3.crossProduct(vector4);
        assertTrue(vector3.equals(result2));

        Vector vector5 = new Vector(new Double[]{1.0, 2.0, 3.0});
        Vector vector6 = new Vector(new Double[]{-3.0, -2.0, -1.0});
        Vector result3 = new Vector(new Double[]{4.0, -8.0, 4.0});
        vector5.crossProduct(vector6);
        assertTrue(vector5.equals(result3));

        Vector vector7 = new Vector(new Double[]{100.0, 100.0, 100.0});
        Vector vector8 = new Vector(new Double[]{-100.0, -100.0, -100.0});
        Vector result4 = new Vector(new Double[]{0.0, 0.0, 0.0});
        vector7.crossProduct(vector8);
        assertTrue(vector7.equals(result4));

        Vector vector9 = new Vector(new Double[]{-1005.0, -100.0, -10000.0});
        Vector vector10 = new Vector(new Double[]{10000.0, 100.0, 1005.0});
        Vector result5 = new Vector(new Double[]{899500.0, -98989975.0, 899500.0});
        vector9.crossProduct(vector10);
        assertTrue(vector9.equals(result5));
    }

    @DisplayName("Setter and getter")
    @Test
    void set_get() {

        Vector vector1 = new Vector(new Integer[]{2, 5, 7});
        vector1.set(2, 0);
        vector1.set(1, 3);
        vector1.set(0, 15);
        assertEquals(0.0, vector1.get(2));
        assertEquals(3.0, vector1.get(1));
        assertEquals(15.0, vector1.get(0));

        Vector vector2 = new Vector(new Double[]{15.0, 127.0});
        vector2.set(1, 39);
        vector2.set(0, 27);
        assertEquals(39.0, vector2.get(1));
        assertEquals(27.0, vector2.get(0));

        Vector vector3 = new Vector(new Double[]{2.0});
        vector3.set(0, 237.0);
        assertEquals(237.0, vector3.get(0));
    }

    @DisplayName("Use operations")
    @Test
    void useOperation() {
        Vector result1 = new Vector(new Double[]{0.0, 5.0});
        assertTrue(Vector.useOperation(vec1, n -> n * 5).equals(result1));

        Vector result2 = new Vector(new Double[]{1.5574077246549023, 0.0});
        assertTrue(Vector.useOperation(vec2, Math::tan).equals(result2));

        Vector result3 = new Vector(new Double[]{-0.4636476090008061, 0.982793723247329});
        assertTrue(Vector.useOperation(vec3, Math::atan).equals(result3));

        Vector result4 = new Vector(new Double[]{2.25, -2.0});
        assertTrue(Vector.useOperation(vec4, n -> n + 1).equals(result4));

        Vector result5 = new Vector(new Double[]{0.0, 1.0, 2.0});
        assertTrue(Vector.useOperation(vec5, n -> n - 1).equals(result5));

        Vector result6 = new Vector(new Double[]{2.0, 2.5, 3.0});
        assertTrue(Vector.useOperation(vec6, n -> n/2).equals(result6));

        Vector result7 = new Vector(new Double[]{0.0, 0.0, 0.0, 0.0});
        assertTrue(Vector.useOperation(vec7, n -> 0.0).equals(result7));

        Vector result8 = new Vector(new Double[]{25.0, 36.0, 49.0});
        assertTrue(Vector.useOperation(vec8, n -> n*n).equals(result8));

        Vector result9 = new Vector(new Double[]{0.0, 0.0, 0.0});
        assertTrue(Vector.useOperation(vec9, Math::sqrt).equals(result9));

        Vector result10 = new Vector(new Double[]{-0.8414709848078965, -0.9092974268256817, -0.1411200080598672});
        assertTrue(Vector.useOperation(vec10, Math::sin).equals(result10));

        Vector result11 = new Vector(new Double[]{4.0, 5.0, 6.0});
        assertTrue(Vector.useOperation(vec11, Math::abs).equals(result11));
    }

    @Test
    void useOperation2() {
        Vector result1 = new Vector(new Double[]{0.0, 5.0});
        vec1.useOperation(n -> n * 5);
        assertTrue(vec1.equals(result1));

        Vector result2 = new Vector(new Double[]{1.5574077246549023, 0.0});
        vec2.useOperation(Math::tan);
        assertTrue(vec2.equals(result2));

        Vector result3 = new Vector(new Double[]{-0.4636476090008061, 0.982793723247329});
        vec3.useOperation(Math::atan);
        assertTrue(vec3.equals(result3));

        Vector result4 = new Vector(new Double[]{2.25, -2.0});
        vec4.useOperation(n -> n + 1);
        assertTrue(vec4.equals(result4));

        Vector result5 = new Vector(new Double[]{0.0, 1.0, 2.0});
        vec5.useOperation(n -> n - 1);
        assertTrue(vec5.equals(result5));

        Vector result6 = new Vector(new Double[]{2.0, 2.5, 3.0});
        vec6.useOperation(n -> n / 2);
        assertTrue(vec6.equals(result6));

        Vector result7 = new Vector(new Double[]{0.0, 0.0, 0.0, 0.0});
        vec7.useOperation(n -> 0.0);
        assertTrue(vec7.equals(result7));

        Vector result8 = new Vector(new Double[]{25.0, 36.0, 49.0});
        vec8.useOperation(n -> n * n);
        assertTrue(vec8.equals(result8));

        Vector result9 = new Vector(new Double[]{0.0, 0.0, 0.0});
        vec9.useOperation(Math::sqrt);
        assertTrue(vec9.equals(result9));

        Vector result10 = new Vector(new Double[]{-0.8414709848078965, -0.9092974268256817, -0.1411200080598672});
        vec10.useOperation(Math::sin);
        assertTrue(vec10.equals(result10));

        Vector result11 = new Vector(new Double[]{4.0, 5.0, 6.0});
        vec11.useOperation(Math::abs);
        assertTrue(vec11.equals(result11));
    }
}