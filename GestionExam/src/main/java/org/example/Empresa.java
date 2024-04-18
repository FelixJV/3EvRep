package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Empresa {
    private Vehiculo[][] vehiculos;

    public static String[] provincias = {"Barcelona", "Lugo", "Madrid", "Malaga", "Valencia", "Vizcaya"};

    public Empresa(){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        HashMap<Integer,ArrayList<Vehiculo>> vehiculoss = new HashMap<>();
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0 && i<10) {
                vehiculos.add( new Coche(provincias[0]));
            }else{
                vehiculos.add( new Autobus(provincias[0]));
            }
            if (i % 2 == 0 && i<10) {
                vehiculos.add( new Coche(provincias[1]));
            }else{
                vehiculos.add( new Autobus(provincias[1]));
            }
            if (i % 2 == 0 && i<10) {
                vehiculos.add( new Coche(provincias[2]));
            }else{
                vehiculos.add( new Autobus(provincias[2]));
            }
            if (i % 2 == 0 && i<10) {
                vehiculos.add( new Coche(provincias[3]));
            }else{
                vehiculos.add( new Autobus(provincias[3]));
            }
            if (i % 2 == 0 && i<10) {
                vehiculos.add( new Coche(provincias[4]));
            }else{
                vehiculos.add( new Autobus(provincias[4]));
            }
            if (i % 2 == 0 && i<10) {
                vehiculos.add( new Coche(provincias[5]));
            }else{
                vehiculos.add( new Autobus(provincias[5]));
            }


        }

    }
    /*public Empresa() {
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
    }*/
    Scanner sc = new Scanner(System.in);
    public void crearAnyaVehiculo(String provincia){
        System.out.println("Coche o Bus?");
        String resp = sc.nextLine();
        sc.nextLine();
        if(resp.equals("Coche")) {
            Vehiculo coche = new Coche(provincia);
            anyadirVehiculo(coche);
        }else if(resp.equals("Bus")){
            Vehiculo bus = new Autobus(provincia);
            anyadirVehiculo(bus);
        }

    }
    public void anyadirVehiculo(Vehiculo vehiculo){
        for (int i = 0; i < vehiculos.length ; i++) {
            for (int j = 0; j < vehiculos.length; j++) {
                if(vehiculos[i][j]!=null){
                    vehiculos[i][j] = vehiculo;
                }else {
                    System.out.println("No hay huecos disponibles");
                }
            }
        }
    }
    public void anyosporProv(int anyo, String prov){
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {
                if(vehiculos[i][j]!= null && vehiculos[i][j].direccion.getProvincia().equals(prov) && vehiculos[i][j].anyoFabric>anyo){
                    String TS = vehiculos[i][j].toString();
                    System.out.println(TS);
                }
            }
        }
    }
public void capacidad(int litros, String id){

    for (int i = 0; i < vehiculos.length; i++) {
        for (int j = 0; j < vehiculos.length; j++) {
            if(vehiculos[i][j].id == id && vehiculos[i][j] instanceof Coche){
                Coche coche = (Coche) vehiculos[i][j];
                ((Coche) vehiculos[i][j]).setCapacidad(litros);
            }
        }
    }
}

public void precioporProv(String festivo){
        double Barcelona=0;
        double Lugo=0;
        double Madrid=0;
        double Malaga=0;
        double Valencia=0;
        double Vizcaya=0;
    double BarcelonaC=0;
    double LugoC=0;
    double MadridC=0;
    double MalagaC=0;
    double ValenciaC=0;
    double VizcayaC=0;
    for (int i = 0; i < vehiculos.length; i++) {
        for (int j = 0; j < vehiculos.length; j++) {
            if(vehiculos[i][j].direccion.getProvincia().equals("Barcelona")&&vehiculos[i][j].getClass().getSimpleName().equals("Autobus")) {
                Barcelona = Barcelona + vehiculos[i][j].getPrecioDia();
            }
            else if(vehiculos[i][j].direccion.getProvincia().equals("Barcelona")&&vehiculos[i][j].getClass().getSimpleName().equals("Coche")){
                BarcelonaC = BarcelonaC + vehiculos[i][j].getPrecioDia();
            }
            else if(vehiculos[i][j].direccion.getProvincia().equals("Lugo")){
                Lugo = Lugo + vehiculos[i][j].getPrecioDia();
            }else if(vehiculos[i][j].direccion.getProvincia().equals("Madrid")){
               Madrid = Madrid + vehiculos[i][j].getPrecioDia();
            }else if(vehiculos[i][j].direccion.getProvincia().equals("Malaga")){
                Malaga = Malaga + vehiculos[i][j].getPrecioDia();
            }else if(vehiculos[i][j].direccion.getProvincia().equals("Valencia")){
                Valencia = Valencia + vehiculos[i][j].getPrecioDia();
            }else if(vehiculos[i][j].direccion.getProvincia().equals("Vizcaya")){
                Vizcaya = Vizcaya + vehiculos[i][j].getPrecioDia();
            }
        }
    }
    System.out.println("La media de precio para Autobuses y coches respecivamente en Barcelona es");

}
    public void ordenarxprov(String prov){

        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {

            }
        }
    }
    public boolean actMinus(String id){
        boolean changed = false;
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {
                if(vehiculos[i][j].id == id && vehiculos[i][j] instanceof Autobus){
                    Autobus autobus = (Autobus) vehiculos[i][j];
                    ((Autobus) vehiculos[i][j]).setMinusVal(true);
                    changed = true;
                }
            }
        }
        return changed;
    }
    public int contadorCap(){
        int cont=0;
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {
                if(vehiculos[i][j]instanceof Coche){
                    cont++;
                }
            }
        }
        return cont;
    }
    public Vehiculo[] arrayOrden(){
        Vehiculo [] aux = new Vehiculo[contadorCap()];
        int y = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < vehiculos.length; j++) {
                if(vehiculos[i][j]instanceof Coche){
                    aux[y] = vehiculos[i][j];
                    y++;
                }
            }
        }
        return aux;
    }
}


