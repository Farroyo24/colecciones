package arrays;

public class DeclararArrays {

	public static void main(String[] args) {
		// Declarar primer array (de enteros)
		// Creamos la referencia
		int[] referenciaEnteros;
		// Creamos el array
		referenciaEnteros = new int[3];
		// Inicializamos los datos
		referenciaEnteros[0]=12;
		referenciaEnteros[1]=13;
		referenciaEnteros[2]=14;
		// referenciaEnteros[4]=12; esa posición no existe
		for(int i=0;i<referenciaEnteros.length;i++){
			System.out.println("Valor"+i+": "+referenciaEnteros[i]);
		
		}
		//------------------------------------------------------------------
		// Declaramos y creamos el array
		double[] referenciaDoubles = new double[3];
		// Inicializamos los valores
		referenciaDoubles[0] = 12.1;
		referenciaDoubles[1] = 12.2;
		referenciaDoubles[2] = 12.3;
		// Recorremos el array
		for (int i = 0; i < referenciaDoubles.length; i++) {
			System.out.printf("Valor %d: %.2f%n",i,referenciaDoubles[i]);
		}
		//-------------------------------------------------------------------
		// Declaramos, craemos e inicializamos el array
		String[] referenciaCadenas = {"Hola"," ","mundo"};
		// Recorremos el array
		for (int i= 0;i  < referenciaCadenas.length;i ++) {
			System.out.print(referenciaCadenas[i]);
		}
		System.out.println(); // salto de línea
		//-------------------------------------------------------------------
		// Creamos e inicializamos array de boolean
		boolean[] referenciasBoolean = {true, false, true, true};
		for (int i = 0; i < referenciasBoolean.length; i++) {
			System.out.printf("%b ",referenciasBoolean[i]);
		}
		System.out.println(); // salto de línea
		//-------------------------------------------------------------------
		// Recorremos arrays con un bucle mejorado
		for(String cadena: referenciaCadenas){
			System.out.print(cadena);
		}
		System.out.println(); // salto de línea
		//-------------------------------------------------------------------
		for (boolean b : referenciasBoolean) {
			System.out.printf("%b ",b);
		}

	}

}
