import MathLibrary.Matrix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Matrix test")
class MatrixTest {
    private Matrix matrix1;
    private Matrix matrix2;
    private Matrix matrix3;
    private Matrix matrix4;
    private Matrix matrix5;
    private Matrix matrix6;
    private Matrix matrix7;
    private Matrix matrix8;
    private Matrix matrix9;
    private Matrix matrix10;
    private Matrix matrix11;
    private Matrix matrix12;
    private Matrix matrix13;
    private Matrix matrix14;
    private Matrix matrix15;

    @BeforeEach
    void init() {
        matrix1 = new Matrix(new Integer[][]{{0, 0}, {0, 0}});
        matrix2 = new Matrix(new Integer[][]{{1, 2}, {2, 3}});
        matrix3 = new Matrix(new Integer[][]{{-15, 1, 7}, {0, -1, 7}, {0, 0, 0}});
        matrix4 = new Matrix(new Integer[][]{{1, 2, 3}, {4, 5, 6}, {0, 0, 0}});
        matrix5 = new Matrix(new Integer[][]{{5, -10, 15, -20}, {-2, 4, -6, 8}, {3, -6, 9, -12}, {-4, 8, -12, 20}});
        matrix6 = new Matrix(new Integer[][]{{740, -540, 360, -180}, {-296, 216, -144, 72}, {444, -324, 216, -108}, {-672, 492, -328, 164}});
        matrix7 = new Matrix(new Integer[][]{{1, 2, 3, 4, 5, 6, 7}, {8, 9, 10, 11, 12, 13, 14}, {15, 16, 17, 18, 19, 20, 21}, {22, 23, 24, 25, 26, 27, 28}, {29, 30, 31, 32, 33, 34, 35}, {36, 37, 38, 39, 40, 41, 42}, {43, 44, 45, 46, 47, 48, 49}});
        matrix8 = new Matrix(new Integer[][]{{49, 48, 47, 46, 45, 44, 43}, {42, 41, 40, 39, 38, 37, 36}, {35, 34, 33, 32, 31, 30, 29}, {28, 27, 26, 25, 24, 23, 22}, {21, 20, 19, 18, 17, 16, 15}, {14, 13, 12, 11, 10, 9, 8}, {7, 6, 5, 4, 3, 2, 1}});
        matrix9 = new Matrix(new Integer[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        matrix10 = new Matrix(new Integer[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
        matrix11 = new Matrix(new Integer[][]{{5, 9, 3}, {5, 9, 4}, {5, 9, 4}});
        matrix12 = new Matrix(new Integer[][]{{1, 4, 8}, {5, 9, 7}, {5, 9, 7}});
        // Matrices for matrix inverse
        matrix13 = new Matrix(new Integer[][]{{1, 2, -1}, {3, -2, 0}, {2, -3, 1}});
        matrix14 = new Matrix(new Integer[][]{{1, 2, -1}, {3, -2, 0}, {4, 0, 1}});
        matrix15 = new Matrix(new Integer[][]{{0, 0, 71, 70}, {0, 0, 70, 69}, {69, 70, 0, 0}, {70, 71, 0, 0}});
    }

    @DisplayName("Addition")
    @Test
    void add() {
        Matrix result = new Matrix(new Double[][]{{1.0, 2.0}, {2.0, 3.0}});
        assertTrue(Matrix.add(matrix1, matrix2).equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-14.0, 3.0, 10.0}, {4.0, 4.0, 13.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.add(matrix3, matrix4).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{745.0, -550.0, 375.0, -200.0}, {-298.0, 220.0, -150.0, 80.0}, {447.0, -330.0, 225.0, -120.0}, {-676.0, 500.0, -340.0, 184.0}});
        assertTrue(Matrix.add(matrix5, matrix6).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}});
        assertTrue(Matrix.add(matrix7, matrix8).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}});
        assertTrue(Matrix.add(matrix9, matrix10).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{6.0, 13.0, 11.0}, {10.0, 18.0, 11.0}, {10.0, 18.0, 11.0}});
        assertTrue(Matrix.add(matrix11, matrix12).equals(result6));
    }

    @Test
    void add2() {
        Matrix result = new Matrix(new Double[][]{{1.0, 2.0}, {2.0, 3.0}});
        matrix1.add(matrix2);
        assertTrue(matrix1.equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-14.0, 3.0, 10.0}, {4.0, 4.0, 13.0}, {0.0, 0.0, 0.0}});
        matrix3.add(matrix4);
        assertTrue(matrix3.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{745.0, -550.0, 375.0, -200.0}, {-298.0, 220.0, -150.0, 80.0}, {447.0, -330.0, 225.0, -120.0}, {-676.0, 500.0, -340.0, 184.0}});
        matrix5.add(matrix6);
        assertTrue(matrix5.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, {50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}});
        matrix7.add(matrix8);
        assertTrue(matrix7.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}});
        matrix9.add(matrix10);
        assertTrue(matrix9.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{6.0, 13.0, 11.0}, {10.0, 18.0, 11.0}, {10.0, 18.0, 11.0}});
        matrix11.add(matrix12);
        assertTrue(matrix11.equals(result6));
    }


    @DisplayName("Subtraction")
    @Test
    void subtract() {
        Matrix result = new Matrix(new Double[][]{{-1.0, -2.0}, {-2.0, -3.0}});
        assertTrue(Matrix.subtract(matrix1, matrix2).equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-16.0, -1.0, 4.0}, {-4.0, -6.0, 1.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.subtract(matrix3, matrix4).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-735.0, 530.0, -345.0, 160.0}, {294.0, -212.0, 138.0, -64.0}, {-441.0, 318.0, -207.0, 96.0}, {668.0, -484.0, 316.0, -144.0}});
        assertTrue(Matrix.subtract(matrix5, matrix6).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{-48.0, -46.0, -44.0, -42.0, -40.0, -38.0, -36.0,}, {-34.0, -32.0, -30.0, -28.0, -26.0, -24.0, -22.0}, {-20.0, -18.0, -16.0, -14.0, -12.0, -10.0, -8.0}, {-6.0, -4.0, -2.0, 0.0, 2.0, 4.0, 6.0}, {8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0}, {22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0}, {36.0, 38.0, 40.0, 42.0, 44.0, 46.0, 48.0}});
        assertTrue(Matrix.subtract(matrix7, matrix8).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{-1.0, -1.0, -1.0}, {-1.0, -1.0, -1.0}, {-1.0, -1.0, -1.0}});
        assertTrue(Matrix.subtract(matrix9, matrix10).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{4.0, 5.0, -5.0}, {0.0, 0.0, -3.0}, {0.0, 0.0, -3.0}});
        assertTrue(Matrix.subtract(matrix11, matrix12).equals(result6));
    }

    @Test
    void subtract2() {
        Matrix result = new Matrix(new Double[][]{{-1.0, -2.0}, {-2.0, -3.0}});
        matrix1.subtract(matrix2);
        assertTrue(matrix1.equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-16.0, -1.0, 4.0}, {-4.0, -6.0, 1.0}, {0.0, 0.0, 0.0}});
        matrix3.subtract(matrix4);
        assertTrue(matrix3.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-735.0, 530.0, -345.0, 160.0}, {294.0, -212.0, 138.0, -64.0}, {-441.0, 318.0, -207.0, 96.0}, {668.0, -484.0, 316.0, -144.0}});
        matrix5.subtract(matrix6);
        assertTrue(matrix5.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{-48.0, -46.0, -44.0, -42.0, -40.0, -38.0, -36.0,}, {-34.0, -32.0, -30.0, -28.0, -26.0, -24.0, -22.0}, {-20.0, -18.0, -16.0, -14.0, -12.0, -10.0, -8.0}, {-6.0, -4.0, -2.0, 0.0, 2.0, 4.0, 6.0}, {8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0}, {22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0}, {36.0, 38.0, 40.0, 42.0, 44.0, 46.0, 48.0}});
        matrix7.subtract(matrix8);
        assertTrue(matrix7.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{-1.0, -1.0, -1.0}, {-1.0, -1.0, -1.0}, {-1.0, -1.0, -1.0}});
        matrix9.subtract(matrix10);
        assertTrue(matrix9.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{4.0, 5.0, -5.0}, {0.0, 0.0, -3.0}, {0.0, 0.0, -3.0}});
        matrix11.subtract(matrix12);
        assertTrue(matrix11.equals(result6));
    }

    @DisplayName("Multiplication by scalar")
    @Test
    void multiplyByScalar() {
        Matrix result = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}});
        Double A = 4.0;
        assertTrue(Matrix.multiplyByScalar(matrix1, A).equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-3.0, -6.0}, {-6.0, -9.0}});
        Double B = -3.0;
        assertTrue(Matrix.multiplyByScalar(matrix2, B).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        Double C = 0.0;
        assertTrue(Matrix.multiplyByScalar(matrix3, C).equals(result3));


        Matrix result4 = new Matrix(new Double[][]{{2.35, 4.7, 7.05}, {9.4, 11.75, 14.1}, {0.0, 0.0, 0.0}});
        Double D = 2.35;
        assertTrue(Matrix.multiplyByScalar(matrix4, D).equals(result4, 0.000001));

        Matrix result5 = new Matrix(new Double[][]{{70.0, -140.0, 210.0, -280.0}, {-28.0, 56.0, -84.0, 112.0}, {42.0, -84.0, 126.0, -168.0}, {-56.0, 112.0, -168.0, 280.0}});
        Double E = 14.0;
        assertTrue(Matrix.multiplyByScalar(matrix5, E).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{4440.0, -3240.0, 2160.0, -1080.0}, {-1776.0, 1296.0, -864.0, 432.0}, {2664.0, -1944.0, 1296.0, -648.0}, {-4032.0, 2952.0, -1968.0, 984.0}});
        Double F = 6.0;
        assertTrue(Matrix.multiplyByScalar(matrix6, F).equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{-11.0, -22.0, -33.0, -44.0, -55.0, -66.0, -77.0}, {-88.0, -99.0, -110.0, -121.0, -132.0, -143.0, -154.0}, {-165.0, -176.0, -187.0, -198.0, -209.0, -220.0, -231.0}, {-242.0, -253.0, -264.0, -275.0, -286.0, -297.0, -308.0}, {-319.0, -330.0, -341.0, -352.0, -363.0, -374.0, -385.0}, {-396.0, -407.0, -418.0, -429.0, -440.0, -451.0, -462.0}, {-473.0, -484.0, -495.0, -506.0, -517.0, -528.0, -539.0}});
        Double G = -11.0;
        assertTrue(Matrix.multiplyByScalar(matrix7, G).equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{-49.0, -48.0, -47.0, -46.0, -45.0, -44.0, -43.0}, {-42.0, -41.0, -40.0, -39.0, -38.0, -37.0, -36.0}, {-35.0, -34.0, -33.0, -32.0, -31.0, -30.0, -29.0}, {-28.0, -27.0, -26.0, -25.0, -24.0, -23.0, -22.0}, {-21.0, -20.0, -19.0, -18.0, -17.0, -16.0, -15.0}, {-14.0, -13.0, -12.0, -11.0, -10.0, -9.0, -8.0}, {-7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0}});
        Double H = -1.0;
        assertTrue(Matrix.multiplyByScalar(matrix8, H).equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        Double I = 1.0;
        assertTrue(Matrix.multiplyByScalar(matrix9, I).equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{-2.0, -2.0, -2.0}, {-2.0, -2.0, -2.0}, {-2.0, -2.0, -2.0}});
        Double J = -2.0;
        assertTrue(Matrix.multiplyByScalar(matrix10, J).equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{25.0, 45.0, 15.0}, {25.0, 45.0, 20.0}, {25.0, 45.0, 20.0}});
        Double K = 5.0;
        assertTrue(Matrix.multiplyByScalar(matrix11, K).equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{3.0, 12.0, 24.0}, {15.0, 27.0, 21.0}, {15.0, 27.0, 21.0}});
        Double L = 3.0;
        assertTrue(Matrix.multiplyByScalar(matrix12, L).equals(result12));
    }

    @Test
    void multiplyByScalar2() {
        Matrix result = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}});
        Double A = 4.0;
        matrix1.multiplyByScalar(A);
        assertTrue(matrix1.equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-3.0, -6.0}, {-6.0, -9.0}});
        Double B = -3.0;
        matrix2.multiplyByScalar(B);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        Double C = 0.0;
        matrix3.multiplyByScalar(C);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{2.35, 4.7, 7.05}, {9.4, 11.75, 14.1}, {0.0, 0.0, 0.0}});
        Double D = 2.35;
        matrix4.multiplyByScalar(D);
        assertTrue(matrix4.equals(result4, 0.000001));

        Matrix result5 = new Matrix(new Double[][]{{70.0, -140.0, 210.0, -280.0}, {-28.0, 56.0, -84.0, 112.0}, {42.0, -84.0, 126.0, -168.0}, {-56.0, 112.0, -168.0, 280.0}});
        Double E = 14.0;
        matrix5.multiplyByScalar(E);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{4440.0, -3240.0, 2160.0, -1080.0}, {-1776.0, 1296.0, -864.0, 432.0}, {2664.0, -1944.0, 1296.0, -648.0}, {-4032.0, 2952.0, -1968.0, 984.0}});
        Double F = 6.0;
        matrix6.multiplyByScalar(F);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{-11.0, -22.0, -33.0, -44.0, -55.0, -66.0, -77.0}, {-88.0, -99.0, -110.0, -121.0, -132.0, -143.0, -154.0}, {-165.0, -176.0, -187.0, -198.0, -209.0, -220.0, -231.0}, {-242.0, -253.0, -264.0, -275.0, -286.0, -297.0, -308.0}, {-319.0, -330.0, -341.0, -352.0, -363.0, -374.0, -385.0}, {-396.0, -407.0, -418.0, -429.0, -440.0, -451.0, -462.0}, {-473.0, -484.0, -495.0, -506.0, -517.0, -528.0, -539.0}});
        Double G = -11.0;
        matrix7.multiplyByScalar(G);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{-49.0, -48.0, -47.0, -46.0, -45.0, -44.0, -43.0}, {-42.0, -41.0, -40.0, -39.0, -38.0, -37.0, -36.0}, {-35.0, -34.0, -33.0, -32.0, -31.0, -30.0, -29.0}, {-28.0, -27.0, -26.0, -25.0, -24.0, -23.0, -22.0}, {-21.0, -20.0, -19.0, -18.0, -17.0, -16.0, -15.0}, {-14.0, -13.0, -12.0, -11.0, -10.0, -9.0, -8.0}, {-7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0}});
        Double H = -1.0;
        matrix8.multiplyByScalar(H);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        Double I = 1.0;
        matrix9.multiplyByScalar(I);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{-2.0, -2.0, -2.0}, {-2.0, -2.0, -2.0}, {-2.0, -2.0, -2.0}});
        Double J = -2.0;
        matrix10.multiplyByScalar(J);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{25.0, 45.0, 15.0}, {25.0, 45.0, 20.0}, {25.0, 45.0, 20.0}});
        Double K = 5.0;
        matrix11.multiplyByScalar(K);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{3.0, 12.0, 24.0}, {15.0, 27.0, 21.0}, {15.0, 27.0, 21.0}});
        Double L = 3.0;
        matrix12.multiplyByScalar(L);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Multiplication")
    @Test
    void multiply() {
        Matrix result = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}});
        assertTrue(Matrix.multiply(matrix1, matrix2).equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-11.0, -25.0, -39.0}, {-4.0, -5.0, -6.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.multiply(matrix3, matrix4).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{26760.0, -19560.0, 13040.0, -6520.0}, {-10704.0, 7824.0, -5216.0, 2608.0}, {16056.0, -11736.0, 7824.0, -3912.0}, {-24096.0, 17616.0, -11744.0, 5872.0}});
        assertTrue(Matrix.multiply(matrix5, matrix6).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{588.0, 560.0, 532.0, 504.0, 476.0, 448.0, 420.0}, {1960.0, 1883.0, 1806.0, 1729.0, 1652.0, 1575.0, 1498.0}, {3332.0, 3206.0, 3080.0, 2954.0, 2828.0, 2702.0, 2576.0}, {4704.0, 4529.0, 4354.0, 4179.0, 4004.0, 3829.0, 3654.0}, {6076.0, 5852.0, 5628.0, 5404.0, 5180.0, 4956.0, 4732.0}, {7448.0, 7175.0, 6902.0, 6629.0, 6356.0, 6083.0, 5810.0}, {8820.0, 8498.0, 8176.0, 7854.0, 7532.0, 7210.0, 6888.0}});
        assertTrue(Matrix.multiply(matrix7, matrix8).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.multiply(matrix9, matrix10).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{65.0, 128.0, 124.0}, {70.0, 137.0, 131.0}, {70.0, 137.0, 131.0}});
        assertTrue(Matrix.multiply(matrix11, matrix12).equals(result6));
    }

    @Test
    void multiply2() {
        Matrix result = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}});
        matrix1.multiply(matrix2);
        assertTrue(matrix1.equals(result));

        Matrix result2 = new Matrix(new Double[][]{{-11.0, -25.0, -39.0}, {-4.0, -5.0, -6.0}, {0.0, 0.0, 0.0}});
        matrix3.multiply(matrix4);
        assertTrue(matrix3.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{26760.0, -19560.0, 13040.0, -6520.0}, {-10704.0, 7824.0, -5216.0, 2608.0}, {16056.0, -11736.0, 7824.0, -3912.0}, {-24096.0, 17616.0, -11744.0, 5872.0}});
        matrix5.multiply(matrix6);
        assertTrue(matrix5.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{588.0, 560.0, 532.0, 504.0, 476.0, 448.0, 420.0}, {1960.0, 1883.0, 1806.0, 1729.0, 1652.0, 1575.0, 1498.0}, {3332.0, 3206.0, 3080.0, 2954.0, 2828.0, 2702.0, 2576.0}, {4704.0, 4529.0, 4354.0, 4179.0, 4004.0, 3829.0, 3654.0}, {6076.0, 5852.0, 5628.0, 5404.0, 5180.0, 4956.0, 4732.0}, {7448.0, 7175.0, 6902.0, 6629.0, 6356.0, 6083.0, 5810.0}, {8820.0, 8498.0, 8176.0, 7854.0, 7532.0, 7210.0, 6888.0}});
        matrix7.multiply(matrix8);
        assertTrue(matrix7.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix9.multiply(matrix10);
        assertTrue(matrix9.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{65.0, 128.0, 124.0}, {70.0, 137.0, 131.0}, {70.0, 137.0, 131.0}});
        matrix11.multiply(matrix12);
        assertTrue(matrix11.equals(result6));
    }

    @DisplayName("Determinant")
    @Test
    void determinant() {
        assertEquals(0.0, Matrix.determinant(matrix1));
        assertEquals(-1.0, Matrix.determinant(matrix2));
        assertEquals(0.0, Matrix.determinant(matrix3));
        assertEquals(0.0, Matrix.determinant(matrix4));
        assertEquals(0.0, Matrix.determinant(matrix5));
        assertEquals(0.0, Matrix.determinant(matrix6));
        assertEquals(0.0, Matrix.determinant(matrix7));
        assertEquals(0.0, Matrix.determinant(matrix8));
        assertEquals(0.0, Matrix.determinant(matrix9));
        assertEquals(0.0, Matrix.determinant(matrix10));
        assertEquals(0.0, Matrix.determinant(matrix11));
        assertEquals(0.0, Matrix.determinant(matrix12));
    }

    @Test
    void determinant2() {
        assertEquals(0.0, matrix1.determinant());
        assertEquals(-1.0, matrix2.determinant());
        assertEquals(0.0, matrix3.determinant());
        assertEquals(0.0, matrix4.determinant());
        assertEquals(0.0, matrix4.determinant());
        assertEquals(0.0, matrix6.determinant());
        assertEquals(0.0, matrix7.determinant());
        assertEquals(0.0, matrix8.determinant());
        assertEquals(0.0, matrix9.determinant());
        assertEquals(0.0, matrix10.determinant());
        assertEquals(0.0, matrix11.determinant());
        assertEquals(0.0, matrix12.determinant());
    }

    @DisplayName("Trace")
    @Test
    void trace() {
        assertEquals(0.0, Matrix.trace(matrix1));
        assertEquals(4.0, Matrix.trace(matrix2));
        assertEquals(-16.0, Matrix.trace(matrix3));
        assertEquals(6.0, Matrix.trace(matrix4));
        assertEquals(38.0, Matrix.trace(matrix5));
        assertEquals(1336.0, Matrix.trace(matrix6));
        assertEquals(175.0, Matrix.trace(matrix7));
        assertEquals(175.0, Matrix.trace(matrix8));
        assertEquals(0.0, Matrix.trace(matrix9));
        assertEquals(3.0, Matrix.trace(matrix10));
        assertEquals(18.0, Matrix.trace(matrix11));
        assertEquals(17.0, Matrix.trace(matrix12));
    }

    @Test
    void trace2() {
        assertEquals(0.0, matrix1.trace());
        assertEquals(4.0, matrix2.trace());
        assertEquals(-16.0, matrix3.trace());
        assertEquals(6.0, matrix4.trace());
        assertEquals(38.0, matrix5.trace());
        assertEquals(1336.0, matrix6.trace());
        assertEquals(175.0, matrix7.trace());
        assertEquals(175.0, matrix8.trace());
        assertEquals(0.0, matrix9.trace());
        assertEquals(3.0, matrix10.trace());
        assertEquals(18.0, matrix11.trace());
        assertEquals(17.0, matrix12.trace());

    }

    @DisplayName("Minor")
    @Test
    void Minor() {
        Matrix result = new Matrix(new Integer[][]{{0}});
        assertTrue(Matrix.minor(matrix1, 0, 0).equals(result));

        Matrix result2 = new Matrix(new Integer[][]{{1}});
        assertTrue(Matrix.minor(matrix2, 1, 1).equals(result2));

        Matrix result3 = new Matrix(new Integer[][]{{-1, 7}, {0, 0}});
        assertTrue(Matrix.minor(matrix3, 0, 0).equals(result3));

        Matrix result4 = new Matrix(new Integer[][]{{1, 2}, {4, 5}});
        assertTrue(Matrix.minor(matrix4, 2, 2).equals(result4));

        Matrix result5 = new Matrix(new Integer[][]{{5, -10, -20}, {3, -6, -12}, {-4, 8, 20}});
        assertTrue(Matrix.minor(matrix5, 1, 2).equals(result5));

        Matrix result6 = new Matrix(new Integer[][]{{740, 360, -180}, {-296, -144, 72}, {444, 216, -108}});
        assertTrue(Matrix.minor(matrix6, 3, 1).equals(result6));

        Matrix result7 = new Matrix(new Integer[][]{{2, 3, 4, 5, 6, 7}, {9, 10, 11, 12, 13, 14}, {16, 17, 18, 19, 20, 21}, {23, 24, 25, 26, 27, 28}, {37, 38, 39, 40, 41, 42}, {44, 45, 46, 47, 48, 49}});
        assertTrue(Matrix.minor(matrix7, 4, 0).equals(result7));

        Matrix result8 = new Matrix(new Integer[][]{{41, 40, 39, 38, 37, 36}, {34, 33, 32, 31, 30, 29}, {27, 26, 25, 24, 23, 22}, {20, 19, 18, 17, 16, 15}, {13, 12, 11, 10, 9, 8}, {6, 5, 4, 3, 2, 1}});
        assertTrue(Matrix.minor(matrix8, 0, 0).equals(result8));

        Matrix result9 = new Matrix(new Integer[][]{{0, 0}, {0, 0}});
        assertTrue(Matrix.minor(matrix9, 0, 1).equals(result9));

        Matrix result10 = new Matrix(new Integer[][]{{1, 1}, {1, 1}});
        assertTrue(Matrix.minor(matrix10, 1, 1).equals(result10));

        Matrix result11 = new Matrix(new Integer[][]{{5, 3}, {5, 4}});
        assertTrue(Matrix.minor(matrix11, 1, 1).equals(result11));

        Matrix result12 = new Matrix(new Integer[][]{{5, 7}, {5, 7}});
        assertTrue(Matrix.minor(matrix12, 0, 1).equals(result12));

    }

    @Test
    void Minor2() {
        Matrix result = new Matrix(new Integer[][]{{0}});
        matrix1.minor(0, 0);
        assertTrue(matrix1.equals(result));

        Matrix result2 = new Matrix(new Integer[][]{{1}});
        matrix2.minor(1, 1);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Integer[][]{{-1, 7}, {0, 0}});
        matrix3.minor(0, 0);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Integer[][]{{1, 2}, {4, 5}});
        matrix4.minor(2, 2);
        assertTrue(matrix4.equals(result4));

        Matrix result5 = new Matrix(new Integer[][]{{5, -10, -20}, {3, -6, -12}, {-4, 8, 20}});
        matrix5.minor(1, 2);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Integer[][]{{740, 360, -180}, {-296, -144, 72}, {444, 216, -108}});
        matrix6.minor(3, 1);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Integer[][]{{2, 3, 4, 5, 6, 7}, {9, 10, 11, 12, 13, 14}, {16, 17, 18, 19, 20, 21}, {23, 24, 25, 26, 27, 28}, {37, 38, 39, 40, 41, 42}, {44, 45, 46, 47, 48, 49}});
        matrix7.minor(4, 0);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Integer[][]{{41, 40, 39, 38, 37, 36}, {34, 33, 32, 31, 30, 29}, {27, 26, 25, 24, 23, 22}, {20, 19, 18, 17, 16, 15}, {13, 12, 11, 10, 9, 8}, {6, 5, 4, 3, 2, 1}});
        matrix8.minor(0, 0);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Integer[][]{{0, 0}, {0, 0}});
        matrix9.minor(0, 1);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Integer[][]{{1, 1}, {1, 1}});
        matrix10.minor(1, 1);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Integer[][]{{5, 3}, {5, 4}});
        matrix11.minor(1, 1);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Integer[][]{{5, 7}, {5, 7}});
        matrix12.minor(0, 1);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Algebraic complement")
    @Test
    void AlgebraicComplement() {
        Matrix result13 = new Matrix(new Integer[][]{{-2, -3, -5}, {1, 3, 7}, {-2, -3, -8}});
        assertTrue(Matrix.algebraicComplement(matrix13).equals(result13));

        Matrix result14 = new Matrix(new Integer[][]{{-2, -3, 8}, {-2, 5, 8}, {-2, -3, -8}});
        assertTrue(Matrix.algebraicComplement(matrix14).equals(result14));

        Matrix result15 = new Matrix(new Integer[][]{{0, 0, -69, 70}, {0, 0, 70, -71}, {-71, 70, 0, 0}, {70, -69, 0, 0}});
        assertTrue(Matrix.algebraicComplement(matrix15).equals(result15));

    }

    @Test
    void AlgebraicComplement2() {
        Matrix result13 = new Matrix(new Integer[][]{{-2, -3, -5}, {1, 3, 7}, {-2, -3, -8}});
        matrix13.algebraicComplement();
        assertTrue(matrix13.equals(result13));

        Matrix result14 = new Matrix(new Integer[][]{{-2, -3, 8}, {-2, 5, 8}, {-2, -3, -8}});
        matrix14.algebraicComplement();
        assertTrue(matrix14.equals(result14));

        Matrix result15 = new Matrix(new Integer[][]{{0, 0, -69, 70}, {0, 0, 70, -71}, {-71, 70, 0, 0}, {70, -69, 0, 0}});
        matrix15.algebraicComplement();
        assertTrue(matrix15.equals(result15));
    }

    @DisplayName("Transpose")
    @Test
    void transpose() {
        Matrix result13 = new Matrix(new Integer[][]{{1, 3, 2}, {2, -2, -3}, {-1, 0, 1}});
        assertTrue(Matrix.transpose(matrix13).equals(result13));

        Matrix result14 = new Matrix(new Integer[][]{{1, 3, 4}, {2, -2, 0}, {-1, 0, 1}});
        assertTrue(Matrix.transpose(matrix14).equals(result14));

        Matrix result15 = new Matrix(new Integer[][]{{0, 0, 69, 70}, {0, 0, 70, 71}, {71, 70, 0, 0}, {70, 69, 0, 0}});
        assertTrue(Matrix.transpose(matrix15).equals(result15));
    }

    @Test
    void transpose2() {
        Matrix result13 = new Matrix(new Integer[][]{{1, 3, 2}, {2, -2, -3}, {-1, 0, 1}});
        matrix13.transpose();
        assertTrue(matrix13.equals(result13));

        Matrix result14 = new Matrix(new Integer[][]{{1, 3, 4}, {2, -2, 0}, {-1, 0, 1}});
        matrix14.transpose();
        assertTrue(matrix14.equals(result14));

        Matrix result15 = new Matrix(new Integer[][]{{0, 0, 69, 70}, {0, 0, 70, 71}, {71, 70, 0, 0}, {70, 69, 0, 0}});
        matrix15.transpose();
        assertTrue(matrix15.equals(result15));
    }

    @DisplayName("Inverse")
    @Test
    void Inverse() {
        Matrix result = new Matrix(new Double[][]{
                {2.0 / 3.0, -1.0 / 3.0, 2.0 / 3.0},
                {1.0, -1.0, 1.0},
                {5.0 / 3.0, -7.0 / 3.0, 8.0 / 3.0}});
        assertTrue(Matrix.inverse(matrix13).equals(result, 0.0001));

        Matrix result2 = new Matrix(new Double[][]{
                {1.0 / 8.0, 1.0 / 8.0, 1.0 / 8.0},
                {3.0 / 16.0, -5.0 / 16.0, 3.0 / 16.0},
                {-1.0 / 2.0, -1.0 / 2.0, 1.0 / 2.0}});
        assertTrue(Matrix.inverse(matrix14).equals(result2, 0.0001));

        Matrix result3 = new Matrix(new Integer[][]{{0, 0, -71, 70}, {0, 0, 70, -69}, {-69, 70, 0, 0}, {70, -71, 0, 0}});
        assertTrue(Matrix.inverse(matrix15).equals(result3));
    }

    @Test
    void Inverse2() {
        Matrix result = new Matrix(new Double[][]{
                {2.0 / 3.0, -1.0 / 3.0, 2.0 / 3.0},
                {1.0, -1.0, 1.0},
                {5.0 / 3.0, -7.0 / 3.0, 8.0 / 3.0}});
        matrix13.inverse();
        assertTrue(matrix13.equals(result, 0.0001));

        Matrix result2 = new Matrix(new Double[][]{
                {1.0 / 8.0, 1.0 / 8.0, 1.0 / 8.0},
                {3.0 / 16.0, -5.0 / 16.0, 3.0 / 16.0},
                {-1.0 / 2.0, -1.0 / 2.0, 1.0 / 2.0}});
        matrix14.inverse();
        assertTrue(matrix14.equals(result2, 0.0001));

        Matrix result3 = new Matrix(new Integer[][]{{0, 0, -71, 70}, {0, 0, 70, -69}, {-69, 70, 0, 0}, {70, -71, 0, 0}});
        matrix15.inverse();
        assertTrue(matrix15.equals(result3));
    }

    @DisplayName("Setter and Getter")
    @Test
    void set_get() {

        matrix13.set(0, 0, 5);
        matrix13.set(1, 2, -20);
        matrix13.set(2, 2, 15020);
        assertEquals(5, matrix13.get(0, 0));
        assertEquals(-20, matrix13.get(1, 2));
        assertEquals(15020, matrix13.get(2, 2));

        matrix14.set(0, 0, 215);
        matrix14.set(2, 1, Integer.MAX_VALUE);
        matrix14.set(2, 2, Integer.MIN_VALUE);
        assertEquals(215, matrix14.get(0, 0));
        assertEquals(Integer.MAX_VALUE, matrix14.get(2, 1));
        assertEquals(Integer.MIN_VALUE, matrix14.get(2, 2));

        matrix15.set(0, 0, 3928);
        matrix15.set(1, 0, -213992132);
        matrix15.set(3, 3, 231232321);
        assertEquals(3928, matrix15.get(0, 0));
        assertEquals(-213992132, matrix15.get(1, 0));
        assertEquals(231232321, matrix15.get(3, 3));

    }

    @DisplayName("Remove col")
    @Test
    void removeCol() {
        Matrix result1 = new Matrix(new Double[][]{{0.0}, {0.0}});
        assertTrue(Matrix.removeCol(matrix1, 1).equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0}, {2.0}});
        assertTrue(Matrix.removeCol(matrix2, 1).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0}, {0.0, -1.0}, {0.0, 0.0}});
        assertTrue(Matrix.removeCol(matrix3, 2).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{2.0, 3.0}, {5.0, 6.0}, {0.0, 0.0}});
        assertTrue(Matrix.removeCol(matrix4, 0).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, -20.0}, {-2.0, 4.0, 8.0}, {3.0, -6.0, -12.0}, {-4.0, 8.0, 20.0}});
        assertTrue(Matrix.removeCol(matrix5, 2).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0}, {-296.0, 216.0, -144.0}, {444.0, -324.0, 216.0}, {-672.0, 492.0, -328.0}});
        assertTrue(Matrix.removeCol(matrix6, 3).equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{1.0, 2.0, 3.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 19.0, 20.0, 21.0}, {22.0, 23.0, 24.0, 26.0, 27.0, 28.0}, {29.0, 30.0, 31.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 47.0, 48.0, 49.0}});
        assertTrue(Matrix.removeCol(matrix7, 3).equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 44.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 37.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 30.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 23.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 16.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 9.0}, {7.0, 6.0, 5.0, 4.0, 3.0, 2.0}});
        assertTrue(Matrix.removeCol(matrix8, 6).equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}, {0.0, 0.0}});
        assertTrue(Matrix.removeCol(matrix9, 1).equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 1.0}, {1.0, 1.0}, {1.0, 1.0}});
        assertTrue(Matrix.removeCol(matrix10, 1).equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0}, {5.0, 9.0}, {5.0, 9.0}});
        assertTrue(Matrix.removeCol(matrix11, 2).equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{4.0, 8.0}, {9.0, 7.0}, {9.0, 7.0}});
        assertTrue(Matrix.removeCol(matrix12, 0).equals(result12));
    }

    @Test
    void removeCol2() {
        Matrix result1 = new Matrix(new Double[][]{{0.0}, {0.0}});
        matrix1.removeCol(1);
        assertTrue(matrix1.equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0}, {2.0}});
        matrix2.removeCol(1);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0}, {0.0, -1.0}, {0.0, 0.0}});
        matrix3.removeCol(2);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{2.0, 3.0}, {5.0, 6.0}, {0.0, 0.0}});
        matrix4.removeCol(0);
        assertTrue(matrix4.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, -20.0}, {-2.0, 4.0, 8.0}, {3.0, -6.0, -12.0}, {-4.0, 8.0, 20.0}});
        matrix5.removeCol(2);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0}, {-296.0, 216.0, -144.0}, {444.0, -324.0, 216.0}, {-672.0, 492.0, -328.0}});
        matrix6.removeCol(3);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{1.0, 2.0, 3.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 19.0, 20.0, 21.0}, {22.0, 23.0, 24.0, 26.0, 27.0, 28.0}, {29.0, 30.0, 31.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 47.0, 48.0, 49.0}});
        matrix7.removeCol(3);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 44.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 37.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 30.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 23.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 16.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 9.0}, {7.0, 6.0, 5.0, 4.0, 3.0, 2.0}});
        matrix8.removeCol(6);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}, {0.0, 0.0}});
        matrix9.removeCol(1);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 1.0}, {1.0, 1.0}, {1.0, 1.0}});
        matrix10.removeCol(1);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0}, {5.0, 9.0}, {5.0, 9.0}});
        matrix11.removeCol(2);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{4.0, 8.0}, {9.0, 7.0}, {9.0, 7.0}});
        matrix12.removeCol(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Remove row")
    @Test
    void removeRow() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0}});
        assertTrue(Matrix.removeRow(matrix1, 0).equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0, 2.0}});
        assertTrue(Matrix.removeRow(matrix2, 1).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0, 7.0}, {0.0, -1.0, 7.0}});
        assertTrue(Matrix.removeRow(matrix3, 2).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{4.0, 5.0, 6.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.removeRow(matrix4, 0).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, 15.0, -20.0}, {-2.0, 4.0, -6.0, 8.0}, {-4.0, 8.0, -12.0, 20.0}});
        assertTrue(Matrix.removeRow(matrix5, 2).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0, -180.0}, {-296.0, 216.0, -144.0, 72.0}, {444.0, -324.0, 216.0, -108.0}});
        assertTrue(Matrix.removeRow(matrix6, 3).equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0}, {29.0, 30.0, 31.0, 32.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 39.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 46.0, 47.0, 48.0, 49.0}});
        assertTrue(Matrix.removeRow(matrix7, 3).equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 44.0, 43.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 37.0, 36.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 30.0, 29.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 23.0, 22.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 16.0, 15.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 9.0, 8.0}});
        assertTrue(Matrix.removeRow(matrix8, 6).equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.removeRow(matrix9, 1).equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}});
        assertTrue(Matrix.removeRow(matrix10, 1).equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 3.0}, {5.0, 9.0, 4.0}});
        assertTrue(Matrix.removeRow(matrix11, 2).equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{5.0, 9.0, 7.0}, {5.0, 9.0, 7.0}});
        assertTrue(Matrix.removeRow(matrix12, 0).equals(result12));
    }

    @Test
    void removeRow2() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0}});
        matrix1.removeRow(0);
        assertTrue(matrix1.equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0, 2.0}});
        matrix2.removeRow(1);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0, 7.0}, {0.0, -1.0, 7.0}});
        matrix3.removeRow(2);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{4.0, 5.0, 6.0}, {0.0, 0.0, 0.0}});
        matrix4.removeRow(0);
        assertTrue(matrix4.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, 15.0, -20.0}, {-2.0, 4.0, -6.0, 8.0}, {-4.0, 8.0, -12.0, 20.0}});
        matrix5.removeRow(2);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0, -180.0}, {-296.0, 216.0, -144.0, 72.0}, {444.0, -324.0, 216.0, -108.0}});
        matrix6.removeRow(3);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0}, {29.0, 30.0, 31.0, 32.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 39.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 46.0, 47.0, 48.0, 49.0}});
        matrix7.removeRow(3);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 44.0, 43.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 37.0, 36.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 30.0, 29.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 23.0, 22.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 16.0, 15.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 9.0, 8.0}});
        matrix8.removeRow(6);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix9.removeRow(1);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}});
        matrix10.removeRow(1);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 3.0}, {5.0, 9.0, 4.0}});
        matrix11.removeRow(2);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{5.0, 9.0, 7.0}, {5.0, 9.0, 7.0}});
        matrix12.removeRow(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Add column")
    @Test
    void addColumn() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.addCol(matrix1, 0).equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0, 0.0, 2.0}, {2.0, 0.0, 3.0}});
        assertTrue(Matrix.addCol(matrix2, 1).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0, 0.0, 7.0}, {0.0, -1.0, 0.0, 7.0}, {0.0, 0.0, 0.0, 0.0}});
        assertTrue(Matrix.addCol(matrix3, 2).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{0.0, 1.0, 2.0, 3.0}, {0.0, 4.0, 5.0, 6.0}, {0.0, 0.0, 0.0, 0.0}});
        assertTrue(Matrix.addCol(matrix4, 0).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, 0.0, 15.0, -20.0}, {-2.0, 4.0, 0.0, -6.0, 8.0}, {3.0, -6.0, 0.0, 9.0, -12.0}, {-4.0, 8.0, 0.0, -12.0, 20.0}});
        assertTrue(Matrix.addCol(matrix5, 2).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0, -180.0, 0.0}, {-296.0, 216.0, -144.0, 72.0, 0.0}, {444.0, -324.0, 216.0, -108.0, 0.0}, {-672.0, 492.0, -328.0, 164.0, 0.0}});
        assertTrue(Matrix.addCol(matrix6, 4).equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{1.0, 2.0, 3.0, 0.0, 4.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 0.0, 11.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 0.0, 18.0, 19.0, 20.0, 21.0}, {22.0, 23.0, 24.0, 0.0, 25.0, 26.0, 27.0, 28.0}, {29.0, 30.0, 31.0, 0.0, 32.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 0.0, 39.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 0.0, 46.0, 47.0, 48.0, 49.0}});
        assertTrue(Matrix.addCol(matrix7, 3).equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 0.0, 44.0, 43.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 0.0, 37.0, 36.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 0.0, 30.0, 29.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 0.0, 23.0, 22.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 0.0, 16.0, 15.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 0.0, 9.0, 8.0}, {7.0, 6.0, 5.0, 4.0, 3.0, 0.0, 2.0, 1.0}});
        assertTrue(Matrix.addCol(matrix8, 5).equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0}});
        assertTrue(Matrix.addCol(matrix9, 1).equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 0.0, 1.0, 1.0}, {1.0, 0.0, 1.0, 1.0}, {1.0, 0.0, 1.0, 1.0}});
        assertTrue(Matrix.addCol(matrix10, 1).equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 0.0, 3.0}, {5.0, 9.0, 0.0, 4.0}, {5.0, 9.0, 0.0, 4.0}});
        assertTrue(Matrix.addCol(matrix11, 2).equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{0.0, 1.0, 4.0, 8.0}, {0.0, 5.0, 9.0, 7.0}, {0.0, 5.0, 9.0, 7.0}});
        assertTrue(Matrix.addCol(matrix12, 0).equals(result12));
    }

    @Test
    void addColumn2() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix1.addCol(0);
        assertTrue(matrix1.equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0, 0.0, 2.0}, {2.0, 0.0, 3.0}});
        matrix2.addCol(1);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0, 0.0, 7.0}, {0.0, -1.0, 0.0, 7.0}, {0.0, 0.0, 0.0, 0.0}});
        matrix3.addCol(2);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{0.0, 1.0, 2.0, 3.0}, {0.0, 4.0, 5.0, 6.0}, {0.0, 0.0, 0.0, 0.0}});
        matrix4.addCol(0);
        assertTrue(matrix4.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, 0.0, 15.0, -20.0}, {-2.0, 4.0, 0.0, -6.0, 8.0}, {3.0, -6.0, 0.0, 9.0, -12.0}, {-4.0, 8.0, 0.0, -12.0, 20.0}});
        matrix5.addCol(2);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0, -180.0, 0.0}, {-296.0, 216.0, -144.0, 72.0, 0.0}, {444.0, -324.0, 216.0, -108.0, 0.0}, {-672.0, 492.0, -328.0, 164.0, 0.0}});
        matrix6.addCol(4);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{1.0, 2.0, 3.0, 0.0, 4.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 0.0, 11.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 0.0, 18.0, 19.0, 20.0, 21.0}, {22.0, 23.0, 24.0, 0.0, 25.0, 26.0, 27.0, 28.0}, {29.0, 30.0, 31.0, 0.0, 32.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 0.0, 39.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 0.0, 46.0, 47.0, 48.0, 49.0}});
        matrix7.addCol(3);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 0.0, 44.0, 43.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 0.0, 37.0, 36.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 0.0, 30.0, 29.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 0.0, 23.0, 22.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 0.0, 16.0, 15.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 0.0, 9.0, 8.0}, {7.0, 6.0, 5.0, 4.0, 3.0, 0.0, 2.0, 1.0}});
        matrix8.addCol(5);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0}});
        matrix9.addCol(1);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 0.0, 1.0, 1.0}, {1.0, 0.0, 1.0, 1.0}, {1.0, 0.0, 1.0, 1.0}});
        matrix10.addCol(1);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 0.0, 3.0}, {5.0, 9.0, 0.0, 4.0}, {5.0, 9.0, 0.0, 4.0}});
        matrix11.addCol(2);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{0.0, 1.0, 4.0, 8.0}, {0.0, 5.0, 9.0, 7.0}, {0.0, 5.0, 9.0, 7.0}});
        matrix12.addCol(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Add row")
    @Test
    void addRow() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}, {0.0, 0.0}});
        assertTrue(Matrix.addRow(matrix1, 0).equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0, 2.0}, {0.0, 0.0}, {2.0, 3.0}});
        assertTrue(Matrix.addRow(matrix2, 1).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0, 7.0}, {0.0, -1.0, 7.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.addRow(matrix3, 3).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.addRow(matrix4, 2).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, 15.0, -20.0}, {-2.0, 4.0, -6.0, 8.0}, {3.0, -6.0, 9.0, -12.0}, {-4.0, 8.0, -12.0, 20.0}, {0.0, 0.0, 0.0, 0.0}});
        assertTrue(Matrix.addRow(matrix5, 4).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0, -180.0}, {0.0, 0.0, 0.0, 0.0}, {-296.0, 216.0, -144.0, 72.0}, {444.0, -324.0, 216.0, -108.0}, {-672.0, 492.0, -328.0, 164.0}});
        assertTrue(Matrix.addRow(matrix6, 1).equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0}, {22.0, 23.0, 24.0, 25.0, 26.0, 27.0, 28.0}, {29.0, 30.0, 31.0, 32.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 39.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 46.0, 47.0, 48.0, 49.0}});
        assertTrue(Matrix.addRow(matrix7, 0).equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 44.0, 43.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 37.0, 36.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 30.0, 29.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 23.0, 22.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 16.0, 15.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 9.0, 8.0}, {7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0}});
        assertTrue(Matrix.addRow(matrix8, 5).equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.addRow(matrix9, 2).equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 1.0, 1.0}, {0.0, 0.0, 0.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}});
        assertTrue(Matrix.addRow(matrix10, 1).equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 3.0}, {5.0, 9.0, 4.0}, {5.0, 9.0, 4.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.addRow(matrix11, 3).equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {1.0, 4.0, 8.0}, {5.0, 9.0, 7.0}, {5.0, 9.0, 7.0}});
        assertTrue(Matrix.addRow(matrix12, 0).equals(result12));
    }

    @Test
    void addRow2() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}, {0.0, 0.0}});
        matrix1.addRow(0);
        assertTrue(matrix1.equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.0, 2.0}, {0.0, 0.0}, {2.0, 3.0}});
        matrix2.addRow(1);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-15.0, 1.0, 7.0}, {0.0, -1.0, 7.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix3.addRow(3);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix4.addRow(2);
        assertTrue(matrix4.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{5.0, -10.0, 15.0, -20.0}, {-2.0, 4.0, -6.0, 8.0}, {3.0, -6.0, 9.0, -12.0}, {-4.0, 8.0, -12.0, 20.0}, {0.0, 0.0, 0.0, 0.0}});
        matrix5.addRow(4);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{740.0, -540.0, 360.0, -180.0}, {0.0, 0.0, 0.0, 0.0}, {-296.0, 216.0, -144.0, 72.0}, {444.0, -324.0, 216.0, -108.0}, {-672.0, 492.0, -328.0, 164.0}});
        matrix6.addRow(1);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}, {8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0}, {15.0, 16.0, 17.0, 18.0, 19.0, 20.0, 21.0}, {22.0, 23.0, 24.0, 25.0, 26.0, 27.0, 28.0}, {29.0, 30.0, 31.0, 32.0, 33.0, 34.0, 35.0}, {36.0, 37.0, 38.0, 39.0, 40.0, 41.0, 42.0}, {43.0, 44.0, 45.0, 46.0, 47.0, 48.0, 49.0}});
        matrix7.addRow(0);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{49.0, 48.0, 47.0, 46.0, 45.0, 44.0, 43.0}, {42.0, 41.0, 40.0, 39.0, 38.0, 37.0, 36.0}, {35.0, 34.0, 33.0, 32.0, 31.0, 30.0, 29.0}, {28.0, 27.0, 26.0, 25.0, 24.0, 23.0, 22.0}, {21.0, 20.0, 19.0, 18.0, 17.0, 16.0, 15.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {14.0, 13.0, 12.0, 11.0, 10.0, 9.0, 8.0}, {7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0}});
        matrix8.addRow(5);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix9.addRow(2);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{1.0, 1.0, 1.0}, {0.0, 0.0, 0.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}});
        matrix10.addRow(1);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 3.0}, {5.0, 9.0, 4.0}, {5.0, 9.0, 4.0}, {0.0, 0.0, 0.0}});
        matrix11.addRow(3);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {1.0, 4.0, 8.0}, {5.0, 9.0, 7.0}, {5.0, 9.0, 7.0}});
        matrix12.addRow(0);
        assertTrue(matrix12.equals(result12));
    }

    @DisplayName("Sum of elements")
    @Test
    void sumOfElements() {
        assertEquals(0.0, Matrix.sumOfElements(matrix1));
        assertEquals(8.0, Matrix.sumOfElements(matrix2));
        assertEquals(-1.0, Matrix.sumOfElements(matrix3));
        assertEquals(21.0, Matrix.sumOfElements(matrix4));
        assertEquals(0.0, Matrix.sumOfElements(matrix5));
        assertEquals(112.0, Matrix.sumOfElements(matrix6));
        assertEquals(1225.0, Matrix.sumOfElements(matrix7));
        assertEquals(1225.0, Matrix.sumOfElements(matrix8));
        assertEquals(0.0, Matrix.sumOfElements(matrix9));
        assertEquals(9.0, Matrix.sumOfElements(matrix10));
        assertEquals(53.0, Matrix.sumOfElements(matrix11));
        assertEquals(55.0, Matrix.sumOfElements(matrix12));
    }

    @Test
    void sumOfElements2() {
        assertEquals(0.0, matrix1.sumOfElements());
        assertEquals(8.0, matrix2.sumOfElements());
        assertEquals(-1.0, matrix3.sumOfElements());
        assertEquals(21.0, matrix4.sumOfElements());
        assertEquals(0.0, matrix5.sumOfElements());
        assertEquals(112.0, matrix6.sumOfElements());
        assertEquals(1225.0, matrix7.sumOfElements());
        assertEquals(1225.0, matrix8.sumOfElements());
        assertEquals(0.0, matrix9.sumOfElements());
        assertEquals(9.0, matrix10.sumOfElements());
        assertEquals(53.0, matrix11.sumOfElements());
        assertEquals(55.0, matrix12.sumOfElements());
    }

    @DisplayName("Use operations")
    @Test
    void useOperation() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}});
        assertTrue(Matrix.useOperation(matrix1, n -> n * 5).equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.5574077246549023, -2.185039863261519}, {-2.185039863261519, -0.1425465430742778}});
        assertTrue(Matrix.useOperation(matrix2, Math::tan).equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-1.5042281630190728, 0.7853981633974483, 1.4288992721907328}, {0.0, -0.7853981633974483, 1.4288992721907328}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.useOperation(matrix3, Math::atan).equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{2.0, 3.0, 4.0}, {5.0, 6.0, 7.0}, {1.0, 1.0, 1.0}});
        assertTrue(Matrix.useOperation(matrix4, n -> n + 1).equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{4.0, -11.0, 14.0, -21.0}, {-3.0, 3.0, -7.0, 7.0}, {2.0, -7.0, 8.0, -13.0}, {-5.0, 7.0, -13.0, 19.0}});
        assertTrue(Matrix.useOperation(matrix5, n -> n - 1).equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{370.0, -270.0, 180.0, -90.0}, {-148.0, 108.0, -72.0, 36.0}, {222.0, -162.0, 108.0, -54.0}, {-336.0, 246.0, -164.0, 82.0}});
        assertTrue(Matrix.useOperation(matrix6, n -> n / 2).equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}});
        assertTrue(Matrix.useOperation(matrix7, n -> 0.0).equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{2401.0, 2304.0, 2209.0, 2116.0, 2025.0, 1936.0, 1849.0}, {1764.0, 1681.0, 1600.0, 1521.0, 1444.0, 1369.0, 1296.0}, {1225.0, 1156.0, 1089.0, 1024.0, 961.0, 900.0, 841.0}, {784.0, 729.0, 676.0, 625.0, 576.0, 529.0, 484.0}, {441.0, 400.0, 361.0, 324.0, 289.0, 256.0, 225.0}, {196.0, 169.0, 144.0, 121.0, 100.0, 81.0, 64.0}, {49.0, 36.0, 25.0, 16.0, 9.0, 4.0, 1.0}});
        assertTrue(Matrix.useOperation(matrix8, n -> n * n).equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        assertTrue(Matrix.useOperation(matrix9, Math::sqrt).equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{0.8414709848078965, 0.8414709848078965, 0.8414709848078965}, {0.8414709848078965, 0.8414709848078965, 0.8414709848078965}, {0.8414709848078965, 0.8414709848078965, 0.8414709848078965}});
        assertTrue(Matrix.useOperation(matrix10, Math::sin).equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 3.0}, {5.0, 9.0, 4.0}, {5.0, 9.0, 4.0}});
        assertTrue(Matrix.useOperation(matrix11, Math::abs).equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{1.0, 2.0, 2.8284271247461903}, {2.23606797749979, 3.0, 2.6457513110645907}, {2.23606797749979, 3.0, 2.6457513110645907}});
        assertTrue(Matrix.useOperation(matrix12, Math::sqrt).equals(result12));
    }

    @Test
    void useOperation2() {
        Matrix result1 = new Matrix(new Double[][]{{0.0, 0.0}, {0.0, 0.0}});
        matrix1.useOperation(n -> n * 5);
        assertTrue(matrix1.equals(result1));

        Matrix result2 = new Matrix(new Double[][]{{1.5574077246549023, -2.185039863261519}, {-2.185039863261519, -0.1425465430742778}});
        matrix2.useOperation(Math::tan);
        assertTrue(matrix2.equals(result2));

        Matrix result3 = new Matrix(new Double[][]{{-1.5042281630190728, 0.7853981633974483, 1.4288992721907328}, {0.0, -0.7853981633974483, 1.4288992721907328}, {0.0, 0.0, 0.0}});
        matrix3.useOperation(Math::atan);
        assertTrue(matrix3.equals(result3));

        Matrix result4 = new Matrix(new Double[][]{{2.0, 3.0, 4.0}, {5.0, 6.0, 7.0}, {1.0, 1.0, 1.0}});
        matrix4.useOperation(n -> n + 1);
        assertTrue(matrix4.equals(result4));

        Matrix result5 = new Matrix(new Double[][]{{4.0, -11.0, 14.0, -21.0}, {-3.0, 3.0, -7.0, 7.0}, {2.0, -7.0, 8.0, -13.0}, {-5.0, 7.0, -13.0, 19.0}});
        matrix5.useOperation(n -> n - 1);
        assertTrue(matrix5.equals(result5));

        Matrix result6 = new Matrix(new Double[][]{{370.0, -270.0, 180.0, -90.0}, {-148.0, 108.0, -72.0, 36.0}, {222.0, -162.0, 108.0, -54.0}, {-336.0, 246.0, -164.0, 82.0}});
        matrix6.useOperation(n -> n / 2);
        assertTrue(matrix6.equals(result6));

        Matrix result7 = new Matrix(new Double[][]{{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}});
        matrix7.useOperation(n -> 0.0);
        assertTrue(matrix7.equals(result7));

        Matrix result8 = new Matrix(new Double[][]{{2401.0, 2304.0, 2209.0, 2116.0, 2025.0, 1936.0, 1849.0}, {1764.0, 1681.0, 1600.0, 1521.0, 1444.0, 1369.0, 1296.0}, {1225.0, 1156.0, 1089.0, 1024.0, 961.0, 900.0, 841.0}, {784.0, 729.0, 676.0, 625.0, 576.0, 529.0, 484.0}, {441.0, 400.0, 361.0, 324.0, 289.0, 256.0, 225.0}, {196.0, 169.0, 144.0, 121.0, 100.0, 81.0, 64.0}, {49.0, 36.0, 25.0, 16.0, 9.0, 4.0, 1.0}});
        matrix8.useOperation(n -> n * n);
        assertTrue(matrix8.equals(result8));

        Matrix result9 = new Matrix(new Double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}});
        matrix9.useOperation(Math::sqrt);
        assertTrue(matrix9.equals(result9));

        Matrix result10 = new Matrix(new Double[][]{{0.8414709848078965, 0.8414709848078965, 0.8414709848078965}, {0.8414709848078965, 0.8414709848078965, 0.8414709848078965}, {0.8414709848078965, 0.8414709848078965, 0.8414709848078965}});
        matrix10.useOperation(Math::sin);
        assertTrue(matrix10.equals(result10));

        Matrix result11 = new Matrix(new Double[][]{{5.0, 9.0, 3.0}, {5.0, 9.0, 4.0}, {5.0, 9.0, 4.0}});
        matrix11.useOperation(Math::abs);
        assertTrue(matrix11.equals(result11));

        Matrix result12 = new Matrix(new Double[][]{{1.0, 2.0, 2.8284271247461903}, {2.23606797749979, 3.0, 2.6457513110645907}, {2.23606797749979, 3.0, 2.6457513110645907}});
        matrix12.useOperation(Math::sqrt);
        assertTrue(matrix12.equals(result12));
    }
}