package grafos.exercicio4.view;

//Execicio 4 - Escreva um programa querecebacomo entrada uma matriz de adjacências para o grafo não-direcionado em sua forma triangular inferior, conforme ilustrado abaixoe retorne a matriz completa, obtendo a parte superior considerando a simetria.

import java.util.Scanner;

public class Program {

	private static char[] vt = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q' };

	public static void main(String[] args) {

		int[][] mat = obterMatrizInferior();

		mat = obterComplemento(mat);

		exibirMatriz(mat);
		
	}

	private static int[][] obterComplemento(int[][] mat) {


		int limit = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < limit; j++) {
				mat[j][i] = mat[i][j];
			}
			limit++;
		}
		return mat;

	}

	public static int[][] obterMatrizInferior() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de colunas da matriz: ");
		int size = sc.nextInt();

		int[][] mat = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("Digite o valor da linha " + i + " coluna " + j + ": ");
				mat[i][j] = sc.nextInt();
			}
		}

		sc.close();
		return mat;
	}
	
	public static void exibirMatriz(int[][] mat) {

		System.out.println();
		System.out.println("===Matriz Completa===");
		System.out.println();

		System.out.print(" ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print("  " + vt[i]);
		}

		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			System.out.print(vt[i] + "|");
			for (int j = 0; j < mat.length; j++) {
				System.out.print(" " + mat[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}

	}
}
