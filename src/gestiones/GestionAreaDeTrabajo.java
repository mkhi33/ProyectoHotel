package gestiones;

import java.util.LinkedList;
import clases.AreaDeTrabajo;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionAreaDeTrabajo implements Serializable {

    private LinkedList<AreaDeTrabajo> lstAreaDeTrabajo = new LinkedList<>();

    public GestionAreaDeTrabajo() {

    }

    //1 	Metodo para agregar area de trabajo.
    /**
     *
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param objArea
     * @return true en caso de que se ha agregado correctamente.
     */
    public boolean agregarArea(AreaDeTrabajo objArea) {
        int id = this.AsignarId();
        objArea.setIdArea(id);
        this.lstAreaDeTrabajo.add(objArea);
        return true;
    }
    //2.	metodos para buscar area de trabajo.
    //2.1 Por nombre.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param nombre
     * @return retorna la posicion del objeto que busca.
     */
    public int buscarAreaPornombre(String nombre) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstAreaDeTrabajo.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstAreaDeTrabajo.get(i).getDescripcionarea().equalsIgnoreCase(nombre)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    //2.2 por id.

    /**
     * @author Amilcar Rodriguez.
     * @since 24Julio2019
     * @param idBuscar
     * @return retorna la posicion del objeto.
     */
    public int buscarAreaPorId(int idBuscar) {
        int posicion = -1;
        int tamanioLista;
        tamanioLista = this.lstAreaDeTrabajo.size();
        for (int i = 0; i < tamanioLista; i++) {
            if (this.lstAreaDeTrabajo.get(i).getIdArea() == idBuscar) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    //3. metodo para modificar objeto segun su posicion.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param objArea
     * @param posicion
     * @return retorna true en caso de que se modifico correctamente.
     *
     */
    public boolean modificarArea(AreaDeTrabajo objArea, int posicion) {

        this.lstAreaDeTrabajo.set(posicion, objArea);
        return true;
    }

    //4. Metodo para eliminar objeto.
    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return retorna true en caso de que se elimine correctamente.
     */
    public boolean eliminarArea(int posicion) {
        this.lstAreaDeTrabajo.remove(posicion);
        return true;
    }
    // 5. Metodo para que retorne un objeto.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @param posicion
     * @return
     */
    public AreaDeTrabajo objArea(int posicion) {
        return this.lstAreaDeTrabajo.get(posicion);

    }
    //6. Metodo para mostrar todas las areas de empleado.

    /**
     * @author Amilcar Rodriguez
     * @since 24Julio2019
     * @return no retorna nada muestra en pantalla todos los objetos tipo area
     * de trabajo agregados en la lista.
     */
    public void imprimir() {
        System.out.println("lstAreaDeTrabajo");
    }

    /**
     * @autor Amilcar Rodriguez
     * @since 28/9/2019
     * @return retorna una asignacion para el ID
     */
    public int AsignarId() {
        int tamanioLista = this.lstAreaDeTrabajo.size();
        int id=0;
        for (int i = 0; i < tamanioLista; i++) {
            id = i+1;
            if(id == this.lstAreaDeTrabajo.get(i).getIdArea()){
                id = id +1;
            }
        }
        return id;
    }

    /*
    Este metodo retorna un modelo para la tabla que muestra las listas
    
     */
    public Object[][] getArrayGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstAreaDeTrabajo.size();//tamanio de la lista
        Object[][] array = new Object[tamanioLista][2];
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            array[i][0] = this.lstAreaDeTrabajo.get(i).getIdArea();
            array[i][1] = this.lstAreaDeTrabajo.get(i).getDescripcionarea();

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
        tamanioLista = this.lstAreaDeTrabajo.size();//tamanio de la lista
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista
            modelo.addElement(this.lstAreaDeTrabajo.get(i).getDescripcionarea());
        }
        return modelo;
    }

    /*
    @Autor Amilcar Rodriguez
    @since 28/9/2019
    @return retorna un objeto
     */
    public AreaDeTrabajo getObj(int posicion) {
        return this.lstAreaDeTrabajo.get(posicion);
    }
    
    
             public String getInformacionGestion(){
                int i, tamanioLista;
                tamanioLista=this.lstAreaDeTrabajo.size();//tamanio de la lista
		String retorno="";
		for(i=0;i<tamanioLista;i++) { //Iniciar un ciclo para recorrer toda la lista
			retorno+= "ID AREA : "+this.lstAreaDeTrabajo.get(i).getIdArea()+"\n"+
                                " Descripcion: "+this.lstAreaDeTrabajo.get(i).getDescripcionarea()+"\n";  
                                 
		}
                return retorno;
        }
    
    
}
