
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Fran
 * @version 1.0
 * Clase que incorpora una coleccion de datos
 * y realiza operaciones estadísticas sobre ellos
 */

public class Datos {
	//atributos de acuerdo al UML
	private List<Double> temperaturas;
	//Constructor que inciializa la lista a vacía
	public Datos(List<Double> temperaturas){
		this.temperaturas=temperaturas;
	}
	/**
	 * 
	 * @return valor medio
	 */
	public double calcularValorMedio(){
		double suma=0;
		for(Double double1: temperaturas){
			suma+=double1;
		}
		return suma/this.temperaturas.size();
	}
	/**
	 * 
	 * @return desviación típica
	 */
	public double calcularDesviacionTipica(){
		double suma=0;
		for(Double double1: temperaturas){
			suma+=Math.pow(double1-this.calcularValorMedio(),2);
		}
		return Math.sqrt(suma/(this.temperaturas.size()-1));
	}
	public int calcularNValoresMedia(){
		int contador=0;
			for (Double double1 : temperaturas) {
				if(double1<this.calcularValorMedio()){
					contador++;
				}
			}
		return contador;
	}
	/**
	 * 
	 * @return valor máximo
	 */
	public double calcularValorMaximo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(this.temperaturas.size()-1);
	}
	/**
	 * 
	 * @return valor mínimo
	 */
	public double calcularValorMinimo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(0);
		
	}
	@Override
	public String toString() {
		return "Datos [temperaturas=" + temperaturas + "]";
	}
	
	

}
