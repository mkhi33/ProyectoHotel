package gestiones;

import java.util.LinkedList;
import clases.Producto;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionProducto implements Serializable {

    private LinkedList<Producto> lstProducto = new LinkedList<>();

    public GestionProducto() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar nuevo producto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param objProducto
     * @return retorna true en caso de que se agregue correctamente el objeto.
     */
    public boolean agregarProducto(Producto objProducto) {
        objProducto.setIdProducto(600 + lstProducto.size() + 1);
        this.lstProducto.add(objProducto);
        return true;
    }

    //2.	Metodo para modificar obj Producto.
    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param objProducto recibe el objeto a modificar.
     * @param posicion recibe la posicion donde se encuentra el objeto.
     * @return retorna true en caso de que se modifique correctamente el objeto.
     */
    public boolean modificarHabitacion(Producto objProducto, int posicion) {
        this.lstProducto.set(posicion, objProducto);
        return true;
    }
    // 3.	Metodo para buscar.
    //3.1 Metodo para buscar por id.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param id recibe el id del objeto a buscar.
     * @return retorna la posicion donde se encuentra el objeto.
     */
    public int buscarPorId(int id) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstProducto.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstProducto.get(i).getIdProducto() == id) {
                posicion = i;
            }
        }
        return posicion;
    }
    //	3.2 Metodo para buscar por nombre de producto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param nombreProducto
     * @return retorna la posicion donde se encuentra el objeto.
     */
    public int buscarPorNumeroHabitacion(String nombreProducto) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstProducto.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstProducto.get(i).getNombreProducto().equals(nombreProducto)) {
                posicion = i;
            }
        }
        return posicion;
    }
    //4. Metodo para eliminar objeto

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna true en caso de que se haya eliminado correctamente el
     * objeto.
     */
    public boolean eliminarProducto(int posicion) {
        this.lstProducto.remove(posicion);
        return true;
    }
    // 5 Metodo para mostrar todos los elementos en la lista.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019 Este metodo muestra en pantalla todos los elementos
     * agregados en la lista.
     */
    public void imprimir() {
        System.out.println(this.lstProducto);
    }
    //6 Metodo que retorna un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna un objeto Habitacion segun su ubicacion.
     */
    public Producto getProducto(int posicion) {
        return this.lstProducto.get(posicion);
    }

    /*
    Este metodo retorna un modelo para la tabla que muestra las listas
    
     */
    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstProducto.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][7];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstProducto.get(i).getIdProducto();
            array[i][1] = this.lstProducto.get(i).getNombreProducto();
            array[i][2] = this.lstProducto.get(i).getuMedida();
            array[i][3] = this.lstProducto.get(i).getFechaVencimiento();
            array[i][4] = this.lstProducto.get(i).getExistencia();
            array[i][5] = this.lstProducto.get(i).getPrecioVenta();
            array[i][6] = this.lstProducto.get(i).getProvedor().getpNombre() + " " + this.lstProducto.get(i).getProvedor().getpApellido();

        }
        return array;
    }

    /**
     * @author Amilcar Rodriguez
     * @since 20 Septiembre 2019
     * @return
     */
    public DefaultComboBoxModel getComboboxModel() {
        int i, tamanioLista;
        tamanioLista = this.lstProducto.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstProducto.get(i).getNombreProducto());
        }
        return modelo;
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstProducto.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "ID : " + this.lstProducto.get(i).getIdProducto() + "\n"
                    + "Producto " + this.lstProducto.get(i).getNombreProducto() + "\n"
                    + "Descripcion " + this.lstProducto.get(i).getDescripcionProducto() + "\n"
                    + "Unidad de medida " + this.lstProducto.get(i).getuMedida() + "\n"
                    + "Existencia:  " + this.lstProducto.get(i).getExistencia() + "\n"
                    + "Fecha de vencimiento: " + this.lstProducto.get(i).getFechaVencimiento() + "\n"
                    + "Precio venta: " + this.lstProducto.get(i).getPrecioVenta() + "\n"
                    + "Proveedor: " + this.lstProducto.get(i).getProvedor() + "\n";

        }
        return retorno;
    }

}
