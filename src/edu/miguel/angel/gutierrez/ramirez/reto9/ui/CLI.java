package edu.miguel.angel.gutierrez.ramirez.reto9.ui;

import edu.miguel.angel.gutierrez.ramirez.reto9.process.GeneradorAyudantes;
import java.util.Random;
import java.util.Scanner;

public class CLI {

    /*
     * Data used by process
     */

    /**
     * Creating the user menu.
     */
    /*
     * Defining an instance of the user menu.
     */
    private static Menu menu = new Menu();

    /*
     * Other texts that are going to be shown within the execution of a selected option.
     */
    private static String USER_ONLY_NOTIFICATION_OPTION = "Generar ayudantes.";
    private static String USER_ONLY_OUTPUT = "Los ayudantes generados son:\n";

    /*
     * Defining menu actions.
     */
    /**
     * Defines the action that generates the helpers.
     */

    private static void showHelperData(GeneradorAyudantes GeneradorAyudantes){
        Object[] helperData = GeneradorAyudantes.getHelperData();
        System.out.println("Los datos del ayudante son:\n"
                + "Número de ojos: " + helperData[0] + "\n"
                + "Color de piel: " + helperData[1] + "\n"
                + "Altura: " + helperData[2] + "\n"
                + "Nivel de creación de objetos: " + helperData[3] + "\n"
                + "Nivel para arreglar cosas: " + helperData[4] + "\n"
                + "Nivel destructivo: " + helperData[5] + "\n");
    }
    private static MenuAccion GeneradorAyudantes = () -> {
        GeneradorAyudantes helpers[] = new GeneradorAyudantes[5];
        Random random = new Random();
        byte i;

        for(i = 0; i < 5; ++i){
            helpers[i] = new GeneradorAyudantes(
                    (byte)(random.nextInt(2 - 1 + 1) + 1),
                    (byte)(random.nextInt(2 - 1 + 1) + 1) == 0 ? "Amarilla" : "Morada",
                    (byte)(random.nextInt(2 - 1 + 1) + 1) == 0 ? "Mediano" : "Alto",
                    (byte)(random.nextInt(5 - 1 + 1) + 1),
                    (byte)(random.nextInt(5 - 1 + 1) + 1),
                    (byte)(random.nextInt(5 - 1 + 1) + 1)
            );
        }

        System.out.printf("%s", USER_ONLY_OUTPUT);
        for(i = 0; i < GeneradorAyudantes.length; ++i){
            showHelperData(helpers[i]);
        }
    };

    /*
     * Adding the menu options and actions.
     */
    static {
        menu
                .addOption(USER_ONLY_NOTIFICATION_OPTION, GeneradorAyudantes)
                .addExitOption();
    }

    /**
     * Showing the menu and executing the actions associated to each option.
     */
    public static void showGeneratedHelpers() {
        menu.showMenu();
        do {
            menu.requestOption();
            int option = menu.readOption();
            menu.executeOption(option);
        } while (menu.isAlive());
    }
}



