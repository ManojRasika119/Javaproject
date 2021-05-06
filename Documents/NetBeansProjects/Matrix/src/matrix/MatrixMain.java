/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Arrays;

/**
 *
 * @author micha
 */
public class MatrixMain {

    public static void main(String args[]) {

        Matrix matrixA = new Matrix("Matrix A", 8, 2);
        matrixA.getRandElements(-10, 10);
        System.out.println(matrixA);

        int[] arrayA = matrixA.getElementsBelowPrincipleDiagonal();
        System.out.println(Arrays.toString(arrayA));
        FileOperations.writeToFile(matrixA, "matrixA-before.txt");

        Matrix matrixB = new Matrix("Matrix B", 8, 2);
        matrixB.getRandElements(-10, 10);
        System.out.println(matrixB);

        int[] arrayB = matrixB.getElementsBelowPrincipleDiagonal();
        System.out.println(Arrays.toString(arrayB));

        Matrix[] matrixCD = matrixA.swapElements(matrixB);
        if (matrixCD != null) {
            Matrix matrixC = matrixCD[0];
            Matrix matrixD = matrixCD[1];

            System.out.println("Matrix C after swap:");
            System.out.println(matrixC);

            System.out.println("Matrix D after swap:");
            System.out.println(matrixD);
        } else {
            System.out.println("Dimension of matrix A anb B are not the same");
        }
        
        System.out.println("Matrix A after swap:");
        System.out.println(matrixA);
        
        System.out.println("Matrix B after swap:");
        System.out.println(matrixB);
    }

}
