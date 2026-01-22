package br.gov.mt.artistasapi.service;

import br.gov.mt.artistasapi.model.Album;
import br.gov.mt.artistasapi.model.Artista;
import br.gov.mt.artistasapi.repository.AlbumRepository;
import br.gov.mt.artistasapi.repository.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;
    private final ArtistaRepository artistaRepository;

    public AlbumService(AlbumRepository albumRepository, ArtistaRepository artistaRepository) {
        this.albumRepository = albumRepository;
        this.artistaRepository = artistaRepository;
    }

    public Album criar(String titulo, Integer anoLancamento, Long artistaId) {
        Artista artista = artistaRepository.findById(artistaId)
                .orElseThrow(() -> new RuntimeException("Artista não encontrado"));

        Album album = new Album();
        album.setTitulo(titulo);
        album.setAnoLancamento(anoLancamento);
        album.setArtista(artista);

        return albumRepository.save(album);
    }

    public List<Album> listar() {
        return albumRepository.findAll();
    }
}
