package view_exercise_2;

import controller_exercise_2.ContaBancaria;

public class Main_Exercise_2 {

	public static void main(String[] args) {

		ContaBancaria contaBancaria = new ContaBancaria();
		
		contaBancaria.saldo = 5000;
		
		contaBancaria.realizaSaque(1250);
		contaBancaria.realizaDeposito(4000);
	}

}
