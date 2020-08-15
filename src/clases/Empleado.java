package clases;

import java.util.Date;
import java.io.Serializable;

public class Empleado extends Persona implements Serializable{
	private Date fechaInicioLaboral;
	private int idEmpleado;
	private double sueldo;
	private AreaDeTrabajo area;
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(int codigoPersona, String numIden, String pNombre, String sNombre, String pApellido, String sApellido,
			String numTelefono, String correo, Date fechaNacimiento, String estadoCivil,int idEmpleado, float salario, AreaDeTrabajo areaTrabajo, Date fechaInicioTrabajar) {
		super(codigoPersona, numIden, pNombre, sNombre, pApellido, sApellido, numTelefono, correo, fechaNacimiento,
				estadoCivil);
		this.area = areaTrabajo;
		this.idEmpleado = idEmpleado;
		this.sueldo = salario;
		this.fechaInicioLaboral = fechaInicioTrabajar;
		
		// TODO Auto-generated constructor stub
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public AreaDeTrabajo getArea() {
		return area;
	}
	public void setArea(AreaDeTrabajo area) {
		this.area = area;
	}
	public Date getFechaInicioLaboral() {
		return fechaInicioLaboral;
	}
	public void setFechaInicioLaboral(Date fechaInicioLaboral) {
		this.fechaInicioLaboral = fechaInicioLaboral;
	}



}
