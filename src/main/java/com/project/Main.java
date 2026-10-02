package com.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static String nom = "";
    static String edat = "";

    @Override
    public void start(Stage stage) throws Exception {
        UtilsViews.addView(getClass(), "Vista1", "/assets/vista1.fxml");
        UtilsViews.addView(getClass(), "Vista2", "/assets/vista2.fxml");

        Scene scene = new Scene(UtilsViews.parentContainer);

        stage.setScene(scene);
        stage.setTitle("Exercici 01");
        stage.setWidth(400);
        stage.setHeight(300);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}