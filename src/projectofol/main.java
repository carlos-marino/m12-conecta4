/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectofol;

import java.util.Scanner;

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
        int filas = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnes: ");
        int columnas = scanner.nextInt();
        
        char[][] tablero = new char[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '-';
            }
        }
        
        imprimirTablero(tablero);
        


        
        
    }
    
    public static void imprimirTablero(char[][] tablero) {
        System.out.print("  "); 
        for (int j = 1; j <= tablero[0].length; j++) {
            System.out.print(j + " "); 
        }
        System.out.println();
        
        for (int i = 1; i <= tablero.length; i++) {
            System.out.print(i + " "); 
            for (int j = 0; j < tablero[i-1].length; j++) {
                System.out.print(tablero[i-1][j] + " ");
            }
            System.out.println();
        }
    }
}