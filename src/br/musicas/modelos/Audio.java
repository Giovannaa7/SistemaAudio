package br.musicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int duracao;

    public void curtir(){
        totalCurtidas++;
    }

    public void reproduzir() {
        totalDeReproducao++;
    }

    // Método que será sobrescrito
    public int getClassificacao() {
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getDuracao() {
        return duracao;
    }
}