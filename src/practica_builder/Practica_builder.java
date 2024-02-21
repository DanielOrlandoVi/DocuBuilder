
package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
import Concrete_builder.*;
import javax.swing.JOptionPane;

public class Practica_builder {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
    construir_camion obj= new construir_camion();
    CamionBuilder obj1= new Camion_uno();
    CamionBuilder obj2=new Camion_dos();
    obj.setcamionBuilder(obj1);
    obj.fabrica_camion();
    camion nueva=obj.getcamion();
    
    
    Practica_builder menu = new Practica_builder();    
    while(1 != 0){
        menu.mostrar_Menu();
        menu.mostrardatos();
        }  
        
    }
    
    //LOGICA DE INTERFAZ GRÁFICA
    int opcion;
    
    public int mostrar_Menu(){
        String opcion_texto = JOptionPane.showInputDialog("¡Bienvenido a la fabrica de camiones!" 
                + "\n" + "Seleccione el camion que desea llevar" + "\n" +
                "1. Camion uno" + "\n" + "2. Camion dos" + "\n" + "3. Salir");
        
        if (opcion_texto == null) {
        	System.exit(0);
        }
        try {
        opcion = Integer.parseInt(opcion_texto);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return mostrar_Menu();
        }
        return opcion;
    }
    
    public void mostrardatos(){
    	Camion_uno camionuno = new Camion_uno();
        Camion_dos camiondos = new Camion_dos();

        
        if (opcion == 1){
            JOptionPane.showMessageDialog(null, "El motor del camion uno es: " + camionuno.builmotor() + "\n" + "La carroceria del camion uno es: " + camionuno.builcarroceria() + 
                    "\n" + "Las ruedas del camion uno son: " + camionuno.builruedas());
        }
        if (opcion == 2){
            JOptionPane.showMessageDialog(null, "El motor del camion dos es: " + camiondos.builmotor() + "\n"+"La carroceria del camion uno es: " + camiondos.builcarroceria() + 
                    "\n" + "Las ruedas del camion uno son: " + camiondos.builruedas());
        }
        if (opcion == 3){
            System.exit(0);
        }
        
 
    }
    
}
