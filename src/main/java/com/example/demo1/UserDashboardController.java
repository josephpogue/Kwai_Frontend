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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.chart.*;


public class UserDashboardController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private LineChart lineChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("No of employees");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Revenue per employee");

        lineChart = new LineChart(xAxis, yAxis);
        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data( 1, 567));
        dataSeries1.getData().add(new XYChart.Data( 5, 612));
        dataSeries1.getData().add(new XYChart.Data(10, 800));
        dataSeries1.getData().add(new XYChart.Data(20, 780));
        dataSeries1.getData().add(new XYChart.Data(40, 810));
        dataSeries1.getData().add(new XYChart.Data(80, 850));

        lineChart.getData().add(dataSeries1);
    }

//    @FXML
//    void showLineCharts(){
//        NumberAxis xAxis = new NumberAxis();
//        xAxis.setLabel("No of employees");
//
//        NumberAxis yAxis = new NumberAxis();
//        yAxis.setLabel("Revenue per employee");
//
//        lineChart = new LineChart(xAxis, yAxis);
//        XYChart.Series dataSeries1 = new XYChart.Series();
//        dataSeries1.setName("2014");
//
//        dataSeries1.getData().add(new XYChart.Data( 1, 567));
//        dataSeries1.getData().add(new XYChart.Data( 5, 612));
//        dataSeries1.getData().add(new XYChart.Data(10, 800));
//        dataSeries1.getData().add(new XYChart.Data(20, 780));
//        dataSeries1.getData().add(new XYChart.Data(40, 810));
//        dataSeries1.getData().add(new XYChart.Data(80, 850));
//
//        lineChart.getData().add(dataSeries1);
//    }
}



//package com.example.demo1;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.image.ImageView;
//import javafx.stage.Stage;
//import java.io.IOException;
//import javafx.scene.chart.*;
//
//
//public class UserDashboardController {
//    @FXML
//    void showLineCharts{
//        NumberAxis xAxis = new NumberAxis();
//        xAxis.setLabel("No of employees");
//
//        NumberAxis yAxis = new NumberAxis();
//        yAxis.setLabel("Revenue per employee");
//
//        LineChart lineChart = new LineChart(xAxis, yAxis);
//        XYChart.Series dataSeries1 = new XYChart.Series();
//        dataSeries1.setName("2014");
//
//        dataSeries1.getData().add(new XYChart.Data( 1, 567));
//        dataSeries1.getData().add(new XYChart.Data( 5, 612));
//        dataSeries1.getData().add(new XYChart.Data(10, 800));
//        dataSeries1.getData().add(new XYChart.Data(20, 780));
//        dataSeries1.getData().add(new XYChart.Data(40, 810));
//        dataSeries1.getData().add(new XYChart.Data(80, 850));
//
//        lineChart.getData().add(dataSeries1);
//    }
//}
