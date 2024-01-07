package OOP.GUI;



import OOP.GUI.Home.HomeController;
import OOP.entity.Virus;
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

public class VirusScreenController implements Initializable {
    public VirusScreenController(Virus virus1){
        this.virus=virus1;
    }
    public Virus virus;
    MediaPlayer mediaPlayer;
    @FXML
    private ImageView imageView;

    @FXML
    private MediaView mediaView;

    @FXML
    private TextArea text;
    private Image image;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setupImageView();
        setupMediaView();
        mediaPlayer.stop();
        imageView.setFitWidth(480); // Set the desired width, height
        imageView.setFitHeight(480);
        text.setText(getDescription());
        text.setEditable(false);
        imageView.setVisible(true);
        text.setVisible(true);
        mediaView.setVisible(false);
    }
    @FXML
    void homeBtn(ActionEvent event) throws IOException  {
        mediaPlayer.stop();
        FXMLLoader fxmlLoader = new FXMLLoader(HomeController.class.getResource("home.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(LipidVirusController.class.getResource("lipidVirus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void infectionBtn(ActionEvent event) {

//        setupMediaView();
        imageView.setVisible(false);
        text.setVisible(false);
        mediaView.setVisible(true);
        mediaPlayer.play();

    }

    @FXML
    void structureBtn(ActionEvent event) {
//        setupImageView();
//        text.setText(getDescription());
        imageView.setVisible(true);
        text.setVisible(true);
        mediaView.setVisible(false);
        try {
            mediaPlayer.stop();
        } catch (Exception e1) {
        }
    }
    private void setupImageView() {
//        String imageUrl = "https://example.com/your-image.jpg";
//
//        // Tạo một đối tượng Image từ URL
//        Image image = new Image(imageUrl, true);
        // Đường dẫn đến hình ảnh
//        String imagePath ="https://image.nhandan.vn/Uploaded/2024/unqxwpejw/2023_09_24/anh-dep-giao-thong-1626.jpg";
        String imagePath =virus.getImageURL();
        // String imagePath = "D:\\D\\intellij\\OOP_Project\\OOP_Project_1\\src\\main\\resources\\OOP\\GUI\\Lipid\\Covid\\Covid.png";
        // Tạo một đối tượng Image mới và thiết lập nó cho imageView
        image = new Image(new File(imagePath).toURI().toString());
        imageView.setImage(image);
    }
    private void setupMediaView() {
        // Đường dẫn đến tệp video
        // String videoPath = "src/main/resources/OOP/GUI/Lipid/Covid/animation.mp4"; //
        String videoPath = virus.infect();
        // Tạo đối tượng Media và MediaPlayer
        Media media = new Media(new File(videoPath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        // Thiết lập MediaPlayer cho MediaView
        mediaView.setMediaPlayer(mediaPlayer);


        mediaPlayer.play();
    }

    public String getDescription() {
        return virus.toString();

    }


}


