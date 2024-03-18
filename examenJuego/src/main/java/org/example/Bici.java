package org.example;

public class Bici extends Casilla{
    public Bici(){
        nombre = getClass().getSimpleName();
    }

    @Override
    public void funcion(Juego juego, Jugador jugador) {
        System.out.println("No hay quien te pare!");
        jugador.setBici(true);
        juego.setTurno(!juego.isTurno());
    }


}
