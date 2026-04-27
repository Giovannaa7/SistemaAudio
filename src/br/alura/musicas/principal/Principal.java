package br.alura.musicas.principal;

import br.alura.musicas.modelos.*;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Shape of You");
        musica.setCantor("Ed Sheeran");

        for (int i = 0; i < 6000; i++) {
            musica.reproduzir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow Podcast");

        for (int i = 0; i < 12000; i++) {
            podcast.curtir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.tipoPreferida(musica);
        preferidas.tipoPreferida(podcast);
    }
}