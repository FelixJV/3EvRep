package ui;


import common.Categoria;
import common.CategoriaException;
import common.Comprobacion;
import domain.Juego;
import net.datafaker.Faker;

public class Main {
    public static void main(String[] args)  {
        //En el main sólo hay que llamar a los métodos de la UI que darán paso al luego o administrar diccionario.


        //Este código no va aquí, pero es para que veáis cómo funciona ciertos aspectos de la aplicación a tener en cuenta
      /*  GestionDiccionario.mostrarMenu();
        try {
            Comprobacion.categoriaOk(Categoria.comedia.name());
            Comprobacion.categoriaOk("hola");
        }catch (CategoriaException e){
            System.out.println(e.getMessage());
        }
*/
Juego juego = new Juego();
        Faker faker = new Faker();
        String nombre = faker.gameOfThrones().character();
        System.out.println("Un personaje de GoT");
        juego.pintarPalabraSin(nombre);
        int intento=0;
        do {

        }while(intento<5);


        //El siguiente código no va aquí pero es para que sepáis cómo funciona el id autonumérico
        /*Palabras asdf = new Palabras();
        System.out.println(Palabras.getAutonumerico());
        Palabra asd = new Palabra(2,"324",Categoria.accion.name());
        System.out.println(Palabras.getAutonumerico());
        Palabra asd2 = new Palabra(2,"324",Categoria.miedo.name());
        System.out.println(Palabras.getAutonumerico());*/

    }
}