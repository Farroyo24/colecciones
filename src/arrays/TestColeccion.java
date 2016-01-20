package arrays;

public class TestColeccion {

	public static void main(String[] args) {
		Coleccion c=new Coleccion(3,4);
		c.llenarColeccion(10);
		c.mostrarColeccion();
		System.out.printf("Numero menor: %.1f%n", c.mostrarMenor());
		System.out.printf("Numero mayor: %.1f%n", c.mostrarMayor());
		System.out.printf("Media: %.1f%n", c.mostrarMedia());
		/*double[][] c2=new Coleccion{{1,2,3},{4,5,6}};

		double[][] valores=c.getVector();*/
		System.out.println(c);
		c.calcularValoresEstadisticos();
		
	}

}
