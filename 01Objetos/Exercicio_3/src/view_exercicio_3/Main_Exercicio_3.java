package view_exercicio_3;

import controller_exercicio_3.Funcionario;

public class Main_Exercicio_3 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionarioSalarioMenorQueOValorMinimo = new Funcionario();

		//Teste Mwetodos Set
		funcionario.setNome("Anonimous");
		funcionario.setSalario(5000.00);
		funcionario.setCargo("Desenvolvedor");
	
		//Teste Metodos Get
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getCargo());
	
		System.out.println(funcionario.getSalarioLiquido(0.1, 0.03));
		
		//Teste Salario < que salario minimo
		funcionarioSalarioMenorQueOValorMinimo.setSalario(1000);//retorna aviso e não registra salario
		
		System.out.println(funcionario.getSalarioLiquido(1.0, 0));//retorna salario minimo
	}

}
