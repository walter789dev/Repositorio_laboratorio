import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class AlgoritmoOrden {
	
	public static void main(String[] args) {
		int i, j, aux, p;
		
		// Exercise 1:
		Integer numbers_int [] = {23, 25, 100, 2, 5};
		
		Arrays.sort(numbers_int);
		System.out.println("Arreglo Entero ordenado: " + Arrays.toString(numbers_int));

		// Exercise 2:
		Arrays.sort(numbers_int, Collections.reverseOrder());
		System.out.println("Arreglo Entero ordenado inverso: " + Arrays.toString(numbers_int));

		// Exercise 3:
		Double numbers_double [] = {23.2, 25.1, 100.15, 2.1, 5.50};
		Arrays.sort(numbers_double);
		System.out.println("Arreglo Real ordenado: " + Arrays.toString(numbers_double));

		// Exercise 4:
		Arrays.sort(numbers_double, Collections.reverseOrder());
		System.out.println("Arreglo Real ordenado inverso: " + Arrays.toString(numbers_double));

		// Exercise 5:
		String words [] = {"Hello", "World", "Everyone", "Pe", "Causa"};
		Arrays.sort(words);
		System.out.println("Arreglo String ordenado: " + Arrays.toString(words));

		// Exercise 6:
		Arrays.sort(words, Collections.reverseOrder());
		System.out.println("Arreglo String ordenado inverso: " + Arrays.toString(words));
		
		// Exercise 9:
		int numbers [] = {20, 15, 150, 12, 5};
		burbuja(numbers);
		
		// Exercise 10:
		int numbers_2 [] = {23, 25, 100, 2, 5};
		seleccion(numbers_2);
		
		// Exercise 11:                                       
		int numbers_3 [] = {23, 25, 100, 2, 5};
		insercionDirecta(numbers_3);
		
		// Exercise 12:
		int numbers_4 [] = {23, 25, 100, 2, 5};
		quicksort(numbers_4, 0, numbers_4.length - 1);
		
		// Exercise 13:
		int numbers_5 [] = {13, 20, 50, 22, 5};
		shell(numbers_5);
		
		// Exercise 14:
		Scanner input = new Scanner(System.in);
		int [] twenty_number = new int[20];
		int option, option_ord;
		
		for (int k = 0; k < twenty_number.length; k++) {
			System.out.print("Ingrese un número entero para la posicion " + (k + 1));
			int number = input.nextInt();
			twenty_number[k] = number;
		}
		
		System.out.println("¿Como desea ordenarlo?: 1. Ascendente, 2. Descendente :");
		option = input.nextInt();
		
		if(option >= 3) {
			System.out.println("Opcion invalida");
		}else {
			System.out.println("¿Que metodo de ordenamiento desea aplicar? 1. Insercion, 2. Burbuja, 3. Seleccion :");
			option_ord = input.nextInt();
			
			switch (option_ord) {
				case 1: insercionDirecta(twenty_number);
				case 2: burbuja(twenty_number);
				case 3: seleccion(twenty_number);
				default: System.out.println("Opcion invalida");
			}
			
			if(option == 2 && option_ord >= 1 && option_ord <= 3) {
		        Integer[] array = new Integer[twenty_number.length];
		        for (int x = 0; x < array.length; x++) array[x] = Integer.valueOf(array[x]);
		        Arrays.sort(array, Collections.reverseOrder());
		    }
			
			System.out.println(Arrays.toString(twenty_number));
		}
	}
	
	public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
	}
	
	public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
              menor = A[i];                                 
              pos = i;                            
              for (j = i + 1; j < A.length; j++){ 
                    if (A[j] < menor) {           
                        menor = A[j];             
                        pos = j;
                    }
              }
              if (pos != i){                                             
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
              }
        }
	}
	
	 public static void insercionDirecta(int A[]){                                            
		int p, j;
		int aux;
		for (p = 1; p < A.length; p++){ 
		     aux = A[p];           
		     j = p - 1;           
		     while ((j >= 0) && (aux < A[j])){ 
		    	 A[j + 1] = A[j];   
		         j--;              
		     }
		     A[j + 1] = aux;      
		}
	}
	
	public static void quicksort(int A[], int izq, int der) {
		int pivote=A[izq];
		int i=izq;         
		int j=der;         
		int aux;
		 
		while(i < j){                                                             
		   while(A[i] <= pivote && i < j) i++; 
		   while(A[j] > pivote) j--;           
		     if (i < j) {                                            
		         aux= A[i];                      
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   
		   A[izq]=A[j];                                         
		   A[j]=pivote; 
		   
		   if(izq < j-1) quicksort(A,izq,j-1);
		   if(j+1 < der) quicksort(A,j+1,der);    
	}
	
	public static void shell(int A[]) {
        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios){                                      
                cambios = false;
                for (i = salto; i < A.length; i++){
                    if (A[i - salto] > A[i]){       
                        aux = A[i];                  
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;                                                
                    }
                }
            }
        }
	}
	
}

