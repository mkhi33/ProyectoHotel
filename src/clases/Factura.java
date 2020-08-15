package clases;

import java.util.Date;

import java.io.Serializable;


public class Factura implements Serializable{
	private Hotel hotel;
	private int idFactura;
	private Caja cajero;
	private Date fechaPAgo;
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public Caja getCajero() {
		return cajero;
	}
	public void setCajero(Caja cajero) {
		this.cajero = cajero;
	}
	public Date getFechaPAgo() {
		return fechaPAgo;
	}
	public void setFechaPAgo(Date fechaPAgo) {
		this.fechaPAgo = fechaPAgo;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	@Override
	public String toString() {
		return "Factura [hotel=" + hotel + ", idFactura=" + idFactura + ", cajero=" + cajero + ", fechaPAgo="
				+ fechaPAgo + "]";
	}
	
	
	
}
