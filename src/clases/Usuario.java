package clases;
 import java.io.Serializable;
public class Usuario implements Serializable{
	private String pNombre;
	private String sNombre;
	private String pApellido;
	private String sApellido;
	private String email;
	private String contrasenia;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "pNombre=" + pNombre + ", sNombre=" + sNombre + ", pApellido=" + pApellido + ", sApellido=" + sApellido + ", email=" + email + ", contrasenia=" + contrasenia + '}';
    }
        
}     