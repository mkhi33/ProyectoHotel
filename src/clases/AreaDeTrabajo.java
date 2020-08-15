package clases;
import java.io.Serializable;
public class AreaDeTrabajo implements Serializable{
	private	int idArea;
	private String Descripcionarea;
	

	public AreaDeTrabajo() {
		// TODO Auto-generated constructor stub
	}


	public int getIdArea() {
		return idArea;
	}


	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}


	public String getDescripcionarea() {
		return Descripcionarea;
	}


	public void setDescripcionarea(String descripcionarea) {
		Descripcionarea = descripcionarea;
	}


	@Override
	public String toString() {
		return "AreaDeTrabajo [idArea=" + idArea + ", Descripcionarea=" + Descripcionarea + "]";
	}

}
