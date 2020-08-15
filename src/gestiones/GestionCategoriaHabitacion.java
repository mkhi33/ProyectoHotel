package gestiones;

import java.util.LinkedList;
import clases.CategoriaHabitacion;
import javax.swing.DefaultComboBoxModel;
import java.io.Serializable;

public class GestionCategoriaHabitacion implements Serializable {

    private LinkedList<CategoriaHabitacion> lstCatHabitacion = new LinkedList<>();

    public GestionCategoriaHabitacion() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar categoria de habitacion

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param objCatHabitacion
     * @return true en caso de que se agregue correctamente.
     */
    public boolean agregarCatHabitacion(CategoriaHabitacion objCatHabitacion) {
        this.lstCatHabitacion.add(objCatHabitacion);
        return true;
    }
    //2. Metodo para modificar categoria habitacion

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @param objCatHabitacion
     * @return retorna true en caso de que se modifique correctamente el objeto.
     */
    public boolean modfCatHabitacion(int posicion, CategoriaHabitacion objCatHabitacion) {
        this.lstCatHabitacion.set(posicion, objCatHabitacion);
        return true;
    }
    //3. Metodo para eliminar categoria de habitacion

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return true en caso de que se elimine correctamente el objeto de la
     * posicion seleccionado.
     */
    public boolean eliminarCatHabitacion(int posicion) {
        this.lstCatHabitacion.remove(posicion);
        return true;
    }
    //4. Metodo para buscar categoria de habitacion.
    //4.1 por id

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param id
     * @return retorna la posicion del objeto
     */
    public int buscarPorId(int id) {
        int posicion = -1;
        int tamanioLista = this.lstCatHabitacion.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstCatHabitacion.get(i).getIdCategoria() == id) {
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param nombre
     * @return retorna la posicion del objeto que busca.
     */
    public int buscarPornombre(String nombre) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstCatHabitacion.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstCatHabitacion.get(i).getNombreCategoria().equalsIgnoreCase(nombre)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    //5. Metodo que retorna un objeto tipo CategoriaHabitacion
    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return retorna un objeto tipo CategoriaHabitacion.
     */
    public CategoriaHabitacion objCategoriaHabitacion(int posicion) {

        return this.lstCatHabitacion.get(posicion);
    }
    //6. Metodo para mostrar en pantalla todos los objetos categoria agregados.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @return no retorna nada, muestra en pantalla todos los elementos
     * agregados en la lista.
     * @param no contiene.
     */
    public void imprimir() {
        System.out.println(lstCatHabitacion);
    }

    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstCatHabitacion.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][5];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstCatHabitacion.get(i).getIdCategoria();
            array[i][1] = this.lstCatHabitacion.get(i).getNombreCategoria();
            array[i][2] = this.lstCatHabitacion.get(i).getCaracteristicas();
            array[i][3] = this.lstCatHabitacion.get(i).getCapacidad();
            array[i][4] = this.lstCatHabitacion.get(i).getPrecioDia();
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
        tamanioLista = this.lstCatHabitacion.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstCatHabitacion.get(i).getNombreCategoria());
        }
        return modelo;
    }

    /**
     * @autor Amilcar Rodriguez
     * @since 28/9/2019
     * @return retorna una asignacion para el ID
     */
    public int AsignarId() {
        int tamanioLista = this.lstCatHabitacion.size();

        

        return tamanioLista + 1;
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstCatHabitacion.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            retorno += "IDcategoria: " + this.lstCatHabitacion.get(i).getIdCategoria() + "\n"
                    + "Nombre de la categoria: " + this.lstCatHabitacion.get(i).getNombreCategoria() + "\n"
                    + "Caracteristicas: " + this.lstCatHabitacion.get(i).getCaracteristicas() + "\n"
                    + "Capacidad: " + this.lstCatHabitacion.get(i).getCapacidad() + "\n"
                    + "Precio por deia :" + this.lstCatHabitacion.get(i).getPrecioDia() + "\n";

        }
        return retorno;
    }

}
