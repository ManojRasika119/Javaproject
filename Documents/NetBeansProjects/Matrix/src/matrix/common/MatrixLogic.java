package matrix.common;

import matrix.Matrix;

/**
 *
 * @author Medhavi
 */
public class MatrixLogic {

    public static Matrix generateMatrix(String name, int rows,
            int columns, int randFrom, int randTo) {
        Matrix matrix = new Matrix(name, rows, columns);
        matrix.getRandElements(randFrom, randTo);

        return matrix;
    }

    public static void swapMatrix(Matrix matrixA, Matrix matrixB) {
        Matrix[] matrixCD = matrixA.swapElements(matrixB);
        Matrix matrixC = matrixCD[0];
        Matrix matrixD = matrixCD[1];

    }
}
