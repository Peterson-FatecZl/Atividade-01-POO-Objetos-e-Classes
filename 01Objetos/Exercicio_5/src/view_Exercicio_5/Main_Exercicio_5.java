package view_Exercicio_5;

import java.time.LocalDate;

import controller_Exercicio_5.Pessoa;

public class Main_Exercicio_5 {
	public static void main(String [ ]args) {
		Pessoa pessoa = new Pessoa();
		
//		teste Tratamento de idade
		pessoa.setDataNascimento(1800, 8, 8);
//		System.out.println(pessoa.getIdade());//Erro idade is null 
		
//		Teste Métodos
		pessoa.setNome("Pessoa Anonima");
		pessoa.setDataNascimento(2000, 2, 20);
		pessoa.setProfissao("Desenvolvedor(a)");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getDataNascimento());
		System.out.println(pessoa.getProfissao());
		System.out.println(pessoa.getIdade());
		
		pessoa.getAttribute();//????????
		
		
	}
}
