/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Usando el ciclo while se realiza la suma de los numeros del 1 al 10 y se imprime el resultado.
 */
public class NumberFour {

    public static void main(String[] args) {

        int numero = 1;
        int suma = 0;

        while (numero <= 10) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma de los números del 1 al 10 es: " + suma);

    }

}
