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
   public String builmotor(){
       return "Motor cummis";
   }
   
   @Override
   public String builcarroceria(){
       return "De lujo";
   }
   
   @Override
   public String builruedas(){
        return "Gan tamaño";
   }
}
