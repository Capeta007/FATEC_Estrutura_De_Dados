package recursividade.exercicio2;

public class RecursivaMenor {
	
	public static void main(String[] args) {
		
		int[] valores = {5,3,2};
		
		System.out.println(buscarMenor(valores, 0, valores.length-1));
		
	}

	private static int buscarMenor(int[] valores, int inicio , int fim ) {
		
		int meio = (inicio+fim)/2;
		int n1,n2;
		
		if(meio>inicio) {
			
			n1 = buscarMenor(valores, inicio, meio);
			n2 = buscarMenor(valores, meio+1, fim);
			
		}else {
			
			n1 = valores[inicio];
			n2 = valores[fim];

		}
		
		if(n1 > n2) {
			return n2;
		}else {
			return n1;
		}
	}

}
