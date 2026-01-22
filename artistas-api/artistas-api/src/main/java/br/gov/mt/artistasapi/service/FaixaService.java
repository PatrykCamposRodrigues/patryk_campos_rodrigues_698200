package br.gov.mt.artistasapi.service;

import br.gov.mt.artistasapi.model.Album;
import br.gov.mt.artistasapi.model.Faixa;
import br.gov.mt.artistasapi.repository.AlbumRepository;
import br.gov.mt.artistasapi.repository.FaixaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaixaService {

    private final FaixaRepository faixaRepository;
    private final AlbumRepository albumRepository;

    public FaixaService(FaixaRepository faixaRepository, AlbumRepository albumRepository) {
        this.faixaRepository = faixaRepository;
        this.albumRepository = albumRepository;
    }

    public Faixa salvar(String titulo, Integer numeroFaixa, Integer duracaoSegundos, Long albumId) {
        Album album = albumRepository.findById(albumId)
                .orElseThrow(() -> new RuntimeException("Álbum não encontrado"));

       Faixa faixa = new Faixa();
faixa.setTitulo(titulo);
faixa.setNumeroFaixa(numeroFaixa);
faixa.setDuracaoSegundos(duracaoSegundos);
faixa.setAlbum(album);


        return faixaRepository.save(faixa);
    }

    public List<Faixa> listar() {
        return faixaRepository.findAll();
    }
}
