package encapsulamiento;

public class Facturacion {
	 private String codigoFactura;
	    private String descripcion;
	    private int cantidad;
	    private double precioUnitario;
		public String getCodigoFactura() {
			return codigoFactura;
		}
		public void setCodigoFactura(String codigoFactura) {
			this.codigoFactura = codigoFactura;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			  if (cantidad > 0) {
		            this.cantidad = cantidad;
		        } else {
		            System.out.println("Error: la cantidad debe ser mayor a 0.");
		        }
		}
		public double getPrecioUnitario() {
			return precioUnitario;
		}
		public void setPrecioUnitario(double precioUnitario) {
			 if (precioUnitario > 0) {
		            this.precioUnitario = precioUnitario;
		        } else {
		           System.out.println("Error: el precio unitario debe ser mayor a 0.");
		        }
			 }
			 
			 public double calcularTotal() {
			        return cantidad * precioUnitario;
			    }

			    public void mostrarFactura() {
			        System.out.println("===== FACTURA =====");
			        System.out.println("Código:          " + codigoFactura);
			        System.out.println("Descripción:     " + descripcion);
			        System.out.println("Cantidad:        " + cantidad);
			        System.out.println("Precio unitario: Q" + precioUnitario);
			        System.out.println("Total:           Q" + calcularTotal());
			        System.out.println("===================");
			    
			 
			 
			 
			 
		}
}
