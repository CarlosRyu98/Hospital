import java.util.ArrayList;

public class Hospital {
	
	private String nombre;
	private String contraseña;
	private ArrayList<String> especialidad = new ArrayList<String>();
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public ArrayList<String> getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(ArrayList<String> especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
