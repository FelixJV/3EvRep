package ui;

import dao.DaoPalabrasFicheros;
import dao.Palabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFicheros {
    public static void main(String[] args) {
        Palabras palabras = new Palabras();

        try {
            //DaoPalabrasFicheros.crearFicheros("Primero");
            DaoPalabrasFicheros.escribirFichero(palabras.getPalabras(), "Primero");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            DaoPalabrasFicheros.leerFichero("Primero");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
