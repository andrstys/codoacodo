package multimedia;

public class Videojuegos implements Entregable {

	private String titulo, genero="Desconocido", compa�ia="Desconocido";
	private int horasEstimadas=10;
	private boolean prestado = false;
	public static int juegosPrestados=0;
	
	//constructors
	
	public Videojuegos() {
		
	}
	
	public Videojuegos(String titulo, int horasEstimadas) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
	}
	
	public Videojuegos(String titulo, String compa�ia, String genero, int horasEstimadas) {
		this.titulo=titulo;
		this.compa�ia=compa�ia;
		this.genero=genero;
		this.horasEstimadas=horasEstimadas;
	}
	
	// getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public String getCompa�ia() {
		return compa�ia;
	}
	public void setCompa�ia(String compa�ia) {
		this.compa�ia=compa�ia;
	}
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public int getHoras() {
		return horasEstimadas;
	}
	public void setHoras(int horasEstimadas) {
		this.horasEstimadas=horasEstimadas;
	}
	
	//toString
	
	public String toString() {
		return "T�tulo: "+titulo+" / Compa��a: "+compa�ia+" / Genero: "+genero+" / Duraci�n: "+horasEstimadas+" horas";
	}
	
	
	//interface methods
	
	public void entregar() {
		prestado = true;
	}
	
	public void devolver() {
		prestado = false;
	}
	
	public void isEntregado() {
		if(prestado==true) {
			juegosPrestados++;
		}
	}
	
	
	public boolean compareTo(Object Videojuegos) {
		Videojuegos otherVideojuegos = (Videojuegos) Videojuegos;
		return this.getHoras()<(otherVideojuegos.getHoras());
	}

	
	
}
