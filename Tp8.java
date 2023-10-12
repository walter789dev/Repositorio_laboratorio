import java.util.Arrays;
import java.util.Scanner;

public class Tp8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matriz [] = {12, 34, 18, 100};
		int matriz_2 [] = {15, 30, 180, 10};
		int matriz_3 [][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {5, 9, 7, 18}};
		int matriz_4 [][] = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
		
		// Exercise 1:
		System.out.println("La suma de las matrices es de: " + Arrays.toString(sum_matrices(matriz, matriz_2)));
		
		// Exercise 2:
		System.out.println("El producto de las matrices es de: " + Arrays.toString(prod_matriz(matriz, matriz_2)));
		
		// Exercise 3:
		int transp [][] = transp_matriz(matriz_3);
		for(int [] array : transp) System.out.println(Arrays.toString(array));
		
		// Exercise 4:
		int simetrico [][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		boolean simetric = simet_matriz(simetrico, transp_matriz(simetrico));
		System.out.println("El arreglo " + (simetric ? "SI" : "NO") + " es simetrico");
		
		// Exercise 5:
		System.out.println("El Producto Escalar: " + prod_esc_matriz(matriz, matriz_2));
		
		// Exercise 6:
		System.out.println("La Suma del Vector es de: " + sum_matriz(matriz));
		
		// Exercise 7:
		int max [] = max_elm(matriz);
		System.out.println("Valor maximo: " + max[0] + ", Posición: " + max[1]);

		// Exercise 8:
		System.out.print("¿Que numero de fila desea sumar? (la matriz posee 3 filas): ");
		int fila = input.nextInt();
		
		if(fila <= 3 && fila >= 1)System.out.println("La suma de la fila " + fila + " da como resultado: " + sum_fila(fila, matriz_3));
		else System.out.println("La fila deseada no existe");
		
		
		// Exercise 9:
		System.out.println("La matriz " + (diagonal(matriz_3) ? "ES" : "NO ES") + " diagonal");
		
		// Exercise 10:
		System.out.print("Ingrese tamaño de la matriz a crear: ");
		int width = input.nextInt();
		int [][] identidad = matriz_identidad(width);
		
		System.out.println("Arreglo Identidad: ");
		
		for (int[] fila : identidad) {
			System.out.println(Arrays.toString(fila));
		}
		
		// Exercise 11:
		int contador [] = par_impar(matriz);
		System.out.println("Numeros Pares: " + contador[0] + ", Numeros Impar: " + contador[1]);
		
		
		// Exercise 12:
		
		int new_array [][] = rotate_matriz(matriz_3);
		for (int[] fila : new_array) {
		System.out.println("Fila: " + Arrays.toString(fila));
		}

		// Exercise 13:
		System.out.print("Ingrese número a buscar: ");
		int number = input.nextInt();

		int count = count_number(number, matriz_3);
		System.out.println("El número tiene: " + count + " coincidencias");


		// Exercise 14:
		int reverse [][] = reverse_fila(matriz_3);

		for (int[] fila_r : reverse) {
		System.out.println("Fila: " + Arrays.toString(fila_r));
		}
	
		// Exercise 15:
		int sum_diagonals = sum_diagonal(matriz_3);
		System.out.println("La suma de sus diagonales: " + sum_diagonals);
		
		// Exercise 17:
		int [] min_filas = min_fila(matriz_3);
		System.out.println("Valor minimo de cada fila: " + Arrays.toString(min_filas));
      
		// Exercise 18:
		int dist_matrices [][] = dist_long_prod_matriz(matriz_3, matriz_4);
		System.out.println("Matriz obtenida :");
		
		for (int[] m : dist_matrices) {
			System.out.println(Arrays.toString(m));
		}
		
	}
	
	// 1
	public static int [] sum_matrices(int [] A, int [] B){
		int [] matriz = new int[A.length];
		for (int i = 0; i < matriz.length; i++) matriz[i] = A[i] + B[i];
		return matriz;
	}

	// 2
	public static int [] prod_matriz(int [] A, int [] B){
		int [] matriz = new int[A.length];
		for (int i = 0; i < matriz.length; i++) matriz[i] = A[i] * B[i];
		return matriz;
	}

	// 3
	public static int [][] transp_matriz(int [][] A){
		int [][] matriz = new int[A[0].length][A.length];
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++) matriz[i][j] = A[j][i];
		}
		return matriz;
	}

	// 4
	public static boolean simet_matriz(int [][] A, int [][] B){
		boolean validate = true;
		if(A.length == B.length && A[0].length == B[0].length){
			for (int i = 0; i < A.length; i++){
				for (int j = 0; j < A[0].length; j++) {
					if(A[i][j] != B[j][i]){
						validate = false;
						break;
					}
				}
				if(validate == false) break;
			}
			return validate;
		} else return !validate;
	}

	// 5
	public static int prod_esc_matriz(int[] A, int [] B){
		int sum_matriz = 0;
		for (int i = 0; i < A.length; i++) sum_matriz += A[i] * B[i];
		return sum_matriz;
	}

	// 6
	public static int sum_matriz(int [] A){
		int total = 0;
		for (int i = 0; i < A.length; i++) total += A[i];
		return total;
	}

	// 7
	public static int[] max_elm(int [] A){
		int max [] = {A[0], 0};
		
		for (int i = 1; i < A.length; i++) {
			if(A[i] > max[0]) {
				max[0] = A[i];
				max[1] = i;
			}
		}
		return max;
	}

	// 8
	public static int sum_fila(int fila, int [][] A) {
		int total = 0;
		for (int i = 0; i < A[fila].length; i++) total += A[fila][i];
		return total;
	}
	
	// 9
	public static boolean diagonal (int [][] A) {
		boolean validate = true;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				
				if((i == j && A[i][j] == 0) || (i != j && A[i][j] != 0)){
					validate = false;
					break;
				}
			}
			if(validate == false) break;
		}
		return validate;
	}
	
	// 10
	public static int[][] matriz_identidad(int fila) {
		int [][] arreglo = new int[fila][fila];
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if(i == j) arreglo[i][j] = 1;
				else arreglo[i][j] = 0;
			}
		}
		return arreglo;
	}
	
	// 11
	public static int [] par_impar(int [] A){
		int par_impar [] = {0, 0};
		for (int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0) par_impar[0] += 1;
			else par_impar[1] += 1;
		}
		return par_impar;
	}
	
	// 12
	public static int[][] rotate_matriz(int [][] matriz){
		int count = 0;
		int [][] pre_array = new int[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			count = 0;
			for (int j = matriz[0].length - 1; j >= 0; j--) {
				pre_array[i][count] = matriz[j][i];
				count += 1;
			}
		}
	return pre_array;
	}
	
	// 13
	public static int count_number(int number, int [][] matriz){
		int count_a = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] == number) count_a += 1;
			}
		}
		return count_a;
	}
	
	// 14
	public static int [][] reverse_fila(int [][] A){
		int [][] pre_array = new int[A.length][A[0].length];
		int count = -1;
		
		for (int j = A.length - 1; j >= 0; j--) {
			count += 1;
			for (int i = 0; i < A[0].length; i++) {
				pre_array[count][i] = A[j][i];
			}
		}
		return pre_array;
	}
	
	// 15
	public static int sum_diagonal(int [][] A) {
		int sum = 0;
		int d = 0;
		int d_inv = A[0].length - 1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if(d == i) {
					sum += A[i][d];
					d += 1;
				}
				if(d_inv == j) {
					sum += A[i][j];
					d_inv -= 1;
				}
			}
		}
		return sum;
	}
	
	// 17
	public static int [] min_fila(int [][] A){
		int [] array = new int[A.length];
		int min = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (j == 0) min = A[i][j];
				else if (A[i][j] < min) min = A[i][j];
			}
			array[i] = min;
		}
		return array;
	}
	
	// 18:
	public static int [][] dist_long_prod_matriz(int [][] A, int [][] B){
		int mayor_f = 0, menor_f = 0, mayor_c = 0, menor_c = 0;
		char mayor_fa, mayor_ca;
		
		if (A.length > B.length) {
			mayor_fa = 'a';
			mayor_f = A.length - 1;
			menor_f = B.length - 1;
		}
		else {
			mayor_fa = 'b';
			mayor_f = B.length - 1;
			menor_f = A.length - 1;
		}
		
		if (A[0].length > B[0].length) {
			mayor_ca = 'b';
			mayor_c = A[0].length - 1;
			menor_c = B[0].length - 1;
		}
		else {
			mayor_ca = 'b';
			mayor_c = B[0].length - 1;
			menor_c = A[0].length - 1;
		}
		
		int [][] matriz = new int[mayor_f][mayor_c];
		
		for (int i = 0; i < mayor_f; i++) {
			for (int j = 0; j < mayor_c; j++) {
				if (i <= menor_f && j <= menor_c) 
					matriz[i][j] = A[i][j] * B[i][j];
				else if (j > menor_c && mayor_ca == 'b') 
					matriz[i][j] = B[i][j];
				else if (j > menor_c && mayor_ca == 'a') 
					matriz[i][j] = A[i][j];
				else if (i > menor_f && mayor_fa == 'a') 
					matriz[i][j] = A[i][j];
				else if (i > menor_f && mayor_fa == 'b') 
					matriz[i][j] = B[i][j];
			}
		}
		return matriz;
	}
}
