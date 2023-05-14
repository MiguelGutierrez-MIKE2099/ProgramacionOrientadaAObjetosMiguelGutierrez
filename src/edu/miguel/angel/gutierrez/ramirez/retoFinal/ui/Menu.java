package edu.miguel.angel.gutierrez.ramirez.retoFinal.ui;

import edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos.Hechicero;
import edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos.Protagonista;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Menu {

    Protagonista protagonista;
    Hechicero hechicero;

    /**
     * Menú que proporciona un conjunto de variables y miembros que describen el menú de usuario.
     */
    private String START_MENU;
    private String REQUEST_OPTION;
    private String NUMERIC_TYPE_ERROR;
    private String OUT_OF_RANGE_ERROR;
    private String ABANDON_GAME;

    /**
     * optionList almacena las cadenas que corresponden a las opciones mostradas al usuario + una opción de salida.
     * actionList almacena las funciones asociadas a cada opción que se muestra al usuario excepto la opción de salida.
     */
    private ArrayList<String> optionList;
    private ArrayList<Action> actionList;

    /**
     * alive sirve para lograr establecer el estado de disponibilidad del menú para el usuario y ayuda
     * a determinar si el menú debe seguir mostrándose o no.
     */
    private boolean alive;

    /**
     * Menú: establece los atributos del menú a sus valores iniciales.
     */
    public Menu(Protagonista protagonista, Hechicero hechicero){
        this.protagonista = protagonista;
        this.hechicero = hechicero;

        START_MENU = "Menú del Protagonista";
        REQUEST_OPTION = "¿Qué desea hacer tu Personaje? Ingresa el número correspondiente a la opción deseada: ";
        NUMERIC_TYPE_ERROR = "Debes ingresar una opción numérica. Intenta nuevamente: ";
        OUT_OF_RANGE_ERROR = "La opción que seleccionaste no está disponible. Intenta nuevamente: ";
        ABANDON_GAME = "Juego terminado...";

        optionList = new ArrayList<>();
        actionList = new ArrayList<>();

        alive = true;
    }

    /**
     * isAlive determina el estado de disponibilidad del menú para el usuario.
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * addOption es un menú de usuario con las opciones que debe proporcionarles y las acciones relacionadas.
     * @param option: es un texto que contiene una de las opciones presentes en el menú.
     * @param action: es el método que se debe ejecutar al seleccionar la opción relacionada.
     * @return this:  es el menú actual con sus modificaciones correspondientes.
     */
    public Menu addOption(String option, Action action) {
        optionList.add(option);
        actionList.add(action);
        return this;
    }

    /**
     * createMenu: Su funcion es agregar un método de salida al final del menú.
     */
    public void addExitOption() {
        optionList.add("Salir del juego.");
    }

    /**
     * cleanMenu: Su función es eliminar todas las opciones y acciones asociadas a ellos del menú.
     */
    public void clearMenu() {
        optionList.clear();
        actionList.clear();
    }

    /**
     * killMenu: Su función es establecer que el menú del Jugador debe dejar de mostrarse al Jugador.
     */
    public void killMenu() {
        alive = false;
    }

    /**
     * showMenu: Su función es mostrar las opciones dentro del menú.
     */
    public void showMenu() {
        System.out.println(START_MENU);
        for (int i = 0; i < optionList.size(); i++) {
            System.out.println(i + 1 + ") " + optionList.get(i));
        }
    }

    public void requestOption(){
        System.out.print(REQUEST_OPTION);
    }

    /**
     * readOption: Su función es leer la entrada del usuario y valida que se ingresó en un formato valido.
     * Opción @return: Es un número que representa el índice de una opción específica.
     */
    public int readOption() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                int option = input.nextInt();
                input.nextLine();
                if (option <= 0 || option > optionList.size()) {
                    System.out.print(OUT_OF_RANGE_ERROR);
                    continue;
                }
                return option;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print(NUMERIC_TYPE_ERROR);
            }
        }
    }

    /**
     * selectAndRunOption: Su función es ejecutar la función relacionda con la opción ingresada por el usuario.
     * opción @param: Es el número que representa el índice de la opción seleccionada por el usuario.
     */
    public void executeOption(int option) {
        if (option == optionList.size()) {
            killMenu();
            System.out.println(ABANDON_GAME);
            return;
        }
        actionList.get(option - 1).definedAction(protagonista, hechicero);
    }

}

