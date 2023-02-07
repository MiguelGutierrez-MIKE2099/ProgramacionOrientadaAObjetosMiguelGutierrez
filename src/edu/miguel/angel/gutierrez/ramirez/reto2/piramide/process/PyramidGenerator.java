package edu.miguel.angel.gutierrez.ramirez.reto2.piramide.process;

import java.util.Scanner;


/**
*Esto funiona como una clase que genera triangulos con asteriscos, trabaja utilizando el cliclo for.
 **/
public class PyramidGenerator {
    public static void main (String[] args){


                Scanner sc = new Scanner(System.in);
                System.out.print("Programa generador de piramides\n");
                 System.out.println("Bienvenido");
                System.out.print("Determina el numero de filas: ");
                int lines = sc.nextInt();
                sc.close();

                System.out.println();
                for(int height = 1; height<=lines; height++){

                    for(int blancos = 1; blancos<=lines-height; blancos++){ //Corresponde a los espacios en blanco.
                        System.out.print(" ");
                    }


                    for(int asteriscos=1; asteriscos<=(height*2)-1; asteriscos++){ //Corresponde a los asteriscos.
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }




