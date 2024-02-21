
package Vista;

import javax.swing.JOptionPane;

import Concrete_builder.Camion_uno;
import Concrete_builder.Camion_dos;


public class Menu {
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
