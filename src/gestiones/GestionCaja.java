package gestiones;

import java.util.LinkedList;
import clases.Caja;
import gui.PantallaPrincipal;
import java.io.Serializable;

public class GestionCaja implements Serializable {

    public LinkedList<Caja> lstCaja = new LinkedList<>();

    public GestionCaja() {
        // TODO Auto-generated constructor stub
    }
    //1. Metodo para agregar nuevo registro de caja.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param objCaja
     * @return retorna true en caso de que se agregue correctamente el objeto.
     */
    public boolean agregarCaja(Caja objCaja) {
        GestionListaProductos lista = new GestionListaProductos();
        if (objCaja.getRsv() == null) {
            lista = PantallaPrincipal.gLstProductos;
            objCaja.setListaProductos(lista);
        }else{
            objCaja.setListaProductos(null);
        }

        this.lstCaja.add(objCaja);
        return true;
    }

    //2.	Metodo para modificar obj.
    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param objCaja recibe el objeto a modificar.
     * @param posicion recibe la posicion donde se encuentra el objeto.
     * @return retorna true en caso de que se modifique correctamente el objeto.
     */
    public boolean modificarCaja(Caja objCaja, int posicion) {
        this.lstCaja.set(posicion, objCaja);
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
    public boolean eliminarCaja(int posicion) {
        this.lstCaja.remove(posicion);
        return true;
    }
    // 5 Metodo para mostrar todos los elementos en la lista.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019 Este metodo muestra en pantalla todos los elementos
     * agregados en la lista.
     */
    public void imprimir() {
        System.out.println(this.lstCaja);
    }
    //6 Metodo que retorna un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 29Julio2019
     * @param posicion
     * @return retorna un objeto Caja segun su ubicacion.
     */
    public Caja getObjCaja(int posicion) {
        return this.lstCaja.get(posicion);
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstCaja.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            retorno += "Nombre del cajero " + this.lstCaja.get(i).getCajero().getpNombre() + "\n"
                    + "Forma de pago: " + this.lstCaja.get(i).getFormaPago() + "\n"
                    + "Efectivo " + this.lstCaja.get(i).getEfectivo() + "\n"
                    + "Cambio :" + this.lstCaja.get(i).getCambio() + "\n"
                    + "Total: " + this.lstCaja.get(i).getTotalPago();
        }
        return retorno;
    }

}
