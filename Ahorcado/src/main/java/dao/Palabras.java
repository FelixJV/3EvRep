package dao;


import common.Categoria;
import common.CategoriaException;
import domain.Palabra;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Palabras {
    private final ArrayList<Palabra> palabras;
    private static int autonumerico;

    public Palabras() {
        this.palabras = new ArrayList<>();

        try {
            palabras.add(new Palabra(autonumerico++, 1, "El mejor verano de mi vida", Categoria.comedia.name()));
            palabras.add(new Palabra(autonumerico++, 1, "Misión Imposible IV fallout", Categoria.accion.name()));

            Faker faker = new Faker();
            String nombre = faker.gameOfThrones().character();
            for (int i = 0; i < 10; i++) {
                palabras.add(new Palabra(autonumerico++, 2, faker.pokemon().name(), Categoria.pokemon.name()));
            }
        } catch (CategoriaException e) {
            System.out.println(e.getMessage());
        }

    }

    public Palabras(ArrayList<Palabra> Palabras) {
        this.palabras = Palabras;
    }

    public static void setAutonumerico(int i) {
        autonumerico = i;
    }

    public List<Palabra> getListaPalabras() {
        return palabras;
    }

    public static int getAutonumerico() {
        return autonumerico;
    }

    public void setListaPalabras(List<Palabra> Palabras) {
        this.palabras.clear();
        this.palabras.addAll(Palabras);
    }
    public Palabra damePalabraAleatoria(){
        return palabras.get((int)(Math.random()*palabras.size()));
    }
    private List<Palabra> dameLista(String categoria){
        ArrayList<Palabra> aux = new ArrayList<>();
        for (int i = 0; i < palabras.size(); i++) {
            if (palabras.get(i).getCategoria().equalsIgnoreCase(categoria))
                aux.add(palabras.get(i)) ;
        }
        return aux;
    }
    public String damePalabraAdivinarCategoira (String categoria){
        List<Palabra> lista = dameLista(categoria);
        return lista.get((int)(Math.random()*lista.size())).getIncognita();
    }

}

