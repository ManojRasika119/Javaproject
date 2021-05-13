/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import matrix.Matrix;
import matrix.common.MatrixLogic;

/**
 *
 * @author Medhavi
 */
public class MatrixGuiMain extends Application {

    private TextArea textArea;

    @Override
    public void start(Stage primaryStage) {
        Matrix matrixA = MatrixLogic.generateMatrix("Matrix A",
                2, 4, -10, 10);
        Matrix matrixB = MatrixLogic.generateMatrix("Matrix B",
                2, 4, -10, 10);

        Matrix[] matrixCD = matrixA.swapElements(matrixB);
        Matrix C = matrixCD[0];
        Matrix D = matrixCD[1];

        //Matrix C = MatrixLogic.swapMatrix(matrixA, matrixB );
        
        primaryStage.setTitle("Matrix Swapping");
        BorderPane root = new BorderPane();

        textArea = new TextArea();
        root.setCenter(textArea);
        textArea.setEditable(false);
//      textArea.appendText("Matrix A :\n");
        textArea.appendText(matrixA.toString());
        textArea.appendText(matrixB.toString());
        textArea.appendText(C.toString());
        textArea.appendText(D.toString());

        String text = textArea.getText();

        Scene scene = new Scene(root, 500, 550);
        //scene.getStylesheets().add(getClass().getResource("MatrixMain.java").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
