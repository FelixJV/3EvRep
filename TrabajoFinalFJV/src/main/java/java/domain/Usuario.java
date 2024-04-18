package java.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private String password;
    private ArrayList<Playlist> tusPlaylist;

    public Usuario(String nombre, String password, ArrayList<Playlist> tusPlaylist) {
        this.nombre = nombre;
        this.password = password;
        this.tusPlaylist = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(password, usuario.password) && Objects.equals(tusPlaylist, usuario.tusPlaylist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, password, tusPlaylist);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getTusPlaylist() {
        return tusPlaylist;
    }

    public void setTusPlaylist(ArrayList<Playlist> tusPlaylist) {
        this.tusPlaylist = tusPlaylist;
    }
}
