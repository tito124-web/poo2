package encapsulamiento;

public class termometro {
	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double temperatura) {
		if (temperatura < -273.15) {
            System.out.println("Temperatura inválida. No puede ser menor al cero absoluto (-273.15°C).");
            this.celsius = 0;
        } else {
            this.celsius = temperatura;
        }
	}
	
	
	
	public double getFahrenheit() {
		return (celsius * 9.0/5.0) + 32;
		
	}
	
}
