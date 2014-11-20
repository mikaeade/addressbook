/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldPartial extends VBox {

    // Label can insert text and pictures etc...
    private final Label nameLabel = new Label("Nimi");
    private final TextField nameField = new TextField();

    private final Label addressLabel = new Label("Osoite");
    private final TextField addressField = new TextField();

    private final Label phoneLabel = new Label("Puhelin");
    private final TextField phoneField = new TextField();

    public TextFieldPartial() {
        //--------- getChildren palauttaa mitä on jo laitettu ja addillä lisätään
        //roottin nähdäen 10 pikseliä
        
        VBox.setMargin(this, new Insets(10,10,10,10));
        this.getChildren().add(nameLabel);
        this.getChildren().add(nameField);
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressField);
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneField);
       
        nameLabel.setStyle("-fx-background-color:pink");
        addressLabel.setStyle("-fx-background-color:lightgreen");
        phoneLabel.setStyle("-fx-background-color:lightblue");
        /// layot for textfield components
        this.setStyle("-fx-spacing:10 10 10 10; -fx-padding:10;-fx-background-color:lightgrey");
    }
    
    public String getTextFieldName(){
    
      return this.addressField.getText();
    
    }   
}
