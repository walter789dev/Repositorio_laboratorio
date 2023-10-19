package poo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tp9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pre_matriz_3 [][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {5, 9, 7, 18}};
		int pre_matriz_4 [][] = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
		int pre_simetrico [][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		
		ArrayList <Integer> matriz = new ArrayList<Integer>(Arrays.asList(12, 34, 18, 100));
		ArrayList <Integer> matriz_2 = new ArrayList<Integer>(Arrays.asList(15, 30, 180, 10));
		ArrayList<ArrayList<Integer>> matriz_3 = insertData(pre_matriz_3);
		ArrayList<ArrayList<Integer>> matriz_4 = insertData(pre_matriz_4);
		
		// Exercise 1:
		System.out.println("Suma de Matrices: " + sum_matrices(matriz, matriz_2));
		
		// Exercise 2:
		System.out.println("Producto de Matrices: " + prod_matrices(matriz, matriz_2));
		
		// Exercise 3:
		ArrayList<ArrayList<Integer>> transp_matriz = transp_matriz(matriz_3);
		
		System.out.println("Matriz Transpuesta: ");
		for (ArrayList<Integer> arrayList : transp_matriz) System.out.println(arrayList + " ");
		
		// Exercise 4:
		ArrayList<ArrayList<Integer>> simetrico = insertData(pre_simetrico);
		
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
		
		if(fila <= 3 && fila >= 1) 
			System.out.println("La suma de la fila " + fila + " da como resultado: " + sum_fila(fila, matriz_3));
		else 
			System.out.println("La fila deseada no existe");
		
		// Exercise 9:
		System.out.println("La matriz " + (diagonal(matriz_3) ? "ES" : "NO ES") + " diagonal");
		
		// Exercise 10:
		System.out.print("Ingrese tamaño de la matriz a crear: ");
		int width = input.nextInt();
		
		ArrayList<ArrayList<Integer>> identidad = matriz_identidad(width);
		
		System.out.println("Arreglo Identidad: ");
		for (ArrayList<Integer> fila1 : identidad) System.out.println(fila1);
		
		// Exercise 11:
		int contador [] = par_impar(matriz);
		System.out.println("Numeros Pares: " + contador[0] + ", Numeros Impar: " + contador[1]);
		
		// Exercise 12:
		ArrayList<ArrayList<Integer>> rotate = rotate_matriz(matriz_3);
		
		for (ArrayList<Integer> fila2 : rotate) System.out.println("Fila: " + fila2);
		
		// Exercise 13:
		System.out.print("Ingrese número a buscar: ");
		int number = input.nextInt();

		int count = count_number(number, matriz_3);
		System.out.println("El número tiene: " + count + " coincidencias");
		
		// Exercise 14:
		ArrayList<ArrayList<Integer>> reverse = reverse_fila(matriz_3);

		for (ArrayList<Integer> fila_r : reverse) {
		System.out.println("Fila: " + fila_r);
		}
	
		// Exercise 15:
		int sum_diagonals = sum_diagonal(matriz_3);
		System.out.println("La suma de sus diagonales: " + sum_diagonals);
		
		// Exercise 17:
		ArrayList<Integer> min_filas = min_fila(matriz_3);
		System.out.println("Valor minimo de cada fila: " + min_filas);
      
		// Exercise 18:
		ArrayList<ArrayList<Integer>> dist_matrices = dist_long_prod_matriz(matriz_3, matriz_4);
		System.out.println("Matriz obtenida :");
		
		for (ArrayList<Integer> m : dist_matrices) System.out.println("Fila: " + m);
	}
	
	public static ArrayList<ArrayList<Integer>> insertData(int [][] A){
		ArrayList<ArrayList<Integer>> matriz = new ArrayList();
		for (int i = 0; i < A.length; i++) {
			matriz.add(new ArrayList<Integer>());
			for (int j = 0; j < A[0].length; j++) matriz.get(i).add(A[i][j]);
		}
		return matriz;
	}
	
	// 1
	public static ArrayList<Integer> sum_matrices(ArrayList<Integer> A, ArrayList<Integer>  B){
		ArrayList<Integer> matriz = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) matriz.add(A.get(i) + B.get(i));
		return matriz;
	}

	// 2
	public static ArrayList<Integer> prod_matrices(ArrayList<Integer> A, ArrayList<Integer>  B){
		ArrayList<Integer> matriz = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) matriz.add(A.get(i) * B.get(i));
		return matriz;
	}

	// 3
	public static ArrayList<ArrayList<Integer>> transp_matriz(ArrayList<ArrayList<Integer>> A){
		ArrayList<ArrayList<Integer>> matriz = new ArrayList();
		for (int i = 0; i < A.size(); i++){
			matriz.add(new ArrayList<Integer>());
			for (int j = 0; j < A.get(0).size(); j++) matriz.get(i).add(A.get(j).get(i));
		}
		return matriz;
	}

	// 4
	public static boolean simet_matriz(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B){
		boolean validate = true;
		if(A.size() == B.size() && A.get(0).size() == B.get(0).size()){
			for (int i = 0; i < A.size(); i++){
				for (int j = 0; j < A.get(0).size(); j++) {
					if(A.get(i).get(j) != B.get(j).get(i)){
						validate = false;
						break;
					}
				}
				if(validate == false) break;
			}
			return validate;
		} 
		else return !validate;
	}

	// 5
	public static int prod_esc_matriz(ArrayList<Integer> A, ArrayList<Integer> B){
		int sum_matriz = 0;
		for (int i = 0; i < A.size(); i++) sum_matriz += A.get(i) * B.get(i);
		return sum_matriz;
	}

	// 6
	public static int sum_matriz(ArrayList<Integer> A){
		int total = 0;
		for (int i = 0; i < A.size(); i++) total += A.get(i);
		return total;
	}

	// 7
	public static int[] max_elm(ArrayList<Integer> A){
		int max [] = {A.get(0), 0};
		
		for (int i = 1; i < A.size(); i++) {
			if(A.get(i) > max[0]) {
				max[0] = A.get(i);
				max[1] = i;
			}
		}
		return max;
	}

	// 8
	public static int sum_fila(int fila, ArrayList<ArrayList<Integer>> A) {
		int total = 0;
		for (int i = 0; i < A.get(fila).size(); i++) total += A.get(fila).get(i);
		return total;
	}
	
	// 9
	public static boolean diagonal (ArrayList<ArrayList<Integer>> A) {
		boolean validate = true;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(0).size(); j++) {
				
				if((i == j && A.get(i).get(j) == 0) || (i != j &&A.get(i).get(j) != 0)){
					validate = false;
					break;
				}
			}
			if(validate == false) break;
		}
		return validate;
	}
	
	// 10
	public static ArrayList<ArrayList<Integer>> matriz_identidad(int fila) {
		ArrayList<ArrayList<Integer>> matriz = new ArrayList();
		for (int i = 0; i < fila; i++) {
			matriz.add(new ArrayList<Integer>());
			
			for (int j = 0; j < fila; j++) {
				if(i == j) matriz.get(i).add(j, 1);
				else matriz.get(i).add(j, 0);
			}
		}
		return matriz;
	}
	
	// 11
	public static int [] par_impar(ArrayList<Integer> A){
		int par_impar [] = {0, 0};
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i) % 2 == 0) par_impar[0] += 1;
			else par_impar[1] += 1;
		}
		return par_impar;
	}
	
	// 12
	public static ArrayList<ArrayList<Integer>> rotate_matriz(ArrayList<ArrayList<Integer>> A){
		int count = 0;
		ArrayList<ArrayList<Integer>> matriz = new ArrayList();
		for (int i = 0; i < A.size(); i++) {
			count = 0;
			matriz.add(new ArrayList<Integer>());
			for (int j = A.get(0).size() - 1; j >= 0; j--) {
				matriz.get(i).add(count, A.get(j).get(i));
				count += 1;
			}
		}
	return matriz;
	}
	
	// 13
	public static int count_number(int number, ArrayList<ArrayList<Integer>> A){
		int count_a = 0;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(0).size(); j++) {
				if(A.get(i).get(j) == number) count_a += 1;
			}
		}
		return count_a;
	}
	
	// 14
	public static ArrayList<ArrayList<Integer>> reverse_fila(ArrayList<ArrayList<Integer>> A){
		ArrayList<ArrayList<Integer>> matriz = new ArrayList();
		int count = -1;
		
		for (int j = A.size() - 1; j >= 0; j--) {
			count += 1;
			matriz.add(new ArrayList<Integer>());
			for (int i = 0; i < A.get(0).size(); i++) {
				matriz.get(count).add(i, A.get(j).get(i));
			}
		}
		return matriz;
	}
	
	// 15
	public static int sum_diagonal(ArrayList<ArrayList<Integer>> A) {
		int sum = 0;
		int d = 0;
		int d_inv = A.get(0).size() - 1;
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(0).size(); j++) {
				if(d == i) {
					sum += A.get(i).get(d);
					d += 1;
				}
				if(d_inv == j) {
					sum += A.get(i).get(j);
					d_inv -= 1;
				}
			}
		}
		return sum;
	}
	
	// 17
	public static ArrayList<Integer> min_fila(ArrayList<ArrayList<Integer>> A){
		ArrayList <Integer> matriz = new ArrayList<Integer>();
		int min = 0;

		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(0).size(); j++) {
				if (j == 0) min = A.get(i).get(j);
				else if (A.get(i).get(j) < min) min = A.get(i).get(j);
			}
			matriz.add(i, min);
		}
		return matriz;
	}
	
	// 18:
	public static ArrayList<ArrayList<Integer>> dist_long_prod_matriz(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B){
		int mayor_f = 0, menor_f = 0, mayor_c = 0, menor_c = 0;
		char mayor_fa, mayor_ca;
		
		if (A.size() > B.size()) {
			mayor_fa = 'a';
			mayor_f = A.size() - 1;
			menor_f = B.size() - 1;
		}
		else {
			mayor_fa = 'b';
			mayor_f = B.size() - 1;
			menor_f = A.size() - 1;
		}
		
		if (A.get(0).size() > B.get(0).size()) {
			mayor_ca = 'b';
			mayor_c = A.get(0).size() - 1;
			menor_c = B.get(0).size() - 1;
		}
		else {
			mayor_ca = 'b';
			mayor_c = B.get(0).size() - 1;
			menor_c = A.get(0).size() - 1;
		}
		
		ArrayList<ArrayList<Integer>> matriz = new ArrayList();
		
		for (int i = 0; i < mayor_f; i++) {
			matriz.add(new ArrayList<Integer>());
			for (int j = 0; j < mayor_c; j++) {
				if (i <= menor_f && j <= menor_c) 
					matriz.get(i).add(j, A.get(i).get(j) * B.get(i).get(j));
				else if (j > menor_c && mayor_ca == 'b') 
					matriz.get(i).add(j, B.get(i).get(j));
				else if (j > menor_c && mayor_ca == 'a') 
					matriz.get(i).add(j, A.get(i).get(j));
				else if (i > menor_f && mayor_fa == 'a') 
					matriz.get(i).add(j, A.get(i).get(j));
				else if (i > menor_f && mayor_fa == 'b') 
					matriz.get(i).add(j, B.get(i).get(j));
			}
		}
		return matriz;
	}
}
