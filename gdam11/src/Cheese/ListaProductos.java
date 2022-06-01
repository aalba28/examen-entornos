/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    
    }

   /**
    * Añade productos
    * @param prod añade un produto
    * @return devuelve null si esta repetido y devuelve el producto si no esta repetido
    */
    public Producto addProducto(Producto prod) {
        
         if (prod.replace(" ","") == ""){
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }
      return null;
 }        
/**
 * Borra productos del codigo
 * @param codigo del producto a eliminar
 * @return devuelve null si esta repetido y devuelve lo que queramos eliminar si no esta repetido
 */
    
    
    public Producto eliminarProducto(String codigo) { 
        
        if (codigo.replace(" ","") == ""){
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }
       return null;
  }
/**
 * Busca los productos
 * @param  codigo para buscar productos
 * @return devuelve el producto que estamos buscando
 */
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if (codigo.replace(" ","") == ""){
            
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
     }
        return null;
    }
/**
 * Saca los productos que tengamos 
 * @return devuelve los productos de la lista
 */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    /**
     * Genera el total de productos
     * @return devuelve un numero de la cantidad de productos que tenemos
     */
    public int totalProductos(){
            return this.getN();
    }
}
