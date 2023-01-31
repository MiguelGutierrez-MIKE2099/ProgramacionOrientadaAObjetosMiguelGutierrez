package edu.miguel.angel.gutierrez.ramirez.reto2.demo;

/**
*Esto funiona como una clase de demostracion (por ahora)
 **/
public class Demo {
    public static void main (String[] args){

    }

    public static void demoFor(){                     //los metodos se nombran por verbos.
        for (int i = 0; i<10; i++){                   // "i" es por el termino "index" o "indice".
            System.out.println("*");
        }

        for (int i = 0; i < 10; i++);{
            for (int j = 0; j<10; j++){               //Imprime solo la mitad de asteriscos.
                System.out.println("*");
            }
            System.out.println();
        }
    }

     public static void demoForArreglos(){
        String [] arreglo = {"pato", "palabra", "ochenta", "chapala", "tonala"};

        for  (String palabra: arreglo){
            System.out.println(palabra);
        }
     }
}
