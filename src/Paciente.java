
public class Paciente {
	
	String dni;
	int numSegSoc;
	String nombre;
	String apellido;
	int telefono;
	String dolencia;
	
	public Paciente(String dni, int numSegSoc, String nombre, String apellido, int telefono, String dolencia) {
		
		this.dni = dni;
		this.numSegSoc = numSegSoc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.dolencia = dolencia;
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumSegSoc() {
		return numSegSoc;
	}

	public void setNumSegSoc(int numSegSoc) {
		this.numSegSoc = numSegSoc;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDolencia() {
		return dolencia;
	}

	public void setDolencia(String dolencia) {
		this.dolencia = dolencia;
	}
}
