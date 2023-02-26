/**
 * @author Miguel Angel Gutierrez Ramirez
 */

package edu.miguel.angel.gutierrez.ramirez.reto4.ui;

import edu.miguel.angel.gutierrez.ramirez.reto4.process.Proceso;

/**
 * CLI contiene todos los datos que serán procesados por la clase Proceso (vaya la redundancia).
 * CLI define las caracteristicas del menú y procede a ejecutarlo.
 */
public class CLI {

    private final static String tiposCafe[] = {"Chocolate", "Vainilla", "Fresa", "Oreo"};
    private final static String trimestres[] = {"Ene-Feb-Mar", "Abr-May-Jun", "Jul-Ago-Sep", "Oct-Nov-Dic"};
    /**
     * Tabla de ventas registradas en el tiempo remarcado .
     */
    private final static int tablaVentas[][] = {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {425, 114, 161, 308}
    };

    /**
     * Definir menu de usuario.
     */

    /**
     * Definir instancias de usuario.
     */
    private static Menu menu = new Menu();

    /**
     *  Menu de opciones.
     * */
    private static String MOST_SALES_PER_FLAVOR_OPTION = "Obtenención del trimestre que más vende por cada sabor de café en existencia";
    private static String MOST_SALES_OPTION = "Obtenención del trimestre que más vende café en lo general, independientemente el sabor del café, saber cuál trimestre tiene mayor nivel de ventas.";

    private static String MOST_SALES_PER_FLAVOR_OUTPUT = "El trimestre con mayor nivel de ventas de cafés de sabor %s es %s.\n";
    private static String MOST_SALES_OUTPUT = "El trimestre con mayor nivel de ventas de cafés fríos fue %s.\n";

    /*
     * Defining menu actions.
     * */
    /**
     * Defines the action that gets the trimester in which the given coffee flavor had the most sales.
     */

    /**
     * En un ultimo momento me dió problemas el siguiente fragmento del codigo,
     * al revisarlo y comparar con mis compañeros, no sé que fué lo que hice que originó errores al momento de añadir las ultimas partes.
     */
   /*
    private static Acciones getMostSalesPerFlavor = () -> {
        for (int i = 0; i < tablaVentas.length; ++i) {
            System.out.printf(MOST_SALES_PER_FLAVOR_OUTPUT, tiposCafe[i], Proceso.getMostSalesPerFlavor(tablaVentas[i], trimestres));
        }
    };


    /**
     * Define la acción que obtiene el trimestre en el que el sabor de café dado tuvo la mayor cantidad de ventas.



    /**
     * En un ultimo momento me dió problemas el siguiente fragmento del codigo,
     * al revisarlo y comparar con mis compañeros, no sé que fué lo que hice que originó errores al momento de añadir las ultimas partes.
     */
            /*
    private static final Acciones getMostSales = () -> {
        System.out.printf(MOST_SALES_OUTPUT, Proceso.getMostSales(tablaVentas, trimestres));
    };

    /*
     * Adding the menu options and actions.

    static {
        menu
                .addOption(MOST_SALES_PER_FLAVOR_OPTION, getMostSalesPerFlavor)
                .addOption(MOST_SALES_OPTION, getMostSales)
                .addExitOption();
    }

    /**
     * Muestreo del menu y ejecucion de sus respectivas opciones definidas.
     */
    /*
    public static void getStatistics() {
        menu.showMenu();
        do {
            menu.requestOption();
            int option = menu.readOption();
            menu.executeOption(option);
        } while (menu.isAlive());
    }
    */

}
