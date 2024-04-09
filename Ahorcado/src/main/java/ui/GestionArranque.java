package ui;

import common.Constantes;

import service.GestionPalabras;
import service.IGestionPalabras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase con métodos de administración para consola
 */
public class GestionArranque {

    private final IGestionPalabras servicio;


    private static final String pass = "2223";

    public GestionArranque(){
        servicio = new GestionPalabras();
    }

    public static int mostrarPrimerMenu(){
        int num=0;

        System.out.println(Constantes.MENU+"\n"+Constantes.JUGAR+"\n"+Constantes.GESTIONAR);
        try(Scanner lector = new Scanner(System.in)){
             num = lector.nextInt();
            //tratar la excepción para evitar que se pare el programa si no introduce un número
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return num;
    }
        public void opcionesUno(){
            int op = mostrarPrimerMenu();
            switch (op) {
                case 1:
                    opcionesMenuJ();
                    break;
                case 2:
                    opcionesMenuG();
                    break;
                default:
                    break;
            }
        }
    public static int mostrarMenuG(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.OPCION1+"\n"+Constantes.OPCION2+"\n"+Constantes.OPCION3+"\n"+Constantes.OPCION4);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        return num;
    }
    public static int mostarMenuJ(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.NUEVA+"\n"+Constantes.CARGAR);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        return num;
    }

    public void opcionesMenuG(){
        int opcion = mostrarMenuG();
        switch(opcion){
            case 0:
                System.out.println();
            case 1:
                System.out.println(servicio.getListaPalabras());
            case 4:
                System.out.println(servicio.eliminarPalabra(2));
        }
    }
    public void opcionesMenuJ(){
        int opcion = mostrarMenuJ();

    }
    public static String pedirChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un letra o Juegatela");
        return sc.nextLine();
    }
    public void mostrarMenuArranque(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.JUGAR+"\n"+Constantes.GESTIONAR);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        opciones(num);
    }
    public void mostrarMenuJuego(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.OPCION1+"\n"+Constantes.OPCION2+"\n"+Constantes.OPCION3+"\n"+Constantes.OPCION4);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        opciones(num);
    }
    public void mostrarMenuGestion(){
        Scanner lector = new Scanner(System.in);
        System.out.println(Constantes.MENU+"\n"+Constantes.OPCION1+"\n"+Constantes.OPCION2+"\n"+Constantes.OPCION3+"\n"+Constantes.OPCION4);
        int num = lector.nextInt(); //tratar la excepción para evitar que se pare el programa si no introduce un número
        opciones(num);
    }

}
