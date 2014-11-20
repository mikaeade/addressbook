/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextAreaPartial extends VBox {
    
     // Label can insert text and pictures etc...
    private final TextArea textArea = new TextArea();

    public TextAreaPartial() {
        //--------- getChildren palauttaa mitä on jo laitettu ja addillä lisätään
        //roottin nähdäen 10 pikseliä
        VBox.setMargin(this, new Insets(10,10,10,10));
        this.autosize();
        this.getChildren().add(textArea);
        this.setStyle("-fx-spacing:10 10 10 10; -fx-padding:10;-fx-background-color:lightgrey;-fx-height:100");
    }
}
