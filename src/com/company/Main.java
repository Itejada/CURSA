package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scanner= new Scanner(System.in);
        boolean error= true;
        String opcion="n";
        Piloto piloto= new Piloto();

    /* Alt+22 = ▬ */
        do {
            System.out.println("\nIntrodcir Piloto☺\t(np)\nElegir Circuito \t(c)\nIniciar carrera\t\t(go)");
            switch (scanner.nextLine()) {
                case "np":
                    do{
                        System.out.println("Introduce el nombre del piloto");
                        piloto.setNombre(scanner.nextLine());
                        System.out.println("Inroduce su escuderia");
                        piloto.setEscuderia(scanner.nextLine());
                        piloto.ListaPilotos();
                        System.out.println("Deseas agregar a otro piloto?\n introduce: (s)Si|| Cualquuier caracter para no.");
                        opcion= scanner.nextLine();
                    }while(opcion.equals("s"));
                    break;
                case "c":

                    break;
                case "go":

                    break;
                case "s":
                    error= false;
                    break;
                default:
                    System.out.println("Error, asegurese de que esta introduciendo correctamente la opcion en minusculas");
                    error=true;
            }
        }while (error);

    }
}

/*
 Caracteristica 1: preparar cursa
 Escenari: Triar participants
 Given pregunta cuants participants  hi ha
 wehn infiquem  el numero  de partc
 then crear pilots i cotxes

 Escenari: indicar el circuit on es fa la cursa
 quan indiquem el nom
 aleeshores guardem el nom de la cursa

 Caracteristica 2: indicar cursa
 Escenari : començar compte enrera
 Given pilots i cotxes entrats
 When premem intro final
 then començar compre enrere i comença la cursa

 Scenario: cursa acabada
 Given que el pilots corren
 When acabin
 Then mostra classificació


  Class:
  Vheicle --> Cotxe --> F1/4x4/etc
  Vheicle --> moto --> Mgp/M3
  Vheicle --> bicicletas  --> Mgp/M3
  *********************
  Persona --> Pilot
  **************
  Circuit

*/