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

        Matrix matrixA = new Matrix("Matrix A", 2, 8);
        matrixA.getRandElements(-10, 10);
        System.out.println(matrixA);
        
        int[] arrayA = matrixA.getElementsBelowPrincipleDiagonal();
        System.out.println(Arrays.toString(arrayA));
        
        

        Matrix matrixB = new Matrix("Matrix B", 2, 8);
        matrixB.getRandElements(-10, 10);
        System.out.println(matrixB);

        int[] arrayB = matrixB.getElementsBelowPrincipleDiagonal();
        System.out.println(Arrays.toString(arrayB));
        
        Matrix matrixa = matrixA.swapElements(matrixA, matrixB);
        System.out.println(matrixa);
        
        Matrix matrixb = matrixB.swapElements(matrixB, matrixA);
        System.out.println(matrixb);
    }

}
