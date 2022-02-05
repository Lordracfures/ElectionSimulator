package com.example.mvc.controlador;

import com.example.mvc.modelo.ConexionHelper;

import java.sql.Connection;

public class Votante extends Thread{

    String nombreComunidad;
    int tipoRango;
    private Connection conexion;
    public  static double conta = 0, contb = 0, contc = 0, contd = 0;
    public static int cont = 0;
/*
    private ProgressBar barravox = (ProgressBar) Main.scene.lookup("#barravox"),
            barrapp = (ProgressBar) Main.scene.lookup("#barrapp"),
            barrapsoe = (ProgressBar) Main.scene.lookup("#barrapsoe"),
            barraiu = (ProgressBar) Main.scene.lookup("#barraiu")
                    ;
*/
    public Votante(String nombreComunidad, int tipoRango, Connection connexion) {
        this.nombreComunidad = nombreComunidad;
        this.tipoRango = tipoRango;
        this.conexion = connexion;
    }

    @Override
    public void run() {
        String tiporango = "";

        ConexionHelper ch = new ConexionHelper();

        cont++;
        String partido = "";

        switch (this.tipoRango){


            case 0:{
                partido = votoRango1();
                tiporango = "18-25";
                break;
            }
            case 1:{
                partido = votoRango2();
                tiporango = "26-40";
                break;
            }
            case 2:{
                partido = votoRango3();
                tiporango = "41-65";
                break;
            }
            case 3:{
                partido = votoRango4();
                tiporango = "+66";
                break;
            }

        }

        ch.insertarVoto(this.conexion,this.nombreComunidad, tiporango, partido);


            incrementarBarra(partido);


        System.out.println(nombreComunidad + " Soy votante tipo: " + this.tipoRango + " y he votado a " + partido);

        System.out.println(" contador de vox: "+conta);
        System.out.println(" contador de psoe: "+contb);
        System.out.println(" contador de pp: "+contc);
        System.out.println(" contador de iu: "+contd);


    }

    public String  votoRango1(){ // de 18-25
        String partido = "";
        int num = 0;
        num =(int)(Math.random()*101);

        if(num >= 0 && num <= 30){
            partido = "vox";
        }else if(num >= 31 && num <= 50){
            partido = "psoe";
        }else if(num >= 51 && num <= 70){
            partido = "pp";
        }else if(num >= 71 && num <= 100){
            partido = "iu";
        }

        return partido;
    }

    public String  votoRango2(){ // de 26-40

        String partido = "";
        int num = 0;
            num =(int)(Math.random()*101);

        if(num >= 0 && num <= 20){
            partido = "vox";
        }else if(num >= 21 && num <= 55){
            partido = "psoe";
        }else if(num >= 56 && num <= 85){
            partido = "pp";
        }else if(num >= 86 && num <= 100){
            partido = "iu";
        }
        return partido;
    }

    public String  votoRango3(){ // 41-65

        String partido = "";
        int num = 0;
        num =(int)(Math.random()*101);

        if(num >= 0 && num <= 10){
            partido = "vox";
        }else if(num >= 10 && num <= 55){
            partido = "psoe";
        }else if(num >= 56 && num <= 90){
            partido = "pp";
        }else if(num >= 91 && num <= 100){
            partido = "iu";
        }
        return partido;
    }

    public String  votoRango4(){ // +66

        String partido = "";
        int num = 0;
        num =(int)(Math.random()*101);

        if(num >= 0 && num <= 25){
            partido = "vox";
        }else if(num >= 26 && num <= 55){
            partido = "psoe";
        }else if(num >= 61 && num <= 95){
            partido = "pp";
        }else if(num >= 96 && num <= 100){
            partido = "iu";
        }
        return partido;
    }

    public void insertarVoto(String nombreComunidad, String partido, String tiporango){ // metodo para insertar votos en la tabla




    }

    public void incrementarBarra(String partido)  {

        switch (partido){

            case "vox":{
                conta = conta + 0.002994;
              //  System.out.println(" contador de vox: "+conta);
               // barravox.setProgress(conta);
                break;
            }
            case "psoe":{
                contb = contb + 0.002994;
              //  System.out.println(" contador de psoe: "+contb);
                //    barrapsoe.setProgress(contd);
                break;
            }
            case "pp":{
                contc = contc + 0.002994;
              //  System.out.println(" contador de pp: "+contc);
             //   barrapp.setProgress(contc);
                break;
            }
            case "iu":{
                contd = contd + 0.002994;
              //  System.out.println(" contador de iu: "+contd);
              //  barraiu.setProgress(contd);
                break;
            }

        }


    }



}
