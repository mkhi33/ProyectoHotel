package clases;
import java.io.Serializable;
public class Proveedor extends Persona implements Serializable{
	private int idProveedor;

	public Proveedor() {
		// TODO Auto-generated constructor stub
	}
	


	public int getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}



	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + "]";
	}


	

}
