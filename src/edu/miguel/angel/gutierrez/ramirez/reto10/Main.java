package edu.miguel.angel.gutierrez.ramirez.reto10;

import edu.miguel.angel.gutierrez.ramirez.reto10.clases.*;

public class Main {

    /**
     *  toma objetos de las subclases de Employee para ejecutar los métodos que heredan
     */
    public static void testEmployee(Empleado empleado){
        empleado.trabajar();
    }
    /**
     * La clase Entrevistador toma objetos de las subclases de Interviewer para ejecutar los métodos que heredan
     *      * para probar la existencia de polimorfismo.
     */
    public static void testInterviewer(Entrevistador entrevistador){
        entrevistador.entrevistar();
    }

    /**
     * toma objetos de las subclases del Programador para ejecutar los métodos que heredan
     *      * para probar la existencia de polimorfismo.
     */
    public static void testProgrammer(Programador programador){
        programador.programar();
    }

    public static void main(String[] args) {
        CEO ceo = new CEO();
        RecursosHumanos hr = new RecursosHumanos();
        ProgramJr programJr = new ProgramJr();
        Manager manager = new Manager();
        ProgramSr programSr = new ProgramSr();

        Programador programmer = new ProgramJr();
        Empleado empleado = new Manager();
        Entrevistador entrevistador = new RH();

        testEmployee(ProgramJr);
        testEmployee(manager);
        testInterviewer(RH);
        testInterviewer(manager);
        testProgrammer(programJr);
        testProgrammer(programSr);

    }
}
