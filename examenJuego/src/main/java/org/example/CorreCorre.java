package org.example;

public class CorreCorre extends Casilla{

    public CorreCorre(){
        nombre = getClass().getSimpleName();
    }
    @Override
    public void funcion() {
        System.out.println("Corre Corre que te pillan!");
    }

    @Override
    public String toString() {
        return "[ ]";
    }
}
