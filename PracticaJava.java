import java.util.Scanner;

public class PracticaJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, number_1, number_2;
		double number_3, number_4;
		String character, character_2;
        
        //Ejercicio 1
        
        System.out.print("Ingrese un número: ");
        number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Número Par" : "Numero Impar");
        
        // Ejercicio 2
        
        System.out.print("Ingrese un número: ");
        number = input.nextInt();
        System.out.println(number % 5 == 0 ? "Es multiplo de 5" : "No es multiplo de 5");
        
        // Ejercicio 3
        input.nextLine();
        
        System.out.print("Ingrese un caracter: ");
        character = input.nextLine();
        
        if(character.length() > 1) 
        	System.out.println("Valor invalido: no es un caracter");
        else {
        	if(character.equals(character.toUpperCase())) System.out.println("El caracter se encuentra en Mayuscula");
        	else System.out.println("El caracter no se encuentra en Mayuscula");
        }
        
        // Ejercicio 4
        
        System.out.print("Ingrese un número: ");
        number_1 = input.nextInt();
        
        System.out.print("Ingrese otro número: ");
        number_2 = input.nextInt();
        
        System.out.println(number_1 == number_2 ? "Son iguales" : "No son iguales");
        
        // Ejercicio 5
        
        System.out.print("Ingrese un número: ");
        number_1 = input.nextInt();
        
        System.out.print("Ingrese otro número: ");
        number_2 = input.nextInt();
        
        if(number_2 >= number_1) 
        	System.out.println(number_2 + " es mayor que " + number_1);
        else if (number_1 == number_2) 
        	System.out.println("Ambos números son iguales");
        else 
        	System.out.println(number_1 + " es mayor que " + number_2);
        
        // Ejercicio 6
        
        System.out.print("Ingrese un número: ");
        number_1 = input.nextInt();
        
        System.out.print("Ingrese otro número: ");
        number_2 = input.nextInt();
        
        System.out.println(number_1 % 10 == number_2 % 10 ? "Los ultimos digitos son iguales" : "Los ultimos digitos no son iguales");
        
        // Ejercicio 7
        
        System.out.print("Ingrese un número: ");
        number_1 = input.nextInt();
        
        System.out.println((number_1 % 3 == 0) && (number_1 % 5 == 0) ? "Es multiplo de 3 y 5" : "No es multiplo de 3 y 5");
       
        // Ejercicio 8
        
        System.out.print("Ingrese un número: ");
        number_1 = input.nextInt();
        
        if(number_1 % 2 == 0) 
        	System.out.println("Es multiplo de 2");
        else if (number_1 % 3 == 0) 
        	System.out.println("Es multiplo de 3");
        else 
        	System.out.println("No es multiplo de 2 ni de 3");
        
        // Ejercicio 9
        input.nextLine();
        
        System.out.print("Ingrese un caracter");
        character = input.nextLine();
        
        System.out.print("Ingrese otro caracter");
        character_2 = input.nextLine();
        boolean validate = true;
        
        if(character.length() > 1) {
        	System.out.println("Primer valor invalido: no es un caracter");
        	validate = false;
        }
        	
        if(character_2.length() > 1) {
        	System.out.println("Segundo valor invalido: no es un caracter");
        	validate = false;
        }
        
        if(validate) {
        	if(character.equals(character_2)) 
        		System.out.println("Ambos caracteres son iguales");
        	else 
        		System.out.println("No son iguales");
        }
        
        // Ejercicio 10
        
        System.out.print("Ingrese un caracter: ");
        character = input.nextLine();
        
        System.out.print("Ingrese otro caracter: ");
        character_2 = input.nextLine();
        
        boolean val_1 = character.equals(character.toLowerCase());
        boolean val_2 = character_2.equals(character_2.toLowerCase());
        
        if (val_1 && val_2) 
        	System.out.println("Ambos caracteres estan en minusculas");
        else if (val_1 || val_2) 
        	System.out.println("Solo un caracter esta en minuscula");
        else 
        	System.out.println("No estan en minusculas");
        
        
        // Ejercicio 11
        
        System.out.print("Ingrese un caracter: ");
        character = input.nextLine();
        int digito = Integer.parseInt(character);
        
        if(digito <= 9 && digito >= 0) 
        	System.out.println("Es un digito numerico");
        else 
        	System.out.println("No es un digito numerico");
        
        
       // Ejercicio 12
        
        System.out.print("Ingrese número a dividir: ");
        number_3 = input.nextDouble();
        
        System.out.print("Ingrese número divisor: ");
        number_4 = input.nextInt();
        
        if(number_4 == 0) 
        	System.out.println("No se puede dividir por 0");
        else {
    	   double result = number_3 / number_4;
    	   System.out.println("Resultado: " + result);
        }
       
        // Ejercicio 13
        System.out.print("Ingrese el año a corroborar: ");
        int year = input.nextInt();
        
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) 
        	System.out.println("El año es bisiesto");
        else 
        	System.out.println("El año no es bisiesto");
        
        
		// Ejercicio 14
		
		System.out.print("Ingrese un número de tres cifras: ");
        number_1 = input.nextInt();
        
        if(number_1 >= 1000 || number_1 <= 99) 
        	System.out.println("El número ingresado no es de 3 cifras");
        else {
        	if((number_1 / 100) == (number_1 % 10))
        		System.out.println("El número es capicua");
        	else
        		System.out.println("El número no es capicua");
        }
        
        // Ejercicio 15
        
        System.out.print("Ingrese hora: ");
        int h = input.nextInt();
        
        System.out.print("Ingrese minutos: ");
        int m = input.nextInt();
        
        System.out.print("Ingrese segundos: ");
        int s = input.nextInt();
        
        if((h > 24 || h < 0) && (m > 60 || m < 0) && (s > 60 || s < 0))
        	System.out.println("El horario ingresado no es valido");
        else
        	System.out.println("Horario valido: " + h + ":" + m + ":" + s);
	}

}
