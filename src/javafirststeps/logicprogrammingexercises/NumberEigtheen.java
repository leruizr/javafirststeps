/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;


import java.util.Scanner;

/**
 *
 * Genere una lista de notas que almacene al menos 3 notas y devuelva la nota promedio.
 * las notas se deben recibir por sistema y la aplicacion debe pedir mediante un ciclo while
 * o do while el total de las notas, saliendo de este cuando esten almacenadas
 * debe tomar de otra lista la clave.(nota 1, nota2...promedio)
 */
public class NumberEigtheen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4]; // Definimos un array para almacenar 4 notas
        double sumaNotas = 0;

        System.out.println("Ingrese 4 notas:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            sumaNotas += notas[i];
        }

        double promedio = sumaNotas / 4;
        System.out.println("Promedio de las notas: " + promedio);
    }

}
