package lista.linear.utilizando.referencia;


public class Aluno {

	private String nome;
	private String ra;
	private int idade;
	private String curso;
	private int semestre;
	
	
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String ra, int idade, String curso, int semestre) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.idade = idade;
		this.curso = curso;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", ra=" + ra + ", idade=" + idade + ", curso=" + curso + ", semestre=" + semestre
				+ "]";
	}
	
	
	
	
}
