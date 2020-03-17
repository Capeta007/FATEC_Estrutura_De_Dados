package recursividade.exercicio3;

import sun.security.util.Length;

public class InverteTexto {
	
	public static void main(String[] args) {
		
		String text = "seu louco doente";
		
		System.out.println(inversorDeStrings(text));
		
	}

	private static String inversorDeStrings(String text) {
		
		if(text.length() == 0) {
			return text;
		}else{
			return text.substring(text.length()-1) + inversorDeStrings(text.substring(0,text.length()-1));
		}
		
	}

}
