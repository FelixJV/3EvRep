package org.example;

public class Atajo extends Casilla{
    @Override
    public void funcion(Juego juego, Jugador jugador) {
        System.out.println("De atajo en atajo por que eres el más majo");
        if(jugador.getPosicion()==80) {
            jugador.setPosicion(80);
        }else{
            jugador.setPosicion(jugador.getPosicion()+16);
        }
        juego.setTurno(!juego.isTurno());

    }
    public Atajo(){nombre=getClass().getSimpleName();}
}
