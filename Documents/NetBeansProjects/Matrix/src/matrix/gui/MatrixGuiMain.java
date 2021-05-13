/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import matrix.Matrix;

/**
 *
 * @author Medhavi
 */
public class MatrixGuiMain extends Application {

    private TextArea textArea;

    @Override
    public void start(Stage primaryStage) {
        Matrix matrixA = new Matrix("Matrix A", 4, 4);
        matrixA.getRandElements(-10, 10);
        
        
        
        primaryStage.setTitle("Matrix Swapping");
        BorderPane root = new BorderPane();

        textArea = new TextArea();
        root.setCenter(textArea);
        textArea.setEditable(false);
//        textArea.appendText("Matrix A :\n");
        textArea.appendText(matrixA.toString());

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
