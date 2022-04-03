package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SubController extends HelloController{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public Label label1;

    @FXML
    void submitForm(ActionEvent event) throws IOException {

//        b1.setText("relaxed");
//        label1.setText("relaxed");

        root = FXMLLoader.load(getClass().getResource("emotionAssessment3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

//        getPresets();

        System.out.println(valence);
        System.out.println(arousal);

    }

}
