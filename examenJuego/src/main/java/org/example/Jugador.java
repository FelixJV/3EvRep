package org.example;

import net.datafaker.Faker;

public class Jugador {
    private int posicion;
    private String nombre;
    private boolean bici;

    private boolean bloqueado;


    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Jugador(){
        Faker faker = new Faker();
        nombre = faker.funnyName().name();
        bici=false;
    }
    public void pintarJugador(){
        System.out.println(nombre +" ,en la posicion " + posicion);
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBici() {
        return bici;
    }

    public void setBici(boolean bici) {
        this.bici = bici;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
}
