package com.example.mvc.controlador;

import com.example.mvc.Main;
import com.example.mvc.modelo.ConexionHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;

public class Grafico implements Initializable {

    @FXML
    private PieChart pichar;

    @FXML
    private ComboBox<String> combo;

    @FXML
    private ImageView img;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        data.add(new PieChart.Data("PSOE", 1));
        data.add(new PieChart.Data("CIUDADANOS", 1));
        data.add(new PieChart.Data("VOX", 1));
        data.add(new PieChart.Data("PP", 1));

        pichar.setData(data);

                // pieChart.setData(pieChartData);

        ArrayList<String> comunidades = new ArrayList<>();
        Collections.addAll(comunidades, new String[] {"Andalucia", "Aragon" , "Asturias",
        "Baleares", "Canarias", "Cantabria","Castilla la Mancha","Castilla y Leon", "Cataluña", "Ceuta", "Valencia",
        "Extremadura", "Galicia", "La Rioja", "Madrid", "Melilla", "Murcia", "Navarra", "Pais Vasco"});
        combo.getItems().addAll(comunidades);



    }

    public void cambiarTabla(ActionEvent actionEvent) throws SQLException, URISyntaxException {
        if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("andalucia")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("aragon")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("asturias")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("baleares")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("canarias")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("cantabria")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("Castilla la Mancha")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("Castilla y Leon")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("cataluña")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("ceuta")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("extremadura")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("galicia")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("la rioja")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("madrid")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("melilla")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("murcia")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("navarra")){
            System.out.println("Has pulsado andalucia");
            calcularVotosComunidad(combo.getSelectionModel().getSelectedItem());
        }else if (combo.getSelectionModel().getSelectedItem().equalsIgnoreCase("pais vasco")){
            System.out.println("Has pulsado andalucia");
        }

    }

    public void calcularVotosComunidad(String comunidad) throws SQLException, URISyntaxException {
        ConexionHelper ch = new ConexionHelper();
        int vpsoe = 0, vpp = 0, vvox = 0, vciudadadanos = 0;

        vpsoe = ch.consultaComunidad(comunidad, "psoe");
        vpp = ch.consultaComunidad(comunidad, "pp");
        vvox = ch.consultaComunidad(comunidad, "vox");
        vciudadadanos = ch.consultaComunidad(comunidad, "iu");

        System.out.println("psoe "+vpsoe);
        System.out.println("pp "+vpp);
        System.out.println("vox "+vvox);
        System.out.println("ciudadanis "+vciudadadanos);

        pichar.getData().get(0).setPieValue(vpsoe);
        pichar.getData().get(1).setPieValue(vpp);
        pichar.getData().get(2).setPieValue(vvox);
        pichar.getData().get(3).setPieValue(vciudadadanos);

        if(vpsoe > vpp && vpsoe > vvox && vpsoe > vciudadadanos){
            img.setImage(new Image("C:\\Users\\raul\\Desktop\\MVC\\src\\main\\vista\\com\\example\\mvc\\psoe.png"));
        }if(vpp > vpsoe && vpp > vvox && vpp > vciudadadanos){
            img.setImage(new Image("C:\\Users\\raul\\Desktop\\MVC\\src\\main\\vista\\com\\example\\mvc\\pp.png"));
        }if(vvox > vpp && vvox > vpsoe && vvox > vciudadadanos){
            img.setImage(new Image("C:\\Users\\raul\\Desktop\\MVC\\src\\main\\vista\\com\\example\\mvc\\vox2.png"));
        }if(vciudadadanos > vpp && vciudadadanos > vvox && vciudadadanos > vpsoe){
            img.setImage(new Image("C:\\Users\\raul\\Desktop\\MVC\\src\\main\\vista\\com\\example\\mvc\\ciudad.jpg"));
        }
    }

}
