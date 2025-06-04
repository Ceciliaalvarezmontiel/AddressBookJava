package com.mycompany.addressbook;

import java.io.*;
import java.util.*;

public class AddressBook {
    private final  HashMap<String, String> contactos;
    private final String filename;

    public AddressBook(String filename) {
        this.filename = filename;
        this.contactos = new HashMap<>();
    }

    public void load() {
        contactos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    contactos.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo: " + e.getMessage());
        }
    }

    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<String, String> entry : contactos.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo: " + e.getMessage());
        }
    }

    public void list() {
        System.out.println("Contactos:");
        for (Map.Entry<String, String> entry : contactos.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void create(String number, String name) {
        if (contactos.containsKey(number)) {
            System.out.println("Ya existe un contacto con ese número.");
        } else {
            contactos.put(number, name);
            System.out.println("Contacto agregado.");
        }
    }

    public void delete(String number) {
        if (contactos.containsKey(number)) {
            contactos.remove(number);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se encontró el contacto con ese número.");
        }
    }
}
