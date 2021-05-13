/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import matrix.common.MatrixLogic;
import java.util.Arrays;

/**
 *
 * @author micha
 */
public class MatrixMain {

    public static void main(String args[]) {

        Matrix matrixA = MatrixLogic.generateMatrix("Matrix A",
                4, 4, -10, 10);
        System.out.println("Matrix A before swap:");
        System.out.println(matrixA);
        //FileOperations.readFromFile(matrixA, "matrixA-before.txt");

        int[] arrayA = matrixA.getElementsBelowPrincipleDiagonal();
        System.out.println(Arrays.toString(arrayA));
        //FileOperations.writeToFile(matrixA, "matrixA-before.txt");

        Matrix matrixB = MatrixLogic.generateMatrix("Matrix B",
                4, 4, -10, 10);
        System.out.println("Matrix B before swap:");
        System.out.println(matrixB);
        //FileOperations.readFromFile(matrixB, "matrixB-before.txt");

        int[] arrayB = matrixB.getElementsBelowPrincipleDiagonal();
        System.out.println(Arrays.toString(arrayB));
        //FileOperations.writeToFile(matrixB, "matrixB-before.txt");

      //  Matrix[] matrixCD = matrixA.swapElements(matrixB);
       // if (matrixCD != null) {
         //   Matrix matrixC = matrixCD[0];
          //  Matrix matrixD = matrixCD[1];

         //   System.out.println("Matrix C after swap:");
         //   System.out.println(matrixC);

         //   System.out.println("Matrix D after swap:");
         //   System.out.println(matrixD);
      //  } else {
      //      System.out.println("Dimension of matrix A anb B are not the same");
      //  }

        //System.out.println("Matrix A after swap:");
        //System.out.println(matrixA);
        //FileOperations.writeToFile(matrixA, "matrixA-after.txt");
        //FileOperations.readFromFile(matrixA, "matrixA-after.txt");
        //System.out.println("Matrix B after swap:");
        //System.out.println(matrixB);
        //FileOperations.writeToFile(matrixB, "matrixB-after.txt");
        //FileOperations.readFromFile(matrixB, "matrixB-after.txt");
    }

}
