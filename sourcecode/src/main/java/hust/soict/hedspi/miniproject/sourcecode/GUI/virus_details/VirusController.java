package hust.soict.hedspi.miniproject.sourcecode.GUI.virus_details;

import hust.soict.hedspi.miniproject.sourcecode.GUI.home.HomeController;
import hust.soict.hedspi.miniproject.sourcecode.Main;
import hust.soict.hedspi.miniproject.sourcecode.entity.Virus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VirusController implements Initializable {

    @FXML
    public MediaView mediaView;

    @FXML
    public ImageView imageView;

    @FXML
    private TextArea text;
    MediaPlayer mediaPlayer;

    @FXML
    public void backToHomePage(ActionEvent actionEvent) throws IOException {
        mediaPlayer.stop();
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage= (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(Main.APP_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void showVirusStructure(ActionEvent actionEvent) {
        imageView.setVisible(true);
        text.setVisible(true);
        mediaView.setVisible(false);
        mediaPlayer.stop();
    }

    @FXML
    public void showVirusInfection(ActionEvent actionEvent) {
        imageView.setVisible(false);
        text.setVisible(false);
        mediaView.setVisible(true);
        mediaPlayer.play();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Virus controller is initialized.");
    }

    private void setupImageView(Virus virus) {
        // Đường dẫn đến hình ảnh
        String imagePath = virus.getImageURL();

        // Tạo một đối tượng Image mới và thiết lập nó cho imageView
        Image image = new Image(imagePath);
        imageView.setImage(image);
    }

    private void setupMediaView(Virus virus) {
        // Đường dẫn đến tệp video
        String videoPath = virus.infect();
        // Tạo đối tượng Media và MediaPlayer
        Media media = new Media(new File(videoPath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        // Thiết lập MediaPlayer cho MediaView
        mediaView.setMediaPlayer(mediaPlayer);

        // Play media
        mediaPlayer.play();
    }

    public String getDescription(Virus virus) {
        return virus.toString();
    }

    public void setSelectedVirus(Virus virus){
        setupImageView(virus);
        setupMediaView(virus);
        mediaPlayer.stop();

        text.setText(getDescription(virus));
        imageView.setVisible(true);
        text.setVisible(true);
        mediaView.setVisible(false);
    }
}
