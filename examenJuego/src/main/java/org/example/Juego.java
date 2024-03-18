package org.example;

public class Juego {
    private boolean turno;


    public Juego(){
        turno = false;
    }

    public String DimeTurno(){
        String turn=null;
        if(!turno){
            turn = "Turno del jugador 1";

        }else{
            turn = "Turno del Jugador 2";
        }
        return turn;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
}
