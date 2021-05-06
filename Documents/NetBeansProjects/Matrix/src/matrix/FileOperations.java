package matrix;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    
    
    public static void writeToFile(Matrix matrix, String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(matrix.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public static Matrix readFromFile(String fileName) {
        return null;
    }
}
