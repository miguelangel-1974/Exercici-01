package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerVista2 {

    @FXML
    Label missatge;

    void actualitzaText() {
        missatge.setText("Hola " + Main.nom + ", tens " + Main.edat + " anys!");
    }

    @FXML
    void tornar(ActionEvent event) {
        UtilsViews.setView("Vista1");
    }
}