import java.util.ArrayList;
import java.util.Iterator;

public class ListaMedicos {
	
	private ArrayList<Medico> medicos;

	public ListaMedicos() {
		
		medicos = new ArrayList<Medico>();
		
	}
	
	public void addMedico(Medico medico) {
		
		medicos.add(medico);
		
	}
	
	public void print() {
		
		Iterator<Medico> it = medicos.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next().toString());
			
		}
		
	}
	
	public void borrarPorDni(String dni) {
		
		for (int i = 0; i < medicos.size(); i++) {
			
			Medico c = medicos.get(i);
			String dniC = c.getDni();
			
			if (dniC.equals(dni)) {
				
				medicos.remove(i);
				
			}
			
		}
		
	}
	
	public boolean existeMedico(String dni) {

		boolean b = false;
		
		for (int i = 0; i < medicos.size(); i++) {
			
			Medico c = medicos.get(i);
			String dniC = c.getDni();
			
			if (dniC.equals(dni)) {
				
				b = true;
				break;
				
			}
			
		}

		return b;
		
	}
	
	public String atenderPaciente(Paciente p) {
		
		for (int i = 0; i < medicos.size(); i++) {
			
			Medico m = medicos.get(i);
			String especialidad = m.getEspecialidad();
			
			if (especialidad.contentEquals(p.getDolencia())) {
				
				ArrayList<Paciente> ap = m.getListaPacientes();
				ap.add(p);
				m.setListaPacientes(ap);
				
				borrarPorDni(m.getDni());
				addMedico(m);
				return m.toString();
				
			}
			
		}
		
		return "false";
		
	}
	
	public void listarTodosLosPacientes() {
		
		for (int i = 0; i < medicos.size(); i++) {
			
			Medico m = medicos.get(i);
			ArrayList<Paciente> pm = m.getListaPacientes();
			Iterator<Paciente> itp = pm.iterator();
			
			while(itp.hasNext()) {
				
				System.out.println(itp.next().toString());
				
			}
			
		}
		
	}
	
	public void listarPacientesPorDniMedico(String dni) {
		
		for (int i = 0; i < medicos.size(); i++) {
			
			Medico m = medicos.get(i);
			String dnic = m.getDni();
			
			if (dnic.equals(dni)) {
				
				ArrayList<Paciente> pm = m.getListaPacientes();
				Iterator<Paciente> itp = pm.iterator();
				
				while(itp.hasNext()) {
					
					System.out.println(itp.next().toString());
					
				}
				
			}
			
		}
		
	}
	
	public void listarMedicosPorEspecialidad() {
		
		
		
	}
	
	public int count() {
		
		return medicos.size();
		
	}
	
	public int numpac() {
		
		int suma = 0;
			
			for (int i = 0; i < medicos.size(); i++) {
				
				Medico m = medicos.get(i);
				
				ArrayList<Paciente> pm = m.getListaPacientes();
				
				suma = suma + pm.size();
				
			}
		
		return suma;
		
	}
	
}
