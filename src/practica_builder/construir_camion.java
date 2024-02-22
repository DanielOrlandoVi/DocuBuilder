
 package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Concrete_builder.*;

import Productos.*;
import Abstraccion.*;


/**
 * La clase construir_camion actúa como el director del proceso de construcción del camión.
 * Se encarga de invocar los métodos apropiados del builder para construir el camión.
 */
public class construir_camion {
    private CamionBuilder nuevo; // Referencia al builder utilizado para construir el camión
    
    /**
     * Método para establecer el builder que se utilizará para construir el camión.
     * @param op El builder que se utilizará.
     */
    public void setcamionBuilder(CamionBuilder op) {
        nuevo = op; // Asigna el builder proporcionado
    }
    
    /**
     * Método para obtener el camión construido.
     * @return El camión construido.
     */
    public Camion getcamion() {
        return nuevo.getcamion(); // Retorna el camión construido por el builder
    }
    
    /**
     * Método que inicia el proceso de construcción del camión.
     * Invoca los métodos del builder para construir cada parte del camión.
     */
    public void fabrica_camion() {
        nuevo.ConstruirCamion(); // Inicia la construcción del camión utilizando el builder
        nuevo.builmotor(); // Construye el motor del camión
        nuevo.builcarroceria(); // Construye la carrocería del camión
        nuevo.builruedas(); // Construye las ruedas del camión
    }
}
