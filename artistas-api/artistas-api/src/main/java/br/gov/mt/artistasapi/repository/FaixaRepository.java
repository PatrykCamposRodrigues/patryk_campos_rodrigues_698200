package br.gov.mt.artistasapi.repository;

import br.gov.mt.artistasapi.model.Faixa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FaixaRepository extends JpaRepository<Faixa, Long> {

    List<Faixa> findByAlbumId(Long albumId);
}
