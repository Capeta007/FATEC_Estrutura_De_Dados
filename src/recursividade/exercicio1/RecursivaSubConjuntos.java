package recursividade.exercicio1;

public class RecursivaSubConjuntos {

	public static void main(String[] args) {
		
		String[] conj = {"1", "2","3"};
		
		subConjunto(conj, conj.length-1);

	}

	private static void subConjunto(String[] conj, int length) {
		
		if(length == -1) {
			System.out.println("{vazio}");
		}else {
			subConjunto(conj, length-1);
			System.out.println("{"+ conj[length] + "}");
			for(int i = length+1; i < conj.length; i++) {
				System.out.println("{"+ conj[length] +","+ conj[i] + "}");
			}
			
		}
		
		
		
	}

}
