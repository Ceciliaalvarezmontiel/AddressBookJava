/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook agenda = new AddressBook("contactos.txt");
        agenda.load();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Listar contactos");
            System.out.println("2. Crear contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Guardar y salir");
            System.out.print("Selecciona una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agenda.list();
                    break;
                case "2":
                    System.out.print("Introduce el número: ");
                    String numero = scanner.nextLine();
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    agenda.create(numero, nombre);
                    break;
                case "3":
                    System.out.print("Introduce el número a eliminar: ");
                    String eliminar = scanner.nextLine();
                    agenda.delete(eliminar);
                    break;
                case "4":
                    agenda.save();
                    System.out.println("Cambios guardados. Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

