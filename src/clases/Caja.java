package clases;
import gestiones.GestionListaProductos;
import java.io.Serializable;

public class Caja implements Serializable{

    private Empleado cajero;
    private String formaPago;
    private float efectivo;
    private float cambio;
    private float totalPago;
    private Reserva rsv;
    private GestionListaProductos listaProductos;

    public Caja() {

    }

    public Reserva getRsv() {
        return rsv;
    }

    public void setRsv(Reserva rsv) {
        this.rsv = rsv;
    }

    public GestionListaProductos getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(GestionListaProductos listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    

    public Empleado getCajero() {
        return cajero;
    }

    public void setCajero(Empleado cajero) {
        this.cajero = cajero;
    }


    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public float getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(float efectivo) {
        this.efectivo = efectivo;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }
    



    
}
