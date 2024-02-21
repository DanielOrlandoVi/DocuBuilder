
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
public class Camion_dos extends CamionBuilder{
   
     @Override
   public String builmotor(){
       return "Motor normal";
   }
   
   @Override
   public String builcarroceria(){
       return "corriente";
   }
   
   @Override
   public String builruedas(){
       return "medianas";
   }
    
    
}
