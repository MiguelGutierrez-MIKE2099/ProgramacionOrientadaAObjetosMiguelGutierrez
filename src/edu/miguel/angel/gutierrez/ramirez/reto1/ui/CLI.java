package edu.miguel.angel.gutierrez.ramirez.reto1.ui;


import edu.miguel.angel.gutierrez.ramirez.reto1.process.Calculator;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(){
        System.out.println("Elige una opcion:");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        System.out.println("5 Modulo");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el primer operando: ");
        int operando1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo operando: ");
        int operando2 = scanner.nextInt();
        scanner.nextLine();
        int resultado = -1;

        switch (option){
            case 1:
                resultado = Calculator.sumarNumeros(operando1, operando2);
                break;
            case 2:
                resultado = Calculator.restarNumeros(operando1, operando2);
                break;
            case 3:
                resultado = Calculator.multiplicarNumeros(operando1, operando2);
                break;
            case 4:
                resultado = Calculator.dividrNumeros(operando1, operando2);
                break;
            case 5:
                resultado = Calculator.obtenerResiduoNumeros(operando1, operando2);
                break;
        }

        System.out.printf("El resultado de la operación es %d + %d = %d", operando1 + operando2 + resultado);
    }
}
