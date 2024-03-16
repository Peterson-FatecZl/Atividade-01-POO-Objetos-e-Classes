package controller_exercicio_3;

public class Funcionario {
	
	private String nome ;
	private double salario;
	private String cargo;
	
	//Contrutor
	public Funcionario() {
		this.nome = "";
		this.salario = 0;
		this.cargo = "";
	}
	
	
	//Metodos
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String Nome){
		this.nome = Nome;
		System.out.println("Nome Registrado");
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double Salario){
		if(Salario < 1412) {
			System.out.println("O Valor Inserido é Menor do que um Salário Mínimo");
		
		}else {
			this.salario = Salario;
			System.out.println("Salário Registrado");
		}
	}
	
	public String getCargo(){
		return this.cargo;
	}
	
	public void setCargo(String Cargo){
		this.cargo = Cargo;
		System.out.println("Cargo Registrado");
	}
	
	public double getSalarioLiquido(double Descontos, double Beneficios){
		double salarioBruto = getSalario();
		double valorASerDescontado = Descontos * this.salario;
		double valorDoBeneficioASerAdicionado = Beneficios * this.salario;

		double salarioLiquido = (salarioBruto + valorDoBeneficioASerAdicionado) - valorASerDescontado;
		
		if(salarioLiquido < 1412) {
			return 1412;
		}else {
			return salarioLiquido;
		}
	}
	
}
