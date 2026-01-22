package br.gov.mt.artistasapi.service;

import br.gov.mt.artistasapi.model.Artista;
import br.gov.mt.artistasapi.repository.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ArtistaService {

    private final ArtistaRepository repository;

    public ArtistaService(ArtistaRepository repository) {
        this.repository = repository;
    }

    public Artista criar(Artista artista) {
        Objects.requireNonNull(artista, "Artista não pode ser nulo");
        return repository.save(artista);
    }

    public List<Artista> listar() {
        return repository.findAll();
    }

    public Artista buscarPorId(Long id) {
        Objects.requireNonNull(id, "ID do artista não pode ser nulo");

        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artista não encontrado"));
    }
}
