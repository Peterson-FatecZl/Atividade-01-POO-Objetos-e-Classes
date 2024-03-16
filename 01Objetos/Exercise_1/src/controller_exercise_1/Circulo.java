package controller_exercise_1;

public class Circulo {

	public double raio;

	// Constructors
	public Circulo() {
		this.raio = 0.0;
	}

	// Methods
	public double getPerimetro() {

		double PI = Math.PI;
		return 2 * PI * raio;

	}

	public double getArea() {

		double PI = Math.PI;
		return PI * (raio * raio);
	}

}
