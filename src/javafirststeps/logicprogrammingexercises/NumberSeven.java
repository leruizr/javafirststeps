/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Usando ciclos for anidados imprima un triangulo de asteriscos.
 */
public class NumberSeven {
    
    public static void main(String[] args) {
        int altura = 10; // Puedes cambiar la altura del triángulo según tus necesidades

        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco antes de los asteriscos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Ir a la siguiente línea
            System.out.println();
        }
    }  
    
}
