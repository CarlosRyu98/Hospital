import java.util.ArrayList;

public class Hospital {
	
	private String nombre;
	private String contrase�a;
	private ArrayList<String> especialidad = new ArrayList<String>();
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public ArrayList<String> getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(ArrayList<String> especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
