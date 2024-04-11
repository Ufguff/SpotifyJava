package com.example.spotifyjava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label Label;

    @FXML
    private Button ButtonCl;

    public void clickButton()
    {
        Label.setVisible(true);
    }

}