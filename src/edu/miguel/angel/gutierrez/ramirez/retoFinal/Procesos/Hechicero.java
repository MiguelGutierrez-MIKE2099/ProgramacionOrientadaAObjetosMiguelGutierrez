package edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos;

public class Hechicero {

    private int PP;
    private int nCapturedFairies;

    /**
     * Esta clase contiene todas las acciones que el Mago puede realizar dentro del juego.
     */
    private String CAPTURE_FAIRY_TEXT;
    private String INCREASE_MAGICIANS_PP;
    private String DECREASE_PLAYERS_HP;
    private String INVOKE_OGRE_TEXT;

    /**
     * Proposito: establece los atributos del Hechicero en sus valores iniciales.
     */
    public Hechicero() {
        setPP(5);
        setNCapturedFairies(0);
        CAPTURE_FAIRY_TEXT = "¡El Hechicero raptado un hada!\n";
        INCREASE_MAGICIANS_PP = "El nivel de PP del Hechicero ha incrementado en 1 unidad.\n";
        DECREASE_PLAYERS_HP = "El nivel de HP de tu Protagonista ha dismunuído en 1 unidad\n";
        INVOKE_OGRE_TEXT = "¡El Shrek que protege al Hechicero ha papeado al Protagonista!\n";
    }

    /**
     * aumentar PP: aumenta el valor de HP del Hechicero.
     * @param extraPP: valor de los puntos PP en los que se incrementarán los PP del Hechicero.
     */
    public void increasePPBy(int extraPP){
        setPP(getPP() + extraPP);
    }

    /**
     * DisminuirPP: disminuye el valor de HP del Hechicero.
     * @param withdrawPP: retirarPP: representa el valor de los puntos PP por los que se reducirán los PP del Hechicero.
     */
    public void decreasePPBy(int withdrawPP){
        setPP(getPP() - withdrawPP);
    }

    /**
     * aumentarNCapturedFairies: aumenta el número de hadas que ha capturado el Hechicero.
     * @param extraFairies):  representa el número de hadas que aumentará el número de hadas capturadas del Hechicero.
     */
    public void increaseNCapturedFairiesBy(int extraFairies){
        setNCapturedFairies(getNCapturedFairies() + extraFairies);
    }

    /**
     * captureFairy: el Hechicero ejecuta este método para capturar un hada y por lo tanto, aumentar el poder del mismo.
     *  Su funcionamiento consiste en que por cada 10 hadas que capture el Hechicero, su poder aumentará en 1 unidad.
     */
    public void captureFairy(){
        System.out.print(CAPTURE_FAIRY_TEXT);

        increaseNCapturedFairiesBy(1);
        if(getNCapturedFairies() % 10 == 0){
            System.out.print(INCREASE_MAGICIANS_PP);
            this.increasePPBy(1);
        }
    }

    public void invokeOgre(Protagonista protagonista){
        System.out.print(INVOKE_OGRE_TEXT);
        System.out.print(DECREASE_PLAYERS_HP);
        protagonista.decreaseHPBy(1);
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PPValue){
        PP = PPValue;
    }

    public int getNCapturedFairies(){
        return nCapturedFairies;
    }

    public void setNCapturedFairies(int nCapturedFairiesValue){
        nCapturedFairies = nCapturedFairiesValue;
    }
}
