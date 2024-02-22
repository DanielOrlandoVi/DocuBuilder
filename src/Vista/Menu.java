
package Vista;

import javax.swing.JOptionPane;

import Concrete_builder.Camion_uno;
import Concrete_builder.Camion_dos;


/**
 * La clase Menu proporciona un menú de opciones para que el usuario seleccione un tipo de camión.
 * Además, muestra los detalles del camión seleccionado.
 */
public class Menu {
    int opcion; // Variable para almacenar la opción seleccionada por el usuario
    
    /**
     * Método para mostrar el menú al usuario y obtener su elección.
     * @return La opción seleccionada por el usuario.
     */
    public int mostrar_Menu() {
        // Mostrar el menú utilizando un cuadro de diálogo de entrada
        String opcion_texto = JOptionPane.showInputDialog("¡Bienvenido a la fabrica de camiones!" 
                + "\n" + "Seleccione el camion que desea llevar" + "\n" +
                "1. Camion uno" + "\n" + "2. Camion dos" + "\n" + "3. Salir");
        
        // Salir del programa si el usuario presiona cancelar o cierra la ventana
        if (opcion_texto == null) {
            System.exit(0);
        }
        
        // Convertir la opción de texto a un número entero
        try {
            opcion = Integer.parseInt(opcion_texto);
        } catch (NumberFormatException e) {
            // Mostrar un mensaje de error si el usuario ingresa un valor no válido
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            // Llamar recursivamente al método para mostrar el menú nuevamente
            return mostrar_Menu();
        }
        
        // Devolver la opción seleccionada por el usuario
        return opcion;
    }
    
    /**
     * Método para mostrar los detalles del camión seleccionado por el usuario.
     */
    public void mostrardatos() {
        // Crear instancias de los tipos de camión
        Camion_uno camionuno = new Camion_uno();
        Camion_dos camiondos = new Camion_dos();
        
        // Mostrar los detalles del camión según la opción seleccionada por el usuario
        if (opcion == 1) {
            JOptionPane.showMessageDialog(null, "El motor del camion uno es: " + camionuno.builmotor() + "\n" + "La carroceria del camion uno es: " + camionuno.builcarroceria() + 
                    "\n" + "Las ruedas del camion uno son: " + camionuno.builruedas());
        } else if (opcion == 2) {
            JOptionPane.showMessageDialog(null, "El motor del camion dos es: " + camiondos.builmotor() + "\n" + "La carroceria del camion uno es: " + camiondos.builcarroceria() + 
                    "\n" + "Las ruedas del camion uno son: " + camiondos.builruedas());
        } else if (opcion == 3) {
            // Salir del programa si el usuario selecciona la opción "Salir"
            System.exit(0);
        }
    }
}