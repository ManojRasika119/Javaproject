/*
Creating two random Metrixes and swapp the elements below the 
Left diagonal with each other
 */
package matrix;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Manoj Rasika
 */
public class Matrix {

    // instance variables - attributes of objects
    private String name;
    private int[][] elements;

    // constructors
    Matrix(String name, int numberOfRows, int numberOfColumns) { // this is constructor
        this.name = name;
        elements = new int[numberOfRows][numberOfColumns];
    }
    // methods

    //creating random elements for A and B Matrixs
    private int getRandom(int a, int b) {

        Random rand = new Random();
        return a + rand.nextInt(b - a + 1);
    }

    void getRandElements(int a, int b) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] = getRandom(a, b);

            }
        }
    }

    //methods
    @Override
    public String toString() {

        String text = "";

        text += name + "\n";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                text += String.format("%6d", elements[i][j]);
            }
            text += "\n";
        }
        return text;
    }

    public boolean haveTheSameNumberOfRows(Matrix otherMatrix) {
        boolean result = true;

        if (elements.length != otherMatrix.elements.length) { // number of rows
            result = false;
        }

        return result;
    }

    public boolean haveTheSameNumberOfColumns(Matrix otherMatrix) {
        boolean result = true;

        if (elements[0].length != otherMatrix.elements[0].length) { // number of columns
            result = false;
        }

        return result;
    }

    public boolean haveTheSameDimensions(Matrix otherMatrix) {
        boolean result = false;

        if (haveTheSameNumberOfRows(otherMatrix)
                && haveTheSameNumberOfColumns(otherMatrix)) {
            result = true;
        }

        return result;
    }

    /*
    public boolean compareMatrixs(Matrix otherMatrix) { // are the same or not
        boolean result = true;

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                if (elements[i][j] != otherMatrix.elements[i][j]) {
                    result = false;
                }

            }

        }

        return result;
    }
     */
    public int getMinOfRowsColumns() {
        return Math.min(elements.length, elements[0].length);

    }
    // define diagonal

    public int[] getPrincipleDiagonal() {
        int minRowsColumns = getMinOfRowsColumns();
        int diagonal[] = new int[minRowsColumns];

        for (int i = 0; i < minRowsColumns; i++) {
            diagonal[i] = elements[0][i];
        }

        return diagonal;

    }
    
 
//swap elements of Matrix A and Matrix B
    public static void getSwap(Matrix a, Matrix b) {
        int[][] tmp = a.elements;
        a.elements = b.elements;
        b.elements = tmp;
    }
    
    //check condition
    public boolean getCondition(Matrix anotherMatrix) {
        boolean result = true;

        if (haveTheSameDimensions(anotherMatrix)) {
                    }
        return result;
    }
    
    //select elements below diagonal of the matrix
    public int[] getElementsBelowDiagonal(){
           int elementsBelowDiagonal = getRandElements();
           int belowElements[] = new int[elementsBelowDiagonal] ;
           for (int i = 0; i < elementsBelowDiagonal; i++) {
                  for (int j=i ; j>=0 ; j--) {
                                       }
            }
           return belowElements;
         
}
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
        
