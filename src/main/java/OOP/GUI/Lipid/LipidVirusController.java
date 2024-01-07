package OOP.GUI.Lipid;



import OOP.GUI.Home.HomeController;
import OOP.GUI.VirusScreenController;
import OOP.entity.Lipid.Corona;
import OOP.entity.Lipid.HIV;
import OOP.entity.Virus;
import OOP.entity.VirusShape;
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
        Virus virus= new Corona("Corona",90, VirusShape.XOAN_OC,"capsid protein",
                "ARN",
                "src/main/resources/OOP/GUI/Lipid/Covid/Covid.png",
                "lipid","Complex lipid envelope");
        FXMLLoader fxmlLoader = new FXMLLoader(VirusScreenController.class.getResource("virusScreen.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        fxmlLoader.setController(new VirusScreenController(virus));
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
    @FXML
    void HIVBtn(ActionEvent event) throws IOException {
        Virus virus= new HIV("HIV",90, VirusShape.XOAN_OC,"Capsid protein",
               "ARN",
                "src/main/resources/OOP/GUI/Lipid/HIV/Structure-of-HIV.png",
                "protect","simple lipid envelope");
//        FXMLLoader fxmlLoader = new FXMLLoader(HIVScreenController.class.getResource("HIVScreen.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(VirusScreenController.class.getResource("virusScreen.fxml"));
        fxmlLoader.setController(new VirusScreenController(virus));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
