package lista.utilizando.referencia;


public class Teste {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		Aluno a1 = new Aluno("leonardo", "21", 21, "ads", 3);
		Aluno a2 = new Aluno("sadsa","5",5,"23",3);
		Aluno a3 = new Aluno("sadasd","6",6,"62",7);
		
		lista.adicionar(a1);
		lista.adicionar(a2);
		lista.adicionar(0, a3);

		System.out.println(lista.getIndex(0).toString());
		System.out.println(lista.getIndex(1).toString());
		System.out.println(lista.getIndex(2).toString());
		
		boolean confirma = true;
		
		int tamanho = lista.total();
		
		if(tamanho != 3) {
			System.out.println("Erro: tamanho da lista está errado");
			confirma = false;
		}
		
		if(!lista.contem(a1)) {
			confirma = false;
			System.out.println("Erro: O vetor não contem o aluno1");
		}
		
		lista.remove(0);
		tamanho = lista.total();
		
		if(tamanho != 2) {
			confirma = false;
			System.out.println("Erro: O tamanho da lista está errado");
		}
		
		if(lista.contem(a3)) {
			confirma = false;
			System.out.println("Erro: O aluno deveria estar na lista");
		}
		
		if (confirma) {
			System.out.println("Codigo executado sem nenhum erro");
		}
        
	}

}
