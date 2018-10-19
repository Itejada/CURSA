package com.company;

public class Piloto {

    private  String nombre;
    private  String escuderia;
    private String[] ListaPilotos = new String[10];
    private int NumreoLista=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }


    public String Pilotos(String nombre){

        setNombre(nombre);
        ListaPilotos[++NumreoLista]=this.nombre;


        return "Nada";
    }


}
