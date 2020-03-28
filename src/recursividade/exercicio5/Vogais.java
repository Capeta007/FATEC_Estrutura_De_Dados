package recursividade.exercicio5;

public class Vogais {
	
	public static void main(String[] args) {
		
		String text = "rr";
		
		System.out.println(verificarVogaisConsoantes(text.toLowerCase()));
		
	}

	private static boolean verificarVogaisConsoantes(String text) {
		
		if(text.length() == 1) {
		
			return (text.equals("a") || text.equals("e") || text.equals("i") || text.equals("o") || text.equals("u"));
		
		}else {
			
			return (text.contains("a") || text.contains("e") || text.contains("i") || text.contains("o") || text.contains("u")) || verificarVogaisConsoantes(text.substring(1));
			
		}
	}

}
