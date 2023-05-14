package edu.miguel.angel.gutierrez.ramirez.reto4.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Aqui se definen las variables que trabajan dentro del menu establecido
 */
public class Menu {

    Scanner input = new Scanner(System.in);
    /**
     * Mensajes de salida de interaccion dentro del menu.
     */
    private String MENU_WELCOME = "Menú";
    private String REQUEST_OPTION = "Ingrese el número correspondiente a la opción de su elección: ";
    private String NUMERIC_TYPE_ERROR = "Lo sentimos, la opcion ingresada NO existe. Por favor ingresa una opcion valida: ";
    private String OUT_OF_RANGE_ERROR = "La opcion ingresada no se encuentra disponible. Por favor ingresa una opcion valida: ";
    private String END_OF_PROGRAM = "Fin de la interaccion, adios.";

    /**
     * optionList corresponde a las opciones mostradas al usuario.
     * menuActionPrototypeList corresponde a las funciones de cada opción mostradas ante el usuario menos la opción "salir".
     */
    private ArrayList<String> optionList = new ArrayList<>();
    private ArrayList<Acciones> menuActionPrototypeList = new ArrayList<>();

    /**
     * alive define si el menú debe seguir mostrándose.
     */
    private boolean alive = true;

    /**
     * killMenu define si el menú debe ocultarse.
     */
    public void killMenu() {
        alive = false;
    }

    /**
     * isAlive definir si el menu está disponible ante el usuario.
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * addOption opcines disponibles en el menu asi como su funcionalidad.
     * @param option: mensaje de salida que expone las opciones disponibles.
     * @param Acciones: el método que se debe ejecutar al seleccionar la opción asociada a él.
     * @return this: mostar menu con sus respectivas opciones.
     */
    public Menu addOption(String option, Acciones Acciones) {
        optionList.add(option);
        menuActionPrototypeList.add(Acciones);
        return this;
    }

    /**
     * createMenu agrega un método de salida al final del menú.
     */
    public void addExitOption() {
        optionList.add("Salir");
    }

    /**
     * cleanMenu eliminar opciones y acciones dentro del menu.
     */
    public void clearMenu() {
        optionList.clear();
        menuActionPrototypeList.clear();
    }

    /**
     * showMenu muestra las opciones dentro del menú
     */
    public void showMenu() {
        System.out.println(MENU_WELCOME);
        for (int i = 0; i < optionList.size(); i++) {
            System.out.println(i + 1 + ") " + optionList.get(i));
        }
    }

    public void requestOption(){
        System.out.print(REQUEST_OPTION);
    }

    /**
     * readOption leer opcion ingresada y validarla.
     * @return option:ejecutar opcion seleccionada.
     */
    public int readOption() {
        while (true) {
            try {
                int option = input.nextInt();
                input.nextLine();
                if (option < 1 || option > optionList.size()) {
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
     * selectAndRunOption ejecutar proceso de opcion seleccionada por el usuario.
     * @param option: representa la opcion seleccionada por el usuario
     */
    public void executeOption(int option) {
        if (option == optionList.size()) {
            killMenu();
            System.out.println(END_OF_PROGRAM);
            return;
        }
        menuActionPrototypeList.get(option - 1).definedAction();
    }
}
