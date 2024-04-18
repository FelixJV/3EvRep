package org.example;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileWriter escritor = new FileWriter("Pachuliiii")) {
            // Escribir del 1 al 10 en el archivo
            for (int i = 1; i <= 10; i++) {
                escritor.write(Integer.toString(i) + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}