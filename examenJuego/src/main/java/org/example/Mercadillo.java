package org.example;

public class Mercadillo extends Casilla{

    public Mercadillo(){
        nombre = getClass().getSimpleName();
    }

    @Override
    public void funcion(Juego juego, Jugador jugador) {
        System.out.println("Pero donde vas?!");
        jugador.setBloqueado(true);
        juego.setTurno(!juego.isTurno());
    }
}
