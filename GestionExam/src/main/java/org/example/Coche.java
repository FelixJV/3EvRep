package org.example;

public class Coche extends Vehiculo{
    private int capacidad;
    private boolean superior;


    public Coche(String id, double precioDia, String[] tipo, Direccion direccion, int anyoFabric, int capacidad, boolean superior) {
        super(id, precioDia, tipo, anyoFabric, direccion);
        this.capacidad = capacidad;
        this.superior = superior;
    }

    public Coche(String prov) {
        super(prov);
       superior = false;
        capacidad = (int) (Math.random() * 30 +80);
    }

    @Override
    public double precioReal(String festivo) {
        double precio = 0;

        if(festivo.equals("s")){
            if(superior) {
                precio = precioDia + (precioDia * 0.3) + (precioDia * 0.2);
            }else {
                precio = precioDia + (precioDia * 0.3);
            }
        }else if(festivo.equals("n")){
            if(superior) {
                precio = precioDia + (precioDia * 0.2);
            }else {
                precio = precioDia;
            }
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Coche{" + super.toString() +
                "capacidad=" + capacidad +
                ", superior=" + superior +
                '}';
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isSuperior() {
        return superior;
    }

    public void setSuperior(boolean superior) {
        this.superior = superior;
    }
}

