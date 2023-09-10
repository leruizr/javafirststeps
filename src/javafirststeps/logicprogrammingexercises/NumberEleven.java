/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Usando For anidado imprima un triangulo con los numeros del 1 al 10.
 */
public class NumberEleven {

    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("  "); // Dos espacios en blanco para alinear los números
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
                if (num > 10) {
                    break; 
                }
            }

            System.out.println();

            if (num > 10) {
                break; 
            }
        }
    }
}


    



