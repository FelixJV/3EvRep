package org.example;

public class Autobus extends Vehiculo{
    private int numViajeros;
    private boolean minusVal;
    public Autobus(String id, double precioDia, String tipo, Direccion direccion, int anyoFabric) {
        super(id, precioDia, tipo,anyoFabric,direccion);
    }

    public Autobus(String prov) {
        super(prov);
        precioDia = Math.random()*100+60;
        numViajeros =(int) (Math.random()*50+60);
        minusVal= false;
    }

    @Override
    public double precioReal(String festivo) {
    double precio = 0;
    double precioPorAsiento = numViajeros*0.01;
        if(festivo.equals("s")){
            precio = precioDia * 0.3 * precioPorAsiento;
        }else if(festivo.equals("n")){
            precio = precioDia * precioPorAsiento;
        }
        return precio;
    }


    @Override
    public String toString() {
        return "Autobus{" + super.toString() +
                "numViajeros=" + numViajeros +
                ", minusVal=" + minusVal +
                '}';
    }

    public int getNumViajeros() {
        return numViajeros;
    }

    public void setNumViajeros(int numViajeros) {
        this.numViajeros = numViajeros;
    }

    public boolean isMinusVal() {
        return minusVal;
    }

    public void setMinusVal(boolean minusVal) {
        this.minusVal = minusVal;
    }
}
