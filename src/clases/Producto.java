package clases;

import java.util.Date;
import java.io.Serializable;
public class Producto implements Serializable{
	private int idProducto;
	private String nombreProducto;
	private String descripcionProducto;
	private String uMedida;
	private int existencia;
	private Proveedor provedor;
	private float precioVenta;
	private Date fechaVencimiento;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public String getuMedida() {
		return uMedida;
	}

	public void setuMedida(String uMedida) {
		this.uMedida = uMedida;
	}

	public Proveedor getProvedor() {
		return provedor;
	}

	public void setProvedor(Proveedor provedor) {
		this.provedor = provedor;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcionProducto="
				+ descripcionProducto + ", uMedida=" + uMedida + ", existencia=" + existencia + ", provedor=" + provedor
				+ ", precioVenta=" + precioVenta + ", fechaVencimiento=" + fechaVencimiento + "]";
	}


	


	
	

}
