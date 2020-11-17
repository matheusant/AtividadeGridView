package br.com.local.cardview;

public class Jogos {
    private String titulo;
    private String descricao;
    private String ranking;
    private int miniatura;

    public Jogos() {
    }

    public Jogos(String titulo, String descricao, String ranking, int miniatura) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.ranking = ranking;
        this.miniatura = miniatura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
