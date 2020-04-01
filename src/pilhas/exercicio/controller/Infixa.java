package pilhas.exercicio.controller;

import sun.security.util.Length;

public class Infixa {
	
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
	
	public String posfixaParaInfixa(char[] exp) {
		
		int i = 1;
		char op;
		Stack stack = new Stack();
		Stack rever = new Stack();
		rever.push('.');
		String convertido = "";
		
		while(exp[exp.length-i] != '.') {
			
			op = exp[exp.length-i];
			
			
			
			
			if(operador(op)) {
				if(!stack.vazia()) {
					
					if(prioridade(stack.topo()) > prioridade(op)) {
						
						if(rever.topo() != '(') {
							rever.push(')');
							stack.push('(');
							stack.push(op);
							i++;
						}else {
							rever.push(stack.topo());
							stack.pop();
//							rever.push(')');
//							stack.push('(');
							stack.push(op);
							i++;
						}
						
						
					}else{
						stack.push(op);
						i++;
					}
					
				}else {
					if(prioridade(rever.topo()) > prioridade(op)) {
						if(rever.topo() != '(') {
							rever.push(')');
							stack.push('(');
							stack.push(op);
							i++;
						}else {
							rever.push(stack.topo());
							stack.pop();
//							rever.push(')');
//							stack.push('(');
							stack.push(op);
							i++;
						}
					}else {
						stack.push(op);
						i++;
					}	
				}
			}else {
				if(!stack.vazia() && stack.topo() == '(') {
					rever.push(op);
					while(!stack.vazia() && stack.topo() == '(') {
						rever.push(stack.topo());
						stack.pop();	
					}
					if(!stack.vazia()) {
						rever.push(stack.topo());
						stack.pop();
					}
					i++;
				}else {
					rever.push(op);
					if(!stack.vazia()) {
						rever.push(stack.topo());
						stack.pop();	
					}	
					i++;
				}
				
		    }
		

		}
		
		while(rever.topo() != '.') {
			convertido += rever.topo();
			rever.pop();
		}
		
		return convertido;
	}
	
    public String prefixaParaInfixa(char[] exp) {
		
		int i = 0;
		char op;
		Stack stack = new Stack();
		Stack rever = new Stack();
		rever.push('.');
		String convertido = "";
		
		while(exp[i] != '.') {
			
			op = exp[i];
			
			
			
			
			if(operador(op)) {
				if(!stack.vazia()) {
					
					if(prioridade(stack.topo()) >= prioridade(op)) {
						
						if(rever.topo() != ')') {
							rever.push('(');
							stack.push(')');
							stack.push(op);
							i++;
						}else {
							rever.push(stack.topo());
							stack.pop();
//							rever.push('(');
//							stack.push(')');
							stack.push(op);
							i++;
						}
						
						
					}else{
						stack.push(op);
						i++;
					}
					
				}else {
					if(prioridade(rever.topo()) > prioridade(op)) {
						if(rever.topo() != ')') {
							rever.push('(');
							stack.push(')');
							stack.push(op);
							i++;
						}else {
							rever.push(stack.topo());
							stack.pop();
//							rever.push('(');
//							stack.push(')');
							stack.push(op);
							i++;
						}
					}else {
						stack.push(op);
						i++;
					}	
				}
			}else {
				if(!stack.vazia() && stack.topo() == ')') {
					rever.push(op);
					while(!stack.vazia() && stack.topo() == ')') {
						rever.push(stack.topo());
						stack.pop();	
					}
					if(!stack.vazia()) {
						rever.push(stack.topo());
						stack.pop();
					}
					i++;
				}else {
					rever.push(op);
					if(!stack.vazia()) {
						rever.push(stack.topo());
						stack.pop();	
					}	
					i++;
				}
				
		    }
		

		}
		
		stack.esvazia();

		while(rever.topo() != '.') {
			stack.push(rever.topo());
			rever.pop();
		}
		
		while(!stack.vazia()) {
			convertido += stack.topo();
			stack.pop();
		}
		return convertido;
	}
}