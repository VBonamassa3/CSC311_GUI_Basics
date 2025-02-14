package edu.farmingdale.csc311_gui_basics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Image image = new Image(getClass().getResourceAsStream("about_bg_mitsu.png"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 900);
        scene.getStylesheets().add(HelloApplication.class.getResource("mystyle.css").toExternalForm());
        stage.setTitle("My Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}