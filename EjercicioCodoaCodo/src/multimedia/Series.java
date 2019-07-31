package multimedia;

public class Series implements Entregable {

	private String titulo, genero="Desconocido", creador="Desconocido";
	private int numTemporadas=3;
	private boolean prestado = false;
	public static int seriesPrestadas=0;
	
	//constructors
	
	public Series() {
	}
	
	public Series(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	
	public Series(String titulo, String creador, String genero, int numTemporadas) {
		this.titulo=titulo;
		this.creador=creador;
		this.genero=genero;
		this.numTemporadas=numTemporadas;
	}

	//getters and setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador=creador;
	}
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	
	public int getTemporadas() {
		return numTemporadas;
	}
	public void setTemporadas(int numTemporadas) {
		this.numTemporadas=numTemporadas;
	}
	
	//toString
	
	public String toString() {
		return "Título: "+titulo+" / Creador: "+creador+" / Género: "+genero+" / Temporadas: "+numTemporadas+" temporadas";
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
			seriesPrestadas++;
		}
	}
		
	public boolean compareTo(Object Series) {
		Series otherSeries = (Series) Series;
		return this.getTemporadas()<(otherSeries.getTemporadas());
	}

	
}
