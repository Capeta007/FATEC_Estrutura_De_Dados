package pilhas.exercicio.view;

import pilhas.exercicio.controller.Posfixa;
import pilhas.exercicio.controller.Prefixa;

public class ConversorDeExpressoes {

	public static void main(String[] args) {
		
		Posfixa pos = new Posfixa();
		Prefixa pre = new Prefixa();
		
		String exp = "A*(B+C)^D";
//		String exp = "A*B+C";

		
		
//		int i = 0;
//		while(s[i] != '.') {
//			System.out.println(s[i]);
//			i++;
//		}
		
		
		exp += ".";
		char[] s = exp.toCharArray();
		System.out.println(pos.infixaParaPosfixa(s));
		exp = "." + exp;
		s = exp.toCharArray();
		System.out.println(pre.infixaParaPrefixa(s));
		
		

	}

}
