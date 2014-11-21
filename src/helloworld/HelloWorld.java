/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * Root = Vbox
 * -> Vbox (name, address, phone) [allekain]
 * -> Hbox (closebth, savebtn) [vierekkäain]
 * @author Ohjelmistokehitys
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        
        TextArea textArea = new TextArea();
        TextFieldPartial textField = new TextFieldPartial();
        
        root.setCenter(textField);
        root.setBottom(new ButtonLayoutPartial(textArea, textField));
        root.setRight(textArea);
     
        Scene scene = new Scene(root);
        // näihin ei tarvi koskea!
        primaryStage.setTitle("Idea");
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
