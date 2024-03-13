package org.example;

public class Dado {
    private int lados;

    public Dado(){
        lados = 20;
    }
    public Dado(int lados){
        this.lados=lados;
    }
    public void tirarDado(Jugador jugador){
        int tirada = (int) (Math.random()*20);
      jugador.setPosicion(tirada);

    }
    public String mostrarTirada(int tirada){
        return "picha";
    }
}
