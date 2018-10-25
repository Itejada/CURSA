package com.company;

public class Coche extends Vehiculo {

    private String potencia;


    public Coche(String marca, int numPotencia){
        this.Marca=marca;
        this.potencia= super.potencia[numPotencia]; /* super. indica que pertenece a la clase padre */
        this.asientos=5;
        this.ruedas=4;

    }

    private String Marca;


    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

}
