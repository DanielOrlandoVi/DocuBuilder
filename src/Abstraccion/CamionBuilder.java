
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Productos.*;
public abstract class CamionBuilder {
    
    protected camion Camion;//objeto de la clase producto
    
    public camion getcamion(){
     
        return Camion;
    }
    
    public void ConstruirCamion(){
        Camion =new camion();
    }
    
    public abstract String builmotor();
    public abstract String builcarroceria();
    public abstract String builruedas();
}
