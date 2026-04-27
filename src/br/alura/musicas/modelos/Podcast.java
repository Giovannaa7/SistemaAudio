package br.alura.musicas.modelos;

public class Podcast extends Audio {
    private String tema;
    private String apresentador;
    private String descricao;

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 10000) {
            return 10;
        } else {
            return 7;
        }
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}