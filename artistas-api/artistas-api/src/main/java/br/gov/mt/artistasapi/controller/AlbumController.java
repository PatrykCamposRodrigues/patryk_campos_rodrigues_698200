package br.gov.mt.artistasapi.controller;

import br.gov.mt.artistasapi.model.Album;
import br.gov.mt.artistasapi.service.AlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albuns")
public class AlbumController {

    private final AlbumService service;

    public AlbumController(AlbumService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Album> criar(@RequestBody AlbumRequest request) {
        Album album = service.criar(
                request.getTitulo(),
                request.getAnoLancamento(),
                request.getArtistaId()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(album);
    }

    @GetMapping
    public List<Album> listar() {
        return service.listar();
    }
}
