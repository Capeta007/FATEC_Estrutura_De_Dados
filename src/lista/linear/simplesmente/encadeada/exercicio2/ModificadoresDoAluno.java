package lista.linear.simplesmente.encadeada.exercicio2;

import javax.swing.JOptionPane;

public class ModificadoresDoAluno {

	public int verificarOpcao(int opc, ListaSimplesEncadeada lse) {
		
		
		if(lse.size() == 1) {
			if(opc == 4) {
				opc = 6;
			}
		}
		
		if(lse.size() == 0) {
			if(opc == 2 || opc == 3 || opc == 4 || opc == 5 || opc == 6 ) {
				opc = 0;
			}
		}
			
		switch (opc) {
		case 1:

			Aluno novo = criarAluno();
			lse.add(novo);
			JOptionPane.showMessageDialog(null, "Aluno Criado com Sucesso");
			
			break;

		case 2:

			Aluno novoPos = criarAluno();
			int index = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que ser que ele fique: "));
			lse.add(index,novoPos);
			JOptionPane.showMessageDialog(null, "Aluno Criado com Sucesso");
			
			break;

		case 3:

			JOptionPane.showMessageDialog(null, lse.imprimir());
			
			break;
		case 4:
			
			Aluno aluno = lse.getElement(JOptionPane.showInputDialog("Digite o numero do aluno : "));
			
		    if(aluno != null) {
				JOptionPane.showMessageDialog(null, aluno.getNumMatricula() + " - " + aluno.getNome() + " P1: " + aluno.getNotap1() + " P2: " + aluno.getNotap2() + " = " + aluno.calcMedia() + "\n");
		    }else {
				JOptionPane.showMessageDialog(null, "Aluno não listado");
		    }

			break;
		case 5:
			
		    if(lse.remove(JOptionPane.showInputDialog("Digite o numero do aluno : ")) == true) {
				JOptionPane.showMessageDialog(null,"Aluno removido com sucesso");
		    }else {
				JOptionPane.showMessageDialog(null, "Aluno não listado");
		    }

			

			break;
		case 6:
			
			lse.clear();

			break;
			
		case 9:

			JOptionPane.showMessageDialog(null, "Fim");
			
			break;

		default:
			
			JOptionPane.showMessageDialog(null, "Opção inválida");
			return 0;
			
		}
		return opc;

	
	}

	public Aluno criarAluno() {

		String numMatricula = JOptionPane.showInputDialog("Digite o número da matricula: ");
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
		float notap1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota na P1: "));
		float notap2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota na P2: "));
		float notaSub = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota na Substitutiva: "));

		float notaEx = notap1;

		if (notap2 < notaEx) {
			notaEx = notap2;
		}

		if (notaSub < notaEx) {
			notaEx = notaSub;
		}

		Aluno novo = new Aluno(numMatricula, nome, disciplina, notap1, notap2, notaSub, notaEx);

		return novo;
	}
}
