/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiones;

import clases.ListaProductos;
import java.util.LinkedList;

/**
 *
 * @author aarve
 */
public class GestionListaProductos {

    public LinkedList<ListaProductos> lstListaProductos = new LinkedList<>();

    //1. Metodo para agregar nuevo producto consumido por el cliente.
    /**
     * @Since Agrega productos consumidos a la lista
     * @param objCarrito
     * @return
     */
    public boolean agregarCarrito(ListaProductos objListaProductos) {
        double costo = objListaProductos.getCantidad() * objListaProductos.getProducto().getPrecioVenta();
        objListaProductos.setCostoProducto(costo);
        this.lstListaProductos.add(objListaProductos);
        return true;
    }
    //2.	Metodo para modificar obj.

    /**
     * @author Amilcar Rodriguez
     * @param objCarrito
     * @since 2/10/2019
     * @param posicion recibe la posicion donde se encuentra el objeto.
     * @return retorna true en caso de que se modifique correctamente el objeto.
     */
    public boolean modificar(ListaProductos objListaProductos, int posicion) {
        this.lstListaProductos.set(posicion, objListaProductos);
        return true;
    }

    //4. Metodo para eliminar objeto
    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna true en caso de que se haya eliminado correctamente el
     * objeto.
     */
    public boolean eliminar(int posicion) {
        this.lstListaProductos.remove(posicion);
        return true;
    }

    public int idCarrito() {
        return this.lstListaProductos.size() + 1;
    }

    public ListaProductos getObjeto(int posicion) {
        return this.lstListaProductos.get(posicion);
    }

    /**
     * @Autor Amilcar Rodriguez
     * @since 20/9/2019
     * @return
     */
    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstListaProductos.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][5];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstListaProductos.get(i).getProducto().getIdProducto();
            array[i][1] = this.lstListaProductos.get(i).getProducto().getNombreProducto();
            array[i][2] = this.lstListaProductos.get(i).getCantidad();
            array[i][3] = this.lstListaProductos.get(i).getProducto().getPrecioVenta();
            array[i][4] = this.lstListaProductos.get(i).getCantidad() * this.lstListaProductos.get(i).getProducto().getPrecioVenta();
        }
        return array;
    }

    //Metodo para calcular el total de la cuenta
    /**
     * @Autor Amilcar Rodriguez
     * @since 4/10/2019
     * @return retorna el calcuo del total de la cuenta apagar
     */
    public double total() {
        int tamanioList = this.lstListaProductos.size();
        double suma = 0;
        for (int i = 0; i < tamanioList; i++) {
            suma = suma + this.lstListaProductos.get(i).getProducto().getPrecioVenta() * this.lstListaProductos.get(i).getCantidad();
        }
        return suma;
    }

    /**
     * @autor Amilcar Rodriguez
     * @since 5/10/2019
     * @return retorna la informacion de tipo string
     */
    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstListaProductos.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno
                    += "Producto seleccionado:  " + this.lstListaProductos.get(i).getProducto().getNombreProducto() + "\n"
                    + "Precio unitario: " + this.lstListaProductos.get(i).getProducto().getPrecioVenta() + "\n"
                    + "Cantidad seleccionado: " + this.lstListaProductos.get(i).getCantidad() + "\n"
                    + "Costo total  " + this.lstListaProductos.get(i).getCostoProducto() + "\n"
                    + "\n";

        }
        return retorno;
    }

}
