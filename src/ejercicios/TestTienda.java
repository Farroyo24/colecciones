package ejercicios;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda tienda=new Tienda();
		//Creamos desde código objetos producto
		Producto producto1=new Producto(0,"gel",1.33);
		//lo añadimos a la tienda
		tienda.addProducto(producto1);
		Producto producto2=new Producto(1, "champú",2.33);
		tienda.addProducto(producto2);
		Producto producto3=new Producto(2, "crema",12.33);
		tienda.addProducto(producto3);
		Producto producto4=new Producto(3, "jabón",4.33);
		tienda.addProducto(producto4);
		//Qué pasa si imprimo el valor de tienda?
		System.out.println(tienda.listarProductos());
		System.out.println("Producto mas caro: ");
		System.out.println(tienda.obtenerProductoMasCaro());
		System.out.println("Producto mas barato: ");
		System.out.println(tienda.obtenerProductoMasBarato());
		
		Producto producto5=new Producto(3, "jabon",4.33);
		tienda.eliminarProducto(producto5);
		System.out.println(tienda.listarProductos());
		
		

	}

}
