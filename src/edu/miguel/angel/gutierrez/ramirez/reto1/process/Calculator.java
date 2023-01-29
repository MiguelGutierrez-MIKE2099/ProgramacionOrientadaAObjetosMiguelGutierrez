package edu.miguel.angel.gutierrez.ramirez.reto1.process;

public class Calculator {

    /**
    *suma enteros
    *@param operando1 primer operando para sumar
    *@param operando2 segundo operando para sumar
    **/
    public static int sumarNumeros(int operando1, int operando2){
        return operando1 + operando2;
    }

    public static int restarNumeros(int operando1, int operando2){
        return operando1 - operando2;
    }

    public static int multiplicarNumeros(int operando1, int operando2){
        return operando1 * operando2;
    }

    public static int dividrNumeros(int operando1, int operando2){
        return operando1 / operando2;
    }

    public static int obtenerResiduoNumeros(int operando1, int operando2){
        return operando1 % operando2;
    }

}
