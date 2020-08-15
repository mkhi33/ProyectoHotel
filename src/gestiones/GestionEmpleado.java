package gestiones;

import java.util.LinkedList;
import clases.Empleado;
import utilitario.AdminFechas;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionEmpleado implements Serializable {

    private LinkedList<Empleado> lstEmpleado = new LinkedList<>();

    public GestionEmpleado() {

    }
    //1-	Metodo para agregar nuevo empleado.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param objEmpleado
     * @return el metodo retorna true en caso de que el objeto se agrego
     * correctamente.
     */
    public boolean agregarEmpleado(Empleado objEmpleado) {
        this.lstEmpleado.add(objEmpleado);
        return true;
    }
    //2-	Metodo para modificar objetoEmpleado

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @param objEmpleado
     * @return retorna true en caso de que el objeto se haya modificado
     * correctamente.
     */
    public boolean modificarEmpleado(int posicion, Empleado objEmpleado) {
        this.lstEmpleado.set(posicion, objEmpleado);
        return true;
    }
    //3. Metodo para buscar Empleado.

    //3.2 Buscar por id.
    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param id
     * @return retorna la posicion del objeto en el linkedList.
     */
    public int buscarPorId(int id) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstEmpleado.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstEmpleado.get(i).getIdEmpleado() == id) {
                posicion = i;
            }
        }
        return posicion;
    }

    // 3.4 Buscar empleado por identificacion
    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param docIdentificacion
     * @return retorna la posicion del objeto encontrado
     */
    public int buscarPorIdentificacion(String docIdentificacion) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstEmpleado.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstEmpleado.get(i).getNumIden().equals(docIdentificacion)) {
                posicion = i;
            }

        }
        return posicion;
    }
    //4. metodo para eliminar.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return retorna true en caso de que se elimine correctamente el objeto.
     */
    public boolean eliminarEmpleado(int posicion) {
        this.lstEmpleado.remove(posicion);
        return true;
    }
    //5. Metodo que retorna un objeto

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return retorna un objeto de tipo Empleado.
     */
    public Empleado getObjetoEmpleado(int posicion) {
        return this.lstEmpleado.get(posicion);
    }
    //6. Metodo para mostrar Empleados registrados.

    /**
     * Muestra en pantalla todos los empleados registrados.
     *
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @return no retorna
     */
    public void imprimirLstEmpleado() {
        System.out.println(lstEmpleado);
    }

    public int AsignarId() {
        int tamanioLista = this.lstEmpleado.size();
        int newId = 1;
        for (int i = 0; i < tamanioLista; i++) {

            if (this.lstEmpleado.get(i).getIdEmpleado() == newId) {
                newId = newId + 1;
            }
        }
        return newId;
    }

    /*
    Este metodo retorna un modelo para la tabla que muestra las listas
    
     */
    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstEmpleado.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][8];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstEmpleado.get(i).getIdEmpleado();
            array[i][1] = this.lstEmpleado.get(i).getpNombre();
            array[i][2] = this.lstEmpleado.get(i).getpApellido();
            array[i][3] = this.lstEmpleado.get(i).getCorreo();
            array[i][4] = this.lstEmpleado.get(i).getNumTelefono();
            array[i][5] = this.lstEmpleado.get(i).getNumIden();
            array[i][6] = this.lstEmpleado.get(i).getArea().getDescripcionarea();
            array[i][7] = this.lstEmpleado.get(i).getSueldo();

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
        tamanioLista = this.lstEmpleado.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstEmpleado.get(i).getpNombre() + " " + this.lstEmpleado.get(i).getpApellido());
        }
        return modelo;
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstEmpleado.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            retorno += "ID Empleado: " + this.lstEmpleado.get(i).getIdEmpleado() + "\n"
                    + "Nombre de Empleado: " + this.lstEmpleado.get(i).getpNombre() + "\n"
                    + "Apellido del empleado: " + this.lstEmpleado.get(i).getpApellido() + "\n"
                    + "Correo: " + this.lstEmpleado.get(i).getCorreo() + "\n"
                    + "Numero de identidad :" + this.lstEmpleado.get(i).getNumIden() + "\n"
                    + "Numero de Telefono :" + this.lstEmpleado.get(i).getNumTelefono() + "\n"
                    + "Estado civil :" + this.lstEmpleado.get(i).getEstadoCivil() + "\n"
                    + "Area de trabajo :" + this.lstEmpleado.get(i).getArea().getDescripcionarea() + "\n"
                    + "Fecha de inicio laboral :" + this.lstEmpleado.get(i).getFechaInicioLaboral().toString() + "\n"
                    + "Fecha de nacimiento :" + this.lstEmpleado.get(i).getFechaNacimiento() + "\n"
                    + "Sueldo :" + this.lstEmpleado.get(i).getSueldo() + "\n";

        }
        return retorno;
    }

}
