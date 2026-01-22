package br.gov.mt.artistasapi.controller;

public class FaixaRequest {

    private String titulo;
    private Integer numeroFaixa;
    private Integer duracaoSegundos;
    private Long albumId;

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroFaixa() {
        return numeroFaixa;
    }

    public Integer getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public Long getAlbumId() {
        return albumId;
    }
}
