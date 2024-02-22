
package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
import Concrete_builder.*;
import javax.swing.JOptionPane;

/**
 * La clase Practica_builder contiene el método principal para probar la construcción de camiones utilizando el patrón Builder.
 */
public class Practica_builder {

    public static void main(String[] args) {
        // Crear un objeto para construir camiones
        construir_camion obj = new construir_camion();
        
        // Crear instancias de builders para diferentes tipos de camiones
        CamionBuilder obj1 = new Camion_uno();
        CamionBuilder obj2 = new Camion_dos();
        
        // Establecer el builder para construir un tipo específico de camión (Camion_uno)
        obj.setcamionBuilder(obj1);
        
        // Iniciar el proceso de construcción del camión
        obj.fabrica_camion();
        
        // Obtener el camión construido
        Camion nueva = obj.getcamion();
        
        // Crear una instancia de la clase Menu para manejar las opciones del usuario
        Menu menu = new Menu();
        
        // Mostrar el menú y los datos del camión
        while (true) { // Ciclo infinito
            menu.mostrar_Menu(); // Mostrar el menú al usuario
            menu.mostrardatos(); // Mostrar los datos del camión construido
        }
    }
<<<<<<< HEAD
=======
    
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
    
>>>>>>> 9ed593dbebd4d7484caa15e66757ddb401f64369
}

