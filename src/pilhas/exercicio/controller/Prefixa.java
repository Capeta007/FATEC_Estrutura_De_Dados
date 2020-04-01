package pilhas.exercicio.controller;

import sun.security.util.Length;

public class Prefixa {

	public boolean operador(char s) {
		return (s == '+' || s == '-' || s == '(' || s == ')' || s == '*' || s == '/' || s == '^');
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
		case '(':
		case ')':
			return 6;
		}
		return 0;
	}

	public String infixaParaPrefixa(char[] exp) {

		int i = 1;
		char op;
		Stack stack = new Stack();
		Stack rever = new Stack();
		String convertido = "";

		while (exp[exp.length - i] != '.') {
			op = exp[exp.length - i];

			if (operador(op)) {

				if (stack.vazia()) {

					if (op == ')') {
						while (op != '(') {
							if (operador(op)) {
								if (stack.vazia() || stack.topo() == ')' || prioridade(stack.topo()) < prioridade(op)) {
									stack.push(op);
								} else {
									rever.push(stack.topo());
									stack.pop();
									stack.push(op);
								}
							} else {
								rever.push(op);
							}
							i++;
							op = exp[exp.length - i];
						}
						stack.push(op);
						i++;
					} else {
						stack.push(op);
						i++;
					}

				} else {

					if (prioridade(stack.topo()) < prioridade(op) && op != '(' || stack.topo() == ')') {

						if (op == ')') {
							while (op != '(') {
								if (operador(op)) {
									if (stack.vazia() || stack.topo() == ')' || prioridade(stack.topo()) < prioridade(op)) {
										stack.push(op);
									} else {
										rever.push(stack.topo());
										stack.pop();
										stack.push(op);
									}
								} else {
									rever.push(op);
								}
								i++;
								op = exp[exp.length - i];
							}
							stack.push(op);
							i++;
						} else {
							stack.push(op);
							i++;
						}

					} else {

						if (stack.topo() == '(') {
							while (stack.topo() != ')') {
								if (stack.topo() != '(') {
									rever.push(stack.topo());
								}
								stack.pop();
							}
							stack.pop();
							stack.push(op);
							i++;
						} else {
							while (!stack.vazia()) {
								if (stack.topo() != '(' && stack.topo() != ')') {
									rever.push(stack.topo());
								}
								stack.pop();
							}
							if (op != '(') {
								stack.push(op);
							}

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
			if (rever.topo() != ')' && rever.topo() != '(') {
				convertido += rever.topo();
			}
			rever.pop();
		}

		return convertido;
	}
}
