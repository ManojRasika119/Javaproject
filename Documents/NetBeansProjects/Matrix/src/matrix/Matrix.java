/*
Creating two random Metrixes and swapp the elements below the 
Left diagonal with each other
 */
package matrix;

import java.util.Random;

/**
 *
 * @author Manoj Rasika
 */

public class Matrix {

    // instance variables - attributes of objects
    String name;
    int[][] elements;
    
    // constructors
    Matrix(String name, int numberOfRows, int numberOfColumns) { // this is constructor
        this.name = name;
        elements = new int[numberOfRows][numberOfColumns];
    }

    //methods
    @Override
    public String toString() {
        
        String text = "";
        
        text += name + "\n";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                text += String.format("%6d", elements[i][j]);   
                elements[i][j]=int getRandom(a,b);
            }
            text += "\n";
        }
        return text;
    }
    
    private int getRandom(int a , int b) {
        //creating random elements for A and B Matrixs
        Random rand = new Random();
        return rand.nextInt();
       

        
    }

//    private void Array(int[][] twoDArrayA) {
//
//        //creating random elements for A and B Matrixs
//        Random elimentA = new Random();
//
//        int[][] twoDArrayA
//                = //this is not attribute of object! this is local variable
//                // of the method
//       
//        for (int i = 0; -10 < i && i < 10; i = elimentA.nextInt()) {
//            for (int j = 0; -10 < j && j < 10; j = elimentA.nextInt()) {
//
//            }
//            System.out.print(twoDArrayA[i][j] + "  ");
//        }
//
//        Random elimentB = new Random();
//
//        int[][] twoDArrayB =
//       
//        for (int r = 0; -10 < r && r < 10; r = elimentB.nextInt()) {
//            for (int s = 0; -10 < s && s < 10; s = elimentB.nextInt()) {
//
//            }
//            System.out.print(twoDArrayB[r][s] + "  ");
//        }
//    }

}
