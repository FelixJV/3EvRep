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
        int tirada;
        if(jugador.isBici()==true) {
            tirada = (int) (Math.random() * 20);
            jugador.setPosicion(jugador.getPosicion() + (tirada * 2));
            System.out.println(tirada);
        }else{
            tirada = (int) (Math.random() * 20);
            jugador.setPosicion(jugador.getPosicion() + tirada);
            System.out.println(tirada);
        }
    }
    public String mostrarTirada(int tirada){
        return "picha";
    }
}
