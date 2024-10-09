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

        System.out.print("Ingrese el número de files: ");
        int files = scanner.nextInt();

        System.out.print("Ingrese el número de columnes: ");
        int columnes = scanner.nextInt();

        char[][] taulell = new char[files][columnes];

        inicialitzarTaulell(taulell);
        imprimirTaulell(taulell);

        boolean jocEnMarxa = true;
        char jugadorActual = 'X';

        while (jocEnMarxa) {
            System.out.println("Torn del jugador " + jugadorActual);
            int columna;

            do {
                System.out.print("Introdueix una columna (1-" + columnes + "): ");
                columna = scanner.nextInt() - 1;
            } while (!columnaValida(taulell, columna));

            colocarFitxa(taulell, columna, jugadorActual);
            imprimirTaulell(taulell);
        }
        scanner.close();  
    }

    public static void inicialitzarTaulell(char[][] taulell) {
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[i].length; j++) {
                taulell[i][j] = ' '; 
            }
        }
    }

    
    public static void imprimirTaulell(char[][] taulell) {
        System.out.println();

        for (int i = 0; i < taulell.length; i++) { 
            System.out.print(" " + (taulell.length - i) + " | "); 
            for (int j = 0; j < taulell[i].length; j++) {
                System.out.print(taulell[i][j] + " | ");
            }
            System.out.println();

            System.out.print("   ");
            for (int j = 0; j < taulell[i].length; j++) {
                System.out.print("----");
            }
            System.out.println("-");
        }

        System.out.print("   ");
        for (int j = 1; j <= taulell[0].length; j++) {
            System.out.print("  " + j + " ");
        }
        System.out.println(); 
    }

     
    public static boolean columnaValida(char[][] taulell, int columna) {
        if (columna < 0 || columna >= taulell[0].length) {
            System.out.println("Columna fora de rang. Torna a intentar-ho.");
            return false;
        }

        if (taulell[0][columna] != ' ') {
            System.out.println("Columna plena. Torna a intentar-ho.");
            return false;
        }

        return true;
    }

    public static void colocarFitxa(char[][] taulell, int columna, char jugador) {
        for (int i = taulell.length - 1; i >= 0; i--) {
            if (taulell[i][columna] == ' ') {
                taulell[i][columna] = jugador; 
                break;
            }
        }
    }
    
}
