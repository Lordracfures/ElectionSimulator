package com.example.mvc.modelo;
import com.example.mvc.controlador.Votante;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.RandomAccess;


public class ConexionHelper {



    public static  void main(String [] args) throws IOException, ClassNotFoundException, SQLException{


        Connection connexion;



        ConexionHelper ch = new ConexionHelper();
        connexion = ch.createConnection(); // call to method for create connection with colegio bbdd

        ArrayList<Comunidad> comunidades;

        comunidades = ch.listaComunidadesVotantes(connexion);

        for (int i = 0; i < comunidades.size(); i++) {
            System.out.println(comunidades.get(i));
        }
    }


    private Connection createConnection() { // apartado 1
        Connection connection = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/censo_por_comunidades?serverTimezone=UTC","root", "153426");

            connection.setAutoCommit(false); //false : tiene en cuenta las transacciones y true para lo contrario

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Conexión establecida con exito!!!!!!");
        return connection;
    }


    private void disconnect(Connection conexion) { // apartado 3
        try {
            if (null != conexion) {
                conexion.close();
                conexion = null;
                System.out.println("Desconexion realizada con exito!!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    private  ArrayList<Comunidad>  listaComunidadesVotantes(Connection conexion){
        ArrayList<Comunidad> comunidades = new ArrayList<Comunidad>();

        String sentenciaSql= "SELECT p.nombre_comunidad as comunidad , p.rango_18_25 , p.rango_26_40 , p.rango_41_65 , rango_mas_66 , " +
                "p.total_habitantes as habitantes from porcentajes_rangoedad p group by p.nombre_comunidad;";

        Statement sentencia = null;
        ResultSet resulset = null;

        try {
            sentencia = conexion.createStatement(); // inicializalimamos la sentencia
            resulset = sentencia.executeQuery(sentenciaSql);

            while (resulset.next()){

                comunidades.add(new Comunidad   (resulset.getString("comunidad"), resulset.getInt("rango_18_25"), resulset.getInt("rango_26_40"), resulset.getInt("rango_41_65"), resulset.getInt("rango_mas_66"), resulset.getInt("habitantes")));


            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(resulset != null) {
                    resulset.clearWarnings();
                    System.out.println("//////resulset cerrado///");
                }
            }catch (Exception e){

            }
        }

        return comunidades;
    }


}
