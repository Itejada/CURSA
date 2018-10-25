package com.company;

public class Lista {


    private Piloto[] Pilotos= getLista();
    private int Tamaño;


    public void setTamañoLista(int Tamaño){
        this.Tamaño=Tamaño;
    }
    public void setLista(){
        Piloto[] Pilotos = new Piloto[this.Tamaño];

    }
    public void setPilotoEnLista(String nombre,String sexo,String escuderia,int num,Coche coche){

        Pilotos[num-1]=new Piloto(nombre,sexo,escuderia,num,coche);
    }

    public Piloto[] getLista(){
        return Pilotos;
    }

    public int getTamaño() {
        return Tamaño;
    }
}
