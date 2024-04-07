package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// NOS PIDEN QUE PARA EL ALUMNO ARIEL VEGA SE REGISTRE LAS NOTAS DE 4 MATERIAS
		
		Alumno alumno = generarAlumno();
		
		registrarNotas(alumno);

	}

	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	public static void registrarNotas(Alumno alumno) {
		
		Scanner scanner = new Scanner(System.in);
		int numMaterias = 1;
		
		while (numMaterias <= 2) {
			//cargar materia
			System.out.println("Ingrese el codigo de la materia");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de la nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;		
		}
		scanner.close();
	}
}
