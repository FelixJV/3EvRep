package org.example;

import java.util.Scanner;


public class Empresa {
    private Vehiculo[][] vehiculos;

    public static String[] provincias = {"Barcelona", "Lugo", "Madrid", "Malaga", "Valencia", "Vizcaya"};

    public Empresa() {
        vehiculos = new Vehiculo[6][6];
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0) {
                        vehiculos[i][j] = new Coche(provincias[0]);

                    }else{
                        vehiculos[i][j] = new Autobus(provincias[0]);
                    }
                }
            }else if (i == 1) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0) {
                        vehiculos[i][j] = new Coche(provincias[1]);

                    }else{
                        vehiculos[i][j] = new Autobus(provincias[1]);
                    }
                }
            }
            else if (i == 2) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0) {
                        vehiculos[i][j] = new Coche(provincias[2]);

                    }else{
                        vehiculos[i][j] = new Autobus(provincias[2]);
                    }
                }
            }
            else if (i == 3) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0) {
                        vehiculos[i][j] = new Coche(provincias[3]);

                    }else{
                        vehiculos[i][j] = new Autobus(provincias[3]);
                    }
                }
            }
            else if (i == 4) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0) {
                        vehiculos[i][j] = new Coche(provincias[4]);

                    }else{
                        vehiculos[i][j] = new Autobus(provincias[4]);
                    }
                }
            }
            else if (i == 5) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0) {
                        vehiculos[i][j] = new Coche(provincias[5]);

                    }else{
                        vehiculos[i][j] = new Autobus(provincias[5]);
                    }
                }
            }
        }
    }
public void mostrarCoches(int litros){

    for (int i = 0; i < vehiculos.length; i++) {
        for (int j = 0; j < vehiculos.length; j++) {
            if(i%2==0){
                Coche coche = (Coche) vehiculos[i][j];
                ((Coche) vehiculos[i][j]).setCapacidad(litros);
            }
        }
    }
}

    public void ordenarxprov(String prov){

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {

            }
        }
    }
}

