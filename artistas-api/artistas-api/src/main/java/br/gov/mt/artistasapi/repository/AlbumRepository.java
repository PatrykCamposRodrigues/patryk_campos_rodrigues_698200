package br.gov.mt.artistasapi.repository;

import br.gov.mt.artistasapi.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    List<Album> findByArtistaId(Long artistaId);
}
