import MathLibrary.BigVector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BigVectorTest {

    private BigVector vec1;
    private BigVector vec2;
    private BigVector vec3;
    private BigVector vec4;
    private BigVector vec5;
    private BigVector vec6;
    private BigVector vec7;
    private BigVector vec8;
    private BigVector vec9;
    private BigVector vec10;
    private BigVector vec11;

    private BigVector vPol1;
    private BigVector vPol2;
    private BigVector vPol3;
    private BigVector vPol4;
    private BigVector vPol5;
    private BigVector vPol6;

    @BeforeEach
    void init() {
        vec1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0), BigDecimal.valueOf(1)});
        vec2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1), BigDecimal.valueOf(0)});
        vec3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-0.5), BigDecimal.valueOf(1.5)});
        vec4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.25), BigDecimal.valueOf(-3)});
        vec5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        vec6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)});
        vec7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
        vec8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)});
        vec9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vec10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-3.0)});
        vec11 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-6.0)});

        vPol1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0), BigDecimal.valueOf(0)}, true);
        vPol2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(3), BigDecimal.valueOf(0)}, true);
        vPol3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(3), BigDecimal.valueOf(90)}, true);
        vPol4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(3), BigDecimal.valueOf(180)}, true);
        vPol5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(3), BigDecimal.valueOf(270)}, true);
        vPol6 = new BigVector(new BigDecimal[]{new BigDecimal("23489832.9999999999"), new BigDecimal("2702323.234234324")}, false);
    }

    @Test
    void add() {
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)});
        assertTrue(result.equals(BigVector.add(vec1, vec2)));

        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.75), BigDecimal.valueOf(-1.5)});
        assertTrue(result2.equals(BigVector.add(vec3, vec4)));

        // Test that the method correctly adds two vectors of the same size
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(5.0), BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0)});
        assertTrue(result3.equals(BigVector.add(vec5, vec6)));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> BigVector.add(vec7, vec8));

        // Test that the method correctly handles the case where one or both of the input vectors are null
        //noinspection ConstantConditions
        assertThrows(NullPointerException.class, () -> BigVector.add(null, vec8));
        //noinspection ConstantConditions
        assertThrows(NullPointerException.class, () -> BigVector.add(vec7, null));
        //noinspection ConstantConditions
        assertThrows(NullPointerException.class, () -> BigVector.add(null, null));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(result4.equals(BigVector.add(vec9, vec9)));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-7.0), BigDecimal.valueOf(-9.0)});
        assertTrue(result5.equals(BigVector.add(vec10, vec11)));
    }

    @Test
    void add2() {
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)});
        vec1.add(vec2);
        assertTrue(result.equals(vec1));

        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.75), BigDecimal.valueOf(-1.5)});
        vec3.add(vec4);
        assertTrue(result2.equals(vec3));

        // Test that the method correctly adds two vectors of the same size
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(5.0), BigDecimal.valueOf(7.0), BigDecimal.valueOf(9.0)});
        vec5.add(vec6);
        assertTrue(result3.equals(vec5));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> vec7.add(vec8));

        // Test that the method correctly handles the case where one or both of the input vectors are null
        assertThrows(NullPointerException.class, () -> vec8.add(null));
        assertThrows(NullPointerException.class, () -> vec7.add(null));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vec9.add(vec9);
        assertTrue(result4.equals(vec9));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-7.0), BigDecimal.valueOf(-9.0)});
        vec10.add(vec11);
        assertTrue(result5.equals(vec10));
    }

    @Test
    void subtract() {
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.0), BigDecimal.valueOf(1.0)});
        assertTrue(result.equals(BigVector.subtract(vec1, vec2)));

        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.75), BigDecimal.valueOf(4.5)});
        assertTrue(result2.equals(BigVector.subtract(vec3, vec4)));

        // Test that the method correctly subtracts two vectors of the same size
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-3.0)});
        assertTrue(result4.equals(BigVector.subtract(vec5, vec6)));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> BigVector.subtract(vec7, vec8));

        // Test that the method correctly handles the case where one or both of the input vectors are null
        //noinspection ConstantConditions
        assertThrows(NullPointerException.class, () -> BigVector.subtract(null, vec7));
        //noinspection ConstantConditions
        assertThrows(NullPointerException.class, () -> BigVector.subtract(vec8, null));
        //noinspection ConstantConditions
        assertThrows(NullPointerException.class, () -> BigVector.subtract(null, null));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(result5.equals(BigVector.subtract(vec9, vec9)));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        BigVector result6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(3.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(3.0)});
        assertTrue(result6.equals(BigVector.subtract(vec10, vec11)));
    }

    @Test
    void subtract2() {
        // Test that the method correctly adds two vectors of the same size, two dimensions
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.0), BigDecimal.valueOf(1.0)});
        vec1.subtract(vec2);
        assertTrue(result.equals(vec1));

        // Test that the method correctly handles the case where some elements of the input vectors are negative and some are positive
        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.75), BigDecimal.valueOf(4.5)});
        vec3.subtract(vec4);
        assertTrue(result2.equals(vec3));

        // Test that the method correctly subtracts two vectors of the same size
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-3.0)});
        vec5.subtract(vec6);
        assertTrue(result3.equals(vec5));

        // Test that the method throws an ArithmeticException when the vectors are not the same size
        assertThrows(ArithmeticException.class, () -> vec7.subtract(vec8));

        // Test that the method correctly handles the case where the elements of the input vectors are all zero
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vec9.subtract(vec9);
        assertTrue(result4.equals(vec9));

        // Test that the method correctly handles the case where the elements of the input vectors are all negative numbers
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-3.0)});
        vec11.subtract(vec10);
        assertTrue(result5.equals(vec11));
    }

    @Test
    void multiplyByScalar() {
        BigDecimal K = BigDecimal.valueOf(2.0);
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0)});
        assertTrue(result.equals(BigVector.multiplyByScalar(vec1, K)));

        // Test that the method correctly multiplies by negative scalar
        BigDecimal L = BigDecimal.valueOf(-2.0);
        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-2.0), BigDecimal.valueOf(0.0)});
        assertTrue(result2.equals(BigVector.multiplyByScalar(vec2, L)));

        //
        BigDecimal M = BigDecimal.valueOf(2.5001);
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.25005), BigDecimal.valueOf(3.75015)});
        assertTrue(result3.equals(BigVector.multiplyByScalar(vec3, M)));

        //
        BigDecimal N = BigDecimal.valueOf(0.0);
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(result4.equals(BigVector.multiplyByScalar(vec4, N)));

        //
        BigDecimal Z = BigDecimal.valueOf(7.0);
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-7.0), BigDecimal.valueOf(-14.0), BigDecimal.valueOf(-21.0)});
        assertTrue(result5.equals(BigVector.multiplyByScalar(vec10, Z)));
    }

    @Test
    void multiplyByScalar2() {
        // Test that the method correctly multiplies by positive scalar
        BigDecimal K = BigDecimal.valueOf(2.0);
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0)});
        vec1.multiplyByScalar(K);
        assertTrue(result.equals(vec1));

        // Test that the method correctly multiplies by negative scalar
        BigDecimal L = BigDecimal.valueOf(-2.0);
        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-2.0), BigDecimal.valueOf(0.0)});
        vec2.multiplyByScalar(L);
        assertTrue(result2.equals(vec2));

        //
        BigDecimal M = BigDecimal.valueOf(2.5001);
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.25005), BigDecimal.valueOf(3.75015)});
        vec3.multiplyByScalar(M);
        assertTrue(result3.equals(vec3));

        //
        BigDecimal N = BigDecimal.valueOf(0.0);
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vec4.multiplyByScalar(N);
        assertTrue(result4.equals(vec4));

        //
        BigDecimal Z = BigDecimal.valueOf(7.0);
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-7.0), BigDecimal.valueOf(-14.0), BigDecimal.valueOf(-21.0)});
        vec10.multiplyByScalar(Z);
        assertTrue(result5.equals(vec10));
    }

    @Test
    void opposite() {
        // Test that the method correctly creates an opposite vector, two dimensions
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0)});
        assertTrue(BigVector.opposite(vec1).equals(result));

        // Test that the method correctly handles the case where elements of input vector are all zero
        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(BigVector.opposite(vec9).equals(result2));

        // Test
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.5), BigDecimal.valueOf(-1.5)});
        assertTrue(BigVector.opposite(vec3).equals(result3));

        //
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)});
        assertTrue(BigVector.opposite(vec11).equals(result4));
    }

    @Test
    void opposite2() {
        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0)});
        vec1.opposite();
        assertTrue(result.equals(vec1));

        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vec9.opposite();
        assertTrue(result2.equals(vec9));

        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-6.0)});
        vec6.opposite();
        assertTrue(result3.equals(vec6));

        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.25), BigDecimal.valueOf(3.0)});
        vec4.opposite();
        assertTrue(result4.equals(vec4));
    }

    @Test
    void length() {
        BigDecimal value1 = BigDecimal.valueOf(1.0);
        assertEquals(value1, BigVector.length(vec1));

        BigDecimal value2 = BigDecimal.valueOf(Math.sqrt(2.5));
        assertEquals(value2, BigVector.length(vec3));

        BigDecimal value3 = BigDecimal.valueOf(0.0);
        assertEquals(value3, BigVector.length(vec9));

        BigDecimal value4 = BigDecimal.valueOf(Math.sqrt(14));
        assertEquals(value4, BigVector.length(vec5));

        BigDecimal value5 = BigDecimal.valueOf(Math.sqrt(110));
        assertEquals(value5, BigVector.length(vec8));
    }

    @Test
    void length2() {
        BigDecimal value1 = BigDecimal.valueOf(1.0);
        assertEquals(vec1.length(), value1);

        BigDecimal value2 = BigDecimal.valueOf(Math.sqrt(2.5));
        assertEquals(vec3.length(), value2);

        BigDecimal value3 = BigDecimal.valueOf(0.0);
        assertEquals(vec9.length(), value3);

        BigDecimal value4 = BigDecimal.valueOf(Math.sqrt(14));
        assertEquals(vec5.length(), value4);

        BigDecimal value5 = BigDecimal.valueOf(Math.sqrt(110));
        assertEquals(vec8.length(), value5);
    }

    @Test
    void getPolar() {
        BigDecimal[] result = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(90.0)};
        assertArrayEquals(result, vec1.getPolar());

        BigDecimal[] result2 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0)};
        assertArrayEquals(result2, vec2.getPolar());

        BigDecimal[] result3 = {BigDecimal.valueOf(Math.sqrt(2.5)), BigDecimal.valueOf(108.43494882292202)};
        assertArrayEquals(result3, vec3.getPolar());

        BigDecimal[] result4 = {BigDecimal.valueOf(3.25), new BigDecimal("292.61986494804042")};
        assertArrayEquals(result4, vec4.getPolar());

        BigDecimal[] result5 = {BigDecimal.valueOf(Math.sqrt(14)), BigDecimal.valueOf(63.43494882292201)};
        assertArrayEquals(result5, vec5.getPolar());
    }

    @Test
    void writePolar() {
        BigVector result1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(vPol1.equals(result1, 0.00001));

        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(3.0), BigDecimal.valueOf(0.0)});
        assertTrue(vPol2.equals(result2, 0.1));

        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(3.0)});
        assertTrue(vPol3.equals(result3, 0.00001));

        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-3.0), BigDecimal.valueOf(0.0)});
        assertTrue(vPol4.equals(result4, 0.00001));

        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(-3.0)});
        assertTrue(vPol5.equals(result5, 0.00001));

        BigVector result = new BigVector(new BigDecimal[]{BigDecimal.valueOf(23489832.9999999999), BigDecimal.valueOf(2702323.234234324)});
        assertTrue(vPol6.equals(result, 0.00001));
    }

    @Test
    void isPerpendicular() {
        BigDecimal[] elements1 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector1 = new BigVector(elements1);
        BigDecimal[] elements2 = {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0)};
        BigVector vector2 = new BigVector(elements2);
        assertTrue(BigVector.isPerpendicular(vector1, vector2));

        BigDecimal[] elements3 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector3 = new BigVector(elements3);
        BigDecimal[] elements4 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector4 = new BigVector(elements4);
        assertFalse(BigVector.isPerpendicular(vector3, vector4));

        BigDecimal[] elements5 = {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)};
        BigVector vector5 = new BigVector(elements5);
        BigDecimal[] elements6 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector6 = new BigVector(elements6);
        assertThrows(ArithmeticException.class, () -> BigVector.isPerpendicular(vector5, vector6));

        BigDecimal[] elements7 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector7 = new BigVector(elements7);
        BigDecimal[] elements8 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)};
        BigVector vector8 = new BigVector(elements8);
        assertFalse(BigVector.isPerpendicular(vector7, vector8));
    }

    @Test
    void isPerpendicular2() {
        BigDecimal[] elements1 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector1 = new BigVector(elements1);
        BigDecimal[] elements2 = {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0)};
        BigVector vector2 = new BigVector(elements2);
        assertTrue(vector1.isPerpendicular(vector2));

        BigDecimal[] elements3 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector3 = new BigVector(elements3);
        BigDecimal[] elements4 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector4 = new BigVector(elements4);
        assertFalse(vector3.isPerpendicular(vector4));

        BigDecimal[] elements5 = {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)};
        BigVector vector5 = new BigVector(elements5);
        BigDecimal[] elements6 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector6 = new BigVector(elements6);
        assertThrows(ArithmeticException.class, () -> vector5.isPerpendicular(vector6));

        BigDecimal[] elements7 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)};
        BigVector vector7 = new BigVector(elements7);
        BigDecimal[] elements8 = {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)};
        BigVector vector8 = new BigVector(elements8);
        assertFalse(vector7.isPerpendicular(vector8));
    }

    @Test
    void isParallel() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        assertThrows(ArithmeticException.class, () -> BigVector.isParallel(vector1, vector2));
        assertThrows(ArithmeticException.class, () -> BigVector.isParallel(vector2, vector1));

        BigVector vector3D = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        BigVector vector4D = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
        assertFalse(BigVector.isParallel(vector3D, vector4D));

        BigVector vector5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(6.0)});
        BigVector vector6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        assertTrue(BigVector.isParallel(vector5, vector6));

        BigVector vector7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(6.0)});
        BigVector vector8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0)});
        assertFalse(BigVector.isParallel(vector7, vector8));

        BigVector vector9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0)});
        BigVector vector10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-4.0)});
        assertTrue(BigVector.isParallel(vector9, vector10));
    }

    @Test
    void isParallel2() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        assertThrows(ArithmeticException.class, () -> vector1.isParallel(vector2));
        assertThrows(ArithmeticException.class, () -> vector2.isParallel(vector1));

        BigVector vector3D = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        BigVector vector4D = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)});
        assertFalse(vector3D.isParallel(vector4D));

        BigVector vector5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(6.0)});
        BigVector vector6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        assertTrue(vector5.isParallel(vector6));

        BigVector vector7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(6.0)});
        BigVector vector8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0)});
        assertFalse(vector7.isParallel(vector8));

        BigVector vector9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0)});
        BigVector vector10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-4.0)});
        assertTrue(vector9.isParallel(vector10));
    }

    @DisplayName("DotProduct")
    @Test
    void dotProduct() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigDecimal result1 = BigDecimal.valueOf(0.0);
        assertEquals(0, result1.compareTo(BigVector.dotProduct(vector1, vector2)));

        BigVector vector3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(10.0), BigDecimal.valueOf(15.0)});
        BigDecimal result2 = BigDecimal.valueOf(0.0);
        assertEquals(0, result2.compareTo(BigVector.dotProduct(vector3, vector4)));

        BigVector vector5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0)});
        BigVector vector6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1928.0), BigDecimal.valueOf(1928.0)});
        BigDecimal result3 = BigDecimal.valueOf(-7434368.0);
        assertEquals(0, result3.compareTo(BigVector.dotProduct(vector5, vector6)));

        BigVector vector7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0), BigDecimal.valueOf(29983.0)});
        BigVector vector8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-29983.0), BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0)});
        BigDecimal result4 = BigDecimal.valueOf(-119331632.0);
        assertEquals(0, result4.compareTo(BigVector.dotProduct(vector7, vector8)));

        BigVector vector9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(5.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(15.0)});
        BigVector vector10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-15.0)});
        BigDecimal result5 = BigDecimal.valueOf(-350.0);
        assertEquals(0, result5.compareTo(BigVector.dotProduct(vector9, vector10)));
    }

    @Test
    void dotProduct2() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigDecimal result1 = BigDecimal.valueOf(0.0);
        assertEquals(0, result1.compareTo(vector1.dotProduct(vector2)));

        BigVector vector3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(10.0), BigDecimal.valueOf(15.0)});
        BigDecimal result2 = BigDecimal.valueOf(0.0);
        assertEquals(0, result2.compareTo(vector3.dotProduct(vector4)));

        BigVector vector5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0)});
        BigVector vector6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1928.0), BigDecimal.valueOf(1928.0)});
        BigDecimal result3 = BigDecimal.valueOf(-7434368.0);
        assertEquals(0, result3.compareTo(vector5.dotProduct(vector6)));

        BigVector vector7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0), BigDecimal.valueOf(29983.0)});
        BigVector vector8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-29983.0), BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0)});
        BigDecimal result4 = BigDecimal.valueOf(-119331632.0);
        assertEquals(0, result4.compareTo(vector7.dotProduct(vector8)));

        BigVector vector9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(5.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(15.0)});
        BigVector vector10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-15.0)});
        BigDecimal result5 = BigDecimal.valueOf(-350.0);
        assertEquals(0, result5.compareTo(vector9.dotProduct(vector10)));
    }

    @DisplayName("crossProduct")
    @Test
    void crossProduct() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector result1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(result1.equals(BigVector.crossProduct(vector1, vector2)));

        BigVector vector3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0), BigDecimal.valueOf(29983.0)});
        BigVector vector4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-29983.0), BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0)});
        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-54090040.0), BigDecimal.valueOf(-895263105.0), BigDecimal.valueOf(-54090040.0)});
        assertTrue(result2.equals(BigVector.crossProduct(vector3, vector4)));

        BigVector vector5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        BigVector vector6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-1.0)});
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(4.0), BigDecimal.valueOf(-8.0), BigDecimal.valueOf(4.0)});
        assertTrue(result3.equals(BigVector.crossProduct(vector5, vector6)));

        BigVector vector7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0)});
        BigVector vector8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-100.0), BigDecimal.valueOf(-100.0), BigDecimal.valueOf(-100.0)});
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(result4.equals(BigVector.crossProduct(vector7, vector8)));

        BigVector vector9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1005.0), BigDecimal.valueOf(-100.0), BigDecimal.valueOf(-10000.0)});
        BigVector vector10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(10000.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(1005.0)});
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(899500.0), BigDecimal.valueOf(-98989975.0), BigDecimal.valueOf(899500.0)});
        assertTrue(result5.equals(BigVector.crossProduct(vector9, vector10)));
    }

    @Test
    void crossProduct2() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        BigVector result1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vector1.crossProduct(vector2);
        assertTrue(result1.equals(vector1));

        BigVector vector3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0), BigDecimal.valueOf(29983.0)});
        BigVector vector4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-29983.0), BigDecimal.valueOf(1928.0), BigDecimal.valueOf(-1928.0)});
        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-54090040.0), BigDecimal.valueOf(-895263105.0), BigDecimal.valueOf(-54090040.0)});
        vector3.crossProduct(vector4);
        assertTrue(result2.equals(vector3));

        BigVector vector5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)});
        BigVector vector6 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-1.0)});
        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(4.0), BigDecimal.valueOf(-8.0), BigDecimal.valueOf(4.0)});
        vector5.crossProduct(vector6);
        assertTrue(result3.equals(vector5));

        BigVector vector7 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0)});
        BigVector vector8 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-100.0), BigDecimal.valueOf(-100.0), BigDecimal.valueOf(-100.0)});
        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vector7.crossProduct(vector8);
        assertTrue(result4.equals(vector7));

        BigVector vector9 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1005.0), BigDecimal.valueOf(-100.0), BigDecimal.valueOf(-10000.0)});
        BigVector vector10 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(10000.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(1005.0)});
        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(899500.0), BigDecimal.valueOf(-98989975.0), BigDecimal.valueOf(899500.0)});
        vector9.crossProduct(vector10);
        assertTrue(result5.equals(vector9));
    }

    @DisplayName("Setter and getter")
    @Test
    void set_get() {
        BigVector vector1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2), BigDecimal.valueOf(5), BigDecimal.valueOf(7)});
        vector1.set(2, BigDecimal.valueOf(0));
        vector1.set(1, BigDecimal.valueOf(3));
        vector1.set(0, BigDecimal.valueOf(15));
        assertEquals(BigDecimal.valueOf(0), vector1.get(2));
        assertEquals(BigDecimal.valueOf(3), vector1.get(1));
        assertEquals(BigDecimal.valueOf(15), vector1.get(0));

        BigVector vector2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(15), BigDecimal.valueOf(127)});
        vector2.set(1, BigDecimal.valueOf(39));
        vector2.set(0, BigDecimal.valueOf(27));
        assertEquals(BigDecimal.valueOf(39), vector2.get(1));
        assertEquals(BigDecimal.valueOf(27), vector2.get(0));

        BigVector vector3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(2)});
        vector3.set(0, BigDecimal.valueOf(237));
        assertEquals(BigDecimal.valueOf(237), vector3.get(0));
    }

    @DisplayName("Use operations")
    @Test
    void useOperation() {
        BigVector result1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(5.0)});
        assertTrue(BigVector.useOperation(vec1, n -> n.multiply(BigDecimal.valueOf(5))).equals(result1));


        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0)});
        assertTrue(BigVector.useOperation(vec2, n -> n.add(BigDecimal.valueOf(0))).equals(result2));

        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.5), BigDecimal.valueOf(0.5)});
        assertTrue(BigVector.useOperation(vec3, n -> n.subtract(BigDecimal.valueOf(1))).equals(result3));

        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-9999999998.75), BigDecimal.valueOf(-10000000003.0)});
        assertTrue(BigVector.useOperation(vec4, n -> n.subtract(BigDecimal.valueOf(10000000000.0))).equals(result4));

        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        assertTrue(BigVector.useOperation(vec5, n -> n.multiply(BigDecimal.valueOf(0))).equals(result5));
    }

    @Test
    void useOperation2() {
        BigVector result1 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(5.0)});
        vec1.useOperation(n -> n.multiply(BigDecimal.valueOf(5)));
        assertTrue(vec1.equals(result1));

        BigVector result2 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0)});
        vec2.useOperation(n -> n.add(BigDecimal.valueOf(0)));
        assertTrue(vec2.equals(result2));

        BigVector result3 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-1.5), BigDecimal.valueOf(0.5)});
        vec3.useOperation(n -> n.subtract(BigDecimal.valueOf(1)));
        assertTrue(vec3.equals(result3));

        BigVector result4 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(-9999999998.75), BigDecimal.valueOf(-10000000003.0)});
        vec4.useOperation(n -> n.subtract(BigDecimal.valueOf(10000000000.0)));
        assertTrue(vec4.equals(result4));

        BigVector result5 = new BigVector(new BigDecimal[]{BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)});
        vec5.useOperation(n -> n.multiply(BigDecimal.valueOf(0)));
        assertTrue(vec5.equals(result5));
    }
}