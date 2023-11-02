package practica;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trabajo_Practico12 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			System.out.print("¿Que información desea validar?: \n1. Correo "
					+ "\n2. Número telefonico \n3. Fecha \n4. Codigo Postal \n5. Salir \nOpción: ");
			int number = input.nextInt();
			
			switch (number) {
				case 1: 
					validate_correo();
					break;
				case 2: 
					validate_telefono();
					break;
				case 3: 
					validate_fecha();
					break;
				case 4: 
					validate_postal();
					break;
				case 5: break;
				default : System.out.println("Opcion Invalida");
			}
			if (number == 5) break;
		}
	}
	
	public static void validate_correo() {
		System.out.print("Ingrese un correo: ");
		
		Pattern patron = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z]\\.com$");
		String correo = input.next();
		Matcher mat = patron.matcher(correo);
		
		if (mat.matches()) System.out.println("El correo es VALIDO");
		else {
			System.out.println("El correo introducido es INVALIDO "
				+ "\\n Debe tener el siguiente formato: xx@xx.com");
		}
	}
	
	public static void validate_telefono() {
		System.out.print("Ingrese un número telefonico: ");
		
		// valido que el telefono tenga 10 numeros para 261 y 9 para 15
		Pattern patron = Pattern.compile("^(261\\d{8}|15\\d{7})$");
		String telefono = input.next();
		Matcher mat = patron.matcher(telefono);
		
		if (mat.matches()) System.out.println("El telefono es VALIDO");
		else {
			System.out.println("El telefono introducido es INVALIDO "
				+ "\\n Debe comenzar con 261 + 7 digitos o 15 + 8 digitos");
		}
	}
	
	public static void validate_fecha() {
		System.out.print("Ingrese una fecha: ");
		
		// Valido que ingrese el dia como 1 o 01, mes 1 o 01 y año 1000 hasta 9999
		Pattern patron = Pattern.compile("^(\\d{1,2}[\\/-]){2}(\\d{2}|\\d{4})$");
		String fecha = input.next();
		Matcher mat = patron.matcher(fecha);
		
		if (mat.matches()) {
			boolean op = fecha.contains("/");
			String bandera = "";
			
			if (op) bandera = "/";
			else bandera = "-";
			
			String [] parts = fecha.split(bandera);
			int day = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int year = Integer.parseInt(parts[2]);
			
			if (day <= 0 || day >= 32) System.out.println("Dia invalido");
			if (month <= 0 || month <= 32) System.out.println("Dia invalido");
			if (year <= 999 || year >= 10000) System.out.println("El año debe ser mayor 999 y menor a 9999");
			
			
			System.out.println("la fecha es VALIDA");
		}
		else {
			System.out.println("la fecha introducida es INVALIDO "
				+ "\\n Debe tener el siguiente formato: x/x/xx o xx-xx-xxxx");
		}
	}
	
	public static void validate_postal() {
		System.out.print("Ingrese un codigo postal: ");
		
		// Valido que el codigo postal posea caracteres númericos y tenga una longitud de 4
		Pattern patron = Pattern.compile("^\\d{4}$");
		String postal = input.next();
		Matcher mat = patron.matcher(postal);
		
		if (mat.matches()) System.out.println("El codigo postal es VALIDO");
		else {
			System.out.println("El codigo postal es INVALIDO "
				+ "\\n Debe tener el siguiente formato: xxxx");
		}
	}

}
