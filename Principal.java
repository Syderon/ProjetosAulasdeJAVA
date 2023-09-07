package herança;

public class Principal {
	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		//pessoa.nome= "José";
		//System.out.println(pessoa.nome);
		
		Aluno aluno = new Aluno("José","456843485","Av. Abdias de Carvalho, 1678",1,"Cursos de TI", "3001");

		
		Aluno aluno2 = new Aluno("Maria","1111112123","Rua Gomes taborda, 75",2,"Direito", "3002");
		
		System.out.println("Alunos: "+aluno.getMatricula()+" "+aluno.getNome()+ " "+aluno.toString());
		System.out.println("Alunos: "+aluno2.getMatricula()+" "+aluno2.getNome()+ " " +aluno2.toString());
		
		System.out.println(aluno.cod);
		System.out.println(aluno2.cod);
		
				
	}
}
