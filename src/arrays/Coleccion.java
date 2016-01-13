package arrays;

public class Coleccion {
	static double[][] vector;
	
	public Coleccion(int fila, int columna){
		this.vector=new double[fila][columna];
	}

	public Coleccion(double[][] vector) {
		this.vector = vector;
	}
	public static void llenarColeccion(int numeroMultiplicador){
		for (int i = 0; i <vector.length; i++){
			for(int j=0;j<vector[i].length;j++){
		//		double numeroAlmacenar = Math.random()*numeroMultiplicador;
				vector[i][j]=Math.random()*numeroMultiplicador;
			//	numeroAlmacenar*=numeroMultiplicador;		}
		}
	}

	@Override
	public String toString() {
		return "";
	}
	
	
	
}
