package domain;


import common.CategoriaException;
import common.Comprobacion;
import dao.Palabras;

public class Palabra implements Comparable{
    private int id;
    private int level;
    private String incognita;
    private String categoria;

    /**
     *
     * @param id identicador único de cada elemento, el String incognita puede tener espacios, mayúsculas, mínúsculas que no lo hagan único
     * @param level indica la dificultad que le asignamos a la incognita a adivinar por el tamaño de caracteres por ejemplo
     * @param incognita palabra a adivinar
     * @param categoria String que debe se un elemento de Categoria, si no lo es se lanzará CategoriaEx y así no se creará el objeto
     * @throws CategoriaException arroja esta excepción si la categoría no es una de las establecidas
     */
    public Palabra(int id, int level, String incognita, String categoria) throws CategoriaException {
        this.id = id;
        this.level = level;
        this.incognita = incognita;
        Comprobacion.categoriaOk(categoria);
        this.categoria = categoria;
    }
    public Palabra(int level, String incognita, String categoria) throws CategoriaException {
        this.id = Palabras.getAutonumerico();
        Palabras.setAutonumerico(Palabras.getAutonumerico()+1);
        this.level = level;
        this.incognita = incognita;
        Comprobacion.categoriaOk(categoria);
        this.categoria = categoria;
    }
    public Palabra(String cadena) throws CategoriaException {

        String[] trozos = cadena.split(";");
        //,Integer.parseInt(trozos[1]),trozos[2],trozos[3])
        this.id = Integer.parseInt(trozos[0]);
        Palabras.setAutonumerico(Palabras.getAutonumerico()+1);
        this.level = Integer.parseInt(trozos[1]);
        this.incognita = (trozos[2]);
        Comprobacion.categoriaOk(categoria);
        this.categoria = (trozos[2]);
    }

    public Palabra() {

    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws CategoriaException {
        Comprobacion.categoriaOk(categoria);
        this.categoria = categoria;
    }

    public String getIncognita() {
        return incognita;
    }

    public void setIncognita(String incognita) {
        this.incognita = incognita;
    }

    public void arraychar(String palabra){
        palabra.toCharArray();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toStringFichero() {
        return id + ";" + level + ";" + incognita + ";" + categoria;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
