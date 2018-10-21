package com.company;

public class Piloto {

    Piloto piloto = new Piloto();
    private  String nombre;
    private  String escuderia;
    private Piloto[] ListaPilotos = new Piloto[10];
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

    public String ListaPilotos(){

        ListaPilotos[++NumreoLista]=this.piloto;

        return "nada";
    }

}
