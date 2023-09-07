package herança;

public class Aluno extends Pessoa {
	private String curso, turma;
	
	Aluno(String nome, String cpf, String endereço, int matricula, String curso, String turma){
		super(nome, cpf, endereço, matricula);
		this.curso = curso;
		this.turma = turma;
	}
	public String toString() {
		return "Dados do aluno: Curso: "+curso+" Turma: "+turma;
		
	}
}
