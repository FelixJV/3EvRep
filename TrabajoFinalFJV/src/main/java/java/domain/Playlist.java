package java.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Playlist {
    private String nombre;
    private int numCanciones;
    private int numDuracionPlist;
    private HashMap<Integer, ArrayList<Cancion>> playlist;

    public Playlist(String nombre, int numCanciones, int numDuracionPlist, HashMap<Integer, ArrayList<Cancion>> playlist) {
        this.nombre = nombre;
        this.numCanciones = numCanciones;
        this.numDuracionPlist = numDuracionPlist;
        this.playlist = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist1 = (Playlist) o;
        return numCanciones == playlist1.numCanciones && numDuracionPlist == playlist1.numDuracionPlist && Objects.equals(nombre, playlist1.nombre) && Objects.equals(playlist, playlist1.playlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numCanciones, numDuracionPlist, playlist);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public int getNumDuracionPlist() {
        return numDuracionPlist;
    }

    public void setNumDuracionPlist(int numDuracionPlist) {
        this.numDuracionPlist = numDuracionPlist;
    }

    public HashMap<Integer, ArrayList<Cancion>> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(HashMap<Integer, ArrayList<Cancion>> playlist) {
        this.playlist = playlist;
    }
}
