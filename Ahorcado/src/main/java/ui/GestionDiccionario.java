package ui;

import common.Constantes;

import domain.Juego;
import service.GestionPalabras;
import service.IGestionPalabras;

import java.util.Scanner;

/**
 * Clase con métodos de administración para consola
 */
public class GestionDiccionario {
    private IGestionPalabras servicio;
    private Juego juego;
    private static final String pass = "2223";

    public GestionDiccionario(IGestionPalabras servicio) {
        this.servicio = servicio;
    }

    public GestionDiccionario() {
        servicio = new GestionPalabras();
    }

    public static void mostrarMenu(){
        Scanner lector = new Scanner(System.in);
        boolean salir1=false;
        do {

            System.out.println("1." + Constantes.JUGAR + "2." + Constantes.GESTIONAR);
            int op = lector.nextInt();
            switch (op){
                case 1:
                    mostarMenuJugar();
                break;
                case 2:

                    System.out.println(Constantes.MENU+"\n"+Constantes.OPCION1+"\n"+Constantes.OPCION2+"\n"+Constantes.OPCION3+"\n"+Constantes.OPCION4);
                    int num = lector.nextInt();
            }
        }while(salir1==false);
         //tratar la excepción para evitar que se pare el programa si no introduce un número

    }
    public static void mostarMenuJugar(){
        boolean salir= false;
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println(Constantes.NUEVA + Constantes.CARGAR);
            int op = lector.nextInt();
            switch (op){
                case 1:



            }
        }while(!salir);
    }
}
