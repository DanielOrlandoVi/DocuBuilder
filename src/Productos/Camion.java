/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author jorge malaver
 */
/**
 * La clase Camion representa un camión y tiene tres atributos: motor, carrocería y ruedas.
 * Esta clase será utilizada en conjunto con el patrón Builder para construir objetos Camion de manera flexible.
 */
public class Camion {
    // Atributos del camión
    private String motor;
    private String carroceria;
    private String ruedas;
    
    /**
     * Método para establecer el motor del camión.
     * @param motor El motor a establecer.
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    /**
     * Método para establecer la carrocería del camión.
     * @param carroceria La carrocería a establecer.
     */
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    
    /**
     * Método para establecer las ruedas del camión.
     * @param ruedas Las ruedas a establecer.
     */
    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
}
