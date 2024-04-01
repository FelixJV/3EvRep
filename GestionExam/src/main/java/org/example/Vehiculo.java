package org.example;

import java.util.Arrays;

public abstract class Vehiculo {
    protected String id;
    protected double precioDia;
    protected String[] tipo ={"electrico", "hibrido", "diesel", "gasolina"};
    protected Direccion direccion;
    protected int anyoFabric;

    protected static int idVehiculo = 0;

    public Vehiculo(String id, double precioDia, String[] tipo, int anyoFabric, Direccion direc) {
        this.id = String.valueOf(getClass().getSimpleName().charAt(0) + (++idVehiculo));
        this.precioDia = precioDia;
        this.tipo = tipo;
        this.direccion= direc;
        this.anyoFabric = anyoFabric;
    }

    public Vehiculo(String direc) {
        direccion = new Direccion(direc);
    }

    public abstract double precioReal(String festivo);

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", precioDia=" + precioDia +
                ", tipo=" + Arrays.toString(tipo) +
                ", direccion=" + direccion +
                ", anyoFabric=" + anyoFabric +
                '}';
    }
}
