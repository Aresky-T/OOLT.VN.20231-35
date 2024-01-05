package org.example.oop_project_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class HelloC {

    @FXML
    private Button btn1;

    @FXML
    private Text text1;

    @FXML
    void btn1_clicked(ActionEvent event) {
        text1.setVisible(!text1.isVisible());
    }

}
