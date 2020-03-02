package lista.utilizando.referencia;

public class ListaLigada {
	
	private Celula primeiro;
	private Celula ultimo;
	
	public ListaLigada() {
		super();
	}

	public void adicionar(Object elemento) {
		
		if(this.primeiro == null) {
			this.primeiro = new Celula(elemento);
			this.ultimo = primeiro;
		}else {
			Celula novaCelula = new Celula(elemento);
			this.ultimo.setProxima(novaCelula);
			this.ultimo = novaCelula;
		}
	}
	
	public void adicionar(int index, Object elemento) {
		
		if(index >  0 && index < total()) {
			Celula atual = primeiro; 
			Celula anterior = atual;
			for (int i = 1; i <= index; i++) {
				
				anterior = atual;
				atual = atual.getProxima(); 
				
			}
			
			Celula nova = new Celula(atual, elemento);
			anterior.setProxima(nova);
		}else if(index == total()) {
			
			adicionar(elemento);
			
		}else if(index == 0){
			Celula nova = new Celula(primeiro, elemento);
			primeiro = nova;
	    }else {
			System.err.println("Essa posição da lista ainda não foi alcançada ou é menor do que o tamanho que deveria");
		}
		
		
		
	}
	
	public int total() {
		int i = 0;
		Celula line = primeiro;
		while(line != null) {
			i++;
			line = line.getProxima();
		}
		return i;
	}

	public Object getIndex(int index) {
		Celula line = primeiro;
		if(index >= 0 && index < total()) {
		for (int j = 1; j <= index; j++) {
		   
		   line = line.getProxima();
		   
		}
		
		return line.getElemento();
		}else {
			System.err.println("Erro: index não existe");
		return null;	
		}
		
	}
	
	public boolean contem(Object elemento) {
		Celula line = primeiro;
		if(line.equals(elemento)) {
			return true;
		}
		while(line != null) {
			
			if(line.getElemento().equals(elemento)) {
				return true;
			}
			
			line = line.getProxima();
			
			
		}
		return false;
	}
	
	public void remove(int index) {
		if(index >= 0 && index < total()) {
			if(index == 0) {
				primeiro = primeiro.getProxima();
			}else{
				Celula line = primeiro;
				Celula ultima = null;
				for (int i = 1; i <= index; i++) {
					
					ultima = line;
					line = line.getProxima();
							
				}
				
				ultima.setProxima(line.getProxima());
				
				
			}
		}else {
			System.err.println("Erro: o index não existe");
		}
		
	}
	
	
	
}
