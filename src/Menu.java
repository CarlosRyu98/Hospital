import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ListaMedicos medicos = new ListaMedicos();
		ListaPacientes pacientes = new ListaPacientes();
		ListaPacientes pacientesNoAtendidos = new ListaPacientes();
		
		HashMap<Integer, Hospital> hospitals = new HashMap<Integer, Hospital>();
		
		System.out.println("Bienvenido a Empresa.");
		System.out.println("En este momento disponemos de  hospitales donde atenderle.");
		for (int i = 0; i < hospitals.size(); i++) {
			
			System.out.println(i + "- " + hospitals.get().getNombre());
			
		}
		System.out.println("8- Nuevo Hospital.");
		System.out.println("9- Borrar Hospital.");
		System.out.println("Elija el hospital que quiere gestionar.");
		
		int oph = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Bienvenido al Hospital");
		System.out.println("Actualmente tenemos "+medicos.count()+" doctores y "+medicos.numpac()+" pacientes satisfechos.");
		System.out.println("Para más información utilice las siguientes opciones:");
			
		System.out.println("1- Dar de alta un paciente.");
		System.out.println("2- Dar de alta un médico.");
		System.out.println("3- Modificar paciente.");
		System.out.println("4- Modificar médico.");
		System.out.println("5- Listar pacientes.");
		System.out.println("6- Listar médicos.");
		System.out.println("7- Dar de baja un médico.");
		System.out.println("8- Atender a un paciente.");
		System.out.println("9- Especialidades de nuestro hospital [info].");
		System.out.println("10- Nueva especialidad.");
		System.out.println("11- Salir.");
		System.out.println("Seleccione su opción.");
		
		int opc = Integer.parseInt(teclado.nextLine());
		
		switch (opc) {
			
		case 1:
			
			System.out.println("Inserta el numero de la seguridad social.");
			int numSecSocial = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta el nombre.");
			String nombreP = teclado.nextLine();
			System.out.println("Inserta el apellido.");
			String apellidoP = teclado.nextLine();
			System.out.println("Inserta el dni.");
			String dniP = teclado.nextLine();
			System.out.println("Inserta el telefono.");
			int telefono = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta la dolencia.");
			String dolencia = teclado.nextLine();
			
			if (Main.especialidad.contains(dolencia)) {
			
				Paciente p = new Paciente(dniP, numSecSocial, nombreP, apellidoP, telefono, dolencia);
				pacientes.addPaciente(p);
			
			} else {
				
				System.out.println("El paciente no puede ser atendido en este hospital.");
				
			}
			
			break;
			
		case 2:
			
			System.out.println("Inserta el nombre.");
			String nombreM = teclado.nextLine();
			System.out.println("Inserta el apellido.");
			String apellidoM = teclado.nextLine();
			System.out.println("Inserta el dni.");
			String dniM = teclado.nextLine();
			System.out.println("Inserta la especialidad.");
			String especialidad = teclado.nextLine();
			
			if (Main.especialidad.contains(especialidad)) {
			
				Medico m = new Medico(dniM, nombreM, apellidoM, especialidad);
				medicos.addMedico(m);
			
			} else {
				
				System.out.println("No tenemos licencia para la especialidad.");
			}
			
			break;
			
		case 3:
			
			System.out.println("Inserta el dni del paciente a modificar.");
			String dniPM = teclado.nextLine();
			
			System.out.println("Inserta el numero de la seguridad social.");
			int numSecSocialM = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta el nombre.");
			String nombrePM = teclado.nextLine();
			System.out.println("Inserta el apellido.");
			String apellidoPM = teclado.nextLine();
			System.out.println("Inserta el telefono.");
			int telefonoM = Integer.parseInt(teclado.nextLine());
			System.out.println("Inserta la dolencia.");
			String dolenciaM = teclado.nextLine();
			
			if (Main.especialidad.contains(dolenciaM)) {
				
				Paciente pm = new Paciente(dniPM, numSecSocialM, nombrePM, apellidoPM, telefonoM, dolenciaM);
				pacientes.addPaciente(pm);
			
			} else {
				
				System.out.println("El paciente no puede ser atendido en este hospital.");
				
			}
			
			break;
			
		case 4:
			
			System.out.println("Inserta el dni del médico a modificar.");
			String dniMM = teclado.nextLine();
			
			if (medicos.existeMedico(dniMM)) {
				
				medicos.borrarPorDni(dniMM);
				
				System.out.println("Inserta el nombre.");
				String nombreMM = teclado.nextLine();
				System.out.println("Inserta el apellido.");
				String apellidoMM = teclado.nextLine();
				System.out.println("Inserta la especialidad.");
				String especialidadM = teclado.nextLine();
				
				if (Main.especialidad.contains(especialidadM)) {
					
					Medico m = new Medico(dniMM, nombreMM, apellidoMM, especialidadM);
					medicos.addMedico(m);
				
				} else {
					
					System.out.println("No tenemos licencia para la especialidad.");
				}
				
			} else {
				
				System.out.println("El médico no pertenece a nuestro hospital.");
				
			}
			
			break;
			
		case 5:
			
			System.out.println("¿Qué opción desea?");
			System.out.println("5.1- Listar todos los pacientes atendidos.");
			System.out.println("5.2- Listar pacientes atendidos por un médico en concreto.");
			System.out.println("5.3- Listar pacientes en espera.");
			System.out.println("5.4- Listar pacientes que no han podido ser atendidos.");
			
			int listp = Integer.parseInt(teclado.nextLine());
			
			switch(listp) {
			
			case 1:
				
				medicos.listarTodosLosPacientes();
				
				break;
				
			case 2:
				
				System.out.println("Inserta el dni del médico.");
				
				String dnim2 = teclado.nextLine();
				medicos.listarPacientesPorDniMedico(dnim2);
				
				break;
				
			case 3:
				
				pacientes.print();
				
				break;
				
			case 4:
				
				pacientesNoAtendidos.print();
				
				break;
			
			}
			
			break;
			
		case 6:
			
			medicos.print();
			
			break;
			
		case 7:
			
			System.out.println("Inserta el dni del médico a eliminar.");
			
			String dniMB = teclado.nextLine();
			
			medicos.borrarPorDni(dniMB);
			
			break;
			
		case 8:
			
			if(pacientes.hayPacientes()) {
				
				Paciente pSinAtender = pacientes.obtenerPrimerPaciente();
				System.out.println("Se atiende al paciente "+ pacientes.toString() + ".");
				pacientes.borrarPrimerPaciente();
			
				String pa = medicos.atenderPaciente(pSinAtender);
			
				if(pa.contentEquals("false")) {
				
					pacientesNoAtendidos.addPaciente(pSinAtender);
					System.out.println("No se puede atender al paciente.");
				
				} else {
				
					System.out.println("El paciente ha sido atendido por: " + pa + ".");
				
				}
				
			} else {
					
				System.out.println("No hay pacientes en espera.");
					
				}
			
			break;
			
		case 9:
			
			System.out.println(Main.especialidad);
			
			medicos.listarMedicosPorEspecialidad();
			
			pacientesNoAtendidos.listarEspecialidadesPorAtender();
			
			break;
			
		case 10:
			
			System.out.println("Inserta la nueva especialidad.");
			
			String espec = teclado.next();
			
			aniadirEspecialidad(espec);
			
			break;
			
		}
		
	}
	
	public static void aniadirEspecialidad(String nuevaEspecialidad) {
		
		if(!Main.especialidad.contains(nuevaEspecialidad)) {
			
			Main.especialidad.add(nuevaEspecialidad);
		}
	}
	
}
