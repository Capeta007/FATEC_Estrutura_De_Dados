package lista.linear.sequencial.vetor;

public class Teste {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adicionar(0, a3);
		
		boolean confirma = true;
		
		int tamanho = vetor.tamanho();
		
		if(tamanho != 3) {
			System.out.println("Erro: tamanho da lista está errado");
			confirma = false;
		}
		
		if(!vetor.contem(a1)) {
			confirma = false;
			System.out.println("Erro: O vetor não contem o aluno1");
		}
		
		vetor.remove(0);
		tamanho = vetor.tamanho();
		
		if(tamanho != 2) {
			confirma = false;
			System.out.println("Erro: O tamanho da lista está errado");
		}
		
		if(vetor.contem(a3)) {
			confirma = false;
			System.out.println("Erro: O aluno deveria estar na lista");
		}
		
		if (confirma) {
			System.out.println("Codigo executado sem nenhum erro");
		}
        
	}

}
