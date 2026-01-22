package br.gov.mt.artistasapi.controller;

public class AlbumRequest {

    private String titulo;
    private Integer anoLancamento;
    private Long artistaId;

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public Long getArtistaId() {
        return artistaId;
    }
}
