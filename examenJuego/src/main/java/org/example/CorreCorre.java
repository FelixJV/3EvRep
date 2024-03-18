package org.example;

public class CorreCorre extends Casilla{

    public CorreCorre(){
        nombre = getClass().getSimpleName();
    }

    @Override
    public void funcion(Juego juego, Jugador jugador) {
        System.out.println("Corre corre que te pillan");
        juego.setTurno(!juego.isTurno());

    }



    @Override
    public String toString() {
        return "[ ]";
    }
}
