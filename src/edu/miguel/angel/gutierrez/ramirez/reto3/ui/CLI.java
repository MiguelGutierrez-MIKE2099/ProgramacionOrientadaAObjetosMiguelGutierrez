package edu.miguel.angel.gutierrez.ramirez.reto3.ui;

import edu.miguel.angel.gutierrez.ramirez.reto3.process.conversionProceso;
import java.util.Scanner;

/**
 * @author Miguel Gutiérrez Ramírez
 * @class CLI interfaz de usuario por línea de comandos
 */
public class CLI {

    public static void showUserInterface(){
        Scanner input = new Scanner(System.in);
        char option;
        String numToCnvrt;

        /**
         * El siguiente menú le presenta al usuario las opciones disponibles de conversiones unitarias
         */
        System.out.println("** Programa de conversión de unidades **");
        System.out.println("¿Qué tipo de procedimiento hacer?" +
                "\na) Convertir un número en decimal a binario." +
                "\nb) Convertir un número en decimal a octal." +
                "\nc) Convertir un número en decimal a hexadecimal." +
                "\nd) Convertir un número en binario a decimal." +
                "\ne) Convertir un número en octal a decimal." +
                "\nf) Convertir un número en hexadecimal a ocatl.");

        do{
            System.out.println("Ingrese el tipo de conversión a realizar: ");
            option = input.nextLine().charAt(0);
            System.out.println("Ingrese el número a convertir:");
            numToCnvrt = input.nextLine();

            /**
             * codigo correspondiente al menú empleado por el usuario.
             */
            switch(option){
                case 'a':
                    System.out.println(conversionProceso.covertirDecimalABinario(numToCnvrt, (byte)2));
                    break;
                case 'b':
                    System.out.println(conversionProceso.covertirDecimalABinario(numToCnvrt, (byte)8));
                    break;
                case 'c':
                    System.out.println(conversionProceso.covertirDecimalABinario(numToCnvrt, (byte)16));
                    break;
                case 'd':
                    System.out.println(conversionProceso.convertirBinarioaHexadecimal
                            (numToCnvrt, (byte)2));
                    break;
                case 'e':
                    System.out.println(conversionProceso.convertirBinarioaHexadecimal(numToCnvrt, (byte)8));
                    break;
                case 'f':
                    System.out.println(conversionProceso.convertirBinarioaHexadecimal(numToCnvrt, (byte)16));
                    break;
            }

            /**
             * Repeticion del procedimiento a voluntad del usuario.
             *
             */
            System.out.println("¿Desea realizar otro procedimiento? " +
                    "\ns) Sí." +
                    "\nn) No.");
            option = input.nextLine().charAt(0);

        }while(option == 's');
    }
}
