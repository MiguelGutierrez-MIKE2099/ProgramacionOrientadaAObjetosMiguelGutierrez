package edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos;

import java.util.Random;

/**
 * La clase de Protagonista contiene todas las acciones que el usuario puede ejecutar en el rol que le conlleva.
 */
public class Protagonista {

    private int HP;
    private int nRescuedFairies;

    /**
     *  Textos que pueden mostrarse al ejecutar los métodos de la presente clase Protagonista.
     */
    private String BUILD_HOUSE_FOR_FAIRY_TEXT;
    private String DECREASE_MAGICIANS_PP;
    private String INCREASE_PLAYERS_HP;

    /**
     * La clase Protagonista establece los atributos del jugador en sus valores iniciales.
     */
    public Protagonista() {
        setHP(5);
        setNRescuedFairies(0);
        BUILD_HOUSE_FOR_FAIRY_TEXT = "¡El Protagonista ha rescatado un hada!\n";
        DECREASE_MAGICIANS_PP = "El nivel de PP del Hechicero se ha reducido en 1 unidad\n";
        INCREASE_PLAYERS_HP = "El nivel de HP del Protagonista ha incrementado en 1 unidad.\n";
    }

    /**
     * aumentar HP: aumenta el valor de HP del Protagonista.
     * @param extraHP: representa el valor de los puntos de HP en los que se incrementará el HP del Protagonista.
     */
    public void increaseHPBy(int extraHP){
        setHP(getHP() + extraHP);
    }

    /**
     * DisminuirHP: disminuye el valor de HP del Protagonista.
     * @param withdrawHP: representa el valor de los puntos de HP por los que se reducirá el HP del Protagonista.
     */
    public void decreaseHPBy(int withdrawHP){
        setHP(getHP() - withdrawHP);
    }

    /**
     * aumentarNRescuedFairies: aumenta el número de hadas que el Protagonista ha rescatado.
     * @param extraFairies):  representa el número de hadas que aumentará el número de hadas rescatadas del Protagonista.
     */
    public void increaseNRescuedFairiesBy(int extraFairies){
        setNRescuedFairies(getNRescuedFairies() + extraFairies);
    }

    /**
     * buildHouseForFairy: el jugador ejecuta este método para rescatar a un hada y hacer que viva en ella, debilitando el poder del Hechicero.
     *  Consiste en que por cada 10 hadas que rescate el jugador, el poder del mago disminuirá en 1 unidad.
     */
    public void buildHouseForFairy(Hechicero magician){
        System.out.print(BUILD_HOUSE_FOR_FAIRY_TEXT);

        increaseNRescuedFairiesBy( 1);
        if(nRescuedFairies % 10 == 0){
            magician.decreasePPBy(1);
            System.out.print(DECREASE_MAGICIANS_PP);
            this.increaseHPBy(1);
            System.out.print(INCREASE_PLAYERS_HP);
        }
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int HPValue){
        HP = HPValue;
    }

    public int getNRescuedFairies(){
        return nRescuedFairies;
    }

    public void setNRescuedFairies(int nRescuedFairiesValue){
        nRescuedFairies = nRescuedFairiesValue;
    }
}
