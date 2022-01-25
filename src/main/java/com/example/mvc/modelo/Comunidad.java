package com.example.mvc.modelo;

public class Comunidad {

    private String nombre;
    private int tprango1;
    private int tprango2;
    private int tprango3;
    private int tprango4;
    private int habitantes;


    public Comunidad(String nombre, int tprango1, int tprango2, int tprango3, int tprango4, int habitantes) {
        this.nombre = nombre;
        this.tprango1 = tprango1;
        this.tprango2 = tprango2;
        this.tprango3 = tprango3;
        this.tprango4 = tprango4;
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Comunidad{" +
                "nombre='" + nombre + '\'' +
                ", tprango1=" + tprango1 +
                ", tprango2=" + tprango2 +
                ", tprango3=" + tprango3 +
                ", tprango4=" + tprango4 +
                ", habitantes=" + habitantes +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTprango1(int tprango1) {
        this.tprango1 = tprango1;
    }

    public void setTprango2(int tprango2) {
        this.tprango2 = tprango2;
    }

    public void setTprango3(int tprango3) {
        this.tprango3 = tprango3;
    }

    public void setTprango4(int tprango4) {
        this.tprango4 = tprango4;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTprango1() {
        return tprango1;
    }

    public int getTprango2() {
        return tprango2;
    }

    public int getTprango3() {
        return tprango3;
    }

    public int getTprango4() {
        return tprango4;
    }

    public int getHabitantes() {
        return habitantes;
    }
}
