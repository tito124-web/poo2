package encapsulamiento;

public class producto {

	

	private String codigo;
	private String nombre;
	private int precio;
	private int stock;
	private int cantidad;
	

public void vender(int cantidad) {
    if (cantidad <= 0) {
        System.out.println("La cantidad debe ser mayor a 0.");
    } else if (cantidad <= stock) {
        stock = stock - cantidad; // 
        System.out.println("Venta exitosa. Stock restante: " + stock);
    } else {
        System.out.println("Stock insuficiente. Stock disponible: " + stock);
    }
}
		
		


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		if (stock >= 0)
		this.stock = stock;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		if (precio <= 0) {
			System.out.println("el precio no puede ser 0");
		this.precio = 0;}
		else {
			this.precio = precio;
		}
	}


	public double carDescuento(int porcentaje) {
		 return precio = precio - (precio * porcentaje / 100);
		
	}
	

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
