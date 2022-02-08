package com.example.mvc.controlador;

import com.example.mvc.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class Grafico implements Initializable {

    @FXML
    private PieChart pieChart;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("City A", 13),
                new PieChart.Data("City B", 15),
                new PieChart.Data("City c", 10),
                new PieChart.Data("City d", 22),
                new PieChart.Data("City e", 30));



                // pieChart.setData(pieChartData);




    }
}
