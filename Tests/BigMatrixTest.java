import MathLibrary.BigMatrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("BigMatrix test")
class BigMatrixTest {
    private BigMatrix matrix1;
    private BigMatrix matrix2;
    private BigMatrix matrix3;
    private BigMatrix matrix4;
    private BigMatrix matrix5;
    private BigMatrix matrix6;
    private BigMatrix matrix7;
    private BigMatrix matrix8;
    private BigMatrix matrix9;
    private BigMatrix matrix10;
    private BigMatrix matrix11;
    private BigMatrix matrix12;
    private BigMatrix matrix13;
    private BigMatrix matrix14;
    private BigMatrix matrix15;

    @BeforeEach
    void init() {
        matrix1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2)},
                {BigDecimal.valueOf(2), BigDecimal.valueOf(3)}});
        matrix3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15), BigDecimal.valueOf(1), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(-1), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3)},
                {BigDecimal.valueOf(4), BigDecimal.valueOf(5), BigDecimal.valueOf(6)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(-10), BigDecimal.valueOf(15), BigDecimal.valueOf(-20)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(4), BigDecimal.valueOf(-6), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(3), BigDecimal.valueOf(-6), BigDecimal.valueOf(9), BigDecimal.valueOf(-12)},
                {BigDecimal.valueOf(-4), BigDecimal.valueOf(8), BigDecimal.valueOf(-12), BigDecimal.valueOf(20)}});
        matrix6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740), BigDecimal.valueOf(-540), BigDecimal.valueOf(360), BigDecimal.valueOf(-180)},
                {BigDecimal.valueOf(-296), BigDecimal.valueOf(216), BigDecimal.valueOf(-144), BigDecimal.valueOf(72)},
                {BigDecimal.valueOf(444), BigDecimal.valueOf(-324), BigDecimal.valueOf(216), BigDecimal.valueOf(-108)},
                {BigDecimal.valueOf(-672), BigDecimal.valueOf(492), BigDecimal.valueOf(-328), BigDecimal.valueOf(164)}});
        matrix7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4), BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(8), BigDecimal.valueOf(9), BigDecimal.valueOf(10), BigDecimal.valueOf(11), BigDecimal.valueOf(12), BigDecimal.valueOf(13), BigDecimal.valueOf(14)},
                {BigDecimal.valueOf(15), BigDecimal.valueOf(16), BigDecimal.valueOf(17), BigDecimal.valueOf(18), BigDecimal.valueOf(19), BigDecimal.valueOf(20), BigDecimal.valueOf(21)},
                {BigDecimal.valueOf(22), BigDecimal.valueOf(23), BigDecimal.valueOf(24), BigDecimal.valueOf(25), BigDecimal.valueOf(26), BigDecimal.valueOf(27), BigDecimal.valueOf(28)},
                {BigDecimal.valueOf(29), BigDecimal.valueOf(30), BigDecimal.valueOf(31), BigDecimal.valueOf(32), BigDecimal.valueOf(33), BigDecimal.valueOf(34), BigDecimal.valueOf(35)},
                {BigDecimal.valueOf(36), BigDecimal.valueOf(37), BigDecimal.valueOf(38), BigDecimal.valueOf(39), BigDecimal.valueOf(40), BigDecimal.valueOf(41), BigDecimal.valueOf(42)},
                {BigDecimal.valueOf(43), BigDecimal.valueOf(44), BigDecimal.valueOf(45), BigDecimal.valueOf(46), BigDecimal.valueOf(47), BigDecimal.valueOf(48), BigDecimal.valueOf(49)}});
        matrix8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49), BigDecimal.valueOf(48), BigDecimal.valueOf(47), BigDecimal.valueOf(46), BigDecimal.valueOf(45), BigDecimal.valueOf(44), BigDecimal.valueOf(43)},
                {BigDecimal.valueOf(42), BigDecimal.valueOf(41), BigDecimal.valueOf(40), BigDecimal.valueOf(39), BigDecimal.valueOf(38), BigDecimal.valueOf(37), BigDecimal.valueOf(36)},
                {BigDecimal.valueOf(35), BigDecimal.valueOf(34), BigDecimal.valueOf(33), BigDecimal.valueOf(32), BigDecimal.valueOf(31), BigDecimal.valueOf(30), BigDecimal.valueOf(29)},
                {BigDecimal.valueOf(28), BigDecimal.valueOf(27), BigDecimal.valueOf(26), BigDecimal.valueOf(25), BigDecimal.valueOf(24), BigDecimal.valueOf(23), BigDecimal.valueOf(22)},
                {BigDecimal.valueOf(21), BigDecimal.valueOf(20), BigDecimal.valueOf(19), BigDecimal.valueOf(18), BigDecimal.valueOf(17), BigDecimal.valueOf(16), BigDecimal.valueOf(15)},
                {BigDecimal.valueOf(14), BigDecimal.valueOf(13), BigDecimal.valueOf(12), BigDecimal.valueOf(11), BigDecimal.valueOf(10), BigDecimal.valueOf(9), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(7), BigDecimal.valueOf(6), BigDecimal.valueOf(5), BigDecimal.valueOf(4), BigDecimal.valueOf(3), BigDecimal.valueOf(2), BigDecimal.valueOf(1)}});
        matrix9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1), BigDecimal.valueOf(1)},
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1), BigDecimal.valueOf(1)},
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1), BigDecimal.valueOf(1)}});
        matrix11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(9), BigDecimal.valueOf(3)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(9), BigDecimal.valueOf(4)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(9), BigDecimal.valueOf(4)}});
        matrix12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(4), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(9), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(9), BigDecimal.valueOf(7)}});
        // Matrices for matrix inverse
        matrix13 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(-1)},
                {BigDecimal.valueOf(3), BigDecimal.valueOf(-2), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(2), BigDecimal.valueOf(-3), BigDecimal.valueOf(1)}});
        matrix14 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(-1)},
                {BigDecimal.valueOf(3), BigDecimal.valueOf(-2), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(4), BigDecimal.valueOf(0), BigDecimal.valueOf(1)}});
        matrix15 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(71), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(69)},
                {BigDecimal.valueOf(69), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(71), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
    }

    @DisplayName("Addition")
    @Test
    void add() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)}});
        assertTrue(BigMatrix.add(matrix1, matrix2).equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-14.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(10.0)},
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(13.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.add(matrix3, matrix4).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(745.0), BigDecimal.valueOf(-550.0), BigDecimal.valueOf(375.0), BigDecimal.valueOf(-200.0)},
                {BigDecimal.valueOf(-298.0), BigDecimal.valueOf(220.0), BigDecimal.valueOf(-150.0), BigDecimal.valueOf(80.0)},
                {BigDecimal.valueOf(447.0), BigDecimal.valueOf(-330.0), BigDecimal.valueOf(225.0), BigDecimal.valueOf(-120.0)},
                {BigDecimal.valueOf(-676.0), BigDecimal.valueOf(500.0), BigDecimal.valueOf(-340.0), BigDecimal.valueOf(184.0)}});
        assertTrue(BigMatrix.add(matrix5, matrix6).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)}});
        assertTrue(BigMatrix.add(matrix7, matrix8).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.add(matrix9, matrix10).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(6.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(11.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(11.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(11.0)}});
        assertTrue(BigMatrix.add(matrix11, matrix12).equals(result6));

    }

    @Test
    void add2() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)}});
        matrix1.add(matrix2);
        assertTrue(matrix1.equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-14.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(10.0)},
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(13.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.add(matrix4);
        assertTrue(matrix3.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(745.0), BigDecimal.valueOf(-550.0), BigDecimal.valueOf(375.0), BigDecimal.valueOf(-200.0)},
                {BigDecimal.valueOf(-298.0), BigDecimal.valueOf(220.0), BigDecimal.valueOf(-150.0), BigDecimal.valueOf(80.0)},
                {BigDecimal.valueOf(447.0), BigDecimal.valueOf(-330.0), BigDecimal.valueOf(225.0), BigDecimal.valueOf(-120.0)},
                {BigDecimal.valueOf(-676.0), BigDecimal.valueOf(500.0), BigDecimal.valueOf(-340.0), BigDecimal.valueOf(184.0)}});
        matrix5.add(matrix6);
        assertTrue(matrix5.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)},
                {BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0), BigDecimal.valueOf(50.0)}});
        matrix7.add(matrix8);
        assertTrue(matrix7.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        matrix9.add(matrix10);
        assertTrue(matrix9.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(6.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(11.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(11.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(11.0)}});
        matrix11.add(matrix12);
        assertTrue(matrix11.equals(result6));
    }


    @DisplayName("Subtraction")
    @Test
    void subtract() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-2.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-3.0)}});
        assertTrue(BigMatrix.subtract(matrix1, matrix2).equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-16.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.subtract(matrix3, matrix4).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-735.0), BigDecimal.valueOf(530.0), BigDecimal.valueOf(-345.0), BigDecimal.valueOf(160.0)},
                {BigDecimal.valueOf(294.0), BigDecimal.valueOf(-212.0), BigDecimal.valueOf(138.0), BigDecimal.valueOf(-64.0)},
                {BigDecimal.valueOf(-441.0), BigDecimal.valueOf(318.0), BigDecimal.valueOf(-207.0), BigDecimal.valueOf(96.0)},
                {BigDecimal.valueOf(668.0), BigDecimal.valueOf(-484.0), BigDecimal.valueOf(316.0), BigDecimal.valueOf(-144.0)}});
        assertTrue(BigMatrix.subtract(matrix5, matrix6).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-48.0), BigDecimal.valueOf(-46.0), BigDecimal.valueOf(-44.0), BigDecimal.valueOf(-42.0), BigDecimal.valueOf(-40.0), BigDecimal.valueOf(-38.0), BigDecimal.valueOf(-36.0)},
                {BigDecimal.valueOf(-34.0), BigDecimal.valueOf(-32.0), BigDecimal.valueOf(-30.0), BigDecimal.valueOf(-28.0), BigDecimal.valueOf(-26.0), BigDecimal.valueOf(-24.0), BigDecimal.valueOf(-22.0)},
                {BigDecimal.valueOf(-20.0), BigDecimal.valueOf(-18.0), BigDecimal.valueOf(-16.0), BigDecimal.valueOf(-14.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-8.0)},
                {BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(14.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(20.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(28.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(34.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(42.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(48.0)}});
        assertTrue(BigMatrix.subtract(matrix7, matrix8).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0)},
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0)},
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0)}});
        assertTrue(BigMatrix.subtract(matrix9, matrix10).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(-5.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-3.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-3.0)}});
        assertTrue(BigMatrix.subtract(matrix11, matrix12).equals(result6));
    }

    @Test
    void subtract2() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-2.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-3.0)}});
        matrix1.subtract(matrix2);
        assertTrue(matrix1.equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-16.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.subtract(matrix4);
        assertTrue(matrix3.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-735.0), BigDecimal.valueOf(530.0), BigDecimal.valueOf(-345.0), BigDecimal.valueOf(160.0)},
                {BigDecimal.valueOf(294.0), BigDecimal.valueOf(-212.0), BigDecimal.valueOf(138.0), BigDecimal.valueOf(-64.0)},
                {BigDecimal.valueOf(-441.0), BigDecimal.valueOf(318.0), BigDecimal.valueOf(-207.0), BigDecimal.valueOf(96.0)},
                {BigDecimal.valueOf(668.0), BigDecimal.valueOf(-484.0), BigDecimal.valueOf(316.0), BigDecimal.valueOf(-144.0)}});
        matrix5.subtract(matrix6);
        assertTrue(matrix5.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-48.0), BigDecimal.valueOf(-46.0), BigDecimal.valueOf(-44.0), BigDecimal.valueOf(-42.0), BigDecimal.valueOf(-40.0), BigDecimal.valueOf(-38.0), BigDecimal.valueOf(-36.0)},
                {BigDecimal.valueOf(-34.0), BigDecimal.valueOf(-32.0), BigDecimal.valueOf(-30.0), BigDecimal.valueOf(-28.0), BigDecimal.valueOf(-26.0), BigDecimal.valueOf(-24.0), BigDecimal.valueOf(-22.0)},
                {BigDecimal.valueOf(-20.0), BigDecimal.valueOf(-18.0), BigDecimal.valueOf(-16.0), BigDecimal.valueOf(-14.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-8.0)},
                {BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(14.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(20.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(28.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(34.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(42.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(48.0)}});
        matrix7.subtract(matrix8);
        assertTrue(matrix7.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0)},
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0)},
                {BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(-1.0)}});
        matrix9.subtract(matrix10);
        assertTrue(matrix9.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(-5.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-3.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-3.0)}});
        matrix11.subtract(matrix12);
        assertTrue(matrix11.equals(result6));
    }

    @DisplayName("Multiplication by scalar")
    @Test
    void multiplyByScalar() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        BigDecimal A = BigDecimal.valueOf(4.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix1, A).equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-6.0)},
                {BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-9.0)}});
        BigDecimal B = BigDecimal.valueOf(-3.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix2, B).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        BigDecimal C = BigDecimal.valueOf(0.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix3, C).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.35), BigDecimal.valueOf(4.7), BigDecimal.valueOf(7.05)},
                {BigDecimal.valueOf(9.4), BigDecimal.valueOf(11.75), BigDecimal.valueOf(14.1)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        BigDecimal D = BigDecimal.valueOf(2.35);
        assertTrue(BigMatrix.multiplyByScalar(matrix4, D).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(70.0), BigDecimal.valueOf(-140.0), BigDecimal.valueOf(210.0), BigDecimal.valueOf(-280.0)},
                {BigDecimal.valueOf(-28.0), BigDecimal.valueOf(56.0), BigDecimal.valueOf(-84.0), BigDecimal.valueOf(112.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(-84.0), BigDecimal.valueOf(126.0), BigDecimal.valueOf(-168.0)},
                {BigDecimal.valueOf(-56.0), BigDecimal.valueOf(112.0), BigDecimal.valueOf(-168.0), BigDecimal.valueOf(280.0)}});
        BigDecimal E = BigDecimal.valueOf(14.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix5, E).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4440.0), BigDecimal.valueOf(-3240.0), BigDecimal.valueOf(2160.0), BigDecimal.valueOf(-1080.0)},
                {BigDecimal.valueOf(-1776.0), BigDecimal.valueOf(1296.0), BigDecimal.valueOf(-864.0), BigDecimal.valueOf(432.0)},
                {BigDecimal.valueOf(2664.0), BigDecimal.valueOf(-1944.0), BigDecimal.valueOf(1296.0), BigDecimal.valueOf(-648.0)},
                {BigDecimal.valueOf(-4032.0), BigDecimal.valueOf(2952.0), BigDecimal.valueOf(-1968.0), BigDecimal.valueOf(984.0)}});
        BigDecimal F = BigDecimal.valueOf(6.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix6, F).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-11.0), BigDecimal.valueOf(-22.0), BigDecimal.valueOf(-33.0), BigDecimal.valueOf(-44.0), BigDecimal.valueOf(-55.0), BigDecimal.valueOf(-66.0), BigDecimal.valueOf(-77.0)},
                {BigDecimal.valueOf(-88.0), BigDecimal.valueOf(-99.0), BigDecimal.valueOf(-110.0), BigDecimal.valueOf(-121.0), BigDecimal.valueOf(-132.0), BigDecimal.valueOf(-143.0), BigDecimal.valueOf(-154.0)},
                {BigDecimal.valueOf(-165.0), BigDecimal.valueOf(-176.0), BigDecimal.valueOf(-187.0), BigDecimal.valueOf(-198.0), BigDecimal.valueOf(-209.0), BigDecimal.valueOf(-220.0), BigDecimal.valueOf(-231.0)},
                {BigDecimal.valueOf(-242.0), BigDecimal.valueOf(-253.0), BigDecimal.valueOf(-264.0), BigDecimal.valueOf(-275.0), BigDecimal.valueOf(-286.0), BigDecimal.valueOf(-297.0), BigDecimal.valueOf(-308.0)},
                {BigDecimal.valueOf(-319.0), BigDecimal.valueOf(-330.0), BigDecimal.valueOf(-341.0), BigDecimal.valueOf(-352.0), BigDecimal.valueOf(-363.0), BigDecimal.valueOf(-374.0), BigDecimal.valueOf(-385.0)},
                {BigDecimal.valueOf(-396.0), BigDecimal.valueOf(-407.0), BigDecimal.valueOf(-418.0), BigDecimal.valueOf(-429.0), BigDecimal.valueOf(-440.0), BigDecimal.valueOf(-451.0), BigDecimal.valueOf(-462.0)},
                {BigDecimal.valueOf(-473.0), BigDecimal.valueOf(-484.0), BigDecimal.valueOf(-495.0), BigDecimal.valueOf(-506.0), BigDecimal.valueOf(-517.0), BigDecimal.valueOf(-528.0), BigDecimal.valueOf(-539.0)}});
        BigDecimal G = BigDecimal.valueOf(-11.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix7, G).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-49.0), BigDecimal.valueOf(-48.0), BigDecimal.valueOf(-47.0), BigDecimal.valueOf(-46.0), BigDecimal.valueOf(-45.0), BigDecimal.valueOf(-44.0), BigDecimal.valueOf(-43.0)},
                {BigDecimal.valueOf(-42.0), BigDecimal.valueOf(-41.0), BigDecimal.valueOf(-40.0), BigDecimal.valueOf(-39.0), BigDecimal.valueOf(-38.0), BigDecimal.valueOf(-37.0), BigDecimal.valueOf(-36.0)},
                {BigDecimal.valueOf(-35.0), BigDecimal.valueOf(-34.0), BigDecimal.valueOf(-33.0), BigDecimal.valueOf(-32.0), BigDecimal.valueOf(-31.0), BigDecimal.valueOf(-30.0), BigDecimal.valueOf(-29.0)},
                {BigDecimal.valueOf(-28.0), BigDecimal.valueOf(-27.0), BigDecimal.valueOf(-26.0), BigDecimal.valueOf(-25.0), BigDecimal.valueOf(-24.0), BigDecimal.valueOf(-23.0), BigDecimal.valueOf(-22.0)},
                {BigDecimal.valueOf(-21.0), BigDecimal.valueOf(-20.0), BigDecimal.valueOf(-19.0), BigDecimal.valueOf(-18.0), BigDecimal.valueOf(-17.0), BigDecimal.valueOf(-16.0), BigDecimal.valueOf(-15.0)},
                {BigDecimal.valueOf(-14.0), BigDecimal.valueOf(-13.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(-11.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-9.0), BigDecimal.valueOf(-8.0)},
                {BigDecimal.valueOf(-7.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-1.0)}});
        BigDecimal H = BigDecimal.valueOf(-1.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix8, H).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        BigDecimal I = BigDecimal.valueOf(1.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix9, I).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0)}});
        BigDecimal J = BigDecimal.valueOf(-2.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix10, J).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(25.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(25.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(20.0)},
                {BigDecimal.valueOf(25.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(20.0)}});
        BigDecimal K = BigDecimal.valueOf(5.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix11, K).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(24.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(21.0)}});
        BigDecimal L = BigDecimal.valueOf(3.0);
        assertTrue(BigMatrix.multiplyByScalar(matrix12, L).equals(result12));
    }

    @Test
    void multiplyByScalar2() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        BigDecimal A = BigDecimal.valueOf(4.0);
        matrix1.multiplyByScalar(A);
        assertTrue(matrix1.equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-6.0)},
                {BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-9.0)}});
        BigDecimal B = BigDecimal.valueOf(-3.0);
        matrix2.multiplyByScalar(B);
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        BigDecimal C = BigDecimal.valueOf(0.0);
        matrix3.multiplyByScalar(C);
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.35), BigDecimal.valueOf(4.7), BigDecimal.valueOf(7.05)},
                {BigDecimal.valueOf(9.4), BigDecimal.valueOf(11.75), BigDecimal.valueOf(14.1)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        BigDecimal D = BigDecimal.valueOf(2.35);
        matrix4.multiplyByScalar(D);
        assertTrue(matrix4.equals(result4));


        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(70.0), BigDecimal.valueOf(-140.0), BigDecimal.valueOf(210.0), BigDecimal.valueOf(-280.0)},
                {BigDecimal.valueOf(-28.0), BigDecimal.valueOf(56.0), BigDecimal.valueOf(-84.0), BigDecimal.valueOf(112.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(-84.0), BigDecimal.valueOf(126.0), BigDecimal.valueOf(-168.0)},
                {BigDecimal.valueOf(-56.0), BigDecimal.valueOf(112.0), BigDecimal.valueOf(-168.0), BigDecimal.valueOf(280.0)}});
        BigDecimal E = BigDecimal.valueOf(14.0);
        matrix5.multiplyByScalar(E);
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4440.0), BigDecimal.valueOf(-3240.0), BigDecimal.valueOf(2160.0), BigDecimal.valueOf(-1080.0)},
                {BigDecimal.valueOf(-1776.0), BigDecimal.valueOf(1296.0), BigDecimal.valueOf(-864.0), BigDecimal.valueOf(432.0)},
                {BigDecimal.valueOf(2664.0), BigDecimal.valueOf(-1944.0), BigDecimal.valueOf(1296.0), BigDecimal.valueOf(-648.0)},
                {BigDecimal.valueOf(-4032.0), BigDecimal.valueOf(2952.0), BigDecimal.valueOf(-1968.0), BigDecimal.valueOf(984.0)}});
        BigDecimal F = BigDecimal.valueOf(6.0);
        matrix6.multiplyByScalar(F);
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-11.0), BigDecimal.valueOf(-22.0), BigDecimal.valueOf(-33.0), BigDecimal.valueOf(-44.0), BigDecimal.valueOf(-55.0), BigDecimal.valueOf(-66.0), BigDecimal.valueOf(-77.0)},
                {BigDecimal.valueOf(-88.0), BigDecimal.valueOf(-99.0), BigDecimal.valueOf(-110.0), BigDecimal.valueOf(-121.0), BigDecimal.valueOf(-132.0), BigDecimal.valueOf(-143.0), BigDecimal.valueOf(-154.0)},
                {BigDecimal.valueOf(-165.0), BigDecimal.valueOf(-176.0), BigDecimal.valueOf(-187.0), BigDecimal.valueOf(-198.0), BigDecimal.valueOf(-209.0), BigDecimal.valueOf(-220.0), BigDecimal.valueOf(-231.0)},
                {BigDecimal.valueOf(-242.0), BigDecimal.valueOf(-253.0), BigDecimal.valueOf(-264.0), BigDecimal.valueOf(-275.0), BigDecimal.valueOf(-286.0), BigDecimal.valueOf(-297.0), BigDecimal.valueOf(-308.0)},
                {BigDecimal.valueOf(-319.0), BigDecimal.valueOf(-330.0), BigDecimal.valueOf(-341.0), BigDecimal.valueOf(-352.0), BigDecimal.valueOf(-363.0), BigDecimal.valueOf(-374.0), BigDecimal.valueOf(-385.0)},
                {BigDecimal.valueOf(-396.0), BigDecimal.valueOf(-407.0), BigDecimal.valueOf(-418.0), BigDecimal.valueOf(-429.0), BigDecimal.valueOf(-440.0), BigDecimal.valueOf(-451.0), BigDecimal.valueOf(-462.0)},
                {BigDecimal.valueOf(-473.0), BigDecimal.valueOf(-484.0), BigDecimal.valueOf(-495.0), BigDecimal.valueOf(-506.0), BigDecimal.valueOf(-517.0), BigDecimal.valueOf(-528.0), BigDecimal.valueOf(-539.0)}});
        BigDecimal G = BigDecimal.valueOf(-11.0);
        matrix7.multiplyByScalar(G);
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-49.0), BigDecimal.valueOf(-48.0), BigDecimal.valueOf(-47.0), BigDecimal.valueOf(-46.0), BigDecimal.valueOf(-45.0), BigDecimal.valueOf(-44.0), BigDecimal.valueOf(-43.0)},
                {BigDecimal.valueOf(-42.0), BigDecimal.valueOf(-41.0), BigDecimal.valueOf(-40.0), BigDecimal.valueOf(-39.0), BigDecimal.valueOf(-38.0), BigDecimal.valueOf(-37.0), BigDecimal.valueOf(-36.0)},
                {BigDecimal.valueOf(-35.0), BigDecimal.valueOf(-34.0), BigDecimal.valueOf(-33.0), BigDecimal.valueOf(-32.0), BigDecimal.valueOf(-31.0), BigDecimal.valueOf(-30.0), BigDecimal.valueOf(-29.0)},
                {BigDecimal.valueOf(-28.0), BigDecimal.valueOf(-27.0), BigDecimal.valueOf(-26.0), BigDecimal.valueOf(-25.0), BigDecimal.valueOf(-24.0), BigDecimal.valueOf(-23.0), BigDecimal.valueOf(-22.0)},
                {BigDecimal.valueOf(-21.0), BigDecimal.valueOf(-20.0), BigDecimal.valueOf(-19.0), BigDecimal.valueOf(-18.0), BigDecimal.valueOf(-17.0), BigDecimal.valueOf(-16.0), BigDecimal.valueOf(-15.0)},
                {BigDecimal.valueOf(-14.0), BigDecimal.valueOf(-13.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(-11.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-9.0), BigDecimal.valueOf(-8.0)},
                {BigDecimal.valueOf(-7.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-3.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-1.0)}});
        BigDecimal H = BigDecimal.valueOf(-1.0);
        matrix8.multiplyByScalar(H);
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        BigDecimal I = BigDecimal.valueOf(1.0);
        matrix9.multiplyByScalar(I);
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0), BigDecimal.valueOf(-2.0)}});
        BigDecimal J = BigDecimal.valueOf(-2.0);
        matrix10.multiplyByScalar(J);
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(25.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(25.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(20.0)},
                {BigDecimal.valueOf(25.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(20.0)}});
        BigDecimal K = BigDecimal.valueOf(5.0);
        matrix11.multiplyByScalar(K);
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(24.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(21.0)}});
        BigDecimal L = BigDecimal.valueOf(3.0);
        matrix12.multiplyByScalar(L);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Multiplication")
    @Test
    void multiply() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.multiply(matrix1, matrix2).equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-11.0), BigDecimal.valueOf(-25.0), BigDecimal.valueOf(-39.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.multiply(matrix3, matrix4).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(26760.0), BigDecimal.valueOf(-19560.0), BigDecimal.valueOf(13040.0), BigDecimal.valueOf(-6520.0)},
                {BigDecimal.valueOf(-10704.0), BigDecimal.valueOf(7824.0), BigDecimal.valueOf(-5216.0), BigDecimal.valueOf(2608.0)},
                {BigDecimal.valueOf(16056.0), BigDecimal.valueOf(-11736.0), BigDecimal.valueOf(7824.0), BigDecimal.valueOf(-3912.0)},
                {BigDecimal.valueOf(-24096.0), BigDecimal.valueOf(17616.0), BigDecimal.valueOf(-11744.0), BigDecimal.valueOf(5872.0)}});
        assertTrue(BigMatrix.multiply(matrix5, matrix6).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(588.0), BigDecimal.valueOf(560.0), BigDecimal.valueOf(532.0), BigDecimal.valueOf(504.0), BigDecimal.valueOf(476.0), BigDecimal.valueOf(448.0), BigDecimal.valueOf(420.0)},
                {BigDecimal.valueOf(1960.0), BigDecimal.valueOf(1883.0), BigDecimal.valueOf(1806.0), BigDecimal.valueOf(1729.0), BigDecimal.valueOf(1652.0), BigDecimal.valueOf(1575.0), BigDecimal.valueOf(1498.0)},
                {BigDecimal.valueOf(3332.0), BigDecimal.valueOf(3206.0), BigDecimal.valueOf(3080.0), BigDecimal.valueOf(2954.0), BigDecimal.valueOf(2828.0), BigDecimal.valueOf(2702.0), BigDecimal.valueOf(2576.0)},
                {BigDecimal.valueOf(4704.0), BigDecimal.valueOf(4529.0), BigDecimal.valueOf(4354.0), BigDecimal.valueOf(4179.0), BigDecimal.valueOf(4004.0), BigDecimal.valueOf(3829.0), BigDecimal.valueOf(3654.0)},
                {BigDecimal.valueOf(6076.0), BigDecimal.valueOf(5852.0), BigDecimal.valueOf(5628.0), BigDecimal.valueOf(5404.0), BigDecimal.valueOf(5180.0), BigDecimal.valueOf(4956.0), BigDecimal.valueOf(4732.0)},
                {BigDecimal.valueOf(7448.0), BigDecimal.valueOf(7175.0), BigDecimal.valueOf(6902.0), BigDecimal.valueOf(6629.0), BigDecimal.valueOf(6356.0), BigDecimal.valueOf(6083.0), BigDecimal.valueOf(5810.0)},
                {BigDecimal.valueOf(8820.0), BigDecimal.valueOf(8498.0), BigDecimal.valueOf(8176.0), BigDecimal.valueOf(7854.0), BigDecimal.valueOf(7532.0), BigDecimal.valueOf(7210.0), BigDecimal.valueOf(6888.0)}});
        assertTrue(BigMatrix.multiply(matrix7, matrix8).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.multiply(matrix9, matrix10).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(65.0), BigDecimal.valueOf(128.0), BigDecimal.valueOf(124.0)},
                {BigDecimal.valueOf(70.0), BigDecimal.valueOf(137.0), BigDecimal.valueOf(131.0)},
                {BigDecimal.valueOf(70.0), BigDecimal.valueOf(137.0), BigDecimal.valueOf(131.0)}});
        assertTrue(BigMatrix.multiply(matrix11, matrix12).equals(result6));
    }

    @Test
    void multiply2() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix1.multiply(matrix2);
        assertTrue(matrix1.equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-11.0), BigDecimal.valueOf(-25.0), BigDecimal.valueOf(-39.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(-5.0), BigDecimal.valueOf(-6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.multiply(matrix4);
        assertTrue(matrix3.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(26760.0), BigDecimal.valueOf(-19560.0), BigDecimal.valueOf(13040.0), BigDecimal.valueOf(-6520.0)},
                {BigDecimal.valueOf(-10704.0), BigDecimal.valueOf(7824.0), BigDecimal.valueOf(-5216.0), BigDecimal.valueOf(2608.0)},
                {BigDecimal.valueOf(16056.0), BigDecimal.valueOf(-11736.0), BigDecimal.valueOf(7824.0), BigDecimal.valueOf(-3912.0)},
                {BigDecimal.valueOf(-24096.0), BigDecimal.valueOf(17616.0), BigDecimal.valueOf(-11744.0), BigDecimal.valueOf(5872.0)}});
        matrix5.multiply(matrix6);
        assertTrue(matrix5.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(588.0), BigDecimal.valueOf(560.0), BigDecimal.valueOf(532.0), BigDecimal.valueOf(504.0), BigDecimal.valueOf(476.0), BigDecimal.valueOf(448.0), BigDecimal.valueOf(420.0)},
                {BigDecimal.valueOf(1960.0), BigDecimal.valueOf(1883.0), BigDecimal.valueOf(1806.0), BigDecimal.valueOf(1729.0), BigDecimal.valueOf(1652.0), BigDecimal.valueOf(1575.0), BigDecimal.valueOf(1498.0)},
                {BigDecimal.valueOf(3332.0), BigDecimal.valueOf(3206.0), BigDecimal.valueOf(3080.0), BigDecimal.valueOf(2954.0), BigDecimal.valueOf(2828.0), BigDecimal.valueOf(2702.0), BigDecimal.valueOf(2576.0)},
                {BigDecimal.valueOf(4704.0), BigDecimal.valueOf(4529.0), BigDecimal.valueOf(4354.0), BigDecimal.valueOf(4179.0), BigDecimal.valueOf(4004.0), BigDecimal.valueOf(3829.0), BigDecimal.valueOf(3654.0)},
                {BigDecimal.valueOf(6076.0), BigDecimal.valueOf(5852.0), BigDecimal.valueOf(5628.0), BigDecimal.valueOf(5404.0), BigDecimal.valueOf(5180.0), BigDecimal.valueOf(4956.0), BigDecimal.valueOf(4732.0)},
                {BigDecimal.valueOf(7448.0), BigDecimal.valueOf(7175.0), BigDecimal.valueOf(6902.0), BigDecimal.valueOf(6629.0), BigDecimal.valueOf(6356.0), BigDecimal.valueOf(6083.0), BigDecimal.valueOf(5810.0)},
                {BigDecimal.valueOf(8820.0), BigDecimal.valueOf(8498.0), BigDecimal.valueOf(8176.0), BigDecimal.valueOf(7854.0), BigDecimal.valueOf(7532.0), BigDecimal.valueOf(7210.0), BigDecimal.valueOf(6888.0)}});
        matrix7.multiply(matrix8);
        assertTrue(matrix7.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix9.multiply(matrix10);
        assertTrue(matrix9.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(65.0), BigDecimal.valueOf(128.0), BigDecimal.valueOf(124.0)},
                {BigDecimal.valueOf(70.0), BigDecimal.valueOf(137.0), BigDecimal.valueOf(131.0)},
                {BigDecimal.valueOf(70.0), BigDecimal.valueOf(137.0), BigDecimal.valueOf(131.0)}});
        matrix11.multiply(matrix12);
        assertTrue(matrix11.equals(result6));
    }

    @DisplayName("Determinant")
    @Test
    void determinant() {
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix1)));
        assertEquals(0, BigDecimal.valueOf(-1.0).compareTo(BigMatrix.determinant(matrix2)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix3)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix4)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix5)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix6)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix7)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix8)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix9)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix10)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix11)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.determinant(matrix12)));
    }

    @Test
    void determinant2() {
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix1.determinant()));
        assertEquals(0, BigDecimal.valueOf(-1.0).compareTo(matrix2.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix3.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix4.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix4.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix6.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix7.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix8.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix9.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix10.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix11.determinant()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix12.determinant()));
    }

    @DisplayName("Trace")
    @Test
    void trace() {
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.trace(matrix1)));
        assertEquals(0, BigDecimal.valueOf(4.0).compareTo(BigMatrix.trace(matrix2)));
        assertEquals(0, BigDecimal.valueOf(-16.0).compareTo(BigMatrix.trace(matrix3)));
        assertEquals(0, BigDecimal.valueOf(6.0).compareTo(BigMatrix.trace(matrix4)));
        assertEquals(0, BigDecimal.valueOf(38.0).compareTo(BigMatrix.trace(matrix5)));
        assertEquals(0, BigDecimal.valueOf(1336.0).compareTo(BigMatrix.trace(matrix6)));
        assertEquals(0, BigDecimal.valueOf(175.0).compareTo(BigMatrix.trace(matrix7)));
        assertEquals(0, BigDecimal.valueOf(175.0).compareTo(BigMatrix.trace(matrix8)));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(BigMatrix.trace(matrix9)));
        assertEquals(0, BigDecimal.valueOf(3.0).compareTo(BigMatrix.trace(matrix10)));
        assertEquals(0, BigDecimal.valueOf(18.0).compareTo(BigMatrix.trace(matrix11)));
        assertEquals(0, BigDecimal.valueOf(17.0).compareTo(BigMatrix.trace(matrix12)));
    }

    @Test
    void trace2() {
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix1.trace()));
        assertEquals(0, BigDecimal.valueOf(4.0).compareTo(matrix2.trace()));
        assertEquals(0, BigDecimal.valueOf(-16.0).compareTo(matrix3.trace()));
        assertEquals(0, BigDecimal.valueOf(6.0).compareTo(matrix4.trace()));
        assertEquals(0, BigDecimal.valueOf(38.0).compareTo(matrix5.trace()));
        assertEquals(0, BigDecimal.valueOf(1336.0).compareTo(matrix6.trace()));
        assertEquals(0, BigDecimal.valueOf(175.0).compareTo(matrix7.trace()));
        assertEquals(0, BigDecimal.valueOf(175.0).compareTo(matrix8.trace()));
        assertEquals(0, BigDecimal.valueOf(0.0).compareTo(matrix9.trace()));
        assertEquals(0, BigDecimal.valueOf(3.0).compareTo(matrix10.trace()));
        assertEquals(0, BigDecimal.valueOf(18.0).compareTo(matrix11.trace()));
        assertEquals(0, BigDecimal.valueOf(17.0).compareTo(matrix12.trace()));
    }

    @DisplayName("Minor")
    @Test
    void Minor() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{{BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.minor(matrix1, 0, 0).equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{{BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.minor(matrix2, 1, 1).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-1), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        assertTrue(BigMatrix.minor(matrix3, 0, 0).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2)},
                {BigDecimal.valueOf(4), BigDecimal.valueOf(5)}});
        assertTrue(BigMatrix.minor(matrix4, 2, 2).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(-10), BigDecimal.valueOf(-20)},
                {BigDecimal.valueOf(3), BigDecimal.valueOf(-6), BigDecimal.valueOf(-12)},
                {BigDecimal.valueOf(-4), BigDecimal.valueOf(8), BigDecimal.valueOf(20)}});
        assertTrue(BigMatrix.minor(matrix5, 1, 2).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740), BigDecimal.valueOf(360), BigDecimal.valueOf(-180)},
                {BigDecimal.valueOf(-296), BigDecimal.valueOf(-144), BigDecimal.valueOf(72)},
                {BigDecimal.valueOf(444), BigDecimal.valueOf(216), BigDecimal.valueOf(-108)}});
        assertTrue(BigMatrix.minor(matrix6, 3, 1).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4), BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(9), BigDecimal.valueOf(10), BigDecimal.valueOf(11), BigDecimal.valueOf(12), BigDecimal.valueOf(13), BigDecimal.valueOf(14)},
                {BigDecimal.valueOf(16), BigDecimal.valueOf(17), BigDecimal.valueOf(18), BigDecimal.valueOf(19), BigDecimal.valueOf(20), BigDecimal.valueOf(21)},
                {BigDecimal.valueOf(23), BigDecimal.valueOf(24), BigDecimal.valueOf(25), BigDecimal.valueOf(26), BigDecimal.valueOf(27), BigDecimal.valueOf(28)},
                {BigDecimal.valueOf(37), BigDecimal.valueOf(38), BigDecimal.valueOf(39), BigDecimal.valueOf(40), BigDecimal.valueOf(41), BigDecimal.valueOf(42)},
                {BigDecimal.valueOf(44), BigDecimal.valueOf(45), BigDecimal.valueOf(46), BigDecimal.valueOf(47), BigDecimal.valueOf(48), BigDecimal.valueOf(49)}});
        assertTrue(BigMatrix.minor(matrix7, 4, 0).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(41), BigDecimal.valueOf(40), BigDecimal.valueOf(39), BigDecimal.valueOf(38), BigDecimal.valueOf(37), BigDecimal.valueOf(36)},
                {BigDecimal.valueOf(34), BigDecimal.valueOf(33), BigDecimal.valueOf(32), BigDecimal.valueOf(31), BigDecimal.valueOf(30), BigDecimal.valueOf(29)},
                {BigDecimal.valueOf(27), BigDecimal.valueOf(26), BigDecimal.valueOf(25), BigDecimal.valueOf(24), BigDecimal.valueOf(23), BigDecimal.valueOf(22)},
                {BigDecimal.valueOf(20), BigDecimal.valueOf(19), BigDecimal.valueOf(18), BigDecimal.valueOf(17), BigDecimal.valueOf(16), BigDecimal.valueOf(15)},
                {BigDecimal.valueOf(13), BigDecimal.valueOf(12), BigDecimal.valueOf(11), BigDecimal.valueOf(10), BigDecimal.valueOf(9), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(6), BigDecimal.valueOf(5), BigDecimal.valueOf(4), BigDecimal.valueOf(3), BigDecimal.valueOf(2), BigDecimal.valueOf(1)}});
        assertTrue(BigMatrix.minor(matrix8, 0, 0).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        assertTrue(BigMatrix.minor(matrix9, 0, 1).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1)},
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1)}});
        assertTrue(BigMatrix.minor(matrix10, 1, 1).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(3)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(4)}});
        assertTrue(BigMatrix.minor(matrix11, 1, 1).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(7)}});
        assertTrue(BigMatrix.minor(matrix12, 0, 1).equals(result12));
    }

    @Test
    void Minor2() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{{BigDecimal.valueOf(0.0)}});
        matrix1.minor(0, 0);
        assertTrue(matrix1.equals(result));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{{BigDecimal.valueOf(1.0)}});
        matrix2.minor(1, 1);
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-1), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix3.minor(0, 0);
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(2)},
                {BigDecimal.valueOf(4), BigDecimal.valueOf(5)}});
        matrix4.minor(2, 2);
        assertTrue(matrix4.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(-10), BigDecimal.valueOf(-20)},
                {BigDecimal.valueOf(3), BigDecimal.valueOf(-6), BigDecimal.valueOf(-12)},
                {BigDecimal.valueOf(-4), BigDecimal.valueOf(8), BigDecimal.valueOf(20)}});
        matrix5.minor(1, 2);
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740), BigDecimal.valueOf(360), BigDecimal.valueOf(-180)},
                {BigDecimal.valueOf(-296), BigDecimal.valueOf(-144), BigDecimal.valueOf(72)},
                {BigDecimal.valueOf(444), BigDecimal.valueOf(216), BigDecimal.valueOf(-108)}});
        matrix6.minor(3, 1);
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4), BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(9), BigDecimal.valueOf(10), BigDecimal.valueOf(11), BigDecimal.valueOf(12), BigDecimal.valueOf(13), BigDecimal.valueOf(14)},
                {BigDecimal.valueOf(16), BigDecimal.valueOf(17), BigDecimal.valueOf(18), BigDecimal.valueOf(19), BigDecimal.valueOf(20), BigDecimal.valueOf(21)},
                {BigDecimal.valueOf(23), BigDecimal.valueOf(24), BigDecimal.valueOf(25), BigDecimal.valueOf(26), BigDecimal.valueOf(27), BigDecimal.valueOf(28)},
                {BigDecimal.valueOf(37), BigDecimal.valueOf(38), BigDecimal.valueOf(39), BigDecimal.valueOf(40), BigDecimal.valueOf(41), BigDecimal.valueOf(42)},
                {BigDecimal.valueOf(44), BigDecimal.valueOf(45), BigDecimal.valueOf(46), BigDecimal.valueOf(47), BigDecimal.valueOf(48), BigDecimal.valueOf(49)}});
        matrix7.minor(4, 0);
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(41), BigDecimal.valueOf(40), BigDecimal.valueOf(39), BigDecimal.valueOf(38), BigDecimal.valueOf(37), BigDecimal.valueOf(36)},
                {BigDecimal.valueOf(34), BigDecimal.valueOf(33), BigDecimal.valueOf(32), BigDecimal.valueOf(31), BigDecimal.valueOf(30), BigDecimal.valueOf(29)},
                {BigDecimal.valueOf(27), BigDecimal.valueOf(26), BigDecimal.valueOf(25), BigDecimal.valueOf(24), BigDecimal.valueOf(23), BigDecimal.valueOf(22)},
                {BigDecimal.valueOf(20), BigDecimal.valueOf(19), BigDecimal.valueOf(18), BigDecimal.valueOf(17), BigDecimal.valueOf(16), BigDecimal.valueOf(15)},
                {BigDecimal.valueOf(13), BigDecimal.valueOf(12), BigDecimal.valueOf(11), BigDecimal.valueOf(10), BigDecimal.valueOf(9), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(6), BigDecimal.valueOf(5), BigDecimal.valueOf(4), BigDecimal.valueOf(3), BigDecimal.valueOf(2), BigDecimal.valueOf(1)}});
        matrix8.minor(0, 0);
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix9.minor(0, 1);
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1)},
                {BigDecimal.valueOf(1), BigDecimal.valueOf(1)}});
        matrix10.minor(1, 1);
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(3)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(4)}});
        matrix11.minor(1, 1);
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(5), BigDecimal.valueOf(7)}});
        matrix12.minor(0, 1);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Algebraic complement")
    @Test
    void AlgebraicComplement() {
        BigMatrix result13 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(-5)},
                {BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(-8)}});
        assertTrue(BigMatrix.algebraicComplement(matrix13).equals(result13));

        BigMatrix result14 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(5), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(-8)}});
        assertTrue(BigMatrix.algebraicComplement(matrix14).equals(result14));

        BigMatrix result15 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(-69), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(-71)},
                {BigDecimal.valueOf(-71), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(-69), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        assertTrue(BigMatrix.algebraicComplement(matrix15).equals(result15));
    }

    @Test
    void AlgebraicComplement2() {
        BigMatrix result13 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(-5)},
                {BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(7)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(-8)}});
        matrix13.algebraicComplement();
        assertTrue(matrix13.equals(result13));

        BigMatrix result14 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(5), BigDecimal.valueOf(8)},
                {BigDecimal.valueOf(-2), BigDecimal.valueOf(-3), BigDecimal.valueOf(-8)}});
        matrix14.algebraicComplement();
        assertTrue(matrix14.equals(result14));

        BigMatrix result15 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(-69), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(-71)},
                {BigDecimal.valueOf(-71), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(-69), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix15.algebraicComplement();
        assertTrue(matrix15.equals(result15));
    }

    @DisplayName("Transpose")
    @Test
    void transpose() {
        BigMatrix result13 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(2)},
                {BigDecimal.valueOf(2), BigDecimal.valueOf(-2), BigDecimal.valueOf(-3)},
                {BigDecimal.valueOf(-1), BigDecimal.valueOf(0), BigDecimal.valueOf(1)}});
        assertTrue(BigMatrix.transpose(matrix13).equals(result13));

        BigMatrix result14 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(4)},
                {BigDecimal.valueOf(2), BigDecimal.valueOf(-2), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(-1), BigDecimal.valueOf(0), BigDecimal.valueOf(1)}});
        assertTrue(BigMatrix.transpose(matrix14).equals(result14));

        BigMatrix result15 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(69), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(71)},
                {BigDecimal.valueOf(71), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(69), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        assertTrue(BigMatrix.transpose(matrix15).equals(result15));
    }

    @Test
    void transpose2() {
        BigMatrix result13 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(2)},
                {BigDecimal.valueOf(2), BigDecimal.valueOf(-2), BigDecimal.valueOf(-3)},
                {BigDecimal.valueOf(-1), BigDecimal.valueOf(0), BigDecimal.valueOf(1)}});
        matrix13.transpose();
        assertTrue(matrix13.equals(result13));

        BigMatrix result14 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1), BigDecimal.valueOf(3), BigDecimal.valueOf(4)},
                {BigDecimal.valueOf(2), BigDecimal.valueOf(-2), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(-1), BigDecimal.valueOf(0), BigDecimal.valueOf(1)}});
        matrix14.transpose();
        assertTrue(matrix14.equals(result14));

        BigMatrix result15 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(69), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(71)},
                {BigDecimal.valueOf(71), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(69), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix15.transpose();
        assertTrue(matrix15.equals(result15));
    }

    @DisplayName("Inverse")
    @Test
    void Inverse() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.0 / 3.0), BigDecimal.valueOf(-1.0 / 3.0), BigDecimal.valueOf(2.0 / 3.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(5.0 / 3.0), BigDecimal.valueOf(-7.0 / 3.0), BigDecimal.valueOf(8.0 / 3.0)}});
        assertTrue(BigMatrix.inverse(matrix13).equals(result, 0.0001));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0 / 8.0), BigDecimal.valueOf(1.0 / 8.0), BigDecimal.valueOf(1.0 / 8.0)},
                {BigDecimal.valueOf(3.0 / 16.0), BigDecimal.valueOf(-5.0 / 16.0), BigDecimal.valueOf(3.0 / 16.0)},
                {BigDecimal.valueOf(-1.0 / 2.0), BigDecimal.valueOf(-1.0 / 2.0), BigDecimal.valueOf(1.0 / 2.0)}});
        assertTrue(BigMatrix.inverse(matrix14).equals(result2, 0.0001));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(-71), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(-69)},
                {BigDecimal.valueOf(-69), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(-71), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        assertTrue(BigMatrix.inverse(matrix15).equals(result3, 0.0001));
    }

    @Test
    void Inverse2() {
        BigMatrix result = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.0 / 3.0), BigDecimal.valueOf(-1.0 / 3.0), BigDecimal.valueOf(2.0 / 3.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(5.0 / 3.0), BigDecimal.valueOf(-7.0 / 3.0), BigDecimal.valueOf(8.0 / 3.0)}});
        matrix13.inverse();
        assertTrue(matrix13.equals(result, 0.0001));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0 / 8.0), BigDecimal.valueOf(1.0 / 8.0), BigDecimal.valueOf(1.0 / 8.0)},
                {BigDecimal.valueOf(3.0 / 16.0), BigDecimal.valueOf(-5.0 / 16.0), BigDecimal.valueOf(3.0 / 16.0)},
                {BigDecimal.valueOf(-1.0 / 2.0), BigDecimal.valueOf(-1.0 / 2.0), BigDecimal.valueOf(1.0 / 2.0)}});
        matrix14.inverse();
        assertTrue(matrix14.equals(result2, 0.0001));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(-71), BigDecimal.valueOf(70)},
                {BigDecimal.valueOf(0), BigDecimal.valueOf(0), BigDecimal.valueOf(70), BigDecimal.valueOf(-69)},
                {BigDecimal.valueOf(-69), BigDecimal.valueOf(70), BigDecimal.valueOf(0), BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(70), BigDecimal.valueOf(-71), BigDecimal.valueOf(0), BigDecimal.valueOf(0)}});
        matrix15.inverse();
        assertTrue(matrix15.equals(result3, 0.0001));
    }

    @DisplayName("Setter and Getter")
    @Test
    void set_get() {

        matrix13.set(0, 0, BigDecimal.valueOf(5));
        matrix13.set(1, 2, BigDecimal.valueOf(-20));
        matrix13.set(2, 2, BigDecimal.valueOf(15020));
        assertEquals(BigDecimal.valueOf(5), matrix13.get(0, 0));
        assertEquals(BigDecimal.valueOf(-20), matrix13.get(1, 2));
        assertEquals(BigDecimal.valueOf(15020), matrix13.get(2, 2));

        matrix14.set(0, 0, BigDecimal.valueOf(215));
        matrix14.set(2, 1, BigDecimal.valueOf(Integer.MAX_VALUE));
        matrix14.set(2, 2, BigDecimal.valueOf(Integer.MIN_VALUE));
        assertEquals(BigDecimal.valueOf(215), matrix14.get(0, 0));
        assertEquals(BigDecimal.valueOf(Integer.MAX_VALUE), matrix14.get(2, 1));
        assertEquals(BigDecimal.valueOf(Integer.MIN_VALUE), matrix14.get(2, 2));

        matrix15.set(0, 0, BigDecimal.valueOf(3928));
        matrix15.set(1, 0, BigDecimal.valueOf(-213992132));
        matrix15.set(3, 3, BigDecimal.valueOf(231232321));
        assertEquals(BigDecimal.valueOf(3928), matrix15.get(0, 0));
        assertEquals(BigDecimal.valueOf(-213992132), matrix15.get(1, 0));
        assertEquals(BigDecimal.valueOf(231232321), matrix15.get(3, 3));

    }

    @DisplayName("Remove col")
    @Test
    void removeCol() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeCol(matrix1, 1).equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(2.0)}});
        assertTrue(BigMatrix.removeCol(matrix2, 1).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeCol(matrix3, 2).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeCol(matrix4, 0).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-12.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(20.0)}});
        assertTrue(BigMatrix.removeCol(matrix5, 2).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0)},
                {BigDecimal.valueOf(-672.0), BigDecimal.valueOf(492.0), BigDecimal.valueOf(-328.0)}});
        assertTrue(BigMatrix.removeCol(matrix6, 3).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(28.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        assertTrue(BigMatrix.removeCol(matrix7, 3).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(44.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(37.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(30.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(23.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(16.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0)},
                {BigDecimal.valueOf(7.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(2.0)}});
        assertTrue(BigMatrix.removeCol(matrix8, 6).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeCol(matrix9, 1).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.removeCol(matrix10, 1).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0)}});
        assertTrue(BigMatrix.removeCol(matrix11, 2).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        assertTrue(BigMatrix.removeCol(matrix12, 0).equals(result12));
    }

    @Test
    void removeCol2() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0)}});
        matrix1.removeCol(1);
        assertTrue(matrix1.equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(2.0)}});
        matrix2.removeCol(1);
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.removeCol(2);
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix4.removeCol(0);
        assertTrue(matrix4.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(-12.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(20.0)}});
        matrix5.removeCol(2);
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0)},
                {BigDecimal.valueOf(-672.0), BigDecimal.valueOf(492.0), BigDecimal.valueOf(-328.0)}});
        matrix6.removeCol(3);
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(28.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        matrix7.removeCol(3);
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(44.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(37.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(30.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(23.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(16.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0)},
                {BigDecimal.valueOf(7.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(2.0)}});
        matrix8.removeCol(6);
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix9.removeCol(1);
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        matrix10.removeCol(1);
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0)}});
        matrix11.removeCol(2);
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        matrix12.removeCol(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Remove row")
    @Test
    void removeRow() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeRow(matrix1, 0).equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)}});
        assertTrue(BigMatrix.removeRow(matrix2, 1).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(7.0)}});
        assertTrue(BigMatrix.removeRow(matrix3, 2).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeRow(matrix4, 0).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(15.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(20.0)}});
        assertTrue(BigMatrix.removeRow(matrix5, 2).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0), BigDecimal.valueOf(-180.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0), BigDecimal.valueOf(72.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-108.0)}});
        assertTrue(BigMatrix.removeRow(matrix6, 3).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        assertTrue(BigMatrix.removeRow(matrix7, 3).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(43.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(29.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(22.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(8.0)}});
        assertTrue(BigMatrix.removeRow(matrix8, 6).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.removeRow(matrix9, 1).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.removeRow(matrix10, 1).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)}});
        assertTrue(BigMatrix.removeRow(matrix11, 2).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        assertTrue(BigMatrix.removeRow(matrix12, 0).equals(result12));
    }

    @Test
    void removeRow2() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix1.removeRow(0);
        assertTrue(matrix1.equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)}});
        matrix2.removeRow(1);
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(7.0)}});
        matrix3.removeRow(2);
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix4.removeRow(0);
        assertTrue(matrix4.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(15.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(20.0)}});
        matrix5.removeRow(2);
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0), BigDecimal.valueOf(-180.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0), BigDecimal.valueOf(72.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-108.0)}});
        matrix6.removeRow(3);
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        matrix7.removeRow(3);
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(43.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(29.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(22.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(8.0)}});
        matrix8.removeRow(6);
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix9.removeRow(1);
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        matrix10.removeRow(1);
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)}});
        matrix11.removeRow(2);
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        matrix12.removeRow(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Add column")
    @Test
    void addColumn() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addCol(matrix1, 0).equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(3.0)}});
        assertTrue(BigMatrix.addCol(matrix2, 1).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addCol(matrix3, 2).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addCol(matrix4, 0).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(15.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(-12.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(20.0)}});
        assertTrue(BigMatrix.addCol(matrix5, 2).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0), BigDecimal.valueOf(-180.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0), BigDecimal.valueOf(72.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-108.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(-672.0), BigDecimal.valueOf(492.0), BigDecimal.valueOf(-328.0), BigDecimal.valueOf(164.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addCol(matrix6, 4).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(28.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        assertTrue(BigMatrix.addCol(matrix7, 3).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(43.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(29.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(22.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(7.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.addCol(matrix8, 5).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addCol(matrix9, 1).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.addCol(matrix10, 1).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0)}});
        assertTrue(BigMatrix.addCol(matrix11, 2).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        assertTrue(BigMatrix.addCol(matrix12, 0).equals(result12));
    }

    @Test
    void addColumn2() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix1.addCol(0);
        assertTrue(matrix1.equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(3.0)}});
        matrix2.addCol(1);
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.addCol(2);
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix4.addCol(0);
        assertTrue(matrix4.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(15.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(-12.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(20.0)}});
        matrix5.addCol(2);
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0), BigDecimal.valueOf(-180.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0), BigDecimal.valueOf(72.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-108.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(-672.0), BigDecimal.valueOf(492.0), BigDecimal.valueOf(-328.0), BigDecimal.valueOf(164.0), BigDecimal.valueOf(0.0)}});
        matrix6.addCol(4);
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(28.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        matrix7.addCol(3);
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(43.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(29.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(22.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(7.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(1.0)}});
        matrix8.addCol(5);
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix9.addCol(1);
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        matrix10.addCol(1);
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(4.0)}});
        matrix11.addCol(2);
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        matrix12.addCol(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Add row")
    @Test
    void addRow() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addRow(matrix1, 0).equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)}});
        assertTrue(BigMatrix.addRow(matrix2, 1).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addRow(matrix3, 3).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addRow(matrix4, 2).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(15.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(-12.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(20.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addRow(matrix5, 4).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0), BigDecimal.valueOf(-180.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0), BigDecimal.valueOf(72.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-108.0)},
                {BigDecimal.valueOf(-672.0), BigDecimal.valueOf(492.0), BigDecimal.valueOf(-328.0), BigDecimal.valueOf(164.0)}});
        assertTrue(BigMatrix.addRow(matrix6, 1).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(28.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        assertTrue(BigMatrix.addRow(matrix7, 0).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(43.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(29.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(22.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(7.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.addRow(matrix8, 5).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addRow(matrix9, 2).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.addRow(matrix10, 1).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.addRow(matrix11, 3).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        assertTrue(BigMatrix.addRow(matrix12, 0).equals(result12));
    }

    @Test
    void addRow2() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix1.addRow(0);
        assertTrue(matrix1.equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)}});
        matrix2.addRow(1);
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.addRow(3);
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix4.addRow(2);
        assertTrue(matrix4.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(-10.0), BigDecimal.valueOf(15.0), BigDecimal.valueOf(-20.0)},
                {BigDecimal.valueOf(-2.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(3.0), BigDecimal.valueOf(-6.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(-12.0)},
                {BigDecimal.valueOf(-4.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(-12.0), BigDecimal.valueOf(20.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix5.addRow(4);
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(740.0), BigDecimal.valueOf(-540.0), BigDecimal.valueOf(360.0), BigDecimal.valueOf(-180.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(-296.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-144.0), BigDecimal.valueOf(72.0)},
                {BigDecimal.valueOf(444.0), BigDecimal.valueOf(-324.0), BigDecimal.valueOf(216.0), BigDecimal.valueOf(-108.0)},
                {BigDecimal.valueOf(-672.0), BigDecimal.valueOf(492.0), BigDecimal.valueOf(-328.0), BigDecimal.valueOf(164.0)}});
        matrix6.addRow(1);
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(8.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(14.0)},
                {BigDecimal.valueOf(15.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(21.0)},
                {BigDecimal.valueOf(22.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(28.0)},
                {BigDecimal.valueOf(29.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(35.0)},
                {BigDecimal.valueOf(36.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(42.0)},
                {BigDecimal.valueOf(43.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(49.0)}});
        matrix7.addRow(0);
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(48.0), BigDecimal.valueOf(47.0), BigDecimal.valueOf(46.0), BigDecimal.valueOf(45.0), BigDecimal.valueOf(44.0), BigDecimal.valueOf(43.0)},
                {BigDecimal.valueOf(42.0), BigDecimal.valueOf(41.0), BigDecimal.valueOf(40.0), BigDecimal.valueOf(39.0), BigDecimal.valueOf(38.0), BigDecimal.valueOf(37.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(35.0), BigDecimal.valueOf(34.0), BigDecimal.valueOf(33.0), BigDecimal.valueOf(32.0), BigDecimal.valueOf(31.0), BigDecimal.valueOf(30.0), BigDecimal.valueOf(29.0)},
                {BigDecimal.valueOf(28.0), BigDecimal.valueOf(27.0), BigDecimal.valueOf(26.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(24.0), BigDecimal.valueOf(23.0), BigDecimal.valueOf(22.0)},
                {BigDecimal.valueOf(21.0), BigDecimal.valueOf(20.0), BigDecimal.valueOf(19.0), BigDecimal.valueOf(18.0), BigDecimal.valueOf(17.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(15.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(14.0), BigDecimal.valueOf(13.0), BigDecimal.valueOf(12.0), BigDecimal.valueOf(11.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(7.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(5.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(2.0), BigDecimal.valueOf(1.0)}});
        matrix8.addRow(5);
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix9.addRow(2);
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        matrix10.addRow(1);
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix11.addRow(3);
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        matrix12.addRow(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Sum of elements")
    @Test
    void sumOfElements() {
        assertEquals(BigDecimal.valueOf(0.0), BigMatrix.sumOfElements(matrix1));
        assertEquals(BigDecimal.valueOf(8.0), BigMatrix.sumOfElements(matrix2));
        assertEquals(BigDecimal.valueOf(-1.0), BigMatrix.sumOfElements(matrix3));
        assertEquals(BigDecimal.valueOf(21.0), BigMatrix.sumOfElements(matrix4));
        assertEquals(BigDecimal.valueOf(0.0), BigMatrix.sumOfElements(matrix5));
        assertEquals(BigDecimal.valueOf(112.0), BigMatrix.sumOfElements(matrix6));
        assertEquals(BigDecimal.valueOf(1225.0), BigMatrix.sumOfElements(matrix7));
        assertEquals(BigDecimal.valueOf(1225.0), BigMatrix.sumOfElements(matrix8));
        assertEquals(BigDecimal.valueOf(0.0), BigMatrix.sumOfElements(matrix9));
        assertEquals(BigDecimal.valueOf(9.0), BigMatrix.sumOfElements(matrix10));
        assertEquals(BigDecimal.valueOf(53.0), BigMatrix.sumOfElements(matrix11));
        assertEquals(BigDecimal.valueOf(55.0), BigMatrix.sumOfElements(matrix12));
    }

    @Test
    void sumOfElements2() {
        assertEquals(BigDecimal.valueOf(0.0), matrix1.sumOfElements());
        assertEquals(BigDecimal.valueOf(8.0), matrix2.sumOfElements());
        assertEquals(BigDecimal.valueOf(-1.0), matrix3.sumOfElements());
        assertEquals(BigDecimal.valueOf(21.0), matrix4.sumOfElements());
        assertEquals(BigDecimal.valueOf(0.0), matrix5.sumOfElements());
        assertEquals(BigDecimal.valueOf(112.0), matrix6.sumOfElements());
        assertEquals(BigDecimal.valueOf(1225.0), matrix7.sumOfElements());
        assertEquals(BigDecimal.valueOf(1225.0), matrix8.sumOfElements());
        assertEquals(BigDecimal.valueOf(0.0), matrix9.sumOfElements());
        assertEquals(BigDecimal.valueOf(9.0), matrix10.sumOfElements());
        assertEquals(BigDecimal.valueOf(53.0), matrix11.sumOfElements());
        assertEquals(BigDecimal.valueOf(55.0), matrix12.sumOfElements());
    }

    @DisplayName("Use operations")
    @Test
    void useOperation() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.useOperation(matrix1, n -> n.multiply(BigDecimal.valueOf(5))).equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.useOperation(matrix2, n -> BigDecimal.valueOf(0)).equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.useOperation(matrix3, n -> n.add(BigDecimal.valueOf(0))).equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.useOperation(matrix4, n -> n.add(BigDecimal.valueOf(1))).equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(-11.0), BigDecimal.valueOf(14.0), BigDecimal.valueOf(-21.0)},
                {BigDecimal.valueOf(-3.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(-7.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(-7.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(-13.0)},
                {BigDecimal.valueOf(-5.0), BigDecimal.valueOf(7.0), BigDecimal.valueOf(-13.0), BigDecimal.valueOf(19.0)}});
        assertTrue(BigMatrix.useOperation(matrix5, n -> n.subtract(BigDecimal.valueOf(1))).equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(370.0), BigDecimal.valueOf(-270.0), BigDecimal.valueOf(180.0), BigDecimal.valueOf(-90.0)},
                {BigDecimal.valueOf(-148.0), BigDecimal.valueOf(108.0), BigDecimal.valueOf(-72.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(222.0), BigDecimal.valueOf(-162.0), BigDecimal.valueOf(108.0), BigDecimal.valueOf(-54.0)},
                {BigDecimal.valueOf(-336.0), BigDecimal.valueOf(246.0), BigDecimal.valueOf(-164.0), BigDecimal.valueOf(82.0)}});
        assertTrue(BigMatrix.useOperation(matrix6, n -> n.divide(BigDecimal.valueOf(2), new MathContext(50))).equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.useOperation(matrix7, n -> n.multiply(BigDecimal.valueOf(0))).equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2401.0), BigDecimal.valueOf(2304.0), BigDecimal.valueOf(2209.0), BigDecimal.valueOf(2116.0), BigDecimal.valueOf(2025.0), BigDecimal.valueOf(1936.0), BigDecimal.valueOf(1849.0)},
                {BigDecimal.valueOf(1764.0), BigDecimal.valueOf(1681.0), BigDecimal.valueOf(1600.0), BigDecimal.valueOf(1521.0), BigDecimal.valueOf(1444.0), BigDecimal.valueOf(1369.0), BigDecimal.valueOf(1296.0)},
                {BigDecimal.valueOf(1225.0), BigDecimal.valueOf(1156.0), BigDecimal.valueOf(1089.0), BigDecimal.valueOf(1024.0), BigDecimal.valueOf(961.0), BigDecimal.valueOf(900.0), BigDecimal.valueOf(841.0)},
                {BigDecimal.valueOf(784.0), BigDecimal.valueOf(729.0), BigDecimal.valueOf(676.0), BigDecimal.valueOf(625.0), BigDecimal.valueOf(576.0), BigDecimal.valueOf(529.0), BigDecimal.valueOf(484.0)},
                {BigDecimal.valueOf(441.0), BigDecimal.valueOf(400.0), BigDecimal.valueOf(361.0), BigDecimal.valueOf(324.0), BigDecimal.valueOf(289.0), BigDecimal.valueOf(256.0), BigDecimal.valueOf(225.0)},
                {BigDecimal.valueOf(196.0), BigDecimal.valueOf(169.0), BigDecimal.valueOf(144.0), BigDecimal.valueOf(121.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(81.0), BigDecimal.valueOf(64.0)},
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(36.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(1.0)}});
        assertTrue(BigMatrix.useOperation(matrix8, n -> n.multiply(n)).equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        assertTrue(BigMatrix.useOperation(matrix9, n -> n.multiply(BigDecimal.valueOf(-1))).equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0)}});
        assertTrue(BigMatrix.useOperation(matrix10, n -> n.scaleByPowerOfTen(1)).equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)}});
        assertTrue(BigMatrix.useOperation(matrix11, n -> n.add(BigDecimal.valueOf(1)).subtract(BigDecimal.valueOf(1))).equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        assertTrue(BigMatrix.useOperation(matrix12, n -> n.multiply(BigDecimal.valueOf(2)).divide(BigDecimal.valueOf(2), new MathContext(50))).equals(result12));
    }

    @Test
    void useOperation2() {
        BigMatrix result1 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix1.useOperation(n -> n.multiply(BigDecimal.valueOf(5)));
        assertTrue(matrix1.equals(result1));

        BigMatrix result2 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix2.useOperation(n -> BigDecimal.valueOf(0));
        assertTrue(matrix2.equals(result2));

        BigMatrix result3 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(-15.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(-1.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix3.useOperation(n -> n.add(BigDecimal.valueOf(0)));
        assertTrue(matrix3.equals(result3));

        BigMatrix result4 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(6.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0), BigDecimal.valueOf(1.0)}});
        matrix4.useOperation(n -> n.add(BigDecimal.valueOf(1)));
        assertTrue(matrix4.equals(result4));

        BigMatrix result5 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(4.0), BigDecimal.valueOf(-11.0), BigDecimal.valueOf(14.0), BigDecimal.valueOf(-21.0)},
                {BigDecimal.valueOf(-3.0), BigDecimal.valueOf(3.0), BigDecimal.valueOf(-7.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(2.0), BigDecimal.valueOf(-7.0), BigDecimal.valueOf(8.0), BigDecimal.valueOf(-13.0)},
                {BigDecimal.valueOf(-5.0), BigDecimal.valueOf(7.0), BigDecimal.valueOf(-13.0), BigDecimal.valueOf(19.0)}});
        matrix5.useOperation(n -> n.subtract(BigDecimal.valueOf(1)));
        assertTrue(matrix5.equals(result5));

        BigMatrix result6 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(370.0), BigDecimal.valueOf(-270.0), BigDecimal.valueOf(180.0), BigDecimal.valueOf(-90.0)},
                {BigDecimal.valueOf(-148.0), BigDecimal.valueOf(108.0), BigDecimal.valueOf(-72.0), BigDecimal.valueOf(36.0)},
                {BigDecimal.valueOf(222.0), BigDecimal.valueOf(-162.0), BigDecimal.valueOf(108.0), BigDecimal.valueOf(-54.0)},
                {BigDecimal.valueOf(-336.0), BigDecimal.valueOf(246.0), BigDecimal.valueOf(-164.0), BigDecimal.valueOf(82.0)}});
        matrix6.useOperation(n -> n.divide(BigDecimal.valueOf(2), new MathContext(50)));
        assertTrue(matrix6.equals(result6));

        BigMatrix result7 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix7.useOperation(n -> n.multiply(BigDecimal.valueOf(0)));
        assertTrue(matrix7.equals(result7));

        BigMatrix result8 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(2401.0), BigDecimal.valueOf(2304.0), BigDecimal.valueOf(2209.0), BigDecimal.valueOf(2116.0), BigDecimal.valueOf(2025.0), BigDecimal.valueOf(1936.0), BigDecimal.valueOf(1849.0)},
                {BigDecimal.valueOf(1764.0), BigDecimal.valueOf(1681.0), BigDecimal.valueOf(1600.0), BigDecimal.valueOf(1521.0), BigDecimal.valueOf(1444.0), BigDecimal.valueOf(1369.0), BigDecimal.valueOf(1296.0)},
                {BigDecimal.valueOf(1225.0), BigDecimal.valueOf(1156.0), BigDecimal.valueOf(1089.0), BigDecimal.valueOf(1024.0), BigDecimal.valueOf(961.0), BigDecimal.valueOf(900.0), BigDecimal.valueOf(841.0)},
                {BigDecimal.valueOf(784.0), BigDecimal.valueOf(729.0), BigDecimal.valueOf(676.0), BigDecimal.valueOf(625.0), BigDecimal.valueOf(576.0), BigDecimal.valueOf(529.0), BigDecimal.valueOf(484.0)},
                {BigDecimal.valueOf(441.0), BigDecimal.valueOf(400.0), BigDecimal.valueOf(361.0), BigDecimal.valueOf(324.0), BigDecimal.valueOf(289.0), BigDecimal.valueOf(256.0), BigDecimal.valueOf(225.0)},
                {BigDecimal.valueOf(196.0), BigDecimal.valueOf(169.0), BigDecimal.valueOf(144.0), BigDecimal.valueOf(121.0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(81.0), BigDecimal.valueOf(64.0)},
                {BigDecimal.valueOf(49.0), BigDecimal.valueOf(36.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(16.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(1.0)}});
        matrix8.useOperation(n -> n.multiply(n));
        assertTrue(matrix8.equals(result8));

        BigMatrix result9 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
                {BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)}});
        matrix9.useOperation(n -> n.multiply(BigDecimal.valueOf(-1)));
        assertTrue(matrix9.equals(result9));

        BigMatrix result10 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0)},
                {BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0), BigDecimal.valueOf(10.0)}});
        matrix10.useOperation(n -> n.scaleByPowerOfTen(1));
        assertTrue(matrix10.equals(result10));

        BigMatrix result11 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(3.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(4.0)}});
        matrix11.useOperation(n -> n.add(BigDecimal.valueOf(1)).subtract(BigDecimal.valueOf(1)));
        assertTrue(matrix11.equals(result11));

        BigMatrix result12 = new BigMatrix(new BigDecimal[][]{
                {BigDecimal.valueOf(1.0), BigDecimal.valueOf(4.0), BigDecimal.valueOf(8.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)},
                {BigDecimal.valueOf(5.0), BigDecimal.valueOf(9.0), BigDecimal.valueOf(7.0)}});
        matrix12.useOperation(n -> n.multiply(BigDecimal.valueOf(2)).divide(BigDecimal.valueOf(2), new MathContext(50)));
        assertTrue(matrix12.equals(result12));
    }
}

