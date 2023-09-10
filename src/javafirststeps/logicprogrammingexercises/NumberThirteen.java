/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Imprima los multiplos de 3 usando un while.
 */
public class NumberThirteen {
    
    public static void main(String[] args) {
        int limite = 1000;
        int numero = 1;

        while (numero <= limite) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
    
}
