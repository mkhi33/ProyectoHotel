package gestiones;

import java.util.LinkedList;
import clases.Factura;
import gui.PantallaPrincipal;
import utilitario.AdminFechas;
import java.io.Serializable;

public class GestionFactura implements Serializable {

    public LinkedList<Factura> lstFactura = new LinkedList<>();

    public GestionFactura() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar nueva factura.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param objFactura
     * @return retorna true en caso de que se agregue correctamente el objeto.
     */
    public boolean agregarFactura(Factura objFactura) {
        objFactura.setIdFactura(this.lstFactura.size() + 1);
        objFactura.setFechaPAgo(AdminFechas.getFechaActual());
        this.lstFactura.add(objFactura);
        return true;
    }

    //2.	Metodo para modificar obj.
    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param objFactura recibe el objeto a modificar.
     * @param posicion recibe la posicion donde se encuentra el objeto.
     * @return retorna true en caso de que se modifique correctamente el objeto.
     */
    public boolean modificarFactura(Factura objFactura, int posicion) {
        this.lstFactura.set(posicion, objFactura);
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
        tamanioLista = this.lstFactura.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstFactura.get(i).getIdFactura() == id) {
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
    public boolean eliminarFactura(int posicion) {
        this.lstFactura.remove(posicion);
        return true;
    }
    // 5 Metodo para mostrar todos los elementos en la lista.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019 Este metodo muestra en pantalla todos los elementos
     * agregados en la lista.
     */
    public void imprimir() {
        System.out.println(this.lstFactura);
    }
    //6 Metodo que retorna un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna un objeto Factura segun su ubicacion.
     */
    public Factura getObjFactura(int posicion) {
        return this.lstFactura.get(posicion);
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstFactura.size();

        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            retorno += "ID factura: " + this.lstFactura.get(i).getIdFactura() + "\n"
                    + "Hotel " + this.lstFactura.get(i).getHotel().getNombreHotel() + "\n"
                    + "Nombre del cajero: " + this.lstFactura.get(i).getCajero().getCajero().getpNombre() + " " + this.lstFactura.get(i).getCajero().getCajero().getpApellido() + "\n"
                    + "Fecha de pago " + this.lstFactura.get(i).getFechaPAgo() + "\n";

        }
        return retorno;
    }

    /**
     * @autor Amilcar Rodriguez
     * @since 6/10/2019
     * @return retorna un String que contiene todos los datos de una factura
     */
    public String generarFactura() {
        int posicion;
        posicion = this.lstFactura.size() - 1;
        Factura objFactura = this.lstFactura.get(posicion);

        String retorno = "";
        String lista = "ID producto\t " + "Nombre producto\t    " + "Cantidad\t   " + "Fecha vencimiento\t  " + "Precio unitario\t    " + "Costo total\n";
        int tamanio;
        tamanio = objFactura.getCajero().getListaProductos().lstListaProductos.size();
        for (int i = 0; i < tamanio; i++) {
            lista = lista
                    + objFactura.getCajero().getListaProductos().lstListaProductos.get(i).getProducto().getIdProducto() + "\t     "
                    + objFactura.getCajero().getListaProductos().lstListaProductos.get(i).getProducto().getNombreProducto() + "\t     "
                    + objFactura.getCajero().getListaProductos().lstListaProductos.get(i).getCantidad() + "\t     "
                    + objFactura.getCajero().getListaProductos().lstListaProductos.get(i).getProducto().getFechaVencimiento() + "\t       "
                    + objFactura.getCajero().getListaProductos().lstListaProductos.get(i).getProducto().getPrecioVenta() + "\t        "
                    + objFactura.getCajero().getListaProductos().lstListaProductos.get(i).getCostoProducto() + "\n        ";

        }
        retorno = "ID factura: " + objFactura.getIdFactura() + "\n"
                + "*** " + objFactura.getHotel().getNombreHotel() + " ***\n"
                + "Direccion: " + objFactura.getHotel().getDireccionHotel() + "\n"
                + "Telefono: " + objFactura.getHotel().getNumTelefono() + "\n"
                + "Correo electronico: " + objFactura.getHotel().getCorreo() + "\n"
                + "RTN :" + objFactura.getHotel().getRtn() + "\n"
                + "***************************************************************\n"
                + "\n"
                + "Fecha: " + objFactura.getFechaPAgo() + "\n"
                + "\n"
                + "Nombre de cajero: " + objFactura.getCajero().getCajero().getpNombre() + " " + objFactura.getCajero().getCajero().getpApellido() + "\n"
                + "\n"
                + "Tipo de pago: " + objFactura.getCajero().getFormaPago() + "\n"
                + "**********************************************************************\n"
                + "\n"
                + lista + "\n"
                + "************************************************************************\n"
                + "Total a pagar: " + objFactura.getCajero().getTotalPago() + "\n"
                + "Pago en efectivo: " + objFactura.getCajero().getEfectivo() + "\n"
                + "Cambio: " + objFactura.getCajero().getCambio() + "\t";
        return retorno;

    }

    /**
     * @autor Amilcar Rodriguez
     * @since 6/10/2019
     * @return retorna un String que contiene todos los datos de una factura de reservas
     */
    public String generarFacturaReserva() {
        int posicion;
        posicion = this.lstFactura.size() - 1;
        Factura objFactura = this.lstFactura.get(posicion);

        String retorno = "";
        String lista = "ID Reserva\t " + "Nombre del cliente\t    " + "Num. Identidad\t   " + "Fecha Reserva\t  " + "Fecha ingreso\t    " + "Fecha egreso\t    " + "Tipo de habitacion\t" + "Costo estadia\n";
        int tamanio;
        lista = lista
                + objFactura.getCajero().getRsv().getIdReserva() + "\t"
                + objFactura.getCajero().getRsv().getNombre() + " " + objFactura.getCajero().getRsv().getApellido() + "\t     "
                + objFactura.getCajero().getRsv().getNumIdentidad() + "\t     "
                + objFactura.getCajero().getRsv().getFechaReserva() + "\t       "
                + objFactura.getCajero().getRsv().getFechaIngreso() + "\t       "
                + objFactura.getCajero().getRsv().getFechaEgreso() + "\t       "
                + objFactura.getCajero().getRsv().getDatosHabitacion().getCategoria().getNombreCategoria() + "\t       "
                + objFactura.getCajero().getRsv().getPrecioEstadia() + "\n";

        retorno = "ID factura: " + objFactura.getIdFactura() + "\n"
                + "*** " + objFactura.getHotel().getNombreHotel() + " ***\n"
                + "Direccion: " + objFactura.getHotel().getDireccionHotel() + "\n"
                + "Telefono: " + objFactura.getHotel().getNumTelefono() + "\n"
                + "Correo electronico: " + objFactura.getHotel().getCorreo() + "\n"
                + "RTN :" + objFactura.getHotel().getRtn() + "\n"
                + "***************************************************************\n"
                + "\n"
                + "Fecha: " + objFactura.getFechaPAgo() + "\n"
                + "\n"
                + "Nombre de cajero: " + objFactura.getCajero().getCajero().getpNombre() + " " + objFactura.getCajero().getCajero().getpApellido() + "\n"
                + "\n"
                + "Tipo de pago: " + objFactura.getCajero().getFormaPago() + "\n"
                + "**********************************************************************\n"
                + "\n"
                + lista + "\n"
                + "************************************************************************\n"
                + "Total a pagar: " + objFactura.getCajero().getTotalPago() + "\n"
                + "Pago en efectivo: " + objFactura.getCajero().getEfectivo() + "\n"
                + "Cambio: " + objFactura.getCajero().getCambio() + "\t";
        return retorno;
    }
}
