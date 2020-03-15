package recursividade.torredehanoi;

public class Principal {

	public static void main(String[] args) {
		
		int n = 3;
		
		recursivo(n, "A", "C", "B");
	}

	private static void recursivo(int n, String orig, String dest, String aux ) {
		
		if(1 == n) {
			moveDisco(orig, dest);
		}else {
			recursivo(n-1, orig, aux, dest);
			moveDisco(orig, dest);
			recursivo(n-1, aux, dest, orig);
		}
		
	}

	private static void moveDisco(String orig, String dest) {
		
		System.out.println("movimento: "+ orig+ " -> "+ dest);
		
	}
	
	
}
