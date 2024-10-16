/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectofol;

/**
 *
 * @author carlos-marino
 */
public class Jugador {
    private char simbol;

    public Jugador(char simbol) {
        this.simbol = simbol;
    }

    public char getSimbol() {
        return simbol;
    }

    @Override
    public String toString() {
        return "Jugador"+ simbol;
    }

    
    
}
