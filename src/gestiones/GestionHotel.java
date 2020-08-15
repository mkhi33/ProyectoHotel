package gestiones;

import java.util.LinkedList;
import clases.Hotel;
import java.io.Serializable;

public class GestionHotel implements Serializable {

    private LinkedList<Hotel> lstHotel = new LinkedList<>();

    public GestionHotel() {

    }
    //1. metodo para registrar Hotel.

    /**
     * @author Amilcar Rodriguez
     * @param hotelAgregado
     * @since 24Julio2019
     * @return retorna true si se agrega correctamente.
     */
    public boolean agregarHotel(Hotel hotelAgregado) {
        this.lstHotel.add(hotelAgregado);
        return true;

    }
    //2. Metodo para buscar por nombre la  posicion en LinkedList del objeto Hotel, nos servira para modificar objeto Hotel.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param nombreHotel
     * @return retorna la posicion del objeto en la lista.
     */
    public int buscarHotel(String nombreHotel) {
        int posicion = -1, tamanioLista;
        tamanioLista = lstHotel.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstHotel.get(i).getNombreHotel().equals(nombreHotel)) {
                posicion = i;
            }
        }
        return posicion;
    }
    //3. Metodo que retorna un objeto hotel

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return retorna un objrto hotel.
     */
    public Hotel objHotel(int posicion) {
        return this.lstHotel.get(posicion);
    }

    //4. metodo para modificar Hotel
    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param objHotel
     * @param posicion
     * @return
     */
    public boolean modificarHotel(Hotel objHotel, int posicion) {
        this.lstHotel.set(posicion, objHotel);
        return true;
    }
    //5.Metodo para mostrar Hotel registrados.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @return no retorna nada.
     */
    public void imprimirLista() {
        System.out.println(this.lstHotel);
    }

    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstHotel.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][5];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstHotel.get(i).getNombreHotel();
            array[i][1] = this.lstHotel.get(i).getDireccionHotel();
            array[i][2] = this.lstHotel.get(i).getRtn();
            array[i][3] = this.lstHotel.get(i).getNumTelefono();
            array[i][4] = this.lstHotel.get(i).getCorreo();
        }
        return array;
    }

    public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstHotel.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Nombre del Hotel : " + this.lstHotel.get(i).getNombreHotel()+ "\n"
                    + "Direccion del Hotel " + this.lstHotel.get(i).getDireccionHotel()+ "\n"
                    + "RTN: " + this.lstHotel.get(i).getRtn()+ "\n"
                    + "Correo electronico: " + this.lstHotel.get(i).getCorreo() + "\n"
                    + "Numero de telefono:  " + this.lstHotel.get(i).getNumTelefono()+ "\n";
 

        }
        return retorno;
    }

}
