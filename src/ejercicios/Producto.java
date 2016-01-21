package ejercicios;

public class Producto {
	private int id;
	private String nombreProducto;
	private double precioProducto;
	
	public Producto(int id, String nombre, double precio){
		this.id=id;
		this.nombreProducto=nombre;
		this.precioProducto=precio;
	}

	public int getId() {
		return id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	@Override
	public String toString() {
		return "Producto: [id=" + id + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + "]";
	}
	public static void main(String[] args){
		Producto p=new Producto(2,"gel",2.2);
		System.out.println(p);
	}
		
}
