package edu.miguel.angel.gutierrez.ramirez.reto12.clases;

public class RecursosHumanos extends Empleado implements Entrevistador{

    /**
     * trabajar: ejecuta el trabajo del entrevistador.
     */
    @Override
    public void trabajar() {
        System.out.println("trabajar - HR.");
    }

    /**
     * entrevista: hace las preguntas de la entrevista.
     */
    @Override
    public void interview() {
        System.out.println("interview - HR.");
    }
}
