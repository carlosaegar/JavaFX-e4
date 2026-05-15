package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Button boton1 = new Button("Botón 1");
        Button boton2 = new Button("Botón 2");
        Button boton3 = new Button("Botón 3");

        HBox hbox = new HBox(boton1, boton2);
        VBox vbox = new VBox(hbox, boton3);

        stage.setScene(new Scene(vbox, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
