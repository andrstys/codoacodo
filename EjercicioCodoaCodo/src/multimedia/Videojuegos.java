package multimedia;

public class Videojuegos implements Entregable {

	private String titulo, genero="Desconocido", compañia="Desconocido";
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
	
	public Videojuegos(String titulo, String compañia, String genero, int horasEstimadas) {
		this.titulo=titulo;
		this.compañia=compañia;
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
	
	
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia=compañia;
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
		return "Título: "+titulo+" / Compañía: "+compañia+" / Genero: "+genero+" / Duración: "+horasEstimadas+" horas";
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
