/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonLayoutPartial extends HBox implements EventHandler<ActionEvent> {

    private final Button closeButton = new Button("Sulje");
    private final Button saveButton = new Button("Tallenna");
    private final Button printButton = new Button("Printtaa");

    UserInfo info = new UserInfo();
    
    
    public ButtonLayoutPartial() {

        this.setStyle("-fx-spacing:10; -fx-padding:10;-fx-background-color:grey");
        HBox.setMargin(closeButton, new Insets(10, 10, 10, 10));
        HBox.setMargin(saveButton, new Insets(10, 10, 10, 10));
        HBox.setMargin(printButton, new Insets(10, 10, 10, 10));
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.getChildren().add(printButton);
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        printButton.setOnAction(this);
        /* *inline method
         closeButton.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent t) {
         }

         });
         }*/
    }

    @Override
    public void handle(ActionEvent t) {
        if (t.getSource().equals(closeButton)) {
            Platform.exit();
        }
        else if (t.getSource().equals(saveButton)){
            System.out.println("Tallennus");   
        }
        else{
            System.out.println("Printtaa");
        }
            
    }
}
