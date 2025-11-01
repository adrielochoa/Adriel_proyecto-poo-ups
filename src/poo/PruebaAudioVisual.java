package poo;

import uni1a.ContenidoAudiovisual;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.Documental;

public class PruebaAudioVisual {

    public static void main(String[] args) {
        
        System.out.println("--- Probando sistema audiovisual ---");

        Pelicula peli1 = new Pelicula("Pulp Fiction", 154, "Crimen", "Miramax");
        Actor actor1 = new Actor("John Travolta");
        peli1.addActor(actor1);
        peli1.mostrarDetalles();
        
        SerieDeTV serie1 = new SerieDeTV("Breaking Bad", 50, "Drama", 5);
        Temporada temp1 = new Temporada(1);
        serie1.addTemporada(temp1);
        serie1.mostrarDetalles();
        
        Documental docu1 = new Documental("Cosmos", 60, "Ciencia", "Universo");
        Investigador inv1 = new Investigador("Neil deGrasse Tyson");
        docu1.addInvestigador(inv1);
        docu1.mostrarDetalles();

        VideoYouTube video1 = new VideoYouTube("Mi primer video", 10, "Entretenimiento", "AdrielVlogs", 150);
        video1.mostrarDetalles();
        
        Cortometraje corto1 = new Cortometraje("El regalo", 7, "Animación", "Jacobo Martínez");
        corto1.mostrarDetalles();

        System.out.println("--- Fin de la prueba ---");
    }
}