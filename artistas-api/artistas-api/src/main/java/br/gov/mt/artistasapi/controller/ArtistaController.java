package br.gov.mt.artistasapi.controller;

import br.gov.mt.artistasapi.model.Artista;
import br.gov.mt.artistasapi.service.ArtistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    private final ArtistaService service;

    public ArtistaController(ArtistaService service) {
        this.service = service;
    }

   @PostMapping(consumes = "application/json", produces = "application/json")
public ResponseEntity<Artista> criar(@RequestBody Artista artista) {
    Artista salvo = service.criar(artista);
    return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
}


    @GetMapping(produces = "application/json")
    public List<Artista> listar() {
        return service.listar();
    }
}
