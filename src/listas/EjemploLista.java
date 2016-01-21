package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos una lista de cadenas (String)
		List<String> listaCadenas = new ArrayList<String>();
		// Añadimos mediante Scanner las cadenas
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadenas de texto (fin para acabar)");
		String cadena = sc.next();
		//while(cadena.toLowerCase()!="fin"){ || No funciona, compara posiciones de memoria
		while(!cadena.toLowerCase().equals("fin")){
			listaCadenas.add(cadena);
			cadena = sc.next();
		}
		// Cierro el Scanner
		sc.close();
		// Conocemos el contenido de la lista
		System.out.println("Número de palabras: "+listaCadenas.size());
		System.out.println(listaCadenas); //Funciona, no da posicion de memoria
		System.out.println("¿Contiene a Pedro? "+listaCadenas.contains("Pedro"));
		if(listaCadenas.contains("Pedro")){
			System.out.println("Está en la posicion: "+listaCadenas.lastIndexOf("pedro"));
		}
		if(listaCadenas.size()>0){
		System.out.println("Primera palabra: "+listaCadenas.get(0));
		}
		// Recorremos la lista e imprimimos las palabras en una única línea
		// Forma 1: clásica
		System.out.println("Primera forma: ");
		for(int i=0;i<listaCadenas.size();i++){
			System.out.println(listaCadenas.get(i));
		}
		// Forma 2: bucle mejorado
		System.out.println("Segunda forma: ");
		for (String string : listaCadenas) {
			System.out.println(string);
		}
		// Forma 3: java 8
		System.out.println("Tercera forma: ");
		listaCadenas.forEach(System.out::println);
	}

}
