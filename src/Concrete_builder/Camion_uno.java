/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;


/**
 * La clase Camion_uno es una implementación concreta de CamionBuilder.
 * Define la construcción de un tipo específico de camión.
 */
public class Camion_uno extends CamionBuilder {
    
    /**
     * Método para construir el motor del camión.
     * @return La descripción del motor construido.
     */
    @Override
    public String builmotor() {
        return "Motor Cummins"; // Retorna el tipo de motor para el Camion_uno
    }
   
    /**
     * Método para construir la carrocería del camión.
     * @return La descripción de la carrocería construida.
     */
    @Override
    public String builcarroceria() {
        return "De lujo"; // Retorna el tipo de carrocería para el Camion_uno
    }
   
    /**
     * Método para construir las ruedas del camión.
     * @return La descripción de las ruedas construidas.
     */
    @Override
    public String builruedas() {
        return "Gran tamaño"; // Retorna el tipo de ruedas para el Camion_uno
    }
}
