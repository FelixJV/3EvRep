package org.example;

import java.util.Arrays;
import java.util.Random;

public abstract class Vehiculo {
    protected String id;
    protected double precioDia;

    protected String tipo;
    protected String[] tipos ={"electrico", "hibrido", "diesel", "gasolina"};
    protected Direccion direccion;
    protected int anyoFabric;

    protected static int idVehiculo = 0;

    public Vehiculo(String id, double precioDia, String tipo, int anyoFabric, Direccion direc) {
        this.id = String.valueOf(getClass().getSimpleName().charAt(0) + (++idVehiculo));
        this.precioDia = precioDia;
        this.tipo = tipo;
        this.direccion= direc;
        this.anyoFabric = anyoFabric;
    }

    public Vehiculo(String direc) {
        Random random = new Random();
        this.id = String.valueOf(getClass().getSimpleName().charAt(0) + (++idVehiculo));
        direccion = new Direccion(direc);
        int indiceAleatorio = random.nextInt(tipos.length);
        this.tipo = tipos[indiceAleatorio];
        anyoFabric = (int)(Math.random()*2022+2010);
    }

    public abstract double precioReal(String festivo);

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", precioDia=" + precioDia +
                ", tipo=" + tipo +
                ", direccion=" + direccion +
                ", anyoFabric=" + anyoFabric +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getAnyoFabric() {
        return anyoFabric;
    }

    public void setAnyoFabric(int anyoFabric) {
        this.anyoFabric = anyoFabric;
    }

    public static int getIdVehiculo() {
        return idVehiculo;
    }

    public static void setIdVehiculo(int idVehiculo) {
        Vehiculo.idVehiculo = idVehiculo;
    }
}
