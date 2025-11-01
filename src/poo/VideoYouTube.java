package poo;

import uni1a.ContenidoAudiovisual; 

public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
    private int likes;

    public VideoYouTube(String titulo, int duracion, String genero, String canal, int likes) {
        
        super(titulo, duracion, genero);
        this.canal = canal;
        this.likes = likes;
    }

    public String getCanal() {
        return canal;
    }

    public int getLikes() {
        return likes;
    }


    public void mostrarDetalles() {
        System.out.println("Detalles del Video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + this.canal);
        System.out.println("Likes: " + this.likes);
        System.out.println();
    }
}