/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

import java.util.Scanner;

/**
 *
 * Elabore un juego triqui con una matriz.
 */
public class NumberFifteen {
    public static void main(String[] args) {
        
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jugadorActual = 'X';
        boolean juegoTerminado = false;

        Scanner sc = new Scanner(System.in);

        while (!juegoTerminado) {
            // Mostrar el tablero
            mostrarTablero(tablero);

            // Pedir al jugador que seleccione una fila y una columna
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.print("Ingrese la fila (0, 1, 2): ");
            int fila = sc.nextInt();
            System.out.print("Ingrese la columna (0, 1, 2): ");
            int columna = sc.nextInt();

            // Verificar si la casilla seleccionada está vacía
            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;

                // Verificar si hay un ganador
                if (hayGanador(tablero, jugadorActual)) {
                    mostrarTablero(tablero);
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else if (tableroLleno(tablero)) {
                    mostrarTablero(tablero);
                    System.out.println("El juego ha terminado en empate.");
                    juegoTerminado = true;
                } else {
                    // Cambiar al otro jugador
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("La casilla seleccionada ya está ocupada. Intenta de nuevo.");
            }
        }

    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    public static boolean hayGanador(char[][] tablero, char jugador) {
        // Verificar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        // Verificar diagonales
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
               (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}



    