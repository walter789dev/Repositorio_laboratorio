import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Arreglos {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] enteros = new int[10];
		for (int i = 0; i < 10; i++) {
			enteros[i] = i + 1;
		}
		
		int [][] bidimensional = new int[10][10];
		double [][][] multidimensional = new double[5][5][5];

		int[] enteros_p = new int[10];
		for (int i = 0; i < enteros_p.length; i++) {
			System.out.print("Ingrese un número entero: ");
			int j = input.nextInt();
			enteros_p[i] = j;
		}

		double [] reales_p = new double[10];
		for (int i = 0; i < reales_p.length; i++) {
			System.out.print("Ingrese un número real: ");
			double d = input.nextDouble();
			reales_p[i] = d;
		}

		char caracteres [] = {'a', 'b', 'c', 'd', 'e', 'f'};
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Caracter " + (i + 1) + ": " + caracteres[i]);
		}

		boolean valores_verdad [] = {true, false, false, true, true};
		for (int i = 0; i < valores_verdad.length; i++) {
			System.out.println("Validez " + (i + 1) + ": " + valores_verdad[i]);
		}

		int [] arreglo = new int[10];
		int sum_arreglo = 0;
		for (int i = 0; i < arreglo.length; i++) {
			Random random = new Random(100);
			arreglo[i] = random.nextInt();
			sum_arreglo += arreglo[i];
		}

		double [] arreglo_d = new double[10];
		double mult_arreglo = 0;
		for (int i = 0; i < arreglo_d.length; i++) {
			Random random = new Random(100);
			arreglo_d[i] = random.nextDouble();
			mult_arreglo *= arreglo_d[i];
		}

		int [] arreglo_o = new int[10];

		for (int i = 0; i < arreglo_o.length; i++) {
			Random random = new Random();
			arreglo_o[i] = random.nextInt(100);
		}
		
		Arrays.sort(arreglo_o);
		System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo_o));
		
		String palabras [] = {"Hola", "Como", "Andan", "Maquinas"};
		Arrays.sort(palabras);
		System.out.println("Arreglo ordenado: " + Arrays.toString(palabras));
	}
	
	public static int count_pair(int [] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) count += 1;
		}
		return count;
	}
	
	public static int count_double(double [] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 10) count += 1;
		}
		return count;
	}
	
	public static int sum_multple_three(int [] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) sum += arr[i];
		}
		return sum;
	}
	
	public static int get_max(int [] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
	
	public static String get_min(String [] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	public int [][] copy_array(int [] arr_a) {
		int [] arr_b = arr_a.clone();
		int arreglo [][] = {arr_b, arr_a};
		return arreglo;
	}
}
