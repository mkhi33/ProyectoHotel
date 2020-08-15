package gestiones;

import java.util.LinkedList;
import clases.Habitacion;
import javax.swing.DefaultComboBoxModel;
import java.io.Serializable;

public class GestionHabitacion implements Serializable{

    private LinkedList<Habitacion> lstHabitacion = new LinkedList<>();

    public GestionHabitacion() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar nueva habitacion.

    /**
     * @author Amilcar Rodriguez
     * @since 26Julio2019
     * @param objHabitacion
     * @return retorna true en caso de que se agregue correctamente el objeto
     * habitacion.
     */
    public boolean agregarHabitacion(Habitacion objHabitacion) {
        this.lstHabitacion.add(objHabitacion);
        return true;
    }

    //2.	Metodo para modificar obj Habitacion.
    /**
     * @author Amilcar Rodriguez
     * @param objHab
     * @since 26Julio2019
     * @param posicion recibe la posicion donde se encuentra el objeto.
     * @return retorna true en caso de que se modifique correctamente el objeto.
     */
    public boolean modificar(int posicion, Habitacion objHab){
        this.lstHabitacion.set(posicion, objHab);
        return true;
    }
    // 3.	Metodo para buscar.
    //3.1 Metodo para buscar por id.

    /**
     * @author Amilcar Rodriguez
     * @since 26Julio2019
     * @param id recibe el id del objeto a buscar.
     * @return retorna la posicion donde se encuentra el objeto.
     */
    public int buscarPorId(int id) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstHabitacion.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstHabitacion.get(i).getIdHabitacion() == id) {
                posicion = i;
            }
        }
        return posicion;
    }
    //	3.2 Metodo para buscar por numero de habitacion.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param numeroHabitacion
     * @return retorna la posicion donde se encuentra el objeto.
     */
    public int buscarPorNumeroHabitacion(int numeroHabitacion) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstHabitacion.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstHabitacion.get(i).getNumHabitacion() == numeroHabitacion) {
                posicion = i;
            }
        }
        return posicion;
    }
    //4. Metodo para eliminar objeto

    /**
     * @author Amilcar Rodriguez
     * @since 26Julio2019
     * @param posicion
     * @return retorna true en caso de que se haya eliminado correctamente el
     * objeto.
     */
    public boolean eliminarHabitacion(int posicion) {
        this.lstHabitacion.remove(posicion);
        return true;
    }
    // 5 Metodo para mostrar todos los elementos en la lista.

    /**
     * @author Amilcar Rodriguez
     * @since 27Julio2019 Este metodo muestra en pantalla todos los elementos
     * agregados en la lista.
     */
    public void imprimir() {
        System.out.println(this.lstHabitacion);
    }
    //6 Metodo que retorna un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna un objeto Habitacion segun su ubicacion.
     */
    public Habitacion getObjHabitacion(int posicion) {
        return this.lstHabitacion.get(posicion);
    }

    /**
     * @Autor Amilcar Rodriguez
     * @since 20/9/2019
     * @return
     */
    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstHabitacion.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][8];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstHabitacion.get(i).getIdHabitacion();
            array[i][1] = this.lstHabitacion.get(i).getNumHabitacion();
            array[i][2] = this.lstHabitacion.get(i).getNumPiso();
            array[i][3] = this.lstHabitacion.get(i).getCategoria().getNombreCategoria();
            array[i][4] = this.lstHabitacion.get(i).getPrecio();
            array[i][5] = this.lstHabitacion.get(i).getCapacidad();
            array[i][6] = this.lstHabitacion.get(i).getDisponibilidad();
            array[i][7] = this.lstHabitacion.get(i).getCategoria().getCaracteristicas();
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
        tamanioLista = this.lstHabitacion.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstHabitacion.get(i).getCategoria().getNombreCategoria()+"["+this.lstHabitacion.get(i).getNumHabitacion()+"]");
        }
        return modelo;
    }

    public int id() {
        int numId = this.lstHabitacion.size() + 100;
        return numId;
    }
    
    
        public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstHabitacion.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            
            retorno += "ID : " + this.lstHabitacion.get(i).getIdHabitacion()+ "\n"
                    +"Numero de habitacion: " + this.lstHabitacion.get(i).getNumHabitacion()+ "\n"
                    + "Numero de piso: " + this.lstHabitacion.get(i).getNumPiso()+ "\n"
                    +"Categoria de habitacion: " + this.lstHabitacion.get(i).getCategoria().getNombreCategoria()+ "\n"
                  +"Precio:  " + this.lstHabitacion.get(i).getPrecio()+ "\n"
                    +"Capacidad: " + this.lstHabitacion.get(i).getCapacidad()+ "\n"
                    +"Disponibilidad: " + this.lstHabitacion.get(i).getDisponibilidad()+ "\n"
                    +"Descripcion: " + this.lstHabitacion.get(i).getDescripcion()+ "\n"
                    ;
           
        }
       return retorno;
    }

}
