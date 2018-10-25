package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scanner= new Scanner(System.in);
        boolean error= true;
        String opcion="n";
        int numPotencia;




    /* Alt+22 = ▬ */
        do {
            System.out.println("\nIntrodcir Pilotos☺\t(np)\nElegir Circuito \t(c)\nIniciar carrera\t\t(go)");
            switch (scanner.nextLine()) {
                case "np":

                    Piloto piloto = new Piloto("null","null","null",0,new Coche(null,0));
                    Coche coche =new Coche("null",0);
                    Lista lista=new Lista();
                    System.out.println("Cuantos participantes habran?");
                    lista.setTamañoLista(scanner.nextInt());
                        scanner.nextLine();
                        lista.setLista();

                        for (int i = 0; i < lista.getTamaño(); i++) {

                            System.out.println("Introduce el nombre del piloto "+(i+1));
                            piloto.setNombre(scanner.nextLine());
                            System.out.println("Hombre o mujer?");
                            piloto.setSexo(scanner.nextLine());
                            System.out.println("Inroduce su escuderia");
                            piloto.setEscuderia(scanner.nextLine());
                            System.out.println("introduce la marca del coche asignado");
                            coche.setMarca(scanner.nextLine());
                            System.out.println("Potencia: 1)Baja 2)Media 3)Alta");
                            numPotencia=scanner.nextInt()+1;
                            scanner.nextLine();
                            piloto.setNumeroPiloto(i+1);
                            piloto.setCoche(new Coche(coche.getMarca(),numPotencia));
                            lista.setPilotoEnLista(piloto.getNombre(),piloto.getSexo(),piloto.getEscuderia(),piloto.getNumeroPiloto(), piloto.getCoche() );

                        }
                        for (int ç = 0; ç <lista.getTamaño(); ç++) {
                            System.out.println("El Piloto num"+ (lista.getLista()[ç].getNumeroPiloto()+1) +": "+ lista.getLista()[ç].getNombre()+" En la escuderia: "+ lista.getLista()[ç].getEscuderia()+" Con el coche: "+ lista.getLista()[ç].getCoche());
                        }
                    break;
                case "c":
                    Circuito cir=new Circuito();
                    System.out.println("Indica que circuito quieres \n1)Macloop\n2)Windrift\n3)Ubrise");
                    int nOpcion= scanner.nextInt();
                    scanner.nextLine();
                    cir.setNombreCircuito(nOpcion);
                    String circuito=cir.getNombreCircuito();
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