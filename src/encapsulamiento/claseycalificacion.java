package encapsulamiento;

public class claseycalificacion {

	private String curso;
	private int nota1;
	private int nota2;
	private int nota3;
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		 if (nota1 >= 0 && nota1 <= 100) {
		        this.nota1 = nota1;
		    } else {
		        System.out.println("Nota inválida. Se asigna 0.");
		        this.nota1 = 0;
		    }
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		 if (nota1 >= 0 && nota2 <= 100) {
		        this.nota2 = nota2;
		    } else {
		        System.out.println("Nota inválida. Se asigna 0.");
		        this.nota2 = 0;
		    }
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		 if (nota1 >= 0 && nota3 <= 100) {
		        this.nota3 = nota3;
		    } else {
		        System.out.println("Nota inválida. Se asigna 0.");
		        this.nota3 = 0;
		    }
	}




	public double promedio() {
		return (nota1 + nota2 + nota3) / 3;
	}

	public void estado() {
		if(promedio() >= 61) {
			System.out.println("Felilsitaciones has aprobado");
		}
		else {
			System.out.println("Lo sineto has reprobado");
		}
		
	}
}
