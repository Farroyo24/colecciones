package arrays;

import java.util.Arrays;

public class TestColeccion1 {

	public static void main(String[] args) {
		/*Coleccion1 c1=new Coleccion1();
		int[] array=c1.getArray();
		//asignamos el valor 5 a la ultima posicion del array
		array[array.length-1]=5;
		//asignamos los demas valores
		int multiplicador=3;
		for(int i=0;i<array.length-1;i++){
			array[i]=multiplicador;
			multiplicador*=2;
		}
		//sumamos los valores de los elementos
		int suma=0;
		for(int i=0;i<array.length-1;i++){
			suma=suma+array[i];
		}
		System.out.println("La suma de los elementos es: "+suma);
		//cambiamos los 5 ultimos valores del array y los dividimos por 3
		for(int i=1;i<=5;i++){
		array[array.length-i]/=3;
		}
		
		//calculamos el valor mas pequeño del array
		int menor=0;
		for(int i=0;i<array.length;i++){
			if(array[i]<array[i]+1){
				menor=array[i];
			}else{
				menor=array[i];
			}
		}
		System.out.println("El valor mas pequeño del array es: "+menor);
		
		
		
		
		//Mostramos el contenido del array
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}*/
		Coleccion1 c=new Coleccion1();
		//valor 5 a la ultima posicion
		c.setArray(c.calcularLongitudArray()-1, 5);
		//valor 3 a la posicion 0 y el doble al resto de posiciones sucesivamente
		c.setArray(0, 3);
		for(int i=1;i<c.calcularLongitudArray()-1;i++){
			int valor=c.valorDePosicion(i-1);
			c.setArray(i,valor*2);
		}
		System.out.println(c);
		//calculamos la suma de los valores del array
		int suma=0;
		for(int i=0;i<c.calcularLongitudArray();i++){
			suma+=c.valorDePosicion(i);
		}
		System.out.println("La suma de los valores es: "+suma);
		//cambiar el valor del array y dividir los ultimos 5 valores por 3
		int contador=0;
		for(int i=c.calcularLongitudArray()-1; ;i--){
			c.setArray(i, c.valorDePosicion(i)/3);
			contador++;
			if(contador==5){
				break;
			}
		}
		System.out.println(c);
		//mostramos el valor mas pequeño
		c.ordenarArray();
		System.out.println("Elemento mas pequeño: "+c.valorDePosicion(0));
		System.out.println(c);
		//imprimirlo con printf en 4 columnas y 3 filas
		contador=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.printf("%5d",c.valorDePosicion(contador++));
			}
			System.out.println();
		}
	}

}
