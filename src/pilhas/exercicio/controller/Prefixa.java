package pilhas.exercicio.controller;

import sun.security.util.Length;

public class Prefixa {

	public boolean operador(char s) {
		return (s == '+' || s == '-' || s == '(' || s == ')' || s == '*' || s == '/' || s == '^');
	}

	public int prioridade(char s) {

		switch (s) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		case '(':
		case ')':
			return 4;
		}
		return 0;
	}

	public String infixaParaPrefixa(char[] exp) {

		int i = 2;
		char op;
		Stack stack = new Stack();
		Stack rever = new Stack();
		String convertido = "";

		while (exp[exp.length-i] != '.') {
			op = exp[exp.length - i];

			if (operador(op)) {

				if (stack.vazia()) {

					stack.push(op);
					i++;

				} else {

					if (prioridade(stack.topo()) < prioridade(op) && op != '(' || op == ')' ) {

						if (op == ')') {
							while (op != '(') {
								if (operador(op)) {
									stack.push(op);
								} else {
									rever.push(op);
								}
								i++;
								op = exp[exp.length - i];
							}
							stack.push(op);
						} else {
							stack.push(op);
							i++;
						}

					} else {

						if (op == '(') {
							while ((stack.topo() != ')')) {

								if(stack.topo() != ')' || stack.topo() != '(') {
									rever.push(stack.topo());
								}

								stack.pop();
							}
							stack.pop();
							i++;
						}else {
							stack.push(op);
							i++;
						}
					}

				}

			} else {

				rever.push(op);
				i++;
			}

		}

		while (!stack.vazia()) {
			if (stack.topo() != ')' && stack.topo() != '(') {
				rever.push(stack.topo());
			}
			stack.pop();
		}

		while (!rever.vazia()) {
			if(rever.topo() != ')' && rever.topo() != '(' ) {
				convertido += rever.topo();
			}
			rever.pop();
		}

		return convertido;
	}

}
