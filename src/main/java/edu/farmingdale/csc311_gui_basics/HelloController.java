package edu.farmingdale.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HelloController {

    @FXML
    public Label Label2;

    @FXML
    public Button revealEdgeworthButton;

    @FXML
    private Label nameText;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("This is the welcome text");
        nameText.setRotate(-15);
    }

    @FXML
    void newButtonClick(ActionEvent event) {
        Label2.setText("This is Miles Edgeworth");
        Label2.setFont(Font.font ("Verdana", 20));
        Label2.setTextFill(Color.MAROON);
    }
}