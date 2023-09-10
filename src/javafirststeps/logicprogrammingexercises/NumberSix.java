/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafirststeps.logicprogrammingexercises;

import java.util.Scanner;

/**
 *
 * Cree dos arrays de tamaño 5, donde capture los datos  de un usuario (id, nombre, apellido, email, contraseña) 
 * en el primer array ingrese los datos anteriores , en el segundo, escriba los datos del usuario 
 * ( 1, pepito , perez, pepito@mail.com, xyz123). 
 * Con un ciclo for recorra los arrays e imprima la  información en un formato clave valor.

 */
public class NumberSix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] id = new int[2];
        String[] nombre = new String[2];
        String[] apellido = new String[2];
        String[] email = new String[2];
        String[] password = new String[2];

        System.out.println("Ingrese el id");
        id[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el nombre");
        nombre[0] = sc.nextLine();
        System.out.println("Ingrese el apellido");
        apellido[0] = sc.nextLine();
        System.out.println("Ingrese el email");
        email[0] = sc.nextLine();
        System.out.println("Ingrese la contraseña");
        password[0] = sc.nextLine();

        id[1] = 1;
        nombre[1] = "pepito";
        apellido[1] = "perez";
        email[1] = "pepito@mail.com";
        password[1] = "xyz123";

        for (int i = 0; i < 2; i++) {
            System.out.println("Usuario " + (i + 1) + ":");
            System.out.println("ID: " + id[i]);
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Apellido: " + apellido[i]);
            System.out.println("Email: " + email[i]);
            System.out.println("Contraseña: " + password[i]);
            System.out.println();
        }

        sc.close();

    }

}
