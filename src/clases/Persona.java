package clases;

import java.util.Date;
import java.io.Serializable;
public abstract class Persona implements Serializable {

    private String numIden;
    private String pNombre;
    private String pApellido;
    private String numTelefono;
    private String correo;
    private Date fechaNacimiento;
    private String estadoCivil;

    public Persona() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Persona(int codigoPersona, String numIden, String pNombre, String sNombre, String pApellido, String sApellido,
            String numTelefono, String correo, Date fechaNacimiento, String estadoCivil) {
        super();
        this.numIden = numIden;
        this.pNombre = pNombre;
        this.pApellido = pApellido;
        this.numTelefono = numTelefono;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }

    public String getNumIden() {
        return numIden;
    }

    public void setNumIden(String numIden) {

        this.numIden = numIden;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        String estCivil = estadoCivil.toUpperCase();
        if (estCivil.equals("SOLTERO") || estCivil.equals("CASADO") || estCivil.equals("VIUDO")) {
            this.estadoCivil = estadoCivil;
        } else {
            throw new IllegalArgumentException("Estado civil incorrecto");
        }
        this.estadoCivil = estadoCivil;
    }

}
