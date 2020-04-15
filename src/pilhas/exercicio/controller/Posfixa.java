package pilhas.exercicio.controller;

public class Posfixa extends Conversor{

	public String infixaParaPosfixa(char[] exp) {

		int i = 0;
		char op;
		Stack stack = new Stack();
		String convertido = "";

		while (exp[i] != '.') {
			op = exp[i];

			if (operador(op)) {

				if (stack.vazia()) {

					if (op == '(') {
						while (op != ')') {

							if (operador(op)) {
								if (stack.vazia() || stack.topo() == '(' || prioridade(stack.topo()) < prioridade(op)) {
									stack.push(op);
								} else {
									convertido += stack.topo();
									stack.pop();
									stack.push(op);
								}
							} else {
								convertido += op;
							}
							i++;
							op = exp[i];

						}
						stack.push(op);
						i++;
					} else {
						stack.push(op);
						i++;
					}
				} else {

					if (prioridade(stack.topo()) < prioridade(op) && op != ')' || op == '(') {
						if (op == '(') {
							while (op != ')') {

								if (operador(op)) {
									if (stack.vazia() || stack.topo() == '('
											|| prioridade(stack.topo()) < prioridade(op)) {
										stack.push(op);
									} else {
										convertido += stack.topo();
										stack.pop();
										stack.push(op);
									}
								} else {
									convertido += op;
								}
								i++;
								op = exp[i];

							}
							stack.push(op);
							i++;
						} else {
							stack.push(op);
							i++;
						}

					} else {
						if (stack.topo() == ')') {
							while (stack.topo() != '(') {
								if (stack.topo() != ')') {
									convertido += stack.topo();
								}
								stack.pop();
							}
							stack.pop();
							stack.push(op);
							i++;
						} else {
							if (stack.topo() != '(' && stack.topo() != ')') {
								convertido += stack.topo();
							}
							stack.pop();
							if (op != ')') {
								stack.push(op);
							}

							i++;
						}

					}

				}

			} else {

				convertido += op;
				i++;
			}

		}

		while (!stack.vazia()) {
			if (stack.topo() != ')' && stack.topo() != '(') {
				convertido += stack.topo();
			}
			stack.pop();
		}

		return convertido;
	}

	public double valor(char[] exp) {

		int i = 0;
		char op;
		String transforma;
		int aux = 0;
		int soma = 0;
		Stack stack = new Stack();

		while (exp[i] != '.') {
			op = exp[i];

			if (!operador(op)) {
				stack.push(op);
				i++;
			} else {
				while (operador(op)) {
					
					aux = conversor(stack.topo());
					stack.pop();
					switch (op) {
					case '+':
						soma = conversor(stack.topo()) + aux;
						break;
					case '-':
						soma = conversor(stack.topo()) - aux;
						break;
					case '*':
						soma = conversor(stack.topo()) * aux;
						break;
					case '/':
						soma = conversor(stack.topo()) / aux;
						break;
					case '^':
						soma = (int) Math.pow(conversor(stack.topo()), aux);
						break;
					}
					stack.pop();
					stack.push((char)soma);
					i++;
					op = exp[i];
				}
			}
		}
		return soma;
	}
	
	public int conversor(char topo) {
		
		int convertido;
		
		try {
		    convertido = Integer.parseInt(topo + "");
		} catch (Exception e) {
			convertido = (int)topo;
		}
		
		return convertido;
	}
}
