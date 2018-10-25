package com.company;
public class Lista {

    private Piloto[] Pilotos= getLista();
    private Coche[] Coches = getListaCoches();
    private int Tamaño;


    public void setTamañoLista(int Tamaño){
        this.Tamaño=Tamaño;
    }
    public void setLista(){
        Piloto[] Pilotos = new Piloto[this.Tamaño];
    }
    public void setPilotoEnLista(String nombre,String sexo,String escuderia,int num,int coche, String marca, String potencia){
        Pilotos[num-1]=new Piloto(nombre,sexo,escuderia,num,coche);
        Coches[coche-1]=new Coche(marca,potencia);
    }
    public Piloto[] getLista(){
        return Pilotos;
    }
    public int getTamaño() {
        return Tamaño;
    }

    public Coche[] getListaCoches(){
        return Coches;
    }

    public void setListaCoches(Coche[] coches){
        Coche[] Coches = new Coche[this.Tamaño];
    }
}