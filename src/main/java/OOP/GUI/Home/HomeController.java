package OOP.GUI.Home;



import OOP.GUI.Lipid.LipidVirusController;
import OOP.GUI.NonLipid.NonLipidVirusController;
import OOP.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

public class HomeController {

    @FXML
    void exitBtn(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType. CONFIRMATION);
        alert.setTitle("Cofirmation");
        alert.setHeaderText("Xác Nhận Thoát");
//        alert.setContentText("Bạn có muốn thoát không?");
        ButtonType buttonTypeYes = new ButtonType ( "Yes", ButtonBar. ButtonData. YES);
        ButtonType buttonTypeNo = new ButtonType ( "No", ButtonBar.ButtonData.NO);

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get().getButtonData() == ButtonBar. ButtonData.YES)
            System.exit(0);




    }

    @FXML
    void lipidBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
//
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/main/GUI/envelope/hiv/FXML/hivFxml.fxml")));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        music.stop();
//        stage.show();
    }
    @FXML
    void helpBtn(ActionEvent event) {

    }
    @FXML
    void nonLipidBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NonLipidVirusController.class.getResource("nonlipid.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}

