package edu.miguel.angel.gutierrez.ramirez.reto4.process;

public class Proceso {

    /**
     * getMostSalesPerFlavor obtiene el trimestre en el que el sabor de café dado tuvo la mayor cantidad de ventas.
     * @param tablaVentas: contiene los valores de las ventas de cada trimestre.
     * @param trimestres: contiene el nombre del trimestre (basicamente)
     * @return: nos devuelve el nombre del trimestre con mayor cantidad de ventas de cafe, (funciona como una consulta de obtencion de datos).
     */
    public static String getMostSalesPerFlavor(int[] tablaVentas, String[] trimestres){
        int maxSaleFlavor = tablaVentas[0], maxSaleIndex = 0;

        for(int i = 1; i < tablaVentas.length; ++i) {
            if(tablaVentas[i] > maxSaleFlavor){
                maxSaleFlavor = tablaVentas[i];
                maxSaleIndex = i;
            }
        }

        return trimestres[maxSaleIndex];
    }

    /**
     * getMostSales obtiene el trimestre que tuvo la mayor cantidad de ventas totales.
     * @param tablaVentas: muestreo de una tabla con las ventas de cafe en cada trimestre.
     * @param trimestres: muestreo del nombre de cada trimestre.
     * @return: devolucion del trimestre con mayor nivel de ventasx de cafe.
     */
    public static String getMostSales(int[][] tablaVentas, String[] trimestres) {
        int maxSale = tablaVentas[0][0];
        int auxSum;
        int maxSaleIndex = 0;

        for(int i = 0; i < tablaVentas[0].length; ++i){
            auxSum = 0;
            for(int j = 0; j < tablaVentas.length; ++j){
                auxSum += tablaVentas[j][i];
            }
            if(auxSum > maxSale){
                maxSale = auxSum;
                maxSaleIndex = i;
            }
        }

        return trimestres[maxSaleIndex];
    }
}
