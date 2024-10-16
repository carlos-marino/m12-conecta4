/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectofol;

/**
 *
 * @author carlos-marino
 */
public class Taulell {

    private char[][] taulell;

    public Taulell(int files, int columnes) {
        taulell = new char[files][columnes];
        inicialitzarTaulell();
    }

    private void inicialitzarTaulell() {
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[i].length; j++) {
                taulell[i][j] = ' ';
            }
        }
    }

    public void imprimirTaulell() {
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

    public boolean columnaValida(int columna) {
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

    public void colocarFitxa(int columna, char jugador) {
        for (int i = taulell.length - 1; i >= 0; i--) {
            if (taulell[i][columna] == ' ') {
                taulell[i][columna] = jugador;
                break;
            }
        }
    }

    public boolean comprovarGuanyador(char jugador) {
        return comprovarHoritzontal(jugador) || comprovarVertical(jugador) || comprovarDiagonals(jugador);
    }

    private boolean comprovarHoritzontal(char jugador) {
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j <= taulell[0].length - 4; j++) {
                if (taulell[i][j] == jugador && taulell[i][j + 1] == jugador && taulell[i][j + 2] == jugador && taulell[i][j + 3] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean comprovarVertical(char jugador) {
        for (int i = 0; i <= taulell.length - 4; i++) {
            for (int j = 0; j < taulell[0].length; j++) {
                if (taulell[i][j] == jugador && taulell[i + 1][j] == jugador && taulell[i + 2][j] == jugador && taulell[i + 3][j] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean comprovarDiagonals(char jugador) {
        for (int i = 3; i < taulell.length; i++) {
            for (int j = 0; j <= taulell[0].length - 4; j++) {
                if (taulell[i][j] == jugador && taulell[i - 1][j + 1] == jugador && taulell[i - 2][j + 2] == jugador && taulell[i - 3][j + 3] == jugador) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= taulell.length - 4; i++) {
            for (int j = 0; j <= taulell[0].length - 4; j++) {
                if (taulell[i][j] == jugador && taulell[i + 1][j + 1] == jugador && taulell[i + 2][j + 2] == jugador && taulell[i + 3][j + 3] == jugador) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean taulerPle() {
        for (int i = 0; i < taulell[0].length; i++) {
            if (taulell[0][i] == ' ') {
                return false;
            }
        }
        return true;
    }
}
