package org.example;

public class Bici extends Casilla{
    public Bici(){
        nombre = getClass().getSimpleName();
    }
    @Override
    public void funcion() {
        System.out.println("No hay quien te pare!");

    }
}
