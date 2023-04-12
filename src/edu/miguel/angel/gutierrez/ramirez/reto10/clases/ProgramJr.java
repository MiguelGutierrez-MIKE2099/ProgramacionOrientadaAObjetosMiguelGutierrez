package edu.miguel.angel.gutierrez.ramirez.reto10.clases;

import java.util.List;
public class ProgramJr extends Empleado implements  Programador{

    public List<String> tecnologias;
    public String proyectoActual;

    /**
     * trabajar: ejecuta el trabajo del programador junior.
     */
    @Override
    public void trabajar() {
        System.out.println("trabajar - ProgramJr.");
    }

    /**
     * trabajar:  genera el código requerido.
     */
    @Override
    public void programar() {
        System.out.println("programar - ProgramJr.");
    }
}
