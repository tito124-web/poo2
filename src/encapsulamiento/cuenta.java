package encapsulamiento;

public class cuenta {

	private String titular;
	private double saldo;
	private int  pin;
	
	
	
	public cuenta(String titular, double saldo, int pin) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.pin = 1234;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
	if (saldo < 1.0) {System.out.println("no se permiten numeros negativos");}
			
		else this.saldo = saldo;
	}
	
	public double retirar(double monto, int pinIngresado) {
		 if (pinIngresado != this.pin) {
	           System.out.println("PIN incorrecto. Retiro denegado.");
	           
	            
	        }
		 else if (monto > this.saldo) {
			 System.out.println("Lo sentimos el saldo es insuficiente ");
		 }
		 else {
			 return monto = monto - this.saldo;
			 
		 }
		 return monto;
		
	}
	
	
	
	
	public double depositar(double monto) {
		if (monto < 1.0) {System.out.println("no se permiten numeros negativos");}
		
		
		 return saldo + monto;
		
		
		
		
	}
	
	public double retirar(double monto) {
		return saldo - monto;
	

}
}
