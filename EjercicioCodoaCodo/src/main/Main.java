package main;
import multimedia.Series;
import multimedia.Videojuegos;

public class Main {

	public static void main(String[]args) {
		
		int i,j;
		Series[] listaSeries = new Series[5];
		Videojuegos[] listaJuegos = new Videojuegos[5];
		
		Videojuegos juegoTemp = new Videojuegos();
		Series serieTemp = new Series();
		
		listaSeries[0] = new Series("Game Of Thrones","D&D","Fantasía",8);
		listaSeries[1] = new Series("Breaking bad","Vince Gilligan");
		listaSeries[2] = new Series("Homeland","Alex Gansa","Thriller",7);
		listaSeries[3] = new Series("Mr. Robot","Sam Esmail");
		listaSeries[4] = new Series("Peaky Blinders","Robert Knight");
		
		listaJuegos[0] = new Videojuegos("The Witcher 3","CD Projekt RED","Open World",56);
		listaJuegos[1] = new Videojuegos("God Of War",20);
		listaJuegos[2] = new Videojuegos("Metal Gear Solid","Konami","Tactical Stealth Action",12);
		listaJuegos[3] = new Videojuegos("Assassins Creed","Ubisoft","Stealth Adventure",15);
		listaJuegos[4] = new Videojuegos("Symphony Of The Night",8);

		
		//series
		listaSeries[1].entregar();
		listaSeries[3].entregar();
		//juegos
		listaJuegos[2].entregar();
		listaJuegos[3].entregar();
		listaJuegos[4].entregar();
		
		for(i=0;i<5;i++) {
			listaSeries[i].isEntregado();
			listaJuegos[i].isEntregado();
		}
		
		System.out.println("Videojuegos prestados: "+Videojuegos.juegosPrestados+" - Series prestadas: "+Series.seriesPrestadas+"\n");
		
		for(i=0;i<5;i++) {
			listaSeries[i].devolver();
			listaJuegos[i].devolver();
		}
		
		//ordenar array de series y videojuegos 
		
		for(i=0;i<listaJuegos.length;i++) {
			for(j=i+1;j<listaJuegos.length;j++) {
				if(listaJuegos[i].compareTo(listaJuegos[j])){
					juegoTemp = listaJuegos[i];
					listaJuegos[i]=listaJuegos[j];
					listaJuegos[j]=juegoTemp;
				}
			}
		}
	
		for(i=0;i<listaSeries.length;i++) {
			for(j=i+1;j<listaSeries.length;j++) {
				if(listaSeries[i].compareTo(listaSeries[j])){
					serieTemp = listaSeries[i];
					listaSeries[i]=listaSeries[j];
					listaSeries[j]=serieTemp;
				}
			}
		}
		
		
		System.out.println("Videojuego con más horas estimadas:\n"+listaJuegos[0]
				+"\nSerie con más temporadas:\n"+listaSeries[0]);
		
		}
		
	
	}
	

	

