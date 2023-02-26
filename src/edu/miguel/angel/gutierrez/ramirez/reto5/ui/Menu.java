package edu.miguel.angel.gutierrez.ramirez.reto5.ui;

import edu.miguel.angel.gutierrez.ramirez.reto5.process.DificultProcess;
import java.util.Scanner;


/**
 * Aqui se definen las variables que trabajan dentro del menu establecido
 */
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al juego!\n");
        System.out.println("Seleccione la dificultad de su partida:");
        do {
            System.out.println("Elija una opción:\n");
            System.out.println("1. Facil");
            System.out.println("2. Intermedio");
            System.out.println("3. Dificil");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                /**
                 * Entrando a la opcion del modo facil, donde se manda llamar al metodo correspondiente a dicha dificultad.
                 */
                case 1:
                    System.out.println("Iniciando en modo Facil...");
                    DificultProcess llamarFacil = new DificultProcess();
                    llamarFacil.jugarNivelFacil();
                    break;

                /**
                 * Entrando a la opcion del modo intermedio, donde se manda llamar al metodo correspondiente a dicha dificultad.
                 */
                case 2:
                    System.out.println("Iniciando en modo Intermedio...");
                    DificultProcess llamarIntermedio = new DificultProcess();
                    llamarIntermedio.jugarNivelIntermedio();
                    break;

                /**
                 * Entrando a la opcion del modo dificil, donde se manda llamar al metodo correspondiente a dicha dificultad.
                 */
                case 3:
                    System.out.println("Iniciando en modo Dificil...");
                    DificultProcess llamarDificil = new DificultProcess();
                    llamarDificil.jugarNivelDificil();
                    break;

                /**
                 * Salir del juego.
                 */
                case 0:
                    System.out.println("Hasta la proxima! ;) ");

                    break;

                /**
                 * Mostrando mensaje de error al seleccionar opcion (al parecer el usuario fué demasiado tonto).
                 */
                default:
                    System.out.println("Opción invalida, por favor no seas tonto y escoge una opcion valida tqm <3");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
