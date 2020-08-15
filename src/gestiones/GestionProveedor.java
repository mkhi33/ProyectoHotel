package gestiones;

import java.util.LinkedList;
import clases.Proveedor;
import javax.swing.DefaultComboBoxModel;
import java.io.Serializable;

public class GestionProveedor implements Serializable{

    private LinkedList<Proveedor> lstProveedor = new LinkedList<>();

    public GestionProveedor() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar proveedor.

    /**
     * @author Amilcar Rodriguez
     * @since 28Julio2019
     * @param objProveedor
     * @return retorna true en caso de que el objeto se agregue correctamente a
     * la lista.
     */
    public boolean agregarProveedor(Proveedor objProveedor) {
        objProveedor.setIdProveedor(600 + lstProveedor.size());
        this.lstProveedor.add(objProveedor);
        return true;
    }
    // 2. Metodo para modificar

    /**
     * @author Amilcar Rodriguez
     * @since 28Julio2019
     * @param posicion
     * @param objProveedor recibe como parametros la posicion y el objeto que se
     * desea modificar.
     * @return retorna true en caso de que se modifique correctamente el objeto
     */
    public boolean modificarProveedor(int posicion, Proveedor objProveedor) {
        this.lstProveedor.set(posicion, objProveedor);
        return true;
    }
    //3. Metodo para eliminar

    /**
     * @author Amilcar Rodriguez
     * @since 28Julio2019
     * @param posicion
     * @return retorna true en caso de que se elimine correctamente el objeto.
     */
    public boolean eliminarProveedor(int posicion) {
        this.lstProveedor.remove(posicion);
        return true;
    }
    //4. Metodo para buscar
    //4.1 Metodo para busca por ID

    /**
     * @author Amilcar Rodriguez
     * @since 28Julio2019
     * @param id
     * @return retorna la posicion del objeto en caso de que se encuentre.
     */
    public int buscarPorId(int id) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstProveedor.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstProveedor.get(i).getIdProveedor() == id) {
                posicion = i;
            }
        }
        return posicion;
    }
    //4.2 Metodo para buscar por primer nombre y primer apellido.

    /**
     * @author Amiclar Rodriguez
     * @since 28Julio2019
     * @param nompre recibe como parametro el primer nombre
     * @param apellido recibe como parametro el primer apellido
     * @return retorna la posicion en caso de que se encuentre el objeto que se
     * busco.
     */
    public int buscarPorNumIdentidad(String numIdentidad) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstProveedor.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstProveedor.get(i).getNumIden().equals(numIdentidad)) {
                posicion = i;
            }
        }
        return posicion;
    }
    //	4.3 Metodo para buscar por correo electronico

    /**
     * @author Amilcar Rodriguez
     * @since 28Julio2019
     * @param email
     * @return retorna la posicion del objeto en caso de que se encuentre
     * correctamente.
     */
    public int buscarPorCorreo(String email) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstProveedor.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstProveedor.get(i).getCorreo().equals(email)) {
                posicion = i;
            }
        }
        return posicion;
    }
    //5. Metodo para mostrar en pantalla todos los elementos de la lista.

    /**
     * @author Amiclar Rodriguez
     * @since 28Julio2019
     * @return no retorna. Muestra en pantalla todos los elementos agregados a
     * la lista.
     */
    public void imprimir() {
        System.out.println(this.lstProveedor);
    }
    //6. Metodo que retorna un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna un objeto de tipo Proveedor, segun su ubicacion.
     */
    public Proveedor getObjProveedor(int posicion) {
        return this.lstProveedor.get(posicion);
    }

    public int AsignarId() {
        int tamanioLista = this.lstProveedor.size();
        int newId = 1;
        for (int i = 0; i < tamanioLista; i++) {

            if (this.lstProveedor.get(i).getIdProveedor() == newId) {
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
        tamanioLista = this.lstProveedor.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][6];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstProveedor.get(i).getIdProveedor();
            array[i][1] = this.lstProveedor.get(i).getpNombre();
            array[i][2] = this.lstProveedor.get(i).getpApellido();
            array[i][3] = this.lstProveedor.get(i).getCorreo();
            array[i][4] = this.lstProveedor.get(i).getNumTelefono();
            array[i][5] = this.lstProveedor.get(i).getNumIden();

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
        tamanioLista = this.lstProveedor.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstProveedor.get(i).getpNombre() + " " + this.lstProveedor.get(i).getpApellido());
        }
        return modelo;
    }
    
        public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstProveedor.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "ID : " + this.lstProveedor.get(i).getIdProveedor()+ "\n"
                    + "Nombre " + this.lstProveedor.get(i).getpNombre()+ "\n"
                    + "Apellido " + this.lstProveedor.get(i).getpApellido()+ "\n"
                    + "Fecha de nacimiento" + this.lstProveedor.get(i).getFechaNacimiento()+ "\n"
                    + "Numero de telefono:  " + this.lstProveedor.get(i).getNumTelefono()+ "\n"
                    + "Numero de identidad: " + this.lstProveedor.get(i).getNumIden()+ "\n"
                    + "Correo electronico: " + this.lstProveedor.get(i).getCorreo()+ "\n"
                    + "Estado civil: " + this.lstProveedor.get(i).getEstadoCivil()+ "\n";

        }
        return retorno;
    }

}
