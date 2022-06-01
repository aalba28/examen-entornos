/*
*	grupo  : Mañana
*	alumno : Alba Maria Jimenez Fernandez
*	n.exp. : 7241
*	fecha  : 01/06/2022
 */
package Cheese;

//VersionFinal

import java.util.ArrayList;

/**
 * ///
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
    }

public static void ListadoProductos(ListaProductos a){
    
        ArrayList<Producto> Listado = new ArrayList<>();
        Listado = a.getProductos();
       
        System.out.print("Productos: ");
        System.out.println("\t\tNum.Productos:"+Listado.size());
        System.out.format("%-24s%-15s%-15s\n", "Codigo","Tipo");
        
        for (Producto c : Listado){
            System.out.format("%-24s%-15s%-15s\n",c.getcode(),c.getTipo());
        }
        System.out.println("-----------------------------------------------------");
}
}
