package figuras;
/**
 * Clase asignada como Main
 * Se instancian tres objetos de la clase Circunferencia, dos de ellas con valor similar para
 * comprobar si retorna correcto el método esIgual
 * Se instancia con objeto c1 el método imprimir para comprobar que los cálculos sean correctos
 *
 * @version 1.0
 * @author dsmm
 * */


public class Test {
	public static void main(String[] args) {
		Circunferencia c1 = new Circunferencia(5.5);
		Circunferencia c2 = new Circunferencia(10.1);
		Circunferencia c3 = new Circunferencia(10.9);
		
		/**
		 * Se crean condicionales para comprobar si aplica correcto el método esIgual
		 * */
		if (c2.esIgual(c3, false)) {
			System.out.println("c2 y c3: iguales sin considerar decimales");
		}
		
		if (c2.esIgual(c3, true))
			System.out.println("c2 y c3: iguales considerando decimales");
		
		c1.imprimir();
	}
}