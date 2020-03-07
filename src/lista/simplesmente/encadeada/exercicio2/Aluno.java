package lista.simplesmente.encadeada.exercicio2;

public class Aluno {
	
	private String numMatricula;
	private String nome;
	private String disciplina;
	private float notap1;
	private float notap2;
	private float notaSub;
	private float notaEx;
	
	public Aluno(String numMatricula, String nome, String disciplina, float notap1, float notap2, float notaSub, float notaEx) {
		super();
		this.numMatricula = numMatricula;
		this.nome = nome;
		this.disciplina = disciplina;
		this.notap1 = notap1;
		this.notap2 = notap2;
		this.notaSub = notaSub;
		this.notaEx = notaEx;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getNotap1() {
		return notap1;
	}

	public void setNotap1(float notap1) {
		this.notap1 = notap1;
	}

	public float getNotap2() {
		return notap2;
	}

	public void setNotap2(float notap2) {
		this.notap2 = notap2;
	}

	public float getNotaSub() {
		return notaSub;
	}

	public void setNotaSub(float notaSub) {
		this.notaSub = notaSub;
	}

	public float getNotaEx() {
		return notaEx;
	}

	public void setNotaEx(float notaEx) {
		this.notaEx = notaEx;
	}

	@Override
	public String toString() {
		return "Aluno [numMatricula=" + numMatricula + ", nome=" + nome + ", disciplina=" + disciplina + ", notap1="
				+ notap1 + ", notap2=" + notap2 + ", notaSub=" + notaSub + ", notaEx=" + notaEx + "]";
	}
	
	public double calcMedia() {
		return ((notap1+notap2)/2);
	}

	
}
