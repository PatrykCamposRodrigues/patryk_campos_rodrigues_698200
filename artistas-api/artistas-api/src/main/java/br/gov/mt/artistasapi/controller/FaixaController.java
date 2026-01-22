package br.gov.mt.artistasapi.controller;

import br.gov.mt.artistasapi.model.Faixa;
import br.gov.mt.artistasapi.service.FaixaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faixas")
public class FaixaController {

    private final FaixaService service;

    public FaixaController(FaixaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Faixa> criar(@RequestBody FaixaRequest request) {
        Faixa faixa = service.salvar(
                request.getTitulo(),
                request.getNumeroFaixa(),
                request.getDuracaoSegundos(),
                request.getAlbumId()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(faixa);
    }

    @GetMapping
    public List<Faixa> listar() {
        return service.listar();
    }
}
