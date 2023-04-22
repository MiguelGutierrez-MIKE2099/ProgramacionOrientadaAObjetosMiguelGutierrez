package edu.miguel.angel.gutierrez.ramirez.reto10.clases;

public class Empleado {

    /**
     * La clase Empleado incluye los atributos necesarios para representar a un empleado.
     * Como es una clase abstracta, algunos de sus métodos serán anulados por sus subclases.
     */

    private String nomina;
    private String fechaContratacion;
    private double salario;
    public String nombre;
    public String email;

    /**
     * trabajar: este método será anulado por las subclases de Empleado.
     */
    public abstract void trabajar();
}
