package org.example;

public class Salida extends Casilla{


    @Override
    public void funcion(Juego juego, Jugador jugador) {
        juego.setTurno(!juego.isTurno());
    }
}
