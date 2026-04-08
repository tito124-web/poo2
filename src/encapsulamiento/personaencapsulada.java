package encapsulamiento;

public class personaencapsulada {
	private String  nombre;
	private String apellido;
	private int edad;
	
	
	public personaencapsulada(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void  setEdad(int edad) {
		
		if (edad < 0) 	{	System.out.println("ocurrio un error al ingresar la edad ");
			
		
		this.edad = 0;}
		else {
			
			this.edad = edad;
			
		}
		
	
	
	
	}
		



public String mostrar() {
	
	 return "El nombre es " + nombre + " el apellido es " + apellido + " y la edad es " + edad;
	
	
	
}
}
