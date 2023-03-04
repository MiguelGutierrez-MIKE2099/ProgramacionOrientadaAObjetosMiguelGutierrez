package edu.miguel.angel.gutierrez.ramirez.reto5.process;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class DificultProcess {



    /**
     *String para las palabras del nivel facil:
     */
    private static final String[] palabrasFaciles = {"gato", "buho", "casa", "hola", "pato", "mesa", "sopa", "caja", "mago", "flor"};

    /**
     * String para las palabras del nivel intermedio:
     */
    private static final String[] palabrasIntermedias = {"amuletos", "adoptado", "arbustos", "elefante", "alemanes", "alcanzar", "mariposa", "guitarra", "autonoma", "paraguas"};

    /**
     * String para las palabras del nivel dificil:
     */
    private static final String[] palabrasDificiles = {"adolescentes", "amarillistas", "espectaculos", "antagonistas", "arqueológico", "cavernícolas", "certificador", "ecuatorianos", "eliminadores", "espirituales"};


    /**
     * Metodo para ejecutar el juego en modo facil:
     * Funciona implementando las palabras del arreglo del nivel facil, las cuales conllevan no mas de 4 letras.
     * En el caso de esta modaliddd cuenta con un numero de 7 intentos.
     */
    public static void jugarNivelFacil() {
        Random rand = new Random();
        String palabra = palabrasFaciles[rand.nextInt(palabrasFaciles.length)];
        char[] letrasAdivinadas = new char[palabra.length()];
        Arrays.fill(letrasAdivinadas, '_');
        int intentos = 7;

        Scanner sc = new Scanner(System.in);


        /**
         *  implementar el manejo de excepciones para la adivinanza
         *  de palabras y la selección del nivel de juego en modo facil.
         */

        String palabraSecreta = "secreto";
        boolean adivinado = false;
        Scanner scanner = new Scanner(System.in);

        while (!adivinado) {
            try {
                System.out.print("Adivina la palabra (o ingresa 0 para salir): ");
                String entrada = scanner.nextLine();

                if (entrada.equals("0")) {
                    break; // el usuario quiere salir del programa
                }

                if (!entrada.matches("[a-zA-Z]+")) {
                    throw new Exception("Por favor, ingresa solo letras");
                }

                if (entrada.equalsIgnoreCase(palabraSecreta)) {
                    System.out.println("¡Adivinaste la palabra!");
                    adivinado = true;
                } else {
                    System.out.println("No, esa no es la palabra.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }




        while (intentos > 0 && Arrays.binarySearch(letrasAdivinadas, '_') >= 0) {
            System.out.println("Palabra: " + String.valueOf(letrasAdivinadas));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().charAt(0);

            
            if (palabra.indexOf(letra) >= 0) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                    }
                }
            } else {
                intentos--;
            }


        }

        if (Arrays.binarySearch(letrasAdivinadas, '_') < 0) {
            System.out.println("¡Acertaste! La palabra era " + palabra);
        } else {
            System.out.println("¡Fallaste! La palabra era " + palabra);
        }
    }


    /**
     * Metodo para ejecutar el juego en modo intermeddio:
     * Funciona implementando las palabras del arreglo del nivel intermedio, las cuales conllevan no mas de 8 letras.
     * En el caso de esta modaliddd cuenta con un numero de 5 intentos.
     */

    public static void jugarNivelIntermedio() {
        Random rand = new Random();
        String palabra = palabrasIntermedias[rand.nextInt(palabrasIntermedias.length)];
        char[] letrasAdivinadas = new char[palabra.length()];
        Arrays.fill(letrasAdivinadas, '_');
        int intentos = 5;

        Scanner sc = new Scanner(System.in);


        /**
         *  implementar el manejo de excepciones para la adivinanza
         *  de palabras y la selección del nivel de juego en modo intermedio.
         */
        String palabraSecreta = "secreto";
        boolean adivinado = false;
        Scanner scanner = new Scanner(System.in);

        while (!adivinado) {
            try {
                System.out.print("Adivina la palabra (o ingresa 0 para salir): ");
                String entrada = scanner.nextLine();

                if (entrada.equals("0")) {
                    break; // el usuario quiere salir del programa
                }

                if (!entrada.matches("[a-zA-Z]+")) {
                    throw new Exception("Por favor, ingresa solo letras");
                }

                if (entrada.equalsIgnoreCase(palabraSecreta)) {
                    System.out.println("¡Adivinaste la palabra!");
                    adivinado = true;
                } else {
                    System.out.println("No, esa no es la palabra.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (intentos > 0 && Arrays.binarySearch(letrasAdivinadas, '_') >= 0) {
            System.out.println("Palabra: " + String.valueOf(letrasAdivinadas));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().charAt(0);

            if (palabra.indexOf(letra) >= 0) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                    }
                }
            } else {
                intentos--;
            }
        }

        if (Arrays.binarySearch(letrasAdivinadas, '_') < 0) {
            System.out.println("¡Acertaste! La palabra era " + palabra);
        } else {
            System.out.println("¡Fallaste! La palabra era " + palabra);
        }
    }

    /**
     * Metodo para ejecutar el juego en modo dificil:
     * Funciona implementando las palabras del arreglo del nivel dificil, las cuales conllevan no mas de 12 letras.
     * En el caso de esta modaliddd cuenta con un numero de 3 intentos.
     */

    public static void jugarNivelDificil() {
        Random rand = new Random();
        String palabra = palabrasDificiles[rand.nextInt(palabrasDificiles.length)];
        char[] letrasAdivinadas = new char[palabra.length()];
        Arrays.fill(letrasAdivinadas, '_');
        int intentos = 3;

        Scanner sc = new Scanner(System.in);

        /**
         *  implementar el manejo de excepciones para la adivinanza
         *  de palabras y la selección del nivel de juego en modo dificil.
         */

        String palabraSecreta = "secreto";
        boolean adivinado = false;
        Scanner scanner = new Scanner(System.in);

        while (!adivinado) {
            try {
                System.out.print("Adivina la palabra (o ingresa 0 para salir): ");
                String entrada = scanner.nextLine();

                if (entrada.equals("0")) {
                    break; // el usuario quiere salir del programa
                }

                if (!entrada.matches("[a-zA-Z]+")) {
                    throw new Exception("Por favor, ingresa solo letras");
                }

                if (entrada.equalsIgnoreCase(palabraSecreta)) {
                    System.out.println("¡Adivinaste la palabra!");
                    adivinado = true;
                } else {
                    System.out.println("No, esa no es la palabra.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }



        while (intentos > 0 && Arrays.binarySearch(letrasAdivinadas, '_') >= 0) {
            System.out.println("Palabra: " + String.valueOf(letrasAdivinadas));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().charAt(0);

            if (palabra.indexOf(letra) >= 0) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                    }
                }
            } else {
                intentos--;
            }
        }

        if (Arrays.binarySearch(letrasAdivinadas, '_') < 0) {
            System.out.println("¡Acertaste! La palabra era " + palabra);
        } else {
            System.out.println("¡Fallaste! La palabra era " + palabra);
        }
    }
}