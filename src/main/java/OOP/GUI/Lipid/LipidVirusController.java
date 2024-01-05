package OOP.GUI.Lipid;



import OOP.GUI.Home.HomeController;
import OOP.GUI.Lipid.Covid.CovidScreenController;
import OOP.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LipidVirusController {

    @FXML
    void covidBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CovidScreenController.class.getResource("covidScreen.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void homeBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("home.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
