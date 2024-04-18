package java.service;

import java.domain.Cancion;
import java.util.ArrayList;

public interface IGestionCanciones {
    public void insertarCancion(String nombre, String artistaS, double duracion, int numGuardados, int id, String genero);

    public void eliminarCancion(int id);

    public void editarCancionArtista(int id, String artista);
    public void editarCancionNombre(int id, String nombre);
    public void editarCancionGenero(int id, String genero);

    public ArrayList<Cancion> listarporGenero(String genero);
    public ArrayList<Cancion> listarporDuracion(boolean ascendente);

}
