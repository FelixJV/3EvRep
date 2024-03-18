package org.example;

public class DrogasNo extends Casilla{

    public DrogasNo(){ nombre=getClass().getSimpleName();}
    @Override
    public void funcion(Juego juego, Jugador jugador) {
        System.out.println("DROGAS NO!");
        jugador.setPosicion(0);
        juego.setTurno(!juego.isTurno());
    }
}
