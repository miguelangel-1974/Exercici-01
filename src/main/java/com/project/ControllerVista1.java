package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerVista1 {

    @FXML
    TextField campNom;

    @FXML
    TextField campEdat;

    @FXML
    Button botoContinuar;

    @FXML
    void comprovar() {
        String nomEscrit = campNom.getText().trim();
        String edatEscrita = campEdat.getText().trim();

        if (nomEscrit.equals("") || edatEscrita.equals("")) {
            botoContinuar.setDisable(true);
        } else {
            botoContinuar.setDisable(false);
        }
    }

    @FXML
    void anarAVista2(ActionEvent event) {
        Main.nom = campNom.getText().trim();
        Main.edat = campEdat.getText().trim();

        ControllerVista2 ctrl2 = (ControllerVista2) UtilsViews.getController("Vista2");
        ctrl2.actualitzaText();

        UtilsViews.setView("Vista2");
    }
}