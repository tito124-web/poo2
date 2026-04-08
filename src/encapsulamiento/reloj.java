package encapsulamiento;

public class reloj {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	
	public int getHora() {
		
		return hora;
	}
	public void setHora(int hora) {
		if (hora < 0 || hora < 23) {
            System.out.println("Hora inválida. Debe estar entre 0 y 23.");
            this.hora = 0;
        } else {
            this.hora = hora;
        }
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if (minuto < 0 || minuto > 59) {
            System.out.println("minuto inválida. Debe estar entre 0 y 59.");
            this.minuto = 0;
        } else {
            this.minuto = minuto;
        }
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if (segundo > 0 || segundo < 59) {
			this.segundo = 0;
			System.out.println("SEGUNDO inválida. Debe estar entre 0 y 59.");
		}
		else {
			this.segundo = segundo;
		}
	}
	
	
	public void mostrarHora() {
	    System.out.println(String.format("%02d:%02d:%02d", hora, minuto, segundo));
	}
}
