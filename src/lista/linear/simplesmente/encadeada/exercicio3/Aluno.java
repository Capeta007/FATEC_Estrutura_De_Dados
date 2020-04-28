package lista.linear.simplesmente.encadeada.exercicio3;


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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ra == null) ? 0 : ra.hashCode());
		result = prime * result + semestre;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ra == null) {
			if (other.ra != null)
				return false;
		} else if (!ra.equals(other.ra))
			return false;
		if (semestre != other.semestre)
			return false;
		return true;
	}
	
}
