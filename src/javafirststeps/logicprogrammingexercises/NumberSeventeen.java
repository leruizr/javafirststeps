/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Crea un juego donde se lance un dado, debe salir aleatoriamente un numero del 1 al 6
 * el juego debe preguntar si desea lanzar el dado de nuevo y en caso de que la respuesta sea negativa
 * termina el juego
 */
public class NumberSeventeen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean jugar = true;

        while (jugar) {
            int resultadoDado = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
            System.out.println("Resultado del dado: " + resultadoDado);

            System.out.print("¿Deseas lanzar el dado de nuevo? (s/n): ");
            String respuesta = sc.nextLine().toLowerCase();

            if (!respuesta.equals("s")) {
                jugar = false;
                System.out.println("Gracias por jugar. ¡Hasta luego!");
            }
        }

    }
    
}
