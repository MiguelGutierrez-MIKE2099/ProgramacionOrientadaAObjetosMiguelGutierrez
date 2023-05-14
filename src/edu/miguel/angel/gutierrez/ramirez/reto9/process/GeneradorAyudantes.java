package edu.miguel.angel.gutierrez.ramirez.reto9.process;

/**
 * Miguel Angel Gutierrez Ramirez AL03035575 IDS .
 * RETO 09 Generador de Ayudantes con definicion
 * de atributos al azar por Constructores.
 *
 */
import java.util.ArrayList;

public class GeneradorAyudantes { //clase Helper
    /**
     * Definicion de variables para cada atributo.
     */
    byte ojos;
    String colorPiel;
    String altura;
    byte nCrear;
    byte nArreglar;
    byte nDestruir;

    /**
     * Se definen los atributos que llevara cada Ayudante generado:
     */
    public GeneradorAyudantes(byte ojos) {
        setNumOfEyes(ojos);
    }

    public GeneradorAyudantes(byte ojos, String colorPiel) {
        setNumOfEyes(ojos);
        setSkinColor(colorPiel);
    }

    public GeneradorAyudantes(byte ojos, String colorPiel, String altura) {
        setNumOfEyes(ojos);
        setSkinColor(colorPiel);
        setHeight(altura);
    }

    public GeneradorAyudantes(byte ojos, String colorPiel, String altura, byte nCrear) {
        setNumOfEyes(ojos);
        setSkinColor(colorPiel);
        setHeight(altura);
        setLvlObjCreation(nCrear);
    }

    public GeneradorAyudantes(byte ojos, String colorPiel, String altura, byte lvlObj, byte nArreglar) {
        setNumOfEyes(ojos);
        setSkinColor(colorPiel);
        setHeight(altura);
        setLvlObjCreation(lvlObj);
        setLvlFixStuff(nArreglar);
    }

    public GeneradorAyudantes(byte ojos, String colorPiel, String altura, byte nCrear, byte nArreglar, byte nDestruir) {
        setNumOfEyes(ojos);
        setSkinColor(colorPiel);
        setHeight(altura);
        setLvlObjCreation(nCrear);
        setLvlFixStuff(nArreglar);
        setLvlDestructive(nDestruir);
    }

    public void setNumOfEyes(byte numOfEyes) {
        this.ojos = numOfEyes;
    }

    public void setSkinColor(String skinColor) {
        this.colorPiel = skinColor;
    }

    public void setHeight(String height) {
        this.altura = height;
    }

    public void setLvlObjCreation(byte lvlObj) {
        this.nCrear = lvlObj;
    }

    public void setLvlFixStuff(byte lvlFixStuff) {
        this.nArreglar = lvlFixStuff;
    }

    public void setLvlDestructive(byte lvlDestructive) {
        this.nDestruir = lvlDestructive;
    }

    public Object[] getHelperData(){
        ArrayList<Object> helperData = new ArrayList<>();
        helperData.add(ojos);
        helperData.add(colorPiel);
        helperData.add(altura);
        helperData.add(nCrear);
        helperData.add(nArreglar);
        helperData.add(nDestruir);

        return helperData.toArray();
    }

}
