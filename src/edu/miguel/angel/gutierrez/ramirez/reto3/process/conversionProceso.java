package edu.miguel.angel.gutierrez.ramirez.reto3.process;


/**
 * @author Miguel Gutiérrez Ramírez
 * conversionProceso clase con métodos de conversión de números en diferentes bases numéricas
 */
public class conversionProceso {
    /**
     * covertirDecimalABinarior recibe un número en base decimal para convertirlo a su representación en base binaria
     * @param decBaseNum número en base decimal a ser convertido en base binaria
     * @return binario representación en base binaria del número decimal recibido
     */
    public static String covertirDecimalABinario(String decBaseNum, short systemBase){
        return Integer.toString(Integer.parseInt(decBaseNum), systemBase);
    }

    /**
     * convertirBinarioaHexadecimal analiza un número binario/octal/hexadecimal para su representación en el sistema decimal
     */
    public static String convertirBinarioaHexadecimal
    (String binOctHexBaseNum, byte systemBase){
        return Integer.toString(Integer.parseInt(binOctHexBaseNum, systemBase));
    }

}


