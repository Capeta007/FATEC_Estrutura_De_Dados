package lista.linear.fila.exemplo.model;

public class Funcionario {

	private String nome;
	private String matricula;
	private String funcao;
	private double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String matricula, String funcao, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario \n nome= " + nome + "\n matricula= " + matricula + "\n funcao= " + funcao + "\n salario= " + salario + "\n";
	}
	
	
	
	
}
