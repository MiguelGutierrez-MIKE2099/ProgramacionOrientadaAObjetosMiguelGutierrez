package edu.miguel.angel.gutierrez.ramirez.reto2.boletos.process;

import java.util.Scanner;

/**
 *Esto funiona como una clase que muestra un menu de opciones para seleccionar el tipo
 *de boletos que el usuario desea comprar para ingresar a la feria.
 **/
public class TicketsMachine {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int boletoAdulto=100;
        int boletoNiño= 70;
        int boletoAM= 70;
        int boletoInapam = 50;
        char opt;
        char tipos;
        do{
            System.out.println("Tipo de boleto:");
            tipos = entrada.next().charAt(0);
            switch(tipos){
                case 'A':
                    System.out.println("El boleto tiene un valor de "+ boletoAdulto);
                    break;
                case 'N':
                    System.out.println("El boleto tiene un valor de "+ boletoNiño);
                    break;
                case 'I':
                    System.out.println("El boleto tiene un valor de "+ boletoInapam);
                    break;
                case 'B':
                    System.out.println("El boleto tiene un valor de "+ boletoAM);
                    break;
            }
            System.out.println("¿Desea adquirir otro boleto? (S/N)");
            opt = entrada.next().charAt(0);
        }while(!(opt !='s'));
        System.out.println("Fin de la compra, vuelva pronto");
    }
}






