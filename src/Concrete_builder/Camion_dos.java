
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
public class Camion_dos extends CamionBuilder{
   
     @Override
   public String buildmotor(){
       String motor = "Motor normal";
       return motor;
   }
   
   @Override
   public String builcarroceria(){
       String carroceria = "corriente";
       return carroceria;
   }
   
   @Override
   public String builruedas(){
       String ruedas = "medianas";
       return ruedas;
   }
    
    
}
