package br.gov.mt.artistasapi.repository;

import br.gov.mt.artistasapi.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
