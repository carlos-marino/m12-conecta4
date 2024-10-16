/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectofol;

import java.util.*;

/**
 *
 * @author carlos-marino
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int files, columnes;
        do {
        System.out.print("Ingrese el número de files: ");
        files = scanner.nextInt();
        } while (files < 4);

        do {
        System.out.print("Ingrese el número de columnes: ");
        columnes = scanner.nextInt();
        } while (columnes < 4);
        
        Taulell taulell = new Taulell(files, columnes);
        taulell.imprimirTaulell();


        Jugador jugadorX = new Jugador('X');
        Jugador jugadorO = new Jugador('O');
        Jugador jugadorActual = jugadorX;

        boolean jocEnMarxa = true;

        while (jocEnMarxa) {
            System.out.println("Torn del jugador " + jugadorActual.getSimbol());
            int columna;

            do {
                System.out.print("Introdueix una columna (1-" + columnes + "): ");
                columna = scanner.nextInt() - 1;
            } while (!taulell.columnaValida(columna));

            taulell.colocarFitxa(columna, jugadorActual.getSimbol());
            taulell.imprimirTaulell();

            if (taulell.comprovarGuanyador(jugadorActual.getSimbol())) {
                System.out.println("El jugador " + jugadorActual + " ha guanyat!");
                jocEnMarxa = false;
            } else if (taulell.taulerPle()) {
                System.out.println("El joc ha acabat en empat!");
                jocEnMarxa = false;
            } else {
                jugadorActual = (jugadorActual == jugadorX) ? jugadorO : jugadorX;
            }
        }

        scanner.close(); 
    }

}
