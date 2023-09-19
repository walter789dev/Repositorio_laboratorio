import java.util.Scanner;

public class RepasoParcial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2, number_capicua;
		
		// Ejercicio: Validar si los dos números terminan igual
		System.out.print("Ingrese un número entero: ");
		number1 = input.nextInt();
		
		System.out.print("Ingrese otro número entero: ");
		number2 = input.nextInt();
		
		if(number1 % 10 == number2 % 10) {
			System.out.println("Ambos números terminan con el mismo digito");
		}else {
			System.out.println("Los números no terminan con el mismo digito");
		}
		
		// Ejercicio: Validar si el número es capicua
		System.out.print("Ingrese un número entero de tres cifras: ");
		number_capicua = input.nextInt();
		
		if(number_capicua <= 999 && number_capicua >= 100) {
			if (number_capicua / 100 == number_capicua % 10) {
				System.out.println("El número es capicua");
			}else {
				System.out.println("El número no es capicua");
			}
		}else {
			System.out.println("El número ingresado no es de tres cifras");
		}
	}
	

}
