package listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leemos mediante Scanner 10 enteros
		//hacemos operaciones con ellos
		//Definimos el Scanner
		Scanner in = new Scanner(System.in);
		//Definimos la lista
		List<Integer> listaEnteros=new ArrayList<Integer>();
		System.out.println("Introduce 5 enteros: ");
		for(int i=0;i<5;i++){
			listaEnteros.add(in.nextInt());
		}
		//cerramos el scanner
		in.close();
		System.out.println(listaEnteros);
		//imprimimos el tamaño de la lista
		System.out.println("Tamaño: "+listaEnteros.size());
		//imprimimos el primer elemento de la listaç
		if(listaEnteros.size()>0){
			System.out.println("Primer elemento: "+listaEnteros.get(0));
			System.out.println("Último elemento: "+listaEnteros.get(listaEnteros.size()-1));
		}
		//añadir otro elemento
		listaEnteros.add(56);
		//añadimos otro elemento a la posicion 0
		listaEnteros.add(0, 100);
		System.out.println(listaEnteros);
		//quitamos elementos
		
		listaEnteros.remove(0);
		listaEnteros.remove(4);
		listaEnteros.remove(new Integer(1));
		System.out.println(listaEnteros);
		
	
	}

}
