package org.example;

public abstract class Casilla {
    protected String nombre;

    public Casilla(){
    }
    public abstract void funcion();

    @Override
    public String toString() {
        return "["+String.valueOf(getClass().getSimpleName().charAt(0))+"]";
    }
}
