package com.example.hotel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EcoHousesApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EcoHousesApplication.class.getResource("hotel-box.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1350, 850);
        stage.setTitle("Welcome to Eco Houses to Rent");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}