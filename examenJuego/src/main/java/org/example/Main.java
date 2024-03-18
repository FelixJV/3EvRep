package org.example;


import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego();
        Dado dado = new Dado();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        tablero.pintarTablero();
        boolean victoria = false;
        do {
            System.out.println(juego.DimeTurno());
            jugador1.pintarJugador();
            jugador2.pintarJugador();
            if (!juego.isTurno()) {
                dado.tirarDado(jugador1);
                tablero.compararPos(jugador1.getPosicion(),juego,jugador1);
            }else {
                dado.tirarDado(jugador2);
                tablero.compararPos(jugador2.getPosicion(),juego,jugador2);
            }
            juego.setTurno(!juego.isTurno()); //ojo aquí no, en todas las casillas menos atajo
            if(jugador1.getPosicion()==95||jugador2.getPosicion()==95){
                victoria=true;
            }

            boolean cont = false;
            do{
                System.out.println("Desea continuar? s/n");
                String resp = sc.nextLine();
                if(Objects.equals(resp, "s")){
                    cont=true;
                }else if(Objects.equals(resp, "n")){
                    cont=false;
                }else{
                    System.out.println("Introduce 'n' o 's'");
                    cont=false;
                }
            }while(!cont);


        } while(!victoria);
    }
}