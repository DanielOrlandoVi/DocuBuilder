
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;


/**
 * La clase Camion_dos es una implementación concreta de CamionBuilder.
 * Define la construcción de otro tipo específico de camión.
 */
public class Camion_dos extends CamionBuilder {
   
    /**
     * Método para construir el motor del camión.
     * @return La descripción del motor construido.
     */
    @Override
    public String builmotor() {
        return "Motor normal"; // Retorna el tipo de motor para el Camion_dos
    }
   
    /**
     * Método para construir la carrocería del camión.
     * @return La descripción de la carrocería construida.
     */
    @Override
    public String builcarroceria() {
        return "Corriente"; // Retorna el tipo de carrocería para el Camion_dos
    }
   
    /**
     * Método para construir las ruedas del camión.
     * @return La descripción de las ruedas construidas.
     */
    @Override
    public String builruedas() {
        return "Medianas"; // Retorna el tipo de ruedas para el Camion_dos
    }  
}

