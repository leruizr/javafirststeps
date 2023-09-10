/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Usando while imprima los numeros pares del 0 al 100.
 */
public class NumberNine {

    public static void main(String[] args) {
        int numero = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

}
