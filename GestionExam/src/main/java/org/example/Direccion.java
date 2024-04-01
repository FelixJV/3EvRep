package org.example;

import java.util.Random;

public class Direccion {
    private String calle;
    private String provincia;

    public Direccion(String prov) {
        Random random = new Random();
        this.calle = "Maluka";
        this.provincia = prov;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
