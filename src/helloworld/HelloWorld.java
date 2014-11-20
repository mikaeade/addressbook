/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        VBox root = new VBox();
        // Label can insert text and pictures etc...
        Label nameLabel  = new Label("Nimi");
        TextField nameField = new TextField();
       
        Label addressLabel  = new Label("Osoite");
        TextField addressField = new TextField();
        
        Label phoneLabel  = new Label("Puhelin");
        TextField phoneField = new TextField();
       
        nameLabel.setStyle("-fx-background-color:pink");
        addressLabel.setStyle("-fx-background-color:lightgreen");
        phoneLabel.setStyle("-fx-background-color:lightblue");
        /// layot for textfield components
        
        VBox textFieldLayout = new VBox();
        textFieldLayout.setStyle("-fx-spacing:10 10 10 10; -fx-padding:10;-fx-background-color:lightgrey");
        //--------- getChildren palauttaa mitä on jo laitettu ja addillä lisätään
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameField);
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressField);
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneField);
        
        // -------luodaan napit 
        
        HBox buttonLayout = new HBox();
        buttonLayout.setStyle("-fx-spacing:10; -fx-padding:10;-fx-background-color:grey");
        
        Button closeButton = new Button("Sulje");       
        Button saveButton = new Button("Tallenna");

        buttonLayout.getChildren().add(closeButton);
        buttonLayout.getChildren().add(saveButton);
        
        //-------- laitetaan textFieldLayout ja buttonLayout roottiin
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
        
        Scene scene = new Scene(root, 400, 450);

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
