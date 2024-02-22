
package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
import Concrete_builder.*;
import Vista.Menu;

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
}

