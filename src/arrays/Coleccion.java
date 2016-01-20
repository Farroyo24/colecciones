
package arrays;
import java.util.Arrays;
public class Coleccion {
	private double[][] vector;
	//private double[][] vector???
	//constructor inicializa vector como una matriz
	//de filas y columnas (filas X columnas)
	
	public Coleccion(int fila, int columna){
		this.vector=new double[fila][columna];
	}

	public Coleccion(double[][] vector) {
		this.vector = vector;
	}
	//metodo que rellena el array de forma aleatoria
	//usamos Math.random() y un multiplicador
	public void llenarColeccion(int numeroMultiplicador){
		for (int i = 0; i <vector.length; i++){
			for(int j=0;j<vector[i].length;j++){
				vector[i][j]=Math.random()*numeroMultiplicador;
			}
	
		}
	}
	public void mostrarColeccion(){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j<vector[i].length; j++) {
				System.out.printf("%.1f ", vector[i][j]);
			}
			System.out.println();//salto de linea;
		}
	}
	public double mostrarMenor(){
		double menor=vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j<vector[i].length; j++) {
				if(vector[i][j]<menor){
					menor=vector[i][j];
				}
			}
		}
		return menor;
	}
	public double mostrarMayor(){
		double mayor=vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j<vector[i].length; j++) {
				if(vector[i][j]>mayor){
					mayor=vector[i][j];
				}
			}
		}
		return mayor;
	}
	public double mostrarMedia(){
		double suma=0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j<vector[i].length; j++) {
				suma+=vector[i][j];
			}
		}
		double media=suma/(vector.length*vector[0].length);
		return media;
	}
	/*public static void sort(double[] a){
		double[] arr={0,1,2,3,4};
		double[] arr2={0,5,10};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr2.length; j++) {
				System.out.printf
			}
		}
	}*/
	public void convertirArray(){
		double[] arrayConvertido=new double[vector.length*vector[0].length];
		int contador=0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j<vector[i].length; j++) {
				//arrayConvertido=
			}
		}
	}
	public void calcularValoresEstadisticos(){
		int tamano=vector.length*vector[0].length;
		double[] vectorUnidimensional=new double[tamano];
		int contador=0;
		for(double[] ds : vector){
			for(double d : ds){
				vectorUnidimensional[contador]=d;
				contador++;
			}
		}
		Arrays.sort(vectorUnidimensional);
		System.out.printf("Valor mas grande: %.2f  y el mas pequeño %.2f%n", vectorUnidimensional[vectorUnidimensional.length-1], vectorUnidimensional[0]);
	}
	@Override
	public String toString(){
		String vectorCadena="";
		//logica
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j<vector[i].length; j++) {
				vectorCadena+=this.vector[i][j]+"-";
			}
		}
		return vectorCadena.substring(0,vectorCadena.length()-1);
	}
	
	
	
}
