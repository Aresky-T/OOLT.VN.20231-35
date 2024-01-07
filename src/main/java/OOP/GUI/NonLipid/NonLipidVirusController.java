package OOP.GUI.NonLipid;

import OOP.GUI.Home.HomeController;
import OOP.GUI.VirusScreenController;
import OOP.entity.Lipid.HIV;
import OOP.entity.NonLipid.Polio;
import OOP.entity.Virus;
import OOP.entity.VirusShape;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NonLipidVirusController {

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

    @FXML
    void polioBtn(ActionEvent event) throws IOException {
        Virus virus= new Polio("Polio",90, VirusShape.XOAN_OC,"Capsid protein",
                "ARN",
                "src/main/resources/OOP/GUI/NonLipid/Polio/polio.jpg"
                );
//        FXMLLoader fxmlLoader = new FXMLLoader(HIVScreenController.class.getResource("HIVScreen.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(VirusScreenController.class.getResource("virusScreen.fxml"));
        fxmlLoader.setController(new VirusScreenController(virus));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Polio");
        stage.setScene(scene);
        stage.show();
    }

}
