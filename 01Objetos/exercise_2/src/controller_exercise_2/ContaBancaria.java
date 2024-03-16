package controller_exercise_2;

public class ContaBancaria {

	public int numeroConta;
	public String nome;
	public double saldo;

	// Constructor
	public ContaBancaria() {

		this.numeroConta = 0;
		this.nome = "";
		this.saldo = 0.0;
	}

	// Methods
	public void realizaDeposito(double valor) {
		this.saldo += valor;
		System.out.printf("You deposited $%.2f your balance is: $%.2f %n", valor, this.saldo);
	}

	public void realizaSaque(double valor) {
		this.saldo -= valor;
		System.out.printf("You withdrew $%.2f your balance is: $%.2f %n", valor, this.saldo);
	}

}
