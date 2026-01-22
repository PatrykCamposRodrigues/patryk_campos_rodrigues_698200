package br.gov.mt.artistasapi.dto;

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
