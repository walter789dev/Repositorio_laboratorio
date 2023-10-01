import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class PracticaJava {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] numbers = new double[10];
		DecimalFormat ft = new DecimalFormat("##.##");
		
		// Exercise 1:
		double media_posit [] =  {0, 0};
		double media_negat [] =  {0, 0};
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			numbers[i] = input.nextDouble();
			
			if(numbers[i] >= 0) {
				media_posit[0] += numbers[i];
				media_posit[1] += 1;
			}else {
				media_negat[0] += numbers[i];
				media_negat[1] += 1;
			}
		}
		
		double med_post = media_posit[0] / media_posit[1];
		double med_negt = media_negat[0] / media_negat[1];
		
		System.out.println("Media Positiva: " + ft.format(med_post));
		System.out.println("Media Negativa: " + ft.format(med_negt));
		
		// Exerxise 2:
		double media_par [] =  {0, 0};
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			numbers[i] = input.nextDouble();
			
			if(i % 2 == 0) {
				media_par[0] += numbers[i];
				media_par[1] += 1;
			}
		}
		
		double med_par = media_par[0] / media_par[1];
		System.out.println("Media de Posiciones Pares: " + ft.format(med_par));
		
		// Exercise 3:
		System.out.print("Ingrese la cantidad de alumnos: ");
		int alumnos = input.nextInt();
		double [] notas_alumnos = new double[alumnos];
		double sum_notas = 0, media_notas = 0;
		
		for (int i = 0; i < alumnos; i++) {
			System.out.print("Ingrese Nota del Alumno " + (i + 1) + ": ");
			int nota = input.nextInt();
			notas_alumnos[i] = nota;
		}
		
		for (int i = 0; i < alumnos; i++) {
			sum_notas += notas_alumnos[i];
		}
		
		media_notas = sum_notas / alumnos;
		System.out.println("Los Alumnos que sobrepasaron la media son: ");
		
		for (int i = 0; i < alumnos; i++) {
			if(notas_alumnos[i] >= media_notas) {
				System.out.println("Alumno " + (i + 1) + ": " + notas_alumnos[i]);
			}
		}
		
		// Exercise 4:
		int [] pares = new int[20];
		System.out.println("Los primeros 20 números pares son: ");
		
		for (int i = 0; i < 20; i++) {
			pares[i] = (i + 1) * 2;
			System.out.print(pares[i] + ", ");
		}
		
		// Exercise 5:
		int [] numbers_2 = new int[10];
		int negativo = 0, positivo = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese un número entero: ");
			int num = input.nextInt();
			numbers_2[i] = num;
			
			if(numbers_2[i] >= 0) positivo += 1;
			else negativo += 1;
		}
		
		System.out.println("Numeros Positivos: " + positivo);
		System.out.println("Numeros Negativos: " + negativo);
		
		// Exercise 6:
		negativo = 0;
		positivo = 0;
		int med_negativo = 0, med_positivo = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese un número entero: ");
			int num = input.nextInt();
			numbers_2[i] = num;
			
			if(numbers_2[i] >= 0) {
				positivo += 1;
				med_positivo += numbers_2[i];
			}
			else {
				negativo += 1;
				med_negativo += numbers_2[i];
			}
		}
		
		System.out.println("Media Positivos: " + ( med_positivo / positivo));
		System.out.println("Media Negativos: " + ( med_negativo / negativo));
		
		// Exercise 7:
		System.out.print("Ingrese cantidad de personas a evaluar");
		int intentos = input.nextInt();
		double [] alturas = new double[intentos];
		double pre_media = 0;
		int contador_alturas = 0;
		
		for (int i = 0; i < intentos; i++) {
			System.out.print("Ingrese altura de persona " + (i + 1));
			double altura = input.nextDouble();
			alturas[i] = altura;
			pre_media += altura;
			contador_alturas += 1;
		}
		
		System.out.println("La altura media es de: " + (pre_media / contador_alturas) + "metros");
		System.out.print("Las personas que superan la media son: ");
		
		for (int i = 0; i < alturas.length; i++) {
			if(alturas[i] >= pre_media) {
				System.out.println("Persona " + (i + 1) + ": " + alturas[i]);
			}
		}
		
		// Exercise 8:
		String [] empleados = new String[20];
		double [] salarios = new double[20];
		double max_salario = 0;
		int pos = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Ingrese nombre del empleado: ");
			String nombre = input.nextLine();
			
			System.out.print("Ingrese salario del empleado: ");
			double monto = input.nextDouble();
			
			empleados[i] = nombre;
			salarios[i] = monto;
			
			input.nextLine();
		}
		
		for (int i = 0; i < 20; i++) {
			if(salarios[i] > max_salario) {
				max_salario = salarios[i];
				pos = i;
			}
		}
		
		System.out.println("El empleado '" + empleados[pos] + "' tiene el mejor salario: $" + max_salario);
		
		// Exercise 9:
		System.out.print("Ingrese valor minimo: ");
		int number_max = input.nextInt();
		
		System.out.print("Ingrese valor maximo: ");
		int number_min = input.nextInt();
		
		System.out.print("Ingrese cantidad de numeros: ");
		int number_count = input.nextInt();
		
		int[] arreglo = new_array(number_max, number_min, number_count);
		
		// Exercise 10 a:
		System.out.print("Ingrese cantidad de filas: ");
		int fila = input.nextInt();
		
		System.out.print("Ingrese cantidad de columnas: ");
		int columna = input.nextInt();
		
		int [][] matriz_a = new int[fila][columna];
		int [][] matriz_b = new int[fila][columna];
		int [][] matriz_c = new int[fila][columna];
		
		for (int x = 0; x < 2; x++) {
			for (int f = 0; f < fila; f++) {
				for (int c = 0; c < columna; c++) {
					System.out.print("Ingrese valor " + (c + 1) + " para fila " + (f + 1) + ((x == 0) ? " A" : " B") + ": ");
					if(x == 0) matriz_a[f][c] = input.nextInt();
					else matriz_b[f][c] = input.nextInt();
				}
			}
		}
		
		System.out.println("Matriz C: ");

		for (int f = 0; f < fila; f++) {
			for (int c = 0; c < columna; c++) {
				matriz_c[f][c] = matriz_a[f][c] + matriz_b[f][c];
				System.out.print(matriz_c[f][c] + " ");
			}
			System.out.println(" ");
		}
		
		// Exercise 10 b:
		System.out.print("Ingrese cantidad de filas: ");
		int fila_1 = input.nextInt();
		
		System.out.print("Ingrese cantidad de columnas: ");
		int columna_1 = input.nextInt();
		
		int matriz_d [][] = create_matriz(fila_1, columna_1, "D");
		int matriz_e [][] = create_matriz(fila_1, columna_1, "E");
		int matriz_f [][] = sum_matrices(matriz_d, matriz_e);
		
		show_matriz(matriz_f);
		
		// Exercise 11:
		System.out.print("Ingrese cantidad de filas: ");
		int fila_A = input.nextInt();
		
		System.out.print("Ingrese cantidad de columnas: ");
		int columna_A = input.nextInt();
		
		int matriz_A [][] = create_matriz(fila_A, columna_A, "A");
		int new_transp_matriz [][] = transp_matriz(matriz_A);
		
		show_matriz(new_transp_matriz);
	}
	
	// 9:
	public static int[] new_array(int max, int min, int count) {
		int [] numeros_enteros = new int[count];
		
		if(min > max) {
			int aux = max;
			max = min;
			min = aux;
		}
		
		for (int i = 0; i < count; i++) {
			Random random = new Random();
			int number_random = random.nextInt(min, max + 1);
			System.out.print(number_random + ", ");
		}
		return numeros_enteros;
	}
  
	// 10 b:
	public static int read_number(int c, int f, String m) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese valor " + (c + 1) + " para fila " + (f + 1) + " " + m + ": ");
		int number = input.nextInt();
		return number;
	}
	
	public static int[][] create_matriz(int f, int c, String name) {
		int[][] matriz = new int[f][c];
		for (int x = 0; x < f; x++) {
			for (int y = 0; y < c; y++) {
				matriz[x][y] = read_number(y, x, name);
			}
		}
		return matriz;
	}
	
	public static void show_matriz(int [][] matriz) {
		System.out.println("Matriz Creada: ");
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println(" ");
		}
	}
	
	public static int[][] sum_matrices(int [][] matriz_a, int [][] matriz_b) {
		int[][] matriz_c = new int[matriz_a.length][matriz_a[0].length];
		for (int x = 0; x < matriz_a.length; x++) {
			for (int y = 0; y < matriz_a[x].length; y++) {
				matriz_c[x][y] = matriz_a[x][y] + matriz_b[x][y];
			}
		}
		return matriz_c;
	}
	
	// 11:
	public static int[][] transp_matriz(int[][] matriz) {
		int[][] new_matriz = new int[matriz[0].length][matriz.length];
		for (int x = 0; x < matriz[0].length; x++) {
			for (int y = 0; y < matriz.length; y++) {
				new_matriz[x][y] = matriz[y][x];
			}
		}
		return new_matriz;
	}
}
