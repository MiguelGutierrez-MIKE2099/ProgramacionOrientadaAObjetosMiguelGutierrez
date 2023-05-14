package edu.miguel.angel.gutierrez.ramirez.retoFinal.ui;

import edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos.Hechicero;
import edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos.Protagonista;

import java.util.Random;

/**
 * La presente clase CLI contiene todos los datos que la clase Game va a procesar.
 * La finalidad de la clase CLI es definir los detalles del menú de usuario y lo ejecuta.
 */
public class CLI {

    /**
     * A continuación se muestran los textos que se mostrarán en la ejecución del juego.
     */
    private static String GAME_OVER = "¡Fin del Juego!\n";
    private static String STATS = "Estado de %s:" +
            "\n* %s: %d." +
            "\n* %s: %d." +
            "\n";
    private static String WINNER_STATS = "¡%s ha ganado!\n";

    /**
     * Acontinuación se muestra la generación del menú de usuario.
     */
    private static Protagonista protagonista = new Protagonista();
    private static Hechicero hechicero = new Hechicero();
    private static Menu menu = new Menu(protagonista, hechicero);

    /**
     * Textos que se mostrarán en la ejecución de la opción seleccionada.
     */
    private static String BUILD_HOUSE_FOR_FAIRY = "Construye una casa para rescatar un hada.";

    /**
     * Acciones que se mostrarán en el menú para que se realicen.
     */

    private static Action buildHouseForFairy = (protagonista, hechicero) -> {
        protagonista.buildHouseForFairy(hechicero);
    };

    /**
     * Añadir las opciones de menú y sus respectivas acciones.
     */
    static {
        menu
                .addOption(BUILD_HOUSE_FOR_FAIRY, buildHouseForFairy)
                .addExitOption();
    }

    /**
     * Mostrar el menú y ejecutar las acciones relacionadas a cada opción.
     */
    public static void play() {
        do {
            menu.showMenu();

            /**
             * Exe Ejecutar la acción del Protagonista.
             */
            menu.requestOption();
            int option = menu.readOption();
            menu.executeOption(option);

            if(menu.isAlive()){
                /**
                 * Ejecutar la acción del Hechicero.
                 */
                switch(new Random().nextInt(2)){
                    case 0:
                        hechicero.captureFairy();
                        break;
                    case 1:
                        hechicero.invokeOgre(protagonista);
                        break;
                }

                /**
                 * Muestra el estado del Protagonista y del Hechicero.
                 */
                System.out.printf(STATS, protagonista.getClass().getSimpleName(),
                        protagonista.getClass().getDeclaredFields()[0].getName(),
                        protagonista.getHP(),
                        protagonista.getClass().getDeclaredFields()[1].getName(),
                        protagonista.getNRescuedFairies());
                System.out.printf(STATS, hechicero.getClass().getSimpleName(),
                        hechicero.getClass().getDeclaredFields()[0].getName(),
                        hechicero.getPP(),
                        hechicero.getClass().getDeclaredFields()[1].getName(),
                        hechicero.getNCapturedFairies());
                System.out.println();
            }
        } while (menu.isAlive() && protagonista.getHP() > 0 && hechicero.getPP() > 0);

        System.out.printf(GAME_OVER);

        if(menu.isAlive()){
            System.out.printf(WINNER_STATS, (protagonista.getHP() > 0 ? protagonista.getClass().getSimpleName() : hechicero.getClass().getSimpleName()));
        }
    }
}
