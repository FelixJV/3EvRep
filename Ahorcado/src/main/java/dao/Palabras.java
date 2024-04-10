package dao;


import common.Categoria;
import common.CategoriaException;
import domain.Palabra;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Palabras{
    private final ArrayList<Palabra> palabras;
    private static int autonumerico;

    public Palabras() {

       String incognita = null;
        String categoria = null;
        int id = 0;
        int level =0;
/*
        Faker faker = new Faker();
        //Aquí leer fichero cuando ya esté el fichero creado con las palabras del DataFaker
        this.palabras = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            if(i<=5){
                incognita = faker.animal().name();
                categoria = "Animal";
                id=i;
            }
            if(i>5 && i<=10){
                incognita = faker.country().name();
                categoria= "Pais";
                id=i;
            }
            int nletras = incognita.length();

            if(nletras <= 6){
                level = 1;
            } if(nletras>6 && nletras<10){
                level = 2;
            }else{
                level = 3;
            }

            try {
                palabras.add(new Palabra(id, level, incognita, categoria));
            } catch (CategoriaException e) {
                throw new RuntimeException(e);
            }
        }
*/

this.palabras = new ArrayList<>();
        try {

                palabras.add(new Palabra(id,level,incognita,categoria));

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

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }

    public boolean eliminaPalabra(int i) {

        boolean salir = false;
        for (int j = 0; j < palabras.size() && !salir; j++) {
            if (palabras.get(j).getId()==i) {
                palabras.remove(j);
                salir = true;
            }
        }
        return salir;
    }
    public void insertarPalabra(int id, int level, String incognita, String categoria){
        try {
            palabras.add(new Palabra(id,level,incognita,categoria));
        } catch (CategoriaException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarCategoría(int id, String categoria){
        boolean salir = false;
        for (int j = 0; j < palabras.size() && !salir; j++) {
            if (palabras.get(j).getId()==id) {
                try {
                    palabras.get(j).setCategoria(categoria);
                } catch (CategoriaException e) {
                    throw new RuntimeException(e);
                }
                salir = true;
            }
        }

    }
    public int compareTo(Palabra o) {
        return 0;
    }
}

