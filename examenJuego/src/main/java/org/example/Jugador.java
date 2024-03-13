package org.example;

import net.datafaker.Faker;

public class Jugador {
    private int posicion;
    private String nombre;
    private boolean bici;

    Faker faker = new Faker();
    public Jugador(String nombre){
        this.nombre = nombre;
        bici = false;
        posicion=0;
    }

    public Jugador(){
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

    public Faker getFaker() {
        return faker;
    }

    public void setFaker(Faker faker) {
        this.faker = faker;
    }
}
