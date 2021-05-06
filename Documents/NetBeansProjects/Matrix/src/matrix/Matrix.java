/*
Creating two random Metrixes and swapp the elements below the 
Left diagonal with each other
 */
package matrix;

import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

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
    public Matrix[] swapElements(Matrix b) {
        Matrix[] matrixCD = null;
        
        if (haveTheSameDimensions(b)) {
            //create new objects - copy of A nad B matrices
            // run the algorithm below in new objects and return the new objects
            // of Matrix type
            Matrix matrixC = new Matrix("matrix C", 0, 0);
            Matrix matrixD = new Matrix("matrix D", 0, 0);
            
            
            matrixCD = new Matrix[2];
            matrixCD[0] = matrixC;
            matrixCD[1] = matrixD;
            
            for (int i = 1; i < elements.length; i++) { //OK
                for (int j = 0; j < elements[0].length; j++) {
                    if (i > j) {
                        int tmp = elements[i][j];
                        elements[i][j] = b.elements[i][j];
                        b.elements[i][j] = tmp;
                    }
                }
            }
        }

        return matrixCD;
    }

    //check condition
    private boolean getCondition(Matrix anotherMatrix) {
        boolean result = true;

        if (haveTheSameDimensions(anotherMatrix)) {
        }
        return result;
    }

    //select elements below diagonal of the matrix
    public int[] getElementsBelowPrincipleDiagonal() {
        ArrayList<Integer> elementsBelowPrincipleDig = new ArrayList<>();

        for (int i = 1; i < elements.length; i++) { //OK
            for (int j = 0; j < elements[0].length; j++) {
                if (i > j) {
                    elementsBelowPrincipleDig.add(elements[i][j]);
                }
            }
        }

        return convertArrayListToArray(elementsBelowPrincipleDig);
    }

    private static int[] convertArrayListToArray(ArrayList<Integer> al) {
        int[] array = new int[al.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = al.get(i);
        }

        return array;
    }

    public void createFile() {

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }

    }

    public void writeToFile(MatrixMain matrix) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(matrix.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
