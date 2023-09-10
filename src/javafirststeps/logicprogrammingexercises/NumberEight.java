/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Usando ciclo for anidado imprima un cuadrado de asteriscos.
 */
public class NumberEight {

    public static void main(String[] args) {
        int lado = 10; // Puedes cambiar el tamaño del cuadrado según tus necesidades

        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Ir a la siguiente línea después de imprimir una fila
        }
    }

}
