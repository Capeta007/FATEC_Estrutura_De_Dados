package pilhas.exercicio.controller;

public class Conversor {
	
	public boolean operador(char s) {
		return (s == '+' || s == '-' || s == '(' || s == ')' || s == '*' || s == '/' || s == '^' || s == '¬' || s == '∧' || s == 'v' || s == '↔');
	}

	public int prioridade(char s) {

		switch (s) {
		case '+':
			return 1;
		case '-':
			return 2;

		case '*':
			return 3;
			
		case '/':
			return 4;
			
		case '^':
		    return 5;
		case 'v':
			return 6;
		case '∧':
			return 7;
		case '¬':
			return 8;
		case '↔':
			return 9;
		case '(':
		case ')':
			return 10;
		}
		return 0;
	}

}