/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
  
        // Root is the main layout
        // Root = VBOX elementit on allekain
        
        BorderPane root = new BorderPane();
        root.setPrefSize(500,400);
        //-------- laitetaan textFieldLayout ja buttonLayout roottiin
        //TextFieldPartial txt =  new TextFieldPartial();
        root.setCenter(new TextFieldPartial());
        root.setBottom(new ButtonLayoutPartial());
        root.setRight(new TextAreaPartial());
     
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
