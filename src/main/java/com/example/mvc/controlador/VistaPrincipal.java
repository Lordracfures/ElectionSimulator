package com.example.mvc.controlador;

import com.example.mvc.Main;
import com.example.mvc.modelo.ConexionHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class VistaPrincipal implements Initializable {

    public static Scene scene;

    public static Scene getScene() {
        return scene;
    }

    @FXML
    public Button boton;

    @FXML
    public ProgressBar barravox, barrapsoe, barrapp, barraiu;

    @FXML
    public ProgressIndicator cargar;


    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }

    public ProgressBar getBarravox() {
        return barravox;
    }

    public void setBarravox(ProgressBar barravox) {
        this.barravox = barravox;
    }

    public ProgressBar getBarrapsoe() {
        return barrapsoe;
    }

    public void setBarrapsoe(ProgressBar barrapsoe) {
        this.barrapsoe = barrapsoe;
    }

    public ProgressBar getBarrapp() {
        return barrapp;
    }

    public void setBarrapp(ProgressBar barrapp) {
        this.barrapp = barrapp;
    }

    public ProgressBar getBarraiu() {
        return barraiu;
    }

    public void setBarraiu(ProgressBar barraiu) {
        this.barraiu = barraiu;
    }

    Boolean activ = false;
    ConexionHelper ch = new ConexionHelper();


    double v = 0;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void iniciarSimulacion(ActionEvent actionEvent) throws InterruptedException {


        if(activ == false){
            boton.setText("Contando votos...");
            System.out.println("Simulación en proceso");


            ch.empezarVotacion();


            activ = true;
        }else if (true){
            boton.setText("Recuento pausado");
            activ = false;

        }
    }



    public void abrirGrafico(ActionEvent actionEvent) throws IOException, SQLException {

        ConexionHelper ch = new ConexionHelper();
        System.out.println("Grafico comunidades pulsado");

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Grafico.fxml"));

        scene = new Scene(fxmlLoader.load(), 746, 550);
        Stage stage = new Stage();


        stage.setScene(scene);


        stage.show();
    }

    public void abrirGrafico2(ActionEvent actionEvent) throws IOException, SQLException {
        ConexionHelper ch = new ConexionHelper();
        System.out.println("Grafico rangos pulsado");

        ;



        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("graficocomunidades.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 746, 550);
        Stage stage = new Stage();


        BarChart<String, Number> barChart = (BarChart<String, Number>) scene.lookup(("#barchart"));

        XYChart.Series<String,Number> series = new XYChart.Series<>();
        series.setName("PSOE");

        series.getData().add(new XYChart.Data<>("18-25", ch.extracted("psoe", "18-25")));
        series.getData().add(new XYChart.Data<>("26-40", ch.extracted("psoe", "26-40")));
        series.getData().add(new XYChart.Data<>("41-65", ch.extracted("psoe", "41-65")));
        series.getData().add(new XYChart.Data<>("+66", ch.extracted("psoe", "+66")));

        XYChart.Series<String,Number> series2 = new XYChart.Series<>();
        series2.setName("CIUDADANOS");

        series2.getData().add(new XYChart.Data<>("18-25", ch.extracted("iu", "18-25")));
        series2.getData().add(new XYChart.Data<>("26-40", ch.extracted("iu", "26-40")));
        series2.getData().add(new XYChart.Data<>("41-65", ch.extracted("iu", "41-65")));
        series2.getData().add(new XYChart.Data<>("+66", ch.extracted("iu", "+66")));

        XYChart.Series<String,Number> series3 = new XYChart.Series<>();
        series3.setName("VOX");

        series3.getData().add(new XYChart.Data<>("18-25", ch.extracted("vox", "18-25")));
        series3.getData().add(new XYChart.Data<>("26-40", ch.extracted("vox", "26-40")));
        series3.getData().add(new XYChart.Data<>("41-65", ch.extracted("vox", "41-65")));
        series3.getData().add(new XYChart.Data<>("+66", ch.extracted("vox", "+66")));

        XYChart.Series<String,Number> series4 = new XYChart.Series<>();
        series4.setName("PP");

        series4.getData().add(new XYChart.Data<>("18-25", ch.extracted("pp", "18-25")));
        series4.getData().add(new XYChart.Data<>("26-40", ch.extracted("pp", "26-40")));
        series4.getData().add(new XYChart.Data<>("41-65", ch.extracted("pp", "41-65")));
        series4.getData().add(new XYChart.Data<>("+66", ch.extracted("pp", "+66")));

        barChart.getData().addAll(series, series2, series3, series4);

        stage.setScene(scene);


        stage.show();
    }

    public void borrarTabla(ActionEvent actionEvent) throws SQLException {
        ConexionHelper ch = new ConexionHelper();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Cambios en la base de datos");
        alert.setHeaderText(null);
        alert.setContentText("La recolección de votos va a reiniciarse...");
        alert.showAndWait();

        ch.eliminarBbdd();
    }
}
