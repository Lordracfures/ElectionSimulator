package com.example.mvc.controlador;

public class Votante extends Thread{

    String nombreComunidad;
    int tipoRango;


    public Votante(String nombreComunidad, int tipoRango) {
        this.nombreComunidad = nombreComunidad;
        this.tipoRango = tipoRango;
    }

    @Override
    public void run() {

        System.out.println("Proceso iniciado");
    }







}
