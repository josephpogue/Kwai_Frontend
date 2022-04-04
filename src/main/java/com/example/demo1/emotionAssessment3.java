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

public class emotionAssessment3 implements Initializable{

    @FXML
    private Label lbl1;
    public static Label static_label;
    @FXML
    private Button calm;
    @FXML
    private Button happy;
    @FXML
    private Button creative;
    @FXML
    private Button relax;

    private int valence;
    private int arousal;

    KWAiUser user = emotionAssessment1.user;

    @Override
    public void initialize(URL url, ResourceBundle rb) {


        valence = user.getValence();
        arousal = user.getArousal();

        if(valence>0&&arousal>0){
            creative.setVisible(false);
            creative.setManaged(false);
            relax.setVisible(false);
            relax.setManaged(false);
        }




    }

}
