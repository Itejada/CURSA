package com.company;

public class Piloto {


    private String nombre;
    private String escuderia;
    private int numeroPiloto;
    private String coche;

    public Piloto(String nombre,String escuderia, int numeroPiloto, String coche){
        this.nombre=nombre;
        this.escuderia=escuderia;
        this.numeroPiloto=numeroPiloto;
        this.coche=coche;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public void setNumeroPiloto(int numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }



    public String getNombre() {
        return nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public int getNumeroPiloto(){
        return numeroPiloto;
    }

    public String getCoche(){
        return coche;
    }


}
