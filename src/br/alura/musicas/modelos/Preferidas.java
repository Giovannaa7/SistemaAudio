package br.alura.musicas.modelos;

public class Preferidas {

    public void tipoPreferida(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println("🎧 " + audio.getTitulo() + " é um dos mais ouvidos do momento!");
        } else {
            System.out.println("🎧 " + audio.getTitulo() + " ainda pode crescer em popularidade.");
        }
    }
}


