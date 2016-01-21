package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto>listaProductos;
	//creo la lista vacía
	public Tienda(){
		this.listaProductos=new ArrayList<Producto>();
	}
	//método que añade productos
	public void addProducto(Producto p){
		this.listaProductos.add(p);
	}
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void eliminarProducto(Producto p){
		this.listaProductos.remove(p);
	}
	public Producto obtenerProductoMasCaro(){
		Producto productoMasCaro=listaProductos.get(0);
		//logica: recorremos la coleccion, comparamos
		//los precios(getPrecio()) y actualizamos si es 
		//necesario la variable productoMasCaro (es un objeto producto)
		for (Producto producto : listaProductos) {
			if(producto.getPrecioProducto()>productoMasCaro.getPrecioProducto()){
				productoMasCaro=producto;
			}
		}
		return productoMasCaro;
	}
	public Producto obtenerProductoMasBarato(){
		Producto productoMasBarato=listaProductos.get(0);
		//logica: recorremos la coleccion, comparamos
		//los precios(getPrecio()) y actualizamos si es 
		//necesario la variable productoMasCaro (es un objeto producto)
		for (Producto producto : listaProductos) {
			if(producto.getPrecioProducto()<productoMasBarato.getPrecioProducto()){
				productoMasBarato=producto;
			}
		}
		return productoMasBarato;
	}
	public String listarProductos(){
		return listaProductos.toString();
	}
	@Override
	public String toString() {
		return "Tienda [listaProductos=" + listaProductos + "]";
	}
	//método que le pasamos String nombre del producto y devuelve
	//la posicion del objeto
	
	
	
	

}
