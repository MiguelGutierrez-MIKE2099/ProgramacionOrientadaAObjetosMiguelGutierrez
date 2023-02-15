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
        String strOut = "";
        int num = Integer.parseInt(decBaseNum);
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(num > 0){
            strOut = digits[num % systemBase] + strOut;
            num /= systemBase;
        }
        return strOut;
    }

    /**
     * cnvrtBinOctHexToDec parses a binary/octal/hexadecimal number to its representation in the decimal system
     * @param convertirBinarioaHexadecimal: bynary/octal/hexadecimal number to parse
     * @return the bynary/octal/hexadecimal's representation in the decimal system
     */
    public static String convertirBinarioaHexadecimal(String convertirBinarioaHexadecimal, byte systemBase){
        String strOut = "";
        int num = 0;

        for(short i = 0; i < convertirBinarioaHexadecimal.length(); ++i){
            System.out.println("binOctHexBaseNum.charAt(i) = " + convertirBinarioaHexadecimal.charAt(i));
            num += (int)Math.pow(systemBase, i) * Character.getNumericValue(convertirBinarioaHexadecimal.charAt(convertirBinarioaHexadecimal.length() - i - 1));
        }

        return Integer.toString(num);
    }

}



