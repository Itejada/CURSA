package com.company;

public class Piloto extends Persona{


    private String escuderia;
    private int numeroPiloto;
    private Coche coche;

    public Piloto(String nombre,String sexo,String escuderia, int numeroPiloto, Coche coche){
        this.nombre=nombre;
        this.sexo= sexo;
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Coche getCoche() {
        return coche;
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



    public String getSexo(){
        return sexo;
    }

}
