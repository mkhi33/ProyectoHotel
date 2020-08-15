package clases;

import java.util.Date;

import utilitario.AdminFechas;
import java.io.Serializable;
import java.util.LinkedList;

public class Reserva implements Serializable {

    private int idReserva;
    private String nombre, apellido, correo, telefono, numIdentidad;
    private Habitacion datosHabitacion;
    private Empleado datosEmpleadoEncargado;
    private int numHuesped;
    private Date fechaReserva;
    private Date fechaIngreso;
    private Date fechaEgreso;
    private double precioEstadia;

    
    final public double impustos = 0.13;

    public Reserva() {
        // TODO Auto-generated constructor stub
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumIdentidad() {
        return numIdentidad;
    }

    public void setNumIdentidad(String numIdentidad) {
        this.numIdentidad = numIdentidad;
    }

    public Habitacion getDatosHabitacion() {
        return datosHabitacion;
    }

    public void setDatosHabitacion(Habitacion datosHabitacion) {
        this.datosHabitacion = datosHabitacion;
    }

    public Empleado getDatosEmpleadoEncargado() {
        return datosEmpleadoEncargado;
    }

    public void setDatosEmpleadoEncargado(Empleado datosEmpleadoEncargado) {
        this.datosEmpleadoEncargado = datosEmpleadoEncargado;
    }

    public int getNumHuesped() {
        return numHuesped;
    }

    public void setNumHuesped(int numHuesped) {
        this.numHuesped = numHuesped;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public double getPrecioEstadia() {
        return precioEstadia;
    }

    public void setPrecioEstadia(double precioEstadia) {
        this.precioEstadia = precioEstadia;
    }

}
