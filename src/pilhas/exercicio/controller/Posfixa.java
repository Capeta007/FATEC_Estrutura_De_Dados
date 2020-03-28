package pilhas.exercicio.controller;

public class Posfixa {

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

	public String infixaParaPosfixa(char[] exp) {
		
		int i = 0;
		char op;
		Stack stack = new Stack();
		String convertido = "";
		
		while(exp[i] != '.') {
			op = exp[i];
			
			
			if(operador(op)) {
				
				if(stack.vazia()) {
					
					stack.push(op);
					i++;
				}else {
					
					if(prioridade(stack.topo()) < prioridade(op) && op != ')' || stack.topo() == '(') {
						if(op == '(') {
							while(op != ')') {
								
								if(operador(op)) {
									stack.push(op);
								}else {
									convertido += op;
								}
								i++;
								op = exp[i];
								
							}
							stack.push(op);
							i++;
						}else {
							stack.push(op);
							i++;
						}
						
					}else {
						if(stack.topo() == ')') {
							while(stack.topo() != '(') {
								if(stack.topo() != ')') {
									convertido += stack.topo();
								}
					     		stack.pop();
					     	}
							stack.pop();
							stack.push(op);
							i++;
						}else {
							while(!stack.vazia()) {
								if(stack.topo() != '(' && stack.topo() != ')') {
									convertido += stack.topo();
								}
					     		stack.pop();
					     	}
							if(op != ')') {
								stack.push(op);
							}
							
							i++;
						}
						
					}
					
				}

			}else {
				
				convertido += op;
				i++;
			}
			
			
		}
		
     	while(!stack.vazia()) {
     		if(stack.topo() != ')' && stack.topo() != '(') {
     			convertido += stack.topo();
			}
     		stack.pop();
     	}
     	
     	return convertido;
	}

}
