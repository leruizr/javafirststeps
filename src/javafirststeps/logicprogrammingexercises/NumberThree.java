/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

/**
 *
 * Empleando un for anidado imprime las tablas de multiplicar del 1 al 10.
 */
public class NumberThree {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.print(i + " x " + j + " = " + resultado + "\n");
            }
            System.out.println("__________________________________");
        }

    }

}
