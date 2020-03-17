package recursividade.exercicio4;

public class Palindromo {
	
	public static void main(String[] args) {
		
		String text = "ara";
		
//		System.out.println(text.substring(text.length()-1));
		System.out.println(verificarPalidromo(text));
		
	}

	private static boolean verificarPalidromo(String text) {
		
		if(text.length() == 1 || text.length() == 2) {
			return (text.substring(0,1).equals(text.substring(text.length()-1)));
		}else {
		return (text.substring(0,1).equals(text.substring(text.length()-1)) && verificarPalidromo(text.substring(1, text.length()-1)));
		}
	}

}
