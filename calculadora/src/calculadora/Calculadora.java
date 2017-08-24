package calculadora;

public class Calculadora {
public double estado;
	public void sumar(double a, double b) {

		estado= a+b;
	}

	public void restar(double a, double b) {

		estado= a+b;

	}

	public void multiplicar(double a, double b) {

		estado =a * b;

	}
	public void multiplicar(double a) {

		estado =a * estado;

	}


	public void dividir(double a, double b) {

		estado=  a / b;

	}

	public void potencia(double ba, double ex) {
		
	estado=1;
			
			for (int i = 1; i < ex; i++)
				 multiplicar (ba, estado);
		
	
	}

}