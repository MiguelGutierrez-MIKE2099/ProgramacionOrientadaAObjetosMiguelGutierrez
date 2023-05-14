package edu.miguel.angel.gutierrez.ramirez.retoFinal.ui;

import edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos.Hechicero;
import edu.miguel.angel.gutierrez.ramirez.retoFinal.Procesos.Protagonista;

/**
 *  A una instancia de la interfaz funcional Acción se le puede asignar la definición de una función lambda.
 */
@FunctionalInterface
public interface Acciones {

    /**
     *definedAction es el prototipo del método que ayudará a inicializar una instancia de la clase Action como una función lambda definida.
     */

    void definedAction(Protagonista protagonista, Hechicero hechicero);
}
