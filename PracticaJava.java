package poo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PracticaJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, numb_2, number_2;
		
		// Ejercicio 16
		
		String months[] = {
				"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", 
				"Diciembre"
		};
		
		System.out.print("Ingrese el nro del mes: ");
		int month = input.nextInt();
		
		if(month <= 0 || month >= 13) 
			System.out.println("Número de mes invalido");
		else {
			if(month == 2)
				System.out.println("El mes " + months[month - 1] +  " tiene 28 dias");
			else if((month % 2 == 0) && (month <= 7)) 
				System.out.println("El mes " + months[month - 1] +  " tiene 30 dias");
			else if((month % 2 != 0) && (month <= 7))
				System.out.println("El mes " + months[month - 1] +  " tiene 31 dias");
			else if ((month % 2 == 0) && (month > 7))
				System.out.println("El mes " + months[month - 1] +  " tiene 31 dias");
			else
				System.out.println("El mes " + months[month - 1] +  " tiene 30 dias");
		}
		
		// Ejercicio 17
		
		System.out.print("Ingrese calificación: ");
		int nota = input.nextInt();

		if(nota < 0 || nota > 10)
			System.out.println("Calificación invalida");
		else {
			if(nota >= 0 && nota < 5)
				System.out.println("Calificación: Insuficiente");
			else if(nota >= 5 && nota < 6) 
				System.out.println("Calificación: Suficiente");
			else if(nota >= 6 && nota < 7)
				System.out.println("Calificación: Bien");
			else if (nota >= 7 && nota < 9)
				System.out.println("Calificación: Notable");
			else
				System.out.println("Calificación: Sobresaliente");
		}
		
		// Ejercicio 18
		number = 0;
		
		while(number <= 99) {
			number += 1;
			System.out.println(number);
		}
		
		// Ejercicio 19
		number = 1;
		
		do {
			System.out.println(number);
			number += 1;
		}
		while(number <= 100);
		
		// Ejercicio 20
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		// Ejercicio 21
		number = 100;
		
		while(number >= 1) {
			System.out.println(number);
			number -= 1;
		}
		
		// Ejercicio 22
		number = 100;
		
		do {
			System.out.println(number);
			number -= 1;
		}
		while(number >= 1);
		
		// Ejercicio 23
		for (int i = 100; i <= 1; i--) {
			System.out.println(i);
		}
		
		
		// Ejercicio 24
		System.out.println("Ingrese un número mayor a 1: ");
		number = input.nextInt();
		numb_2 = 1;
		
		if(number <= 1) {
			System.out.println("Número invalido");
		}else {
			for (int i = 1; i <= number; i++) {
				System.out.println(i);
			}
			
			while(numb_2 <= number) {
				System.out.println(numb_2);
				numb_2 += 1;
			}
			
			numb_2 = 1;
			
			do {
				System.out.println(numb_2);
				numb_2 += 1;
			}
			while(numb_2 <= number);
		}
		
		// Ejercicio 25
		
		System.out.print("Ingrese un número mayor a 1: ");
		number = input.nextInt();
		
		if(number <= 1) {
			System.out.println("Número invalido");
		}else {
			for (int i = number; i >= 1; i--) {
				System.out.println(i);
			}
			
			numb_2 = number;
			
			
			while(numb_2 >= 1) {
				System.out.println(numb_2);
				numb_2 -= 1;
			}
			
			numb_2 = number;
			
			do {
				System.out.println(numb_2);
				numb_2 -= 1;
			}
			while(numb_2 >= 1);
		}
		
		
		// Ejercicio 26
		
		while (true) {
			System.out.print("Ingrese un número: ");
			number = input.nextInt();
			
			System.out.print("Ingrese otro número: ");
			number_2 = input.nextInt();
			
			if(number == number_2) 
				System.out.println("Los números ingresados son iguales");
			else {
				if(number_2 > number) {
					int aux = number;
					number = number_2;
					number_2 = aux;
				}
				
				for (int i = number_2; i <= number; i++) {
					System.out.println(i);
				}
				break;
			}
		}
		
		
		// Ejercicio 27
		
		while (true) {
			System.out.print("Ingrese un número a: ");
			number = input.nextInt();
			
			System.out.print("Ingrese otro número b: ");
			number_2 = input.nextInt();
			
			if(number >= number_2) 
				System.out.println("El número 'a' debe ser menor que 'b'");
			else {
				
				for (int i = number; i <= number_2; i+= 2) {
					System.out.println(i);
				}
				break;
			}
		}
		
		// Ejercicio 28
		
		while (true) {
			System.out.print("Ingrese un número n: ");
			number = input.nextInt();
			
			System.out.print("Ingrese otro número m: ");
			number_2 = input.nextInt();
			
			if(number >= number_2) 
				System.out.println("El número 'n' debe ser menor que 'm'");
			else {
				for (int i = 1; i <= number_2; i++) {
					if(i % number == 0)
						System.out.println(i);
				}
				break;
			}
		}

		
		// Ejercicio 29
		
		while(true) {
			System.out.print("Ingrese cantidad de millas o 0 para salir: ");
			double number_d = input.nextDouble();
			
			if(number_d == 0) break;
			
			double km = 1.6093;
			double km_total = number_d / km;
			DecimalFormat formato = new DecimalFormat("##,##");
			
			System.out.println(number_d + " Millas = " + formato.format(km_total)  + " Km");
		}
		
	}
	

}
