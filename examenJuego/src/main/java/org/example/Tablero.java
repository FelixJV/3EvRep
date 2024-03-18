package org.example;

public class Tablero {

    private Casilla [] tablero;
    public Tablero(){
      tablero = new Casilla[96];
        for (int i = 0; i < 96; i++) {
            if(i==0){
                tablero[i]=new Salida();
            }else if(i==40||i==10||i==60||i==66){
                tablero[i] = new Bici();
            }else if(i==14||i==30||i==46||i==62||i==78){
                tablero[i]=new Mercadillo();
            }else if(i==16||i==32||i==48||i==64||i==80){
                tablero[i]=new Atajo();
            }else if(i==94){
                tablero[i]=new DrogasNo();
            }else if(i==95){
                tablero[i]=new Fin();
            }else{
                tablero[i]= new CorreCorre();
            }
        }
    }
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            if(i==15||i==31||i==47||i==63||i==79||i==95){
                System.out.print(tablero[i].toString());
                System.out.println();
            }else{
                System.out.print(tablero[i].toString());
            }
        }
    }
    public void compararPos(int pos, Juego juego, Jugador jugador){
        tablero[pos].funcion(juego,jugador);
    }
}
