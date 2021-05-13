/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix.gui2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Medhavi
 */
public class MatrixGuiMain extends Application {
    
    private TextArea textArea;
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Matrix Swapping");
        BorderPane root =new BorderPane();
       
        textArea = new TextArea();
        root.setCenter(textArea);
        textArea.setEditable(false);
        textArea.appendText("Matrix A :\n"); 
        
        String text = textArea.getText();
        System.out.println(text);
              
        
        Scene scene = new Scene(root, 500, 550);
        scene.getStylesheets().add(getClass().getResource("MatrixMain.java").toExternalForm());
        
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
