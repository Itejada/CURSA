package com.company;

public class Circuito {


    private static String[] NOMBRE_CIRCUITO= {"Macloop","Windrift","Ubrise"};
    String circuito=null;



    public void setNombreCircuito(int nOpcion) {
         circuito = NOMBRE_CIRCUITO[nOpcion -1];

    }
    public String getNombreCircuito() {
        return circuito;
    }

}
