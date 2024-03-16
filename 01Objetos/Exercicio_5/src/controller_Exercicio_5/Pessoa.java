package controller_Exercicio_5;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome Registrado");
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(int ano, int mes,int dia) {
		this.dataNascimento = LocalDate.of(ano, mes, dia);
		if(getIdade()> 150) {
			System.out.println("Erro: A idade Ultrapassou 150 Anos");
			this.dataNascimento = null;
		}else {
			System.out.println("Data De Nascimento Registrada");
		}
	}
	
	public void getAttribute() {
		int diaNascimento = dataNascimento.getDayOfMonth();
		int mesNascimento = dataNascimento.getMonthValue();
		int anoNascimento = dataNascimento.getYear();
		
		System.out.println("Nome: "+this.nome);
		System.out.printf("Data De nascimento(dd/mm/aaaa): %d/%d/%d %n",diaNascimento,mesNascimento,anoNascimento);
		System.out.println("Profissão: "+this.profissao);
	}
	//Não Será imprementado pois Não está modelado da maneira esperada no exercício.
	public void setAttribute() {}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
		System.out.println("Profissão Registrada");
	}
	
	public int getIdade() {
		//Manipulação de tipos para tratamento correto das datas
		LocalDate dataAtual = LocalDate.now();
		String dataAtualEmString = String.valueOf(dataAtual);
		String[] dataAtualEmStringAnoMesDia = dataAtualEmString.split("-");
		
		//Data Atual no tipo inteiro
		int diaAtual = dataAtual.getDayOfMonth();
		int mesAtual = dataAtual.getMonthValue();
		int anoAtual = dataAtual.getYear();
		
		//data de nascimento no tipo inteiro
		int diaNascimento = dataNascimento.getDayOfMonth();
		int mesNascimento = dataNascimento.getMonthValue();
		int anoNascimento = dataNascimento.getYear();
		
		//Calculo de idade
		int idade = anoAtual - anoNascimento;
		
		if(mesNascimento > Integer.parseInt(dataAtualEmStringAnoMesDia[1])) {
			idade -= 1;
		}else if(mesNascimento == mesAtual && diaNascimento > diaAtual) {
			idade -= 1;
		}
		
		return idade;
	}
	
}
