package encapsulamiento;

public class becado {
	private String nombre;
	private int carnet;
	private double promedio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCarnet() {
		return carnet;
	}
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		 if (promedio < 0 || promedio > 100) {
	            System.out.println("Promedio inválido. Debe estar entre 0 y 100.");
	            this.promedio = 0;
	        } else {
	            this.promedio = promedio;
	        }
		
		
	
	}
	
	
public Boolean esbecado() {
	return promedio >= 85;
	
	
	
	
	
	
}
@Override
public String toString() {
	return "nombre=" + nombre + ", carnet=" + carnet + ", promedio=" + promedio + esbecado();
}
}
