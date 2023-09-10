/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

import java.util.Random;

/**
 *
 * Cree un juego de numeros aleatorios usando un ciclo while en el que cada vez que salga un cero
 * pierda una vida y cada vez que salga un numero diferente a 0 se sume 1 punto.
 * el juego termina cuando el total de vidas sea 0.
 */
public class NumberSixteen {

    public static void main(String[] args) {
        int vidas = 5;
        int puntos = 0;
        Random random = new Random();  // El random es para que nos de el numero aleatorio y se llama similar al scanner.

        while (vidas > 0) {
            int numeroAleatorio = random.nextInt(11); // Genera un número aleatorio entre 0 y 10

            if (numeroAleatorio == 0) {
                System.out.println("¡Salió un cero! Pierdes una vida.");
                vidas--;
            } else {
                System.out.println("¡Salió un " + numeroAleatorio + "! Sumas un punto.");
                puntos++;
            }

            System.out.println("Vidas restantes: " + vidas);
            System.out.println("Puntos acumulados: " + puntos);
            System.out.println();
        }

        System.out.println("¡Juego terminado! Obtuviste " + puntos + " puntos.");
    }

}
