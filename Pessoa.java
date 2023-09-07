package herança;

public class Pessoa {
	private String nome;
	public String cpf;
	public int matricula;
	public String endereço;
	public static int cod;
	
	public Pessoa(String nome, String cpf, String endereço, int matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		cod++;
		this.matricula = cod;
		
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return matricula;
	}
}
