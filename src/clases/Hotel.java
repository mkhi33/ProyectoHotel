package clases;
import java.io.Serializable;
public class Hotel implements Serializable{
	
	private String nombreHotel;
	private String direccionHotel;
	private String rtn;
	private String numTelefono;
	private String correo;
	
	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Hotel() {
		
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getDireccionHotel() {
		return direccionHotel;
	}

	public void setDireccionHotel(String direccionHotel) {
		this.direccionHotel = direccionHotel;
	}

	public String getRtn() {
		return rtn;
	}

	public void setRtn(String rtn) {
		this.rtn = rtn;
	}

	
}
