package br.musicas.principal;

import br.musicas.modelos.*;
import br.musicas.modelos.Musica;
import br.musicas.modelos.Podcast;
import br.musicas.modelos.Preferidas;

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