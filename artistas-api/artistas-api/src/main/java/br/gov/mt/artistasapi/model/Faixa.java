package br.gov.mt.artistasapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class Faixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(name = "duracao_segundos")
    private Integer duracaoSegundos;

    @Column(name = "numero_faixa")
    private Integer numeroFaixa;

    @JsonIgnoreProperties({"artista"})
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    public Faixa() {
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public Integer getNumeroFaixa() {
        return numeroFaixa;
    }

    public Album getAlbum() {
        return album;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoSegundos(Integer duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public void setNumeroFaixa(Integer numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
