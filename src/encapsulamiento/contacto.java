package encapsulamiento;

public class contacto {
	private String name;
	private String email;
	private String num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (!email.contains("@")){
		   throw new IllegalArgumentException(
	                "El email debe contener el carácter '@'."
	            );
				
		}
		
			this.email = email;
		
	      
		
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		if (num.length() != 8 || !num.matches("\\d+")) {
	        throw new IllegalArgumentException(
	            "El teléfono debe tener exactamente 8 dígitos."
	        );
	    }
		
	    this.num = num;
	
	}
	
	
	  public void mostrarContacto() {
	        System.out.println(String.format(
	            "Nombre: %s | Email: %s | Teléfono: %s",
	            name, email, num
	        ));
	    }
}
