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
public class Camion_uno extends CamionBuilder{
    
   @Override
   public String buildmotor(){
       String motor = "Motor cummis";
       return motor;
   }
   
   @Override
   public String builcarroceria(){
       String carroceria = "De lujo";
       return carroceria;
   }
   
   @Override
   public String builruedas(){
       String ruedas = "Gan tamaño";  
       return ruedas;
   }
}
