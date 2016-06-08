package teste;

public class Ordenacao {
	
	public static void main(String[] args){
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i ++){
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + "-");
		}
		
		quickSort(vetor, 0, vetor.length - 1);
		System.out.println("");
		
		for(int i = 0; i < vetor.length; i ++){
			System.out.print(vetor[i] + "-");
		}
		
	}
	
	public static void quickSort(int[] vetor, int inicio, int fim){
		if(fim <= inicio){
			return;
		}
		int pivo = vetor[inicio];
		int i = inicio +1;
		int j = fim;
		
		while(i <= j){
			if(vetor[i] <= pivo){
				i++;
			}
			else if(vetor[j] > pivo){
				j--;
			}
			else{
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				i++;
				j--;
			}
		}
		
		vetor[inicio] = vetor[j];
		vetor[j] = pivo;
		
		quickSort(vetor, inicio, j-1);
		quickSort(vetor, j+1, fim);
		
	}

}
