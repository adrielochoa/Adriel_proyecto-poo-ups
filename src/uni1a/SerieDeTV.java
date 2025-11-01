package uni1a; 

import java.util.ArrayList; 
import java.util.List; 
import poo.Temporada; 

public class SerieDeTV extends ContenidoAudiovisual {
    
    private int temporadas; 
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracion, String genero, int temporadas) {
        super(titulo, duracion, genero); 
        this.temporadas = temporadas; 
        this.listaTemporadas = new ArrayList<>(); 
    }

    public void addTemporada(Temporada temp) {
        this.listaTemporadas.add(temp);
    }
    
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() { 
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println(); 
    }
}