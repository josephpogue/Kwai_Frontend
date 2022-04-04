package com.example.demo1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class emotionAssessment2 implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    KWAiUser user = emotionAssessment1.user;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    void calm(ActionEvent event) throws IOException {
        user.addValence(6);
        user.addArousal(-6);
    }

    @FXML
    void content(ActionEvent event) throws IOException {
        user.addValence(10);
       user.addArousal(-7);
    }


    @FXML
    void bored(ActionEvent event) throws IOException {

        user.addValence(-3);
        user.addArousal(-8);

    }

    @FXML
    void worried(ActionEvent event) throws IOException {

        user.addValence(-2);
        user.addArousal(-3);

    }

    @FXML
    void distracted(ActionEvent event) throws IOException {
        user.addValence(-1);
        user.addArousal(3);
    }

    @FXML
    void focused(ActionEvent event) throws IOException {

        user.addValence(5);
        user.addArousal(-5);
    }

    @FXML
    void relaxed(ActionEvent event) throws IOException {
        user.addValence(6);
        user.addArousal(-10);
    }

    @FXML
    void angry(ActionEvent event) throws IOException {

        user.addValence(-5);
        user.addArousal(9);

    }

    @FXML
    void inspired(ActionEvent event) throws IOException {
        user.addValence(5);
        user.addArousal(5);
    }

    @FXML
    void frustrated(ActionEvent event) throws IOException {
        user.addValence(-5);
        user.addArousal(5);
    }
    @FXML
    void submitForm(ActionEvent event) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("emotionAssessment3.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
