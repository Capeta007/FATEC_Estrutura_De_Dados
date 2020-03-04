package lista.simplesmente.encadeada.exercicio2;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		inicializacao();

	}

	private static void inicializacao() {
        
		int sinal = 0;
		
		ListaSimplesEncadeada lse = new ListaSimplesEncadeada();
		
		while(sinal != 9) {
		
		String opc = JOptionPane.showInputDialog("1 - Adicionar Aluno \n" + "2 - Vizualizar Dados \n" + "9 - Fim");

		sinal = verificarOpcao(opc, lse);

		}
	}

	private static int verificarOpcao(String opc, ListaSimplesEncadeada lse) {

		switch (opc) {
		case "1":

			Aluno novo = criarAluno();
			lse.add(novo);
			JOptionPane.showMessageDialog(null,"Aluno Criado com Sucesso");
			
			return 1;
			
		case "2":
//			String alunos = null;
//			int i = 0;
//			while(true) {
//				try {
//					alunos += lse.getElement(i).getNumMatricula() + " - " + lse.getElement(i).getNome() + "\n"; 
//				}catch (Exception e) {
//					break;
//				}
//				i++;
//			}

			JOptionPane.showMessageDialog(null, calcMedia(lse));
			
			return 2;
			
		case "9":
			JOptionPane.showMessageDialog(null, "Fim");

			return 9;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
			return 0;
		
		}
		

	}

	private static String calcMedia(ListaSimplesEncadeada lse) {
		
		Aluno[] alunos = lse.returnAll();
		
		String media = "";
		
		for (Aluno aluno : alunos) {
			
			media += aluno.getNumMatricula() + " - " + aluno.getNome() + " P1: " + aluno.getNotap1() + " P2: " + aluno.getNotap2() + " = " + ((aluno.getNotap1()+aluno.getNotap2())/2) + "\n"; 
		}
		
		return media;
	}

	private static Aluno criarAluno() {
		
		String numMatricula = JOptionPane.showInputDialog("Digite o número da matricula: ");
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
		float notap1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota na P1: "));
		float notap2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota na P2: "));
		float notaSub = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota na Substitutiva: "));
		
		float notaEx = notap1;
		
		if(notap2 < notaEx) {
			notaEx = notap2;
		}
		
		if(notaSub < notaEx) {
			notaEx = notaSub;
		}
		
		
		Aluno novo = new Aluno(numMatricula, nome, disciplina, notap1, notap2, notaSub, notaEx);
		
		return novo;
	}

}
