package practica;
import java.util.*;

public class Tp10 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> clone_numbers = new ArrayList<Integer>();
		ArrayList<String> text = new ArrayList<String>();
		ArrayList<String> text_2 = new ArrayList<String>(Arrays.asList("pedro", "pablo", "pedro", "pablo", "roberto"));
		
		Scanner input = new Scanner(System.in); 
		
		// Ejercicio 1:
		for (int i = 0; i < 5; i++) numbers.add(i);

		// Ejercicio 2:
		text.add("Pedro"); // 2
		text.add("Osvaldo");
		text.add("Pipo");
		
		// Ejercicio 3:
		for (Integer number : numbers)System.out.println(number);
		
		// Ejercicio 4:
		System.out.println("Longitud de Arreglo: " + text.size());
		
		// Ejercicio 5:
		System.out.print("Ingrese la posicion a eliminar (menor a " + text.size() + "):");
		int pos = input.nextInt();
		pos -= 1;

		System.out.println(pos >= 0 && pos < text.size() ? "Se ha eliminado: " + text.remove(pos): "Posicion invalida");

		// Ejercicio 6:
		System.out.println(numbers.isEmpty() ? "El arreglo esta vacio" : "El arreglo tiene elementos");

		// Ejercicio 7:
		int mayor = numbers.get(0);

		for (Integer number1 : numbers) if (mayor < number1) mayor = number1;

		System.out.println("El número mayor es: " + mayor);
		
		// Ejercicio 8:
		for (Integer i : numbers) clone_numbers.add(i);
		System.out.println("Arreglo clonado: " + clone_numbers);
		
		// Ejercicio 9:
		clone_numbers = reverse_numbers(clone_numbers);
		System.out.println("Arreglo invertido: " + clone_numbers);
		
		// Ejercicio 10:
		numbers.addAll(0, clone_numbers);
		System.out.println("Nuevo arreglo combinado: " +  numbers);
		
		// Ejercicio 11:
		for (int i = 0; i < numbers.size(); i++) if(numbers.get(i) % 2 == 0) numbers.remove(i);
		
		System.out.println("Arreglo sin números pares: " + numbers);
		
		// Ejercicio 12:
		System.out.print("Ingrese texto a buscar en arreglo: ");
		String texto = input.next();
		int indice = text.indexOf(texto.toLowerCase());
		
		if(indice == -1) System.out.println("El elemento no se encuentra en la lista");
		else System.out.println("Posición: " + indice);
		
		// Ejercicio 13:
		System.out.println(equals_array(numbers, clone_numbers) ? "Son iguales" : "No son iguales");
		
		// Ejercicio 14:
		int menor = numbers.get(0);

		for (Integer number1 : numbers) if (menor > number1) menor = number1;
		
		System.out.println("El número menor es: " + mayor);
		
		// Ejercicio 15:
		System.out.println("La suma de elementos es: " + sum_elements(clone_numbers));
		
		// Ejercicio 16:
		System.out.println("La suma de elementos es: " + sum_string(text));
		
		// Ejercicio 17:
		text_2 = remove_repeat(text_2);
		System.out.println("Arreglo sin repeticiones: " + text_2);
		
		// Ejercicio 18:
		System.out.println("La suma de indices pares es: " + sum_par_elements(clone_numbers));
		
		// Ejercicio 19:
		input.nextLine();
		
		System.out.print("Ingrese número a buscar:");
		int number_search = input.nextInt();
		
		if(numbers.contains(number_search)) System.out.println("El número se encuentra en el arreglo");
		else System.out.println("El número NO se encuentra en el arreglo");
		
		// Ejercicio 20:
		String mayor_str = text.get(0);

		for (String str : text) if (mayor_str.length() < str.length()) mayor_str = str;
		
		System.out.println("El texto con mayor tamaño es: " + mayor_str);
		
		// Ejercicio 21:
		System.out.println("El promedio de elementos es: " + prom_elements(numbers));
		
		// Ejercicio 22:
		Collections.sort(numbers);
		System.out.println("Arreglo ordenado: " + numbers);
		
		// Ejercicio 23:
		System.out.print("Ingrese número de filtro:");
		int number_filter = input.nextInt();
		
		System.out.println("Los numeros menores del arreglo: " + remove_menores(number_filter, clone_numbers));
		
		// Ejercicio 24:
		System.out.print("Ingrese número a buscar:");
		int number_search_2 = input.nextInt();
		
		System.out.println("Numero de apariciones: " + count_element(number_search_2, clone_numbers));
		
		// Ejercicio 25:
		Collections.sort(text);
		System.out.println("Arreglo ordenado: " + text);
	}
	
	public static ArrayList<Integer> reverse_numbers(ArrayList<Integer> A) {
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		for (int i = A.size() - 1; i > - 1; i--) reverse.add(A.get(i));
		return reverse;
	}
	
	public static boolean equals_array(ArrayList<Integer> A, ArrayList<Integer> B) {
		boolean validate = true;
		if(A.size() == B.size()) {
			for (int i = 0; i < A.size(); i++) {
				if(A.get(i) != B.get(i)) {
					validate = false;
					break;
				}
			}
			return validate;
		}
		else return !validate;
	}

	public static double sum_elements(ArrayList<Integer> A) {
		double sum_total = 0;
		for (Integer integer : A) sum_total += (double) integer;
		return sum_total;
	}
	
	public static String sum_string(ArrayList<String> A) {
		String texto = "";
		for (String s : A) texto += s + " ";
		return texto;
	}
	
	public static ArrayList<String> remove_repeat(ArrayList<String> A) {
		ArrayList<String> remove = new ArrayList<String>();
		for (String string : A) {
			if(!remove.contains(string)) remove.add(string);
		}
		return remove;
	}
	
	public static double sum_par_elements(ArrayList<Integer> A) {
		double sum_total = 0;
		for (int i = 0; i < A.size(); i++) {
			if(i % 2 == 0) sum_total += (double) A.get(i);
		}
		return sum_total;
	}
	
	public static double prom_elements(ArrayList<Integer> A) {
		int tam = A.size();
		double sum_total = 0;
		for (Integer integer : A) sum_total += (double) integer;
		return sum_total / tam;
	}
	
	public static ArrayList<Integer> remove_menores(int number, ArrayList<Integer> A) {
		ArrayList<Integer> remove = new ArrayList<Integer>();
		for (Integer int_1 : A) {
			if(int_1 < number) remove.add(int_1);
		}
		return remove;
	}
	
	public static int count_element(int number, ArrayList<Integer> A) {
		int count = 0;
		for (Integer integer : A) if (integer == number) count++;
		return count;
	}
}
