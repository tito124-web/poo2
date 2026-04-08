package encapsulamiento;

public class Juego {
	private int puntajeactual;
	private int puntajemaximo;
	private String name;
	public int getPuntajeactual() {
		return puntajeactual;
	}
	public void setPuntajeactual(int puntajeactual) {
		if (puntajeactual < 0) {
			throw new IllegalArgumentException(
			"el numero no puede ser negativo"		);
			
		}
		this.puntajeactual = puntajeactual;
	}
	public int getPuntajemaximo() {
		return puntajemaximo;
	}
	public void setPuntajemaximo(int puntajemaximo) {
		this.puntajemaximo = puntajemaximo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void actualizarPuntaje(int nuevoPuntaje) {
		if(nuevoPuntaje > puntajemaximo) {
			this.puntajemaximo = nuevoPuntaje;
		}
		
	}
}
