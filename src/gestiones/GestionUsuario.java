package gestiones;
import java.util.LinkedList;
import clases.Usuario;
import java.io.Serializable;

public class GestionUsuario implements Serializable{
	private LinkedList <Usuario> lstUsuario = new LinkedList<>();

	public GestionUsuario() {
		// TODO Auto-generated constructor stub
	}
	//1. Metodo para agregar nuevo usuario.
	/**
	 * @author Amilcar Rodriguez
	 * @since 29Julio2019
	 * @param objUsuario
	 * @return retorna true en caso de que se agregue correctamente el  objeto.
	 */
	public boolean agregarUSuario(Usuario objUsuario) {
		 this.lstUsuario.add(objUsuario);
		 return true;
	}
	
	//2.	Metodo para modificar obj.
	/**
	 * @author Amilcar Rodriguez
	 * @since 29Julio2019
	 * @param objUsuario recibe el objeto a modificar.
	 * @param posicion recibe la posicion donde se encuentra el objeto.
	 * @return retorna true en caso de que se modifique correctamente el objeto.
	 */
	public boolean modificarUsuario(Usuario objUsuario, int posicion) {
		this.lstUsuario.set(posicion, objUsuario);
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
	public int buscarPorCorreo(String correo) {
		int posicion = -1;
		int tamanioLista;
		tamanioLista = this.lstUsuario.size();
		for(int i = 0; i < tamanioLista; i++) {
			if(this.lstUsuario.get(i).getEmail().equals(correo)) {
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
		 * @return retorna true en caso de que se haya eliminado correctamente el objeto.
		 */
		public boolean eliminarUsuario(int posicion) {
			this.lstUsuario.remove(posicion);
			return true;
		}
		// 5 Metodo para mostrar todos los elementos en la lista.
		/**
		 * @author Amilcar Rodriguez
		 * @since 29Julio2019
		 *  Este metodo muestra en pantalla todos los elementos agregados en la lista.
		 */
		public void imprimir() {
			System.out.println(this.lstUsuario);
		}
		//6 Metodo que retorna un objeto.
		/**
		 * @author Amilcar Rodriguez
		 * @since 29Julio2019
		 * @param posicion
		 * @return retorna un objeto Factura segun su ubicacion.
		 */
		public Usuario getUsuario(int posicion) {
			return this.lstUsuario.get(posicion);
		}
	

}
