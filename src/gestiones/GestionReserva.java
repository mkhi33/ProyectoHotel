package gestiones;

import java.util.LinkedList;
import clases.Reserva;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;
import utilitario.AdminFechas;

public class GestionReserva implements Serializable {

    private LinkedList<Reserva> lstReserva = new LinkedList<>();

    public GestionReserva() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar reserva a la lista.

    /**
     * @author Amilcar Rodriguez
     * @since 27Julio2019
     * @param objReserva
     * @return retorna true si se agrego correctamente el objeto reserva.
     */
    public boolean agregarReserva(Reserva objReserva) {
        objReserva.setIdReserva(700 + lstReserva.size());
        this.lstReserva.add(objReserva);
        return true;
    }
    //2. Metodo para modificar

    /**
     * @author Amilcar Rodriguez
     * @since 27Julio2019
     * @param posicion
     * @param objReserva
     * @return true en caso de que se midufico correctamente el objeto.
     */
    public boolean modificarReserva(int posicion, Reserva objReserva) {
        this.lstReserva.set(posicion, objReserva);
        return true;
    }
    //3. Metodo para eliminar

    /**
     * @author Amiclar Rodriguez
     * @since 27Julio2019
     * @param posicion
     * @return true en caso de que se elimine correctamente el objeto.
     */
    public boolean eliminarReserva(int posicion) {
        this.lstReserva.remove(posicion);
        return true;
    }
    //4. Metodo para buscar
    //	4.1 Buscar por idReserva

    /**
     * @author Amilcar Rodriguez
     * @since 27Julio2019
     * @param id
     * @return retorna la posicion del objeto que se busco.
     */
    public int buscarPorId(int id) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstReserva.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstReserva.get(i).getIdReserva() == id) {
                posicion = i;
            }
        }
        return posicion;
    }

    /**
     * @Autor Amilcar Rodriguez
     * @since 1/10/2019
     * @param numIdentidad
     * @return retorna la posicion del elemento buscado
     */
    public int buscarPorNumIdentidadCliente(String numIdentidad) {
        int posicion = -1;
        int tamanioLista = this.lstReserva.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstReserva.get(i).getNumIdentidad().equals(numIdentidad)) {
                posicion = i;
            }
        }
        return posicion;
    }

    //5 Mostrar la informacion
    /**
     * @author Amilcar Rodriguez
     * @since 27Julio2019 Este metodo muestra todos los elementos agregados a la
     * lista.
     */
    public void imprimir() {
        System.out.println(this.lstReserva);
    }
    //6. Metodo que retorna un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna un objeto de tipo Reserva, segun su ubicacion.
     */
    public Reserva getObjetoReserva(int posicion) {
        return this.lstReserva.get(posicion);
    }

    /**
     * @autor Amilcar Rodriguez
     * @since 28/9/2019
     * @return retorna una asignacion para el ID
     */
    public int AsignarId() {
        int tamanioLista = this.lstReserva.size();
        int newId = 1;
        for (int i = 0; i < tamanioLista; i++) {

            if (this.lstReserva.get(i).getIdReserva() == newId) {
                newId = newId + 1;
            }
        }
        return newId;
    }

    /**
     * @Autor Amilcar Rodriguez
     * @since 20/9/2019
     * @return
     */
    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstReserva.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][8];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstReserva.get(i).getIdReserva();
            array[i][1] = this.lstReserva.get(i).getNombre() + " " + this.lstReserva.get(i).getApellido();
            array[i][2] = this.lstReserva.get(i).getDatosHabitacion().getCategoria().getNombreCategoria();
            array[i][3] = this.lstReserva.get(i).getDatosHabitacion().getNumHabitacion();
            array[i][4] = this.lstReserva.get(i).getFechaReserva().toString();
            array[i][5] = this.lstReserva.get(i).getFechaIngreso().toString();
            array[i][6] = this.lstReserva.get(i).getFechaEgreso().toString();
            array[i][7] = this.lstReserva.get(i).getNumHuesped();
        }
        return array;
    }

    /**
     * Este metodo calcula el costo total de estadia en el hotel, segun la
     * cantidad de dias.
     *
     * @autor Amilcar Rodriguez
     * @param objReserva
     * @return
     */
    public double precioEstadia(Reserva objReserva) {
        int dias;
        double precioDia;
        double precioAlojamiento;
        dias = AdminFechas.restarFechasDias(objReserva.getFechaIngreso(), objReserva.getFechaEgreso());
        precioDia = objReserva.getDatosHabitacion().getCategoria().getPrecioDia();
        precioAlojamiento = dias * precioDia + (precioDia * dias * objReserva.impustos);
        return precioAlojamiento;
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstReserva.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "ID : " + this.lstReserva.get(i).getIdReserva() + "\n"
                    + "Nombre cliente " + this.lstReserva.get(i).getNombre() + "\n"
                    + "Apellido cliente " + this.lstReserva.get(i).getApellido() + "\n"
                    + "Fecha de nacimiento" + this.lstReserva.get(i).getNumIdentidad() + "\n"
                    + "Numero de telefono:  " + this.lstReserva.get(i).getTelefono() + "\n"
                    + "Numero de identidad: " + this.lstReserva.get(i).getNumIdentidad() + "\n"
                    + "Correo electronico: " + this.lstReserva.get(i).getCorreo() + "\n"
                    + "Empleado encargado de la reserva : " + this.lstReserva.get(i).getDatosEmpleadoEncargado().getpNombre() + " " + this.lstReserva.get(i).getDatosEmpleadoEncargado().getpNombre() + "\n"
                    + "Numero de habitacion: " + this.lstReserva.get(i).getDatosHabitacion().getNumHabitacion() + "\n"
                    + "Fecha de ingreso: " + this.lstReserva.get(i).getFechaEgreso().toString() + "\n"
                    + "Fecha de egreso: " + this.lstReserva.get(i).getFechaEgreso() + "\n"
                    + "Fecha de reserva: " + this.lstReserva.get(i).getFechaReserva() + "\n"
                    + "Cantidad de huespedes: " + this.lstReserva.get(i).getNumHuesped() + "\n"
                    + "Precio estadia: " + this.lstReserva.get(i).getPrecioEstadia() + "\n";

        }
        return retorno;
    }
    
        public DefaultComboBoxModel getComboboxModel() {
        int i, tamanioLista;
        tamanioLista = this.lstReserva.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstReserva.get(i).getNombre()+ " " + this.lstReserva.get(i).getApellido());
        }
        return modelo;
    }
    

}
