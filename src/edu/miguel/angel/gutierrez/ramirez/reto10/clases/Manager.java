package edu.miguel.angel.gutierrez.ramirez.reto10.clases;

public class Manager extends Empleado implements  Entrevistador{

    /**
     * trabajar: ejecuta el trabajo del manager.
     */
    @Override
    public void trabajar() {
        System.out.println("trabajar - Manager.");
    }

    /**
     * La clase Entrevistador hace las preguntas de la entrevista.
     */
    @Override
    public void interview() {
        System.out.println("entrevistador - Manager.");
    }
}

