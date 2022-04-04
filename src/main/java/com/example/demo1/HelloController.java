package com.example.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public int valence = 0;
    public int arousal = 0;

//    @FXML
//    public static void start(Stage stage) throws IOException {
//        try {
//            Parent root = FXMLLoader.load(HelloController.class.getResource("emotionAssessment.fxml"));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//    }

    @FXML
    void emotionControl(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("emotionAssessment.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void showNextScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void userDashboard(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("userdashboard.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void customization(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("customization.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void listen(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("listen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void one(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 1;
        arousal = 1;
    }

    @FXML
    void two(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 2;
        arousal = 2;
    }

    @FXML
    void three(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 3;
        arousal = 3;

        System.out.println(valence);
        System.out.println(arousal);
    }

    @FXML
    void four(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 4;
        arousal = 4;
    }

    @FXML
    void five(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 5;
        arousal = 5;
    }

    @FXML
    void six(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 6;
        arousal = 6;
    }

    @FXML
    void seven(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 7;
        arousal = 7;
    }
    @FXML
    void eight(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 8;
        arousal = 8;
    }

    @FXML
    void nine(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("emotionAssessment2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        valence = 9;
        arousal = 9;
    }

    @FXML
    void content(ActionEvent event) throws IOException {
        valence += 10;
        arousal -= 7;
    }

    @FXML
    void calm(ActionEvent event) throws IOException {
        valence += 6;
        arousal -= 6;
    }

    @FXML
    void bored(ActionEvent event) throws IOException {
        valence -= 3;
        arousal -= 8;
    }

    @FXML
    void worried(ActionEvent event) throws IOException {
        valence -= 2;
        arousal -= 3;
    }

    @FXML
    void distracted(ActionEvent event) throws IOException {
        valence -= 1;
        arousal += 3;
    }

    @FXML
    void focused(ActionEvent event) throws IOException {
        valence += 5;
        arousal -= 5;
    }

    @FXML
    void relaxed(ActionEvent event) throws IOException {
        valence += 6;
        arousal -= 10;
    }

    @FXML
    void angry(ActionEvent event) throws IOException {
        valence -= 5;
        arousal += 9;
    }

    @FXML
    void inspired(ActionEvent event) throws IOException {
        valence += 5;
        arousal += 4;
    }

    @FXML
    void frustrated(ActionEvent event) throws IOException {
        valence -= 5;
        arousal += 5;
    }

    @FXML
//    private Button b1;
    public Label label1;

//    @FXML
//    void submitForm(ActionEvent event) throws IOException {
//
////        b1.setText("relaxed");
////        label1.setText("relaxed");
//
//        root = FXMLLoader.load(getClass().getResource("emotionAssessment3.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
////        getPresets();
//
//        System.out.println(valence);
//        System.out.println(arousal);
//
//    }

    public void gotoPreset(ActionEvent event) {
        Button button = (Button) event.getSource();

        String preset = button.getText();
        System.out.println(preset);
    }





}