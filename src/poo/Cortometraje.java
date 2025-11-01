package poo;

import uni1a.ContenidoAudiovisual; 

public class Cortometraje extends ContenidoAudiovisual {

    private String director;

    public Cortometraje(String titulo, int duracion, String genero, String director) {
        super(titulo, duracion, genero);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

 
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + this.director);
        System.out.println();
    }
}