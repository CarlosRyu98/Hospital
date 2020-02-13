import java.util.ArrayList;

public class Medico {
	
	String dni;
	String nombre;
	String apellido;
	String especialidad;
	private ArrayList<Paciente> listaPacientes;
	
	public Medico(String dni, String nombre, String apellido, String especialidad) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.listaPacientes = new ArrayList<Paciente>();
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public String toString() {
		return "Medico [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
				+ ", listaPacientes=" + listaPacientes + "]";
	}


	

}
