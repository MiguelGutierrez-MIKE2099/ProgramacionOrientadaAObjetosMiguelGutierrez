package edu.miguel.angel.gutierrez.ramirez.reto10;

import edu.miguel.angel.gutierrez.ramirez.reto10.clases.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
public class Main {

    /**
     * toma objetos de las subclases de Employee para ejecutar los métodos que heredan
     */
    public static void testEmployee(Empleado empleado) {
        empleado.trabajar();
    }

    /**
     * La clase Entrevistador toma objetos de las subclases de Interviewer para ejecutar los métodos que heredan
     * * para probar la existencia de polimorfismo.
     */
    public static void testInterviewer(Entrevistador entrevistador) {
        entrevistador.entrevistar();
    }

    /**
     * toma objetos de las subclases del Programador para ejecutar los métodos que heredan
     * * para probar la existencia de polimorfismo.
     */
    public static void testProgrammer(Programador programador) {
        programador.programar();
    }


    public static void filterByAge(List<programJr> lstJprogramJr) {
        for (programJr itJrprogramJr : lstprogramJr) {
            if (itJrEngineer.edad > 20) {
                System.out.println(itprogramJr.nombre + ":");
                System.out.println("Nombre = " + itprogramJr.nombre);
                System.out.println("Edad = " + itprogramJr.edad);
            }
        }
    }

    /**
     * Hacer un método que lea un archivo de texto con información de empleados, los agregue a un arrayList y retorne dicho arraylist.
     *
     * @param nombreArchivo: represents the name of the text file whose information is going to be read.
     * @return lstJrsOutput: represents a list containing all the jr engineers found in the text file.
     */
    public static List<programJr> readFromFile(String nombreArchivo) {
        List<programJr> lstJrsOutput = new ArrayList<programJr>();
        try (FileReader fileReader = new FileReader(nombreArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String txtLine, name = "";
            short age = 0;
            while ((txtLine = bufferedReader.readLine()) != null) {
                String[] substrings = txtLine.split(" ");

                if (substrings[0].equals("Nombre")) {
                    name = substrings[2];
                }
                if (substrings[0].equals("Edad")) {
                    age = Short.parseShort(substrings[2]);
                }
                if (substrings[0].equals("}")) {
                    programJr jrEngineer3 = new programJr();
                    jrEngineer3.nombre = name;
                    jrEngineer3.edad = age;
                    lstJrsOutput.add(jrEngineer3);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lstJrsOutput;
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


        /**
         * Crear una lista de 10 JrEngineer con nombres y edades variadas
         * (las  edades se pueden llegar a repetir pero los nombres no)
         */
        List<programJr> lstJrsInput = new ArrayList<programJr>();
        for (i = 0; i < 10; ++i) {
            programJr jrEngineer2 = new JrEngineer();
            jrEngineer2.nombre = "Nombre_" + i;
            jrEngineer2.edad = (short) (new Random().nextInt(100 - 18 + 1) + 18);
            lstJrsInput.add(jrEngineer2);
        }

        /**
         * Guardar la lista en un archivo de texto, hay libertad sobre el formato en que se guarde la información: 30 pts
         */
        try (FileWriter fileWriter = new FileWriter(nombreArchivo);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            i = 0;
            for (programJr itJr : lstJrsInput) {
                String strJr = "Jr engineer " + i + "{" +
                        "\nNombre = " + itJr.nombre +
                        "\nEdad = " + itJr.edad +
                        "\n}";
                bufferedWriter.write(strJr);
                bufferedWriter.newLine();
                ++i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Leer el archivo de texto con los alumnos y almacenarlos en un arraylist: 20pts
         */
        List<programJr> lstJrsOutput = new ArrayList<programJr>();
        try (FileReader fileReader = new FileReader(nombreArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String txtLine, name = "";
            short age = 0;
            while ((txtLine = bufferedReader.readLine()) != null) {
                String[] substrings = txtLine.split(" ");

                if (substrings[0].equals("Nombre")) {
                    name = substrings[2];
                }
                if (substrings[0].equals("Edad")) {
                    age = Short.parseShort(substrings[2]);
                }
                if (substrings[0].equals("}")) {
                    programJr jrEngineer3 = new programJr();
                    jrEngineer3.nombre = name;
                    jrEngineer3.edad = age;
                    lstJrsOutput.add(jrEngineer3);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        filterByAge(lstJrsOutput);


        /**
         * determinar cuantos empleados tienen entre 20 y 25 años de edad
         */
        short count = (short) lstJrsOutput.stream()
                .filter(jr -> jr.edad >= 20 && jr.edad <= 25).count();
        System.out.println("El número de empleados que tienen entre 20 y 25 años de edad es: " + count);

        /**
         * con la lista ordenada alfabéticamente, imprimir en pantalla los primeros 10 empleados de la lista.
         */
        System.out.println("Imprimir lista de los primeros 10 jr. engineers ordenados alfabpeticamente:\n");
        lstJrsOutput.stream()
                .sorted(Comparator.comparing(jr -> jr.nombre))
                .limit(10)
                .forEach(jr -> System.out.println(jr.toString()));

        /**
         * encontrar el promedio de edad de todos los empleados.
         */
        double avrgAge = lstJrsOutput.stream()
                .mapToDouble(jr -> jr.edad)
                .average()
                .orElse(Double.NaN);
        System.out.println("La edad promedio de los empleados es: " + avrgAge);

        /**
         * encontrar el último empleado de la lista si esta tiene como primer criterio de ordenamiento la edad y segundo criterio el nombre(alfabéticamente).
         */
        List<programJr> auxLstJrsOutput = lstJrsOutput.stream().sorted(Comparator.comparing(jr -> jr.edad)).toList();
        lstJrsOutput.sort(Comparator.comparing(jr -> jr.nombre));
        System.out.println("EL último empleado es:\n" + auxLstJrsOutput.get(auxLstJrsOutput.size() - 1).toString());

    }

}
