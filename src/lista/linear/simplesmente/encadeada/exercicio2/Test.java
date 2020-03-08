package lista.linear.simplesmente.encadeada.exercicio2;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		inicializacao();
	}

	public static void inicializacao() {

		int sinal = 0;

		ListaSimplesEncadeada lse = new ListaSimplesEncadeada();

		int opc = 0;

		while (sinal != 9) {

			try {
				if (lse.size() > 1) {

					opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Aluno \n"
							+ "2 - Adicionar Aluno em uma Posição \n" + "3 - Vizualizar Dados \n"
							+ "4 - Procurar por numero \n" + "5 - Remover por numero \n" + "6 - *Limpar Lista*"
							+ "\n Tamanho da Lista = " + lse.size() + "\n" + "9 - Fim"));

				} else if (lse.size() == 1) {

					opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Aluno \n"
							+ "2 - Adicionar Aluno em uma Posição \n" + "3 - Vizualizar Dado \n"
							+ "4 - Remover único aluno \n" + "\n Tamanho da Lista = " + lse.size() + "\n" + "9 - Fim"));

				} else {
					opc = Integer.parseInt(JOptionPane.showInputDialog(
							"1 - Adicionar Aluno \n" + "\nTamanho da Lista = " + lse.size() + "\n" + "9 - Fim"));

				}

			} catch (Exception e) {

			}

			ModificadoresDoAluno rda = new ModificadoresDoAluno();

			sinal = rda.verificarOpcao(opc, lse);

		}
	}

}
