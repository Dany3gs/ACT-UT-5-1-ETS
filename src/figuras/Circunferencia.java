package figuras;
/**
 *Esta clase calcula el diámetro y el área de un círculo con el método imprimir,
 * indicando también el color.
 * Tiene otro método que compara los resultados con y sin decimales.
 *
 * @version 1.0
 * @author dsmm
 * */

public class Circunferencia {
	private double radio;
	private String color = "rojo";
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public Circunferencia(double radio) {
		this.radio = radio;
		
	}
	
	
	public void imprimir() {
		
		/**
		 * Método para el cálculo
		 * */
		//String color = "rojo";
		System.out.println("Di�metro: " + 2 * radio);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}
	
	public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
		/**
		 * Método para la comparación, se instancia en la clase Test
		 * */
		
		double radio1 = this.radio;
		double radio2 = otro.getRadio();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}