package bubbleSort;

import java.util.Arrays;


public class BubbleSort {
	
	
	
	
	public static void main(String[ ]args) {			
		
		int[] array = {4,8,92,5,1,6,54}; //matriz simples
		
		int n = array.length; //"n" será o tamanho do array, mas nesse caso será desnecessário, você poderá substituir arra.length por 'n' se quiser
		int temp = 0; // começa com zero, mas será a variável que guardará um dado para reposicioná-lo
		
		for(int i = 0; i < array.length; i++) { // Será repetido a operação enquanto o 'i' for menor que o tamanho do array.
			for( int j = 0; j < (array.length - 1); j++) { // Será repetido a operação quando o 'j' for menor que o tamanho da array 'n' menos 1 (pois as posições vão de 0 a 6)
				
				if(array[j+1] < array[j]) { // Se, o array da posição [1] = [0 + 1] for maior que o array da posição [0] ,então essa operação sera feita
					
					temp = array[j+1]; // Esta variavel temp guardara o dado da posição [j+1]
					array[j+1] = array[j]; // a posição [j+1] guardará o dado da posição[j], aqui ocorre uma substituição para ordenação
					array[j] = temp; //a posição[j] adquire o dado que era da posição[j+1]	
					System.out.println(Arrays.toString(array)); // imprime em linha pelo .toString da classe arrays
	
					}
				}		
			}
		
		
		for(int a = 1 ; a < n; a++) {
		System.out.println(array[a] + " ");		
		}
		
		System.out.println(Arrays.toString(array));
		
		
	}
	
	






	
	
	

}
