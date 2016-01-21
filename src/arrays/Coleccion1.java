package arrays;

import java.util.Arrays;

public class Coleccion1 {
	private int[] array;
	
	public Coleccion1(){
		this.array=new int[12];
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int posicion, int numero) {
		if(posicion<=this.array.length){
			this.array[posicion]=numero;
		}
	}
	@Override
	public String toString(){
		return Arrays.toString(array);
	}
	public int calcularLongitudArray(){
		return this.array.length;
	}
	public int valorDePosicion(int posicion){
		if(posicion<=this.array.length){
			return this.array[posicion];
		}
		return -1;
	}
	public void ordenarArray(){
		Arrays.sort(array);
	}
	
	
}
