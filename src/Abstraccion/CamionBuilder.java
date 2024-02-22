
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Productos.*;


/**
 * La clase abstracta CamionBuilder es la interfaz para construir diferentes tipos de camiones.
 * Define los métodos necesarios para construir un camión, como la construcción del motor, carrocería y ruedas.
 */
public abstract class CamionBuilder {
    // Objeto de la clase producto (Camion)
    protected Camion camion;
    
    /**
     * Método para obtener el camión construido.
     * @return El camión construido.
     */
    public Camion getcamion(){
        return camion;
    }
    
    /**
     * Método para inicializar la construcción del camión.
     */
    public void ConstruirCamion(){
        camion =new Camion();
    }
    
    /**
     * Método abstracto para construir el motor del camión.
     * @return La descripción del motor construido.
     */
    public abstract String builmotor();
    
    /**
     * Método abstracto para construir la carrocería del camión.
     * @return La descripción de la carrocería construida.
     */
    public abstract String builcarroceria();
    
    /**
     * Método abstracto para construir las ruedas del camión.
     * @return La descripción de las ruedas construidas.
     */
    public abstract String builruedas();
}
