package view_exercise_1;

import controller_exercise_1.Circulo;

public class Main_Execise_1 {
	public static void main(String[] args) {
	
		Circulo calcularCirculo = new Circulo();
		calcularCirculo.raio = 3;
		
		System.out.printf("The Perimeter of the circle is: %.2f%n",calcularCirculo.getPerimetro());
		System.out.printf("The Area of the circle is: %.2f%n",calcularCirculo.getArea());
	}

}
