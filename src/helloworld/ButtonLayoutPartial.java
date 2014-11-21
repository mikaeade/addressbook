/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonLayoutPartial extends HBox implements EventHandler<ActionEvent> {

    private ArrayList<People> lista = new ArrayList();
    private final Button closeButton = new Button("Sulje");
    private final Button saveButton = new Button("Tallenna");
    private final Button printButton = new Button("Printtaa");
    private TextArea textArea;
    private TextFieldPartial textField;

    public ButtonLayoutPartial(TextArea textArea, TextFieldPartial textField) {

        this.textArea = textArea;
        this.textField = textField;
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
    }

    @Override
    public void handle(ActionEvent t) {
        if (t.getSource().equals(closeButton)) {
            Platform.exit();
        } else if (t.getSource().equals(saveButton)) {
            People temp1  = textField.getTextFieldData();
            System.out.println(temp1.getNimi());
            lista.add(temp1);
            System.out.println("listan koko: " + lista.size());
            System.out.println("listan eka: " +lista.get(0).getNimi());
            if(lista.size() > 1)
               System.out.println("listan eka: " +lista.get(1).getNimi()); 
            textField.clearTextFields();
        } 
        
        else {
            for (People temp : lista) {
                textArea.setText(textArea.getText()
                        + "Nimi:" + temp.getNimi() + "\n"
                        + "Osoite:" + temp.getOsoite() + "\n"
                        + "Puhelin:" + temp.getPuhelin() + "\n\n");
            }
        }
    }
}

