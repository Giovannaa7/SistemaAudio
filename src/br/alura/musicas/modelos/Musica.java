package br.alura.musicas.modelos;

public class Musica extends Audio {
    private String cantor;
    private String genero;
    private String album;

    @Override
    public int getClassificacao() {
        if (getTotalDeReproducao() >= 5000) {
            return 10;
        } else {
            return 7;
        }
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}