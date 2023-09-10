/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Usando un ciclo for se imprime la suma de los numeros del 1 al 10.
 */
public class NumberFive {
    
    public static void main(String[] args) {
        
        int numero = 1;
        int suma = 0;
        
        for (int i = 1; i <= 10; i++) {
            suma += numero;
            numero++;
        }
        
        System.out.println("La suma de los numeros del 1 al 10 es:" + suma);
    }
    
}
