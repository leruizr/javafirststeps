/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Con un ciclo for dame el factorial de los numeros del 1 al 10.
 */
public class NumberFourteen {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            long factorial = 1; // Usamos 'long' para manejar factoriales grandes
            
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            System.out.println("El factorial de " + n + " es " + factorial);
        }
    }
    
}
