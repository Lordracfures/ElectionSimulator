package com.example.mvc.controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Graficocomunidades implements Initializable {

    @FXML
    private NumberAxis naxis;

    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private BarChart<String, Number> barChart;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }



}
