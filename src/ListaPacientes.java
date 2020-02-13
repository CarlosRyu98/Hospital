import java.util.ArrayList;
import java.util.Iterator;

public class ListaPacientes {
	
	private ArrayList<Paciente> pacientes;

	public ListaPacientes() {
		
		pacientes = new ArrayList<Paciente>();
		
	}
	
	public void addPaciente(Paciente paciente) {
		
		pacientes.add(paciente);
		
	}
	
	public void print() {
		
		Iterator<Paciente> it = pacientes.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next().toString());
			
		}
		
	}
	
	public void borrarPorDni(String dni) {
		
		for (int i = 0; i < pacientes.size(); i++) {
			
			Paciente c = pacientes.get(i);
			String dniC = c.getDni();
			
			if (dniC.equals(dni)) {
				
				pacientes.remove(i);
				
			}
			
		}
		
	}
	
	public void borrarPrimerPaciente() {
		
		if(pacientes.size() > 0) {
			
			pacientes.remove(0);
			
		}
		
	}
	
	public Paciente obtenerPrimerPaciente() {
		
		return pacientes.get(0);
		
	}
	
	public boolean existePaciente(String dni) {

		boolean b = false;
		
		for (int i = 0; i < pacientes.size(); i++) {
			
			Paciente c = pacientes.get(i);
			String dniC = c.getDni();
			
			if (dniC.equals(dni)) {
				
				b = true;
				break;
				
			}
			
		}

		return b;
		
	}
	
	public boolean hayPacientes() {
		
		return pacientes.size() > 0;
		
	}
	
	public void listarEspecialidadesPorAtender() {
		
		ArrayList<String> dolenciasSinAtender = new ArrayList<String>();
		
		for (int i = 0; i < pacientes.size(); i++) {
			
			Paciente c = pacientes.get(i);
			
			if (!dolenciasSinAtender.contains(c.getDolencia())) {
				
				System.out.println(c.getDolencia());
				
				dolenciasSinAtender.add(c.getDolencia());
				
			}
			
		}
		
	}
	
	
}
