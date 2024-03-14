package domain;

import java.awt.color.ICC_ColorSpace;

public class Juego {
    //pensar en los atributos que definen el estado del juego en ese instante para que que si lo paran se pueda recuperar
    private Palabra aAdivinar; //o el String directamente
    private Jugador jugador;
    private int intentos;
    private int dificultad; //opcional, aquí o por elemento.

    public Juego() {
    }

    public Juego(Palabra aAdivinar, Jugador jugador, int dificultad) {
        this.aAdivinar = aAdivinar;
        this.jugador = jugador;
        intentos = 6;
        this.dificultad = dificultad;
    }
    public void comprobarPalabra(char letra, String palabra,int intento){
        char charpalabra [] = palabra.toCharArray();
        if(palabra.contains(String.valueOf(letra))){
            pintarPalabraCon(letra, palabra);
        }else{
            intento++;
        }
    }
    public void pintarPalabraCon(char letra, String palabra) {
        char charpalabra [] = palabra.toCharArray();
        for (int i = 0; i < charpalabra.length; i++) {
            if (i == palabra.indexOf(letra)) {
                System.out.println(letra);
            } else {
                System.out.println("_");
            }
        }

    }
    public void pintarPalabraSin(String palabra){
        char charpalabra [] = palabra.toCharArray();
        for (int i = 0; i < charpalabra.length; i++) {
            System.out.print("_");
        }
    }

    public void munyeco(int intento){
        if (intento == 0 ){
            System.out.println("________");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|__");
        }else if(intento == 1 ){
            System.out.println("________");
            System.out.println("|      O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|__");
        }else if(intento == 2 ){
            System.out.println("________");
            System.out.println("|      O");
            System.out.println("|     /|}");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|__");
        }
        else if(intento == 3 ){
            System.out.println("________");
            System.out.println("|      O");
            System.out.println("|     /|}");
            System.out.println("|      |");
            System.out.println("|");
            System.out.println("|__");
        }else if(intento == 4 ){
            System.out.println("________");
            System.out.println("|      O");
            System.out.println("|     /|}");
            System.out.println("|      |");
            System.out.println("|     _|_");
            System.out.println("|__");
        }
    }
}
