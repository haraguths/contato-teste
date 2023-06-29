package com.api.contatos.controllers;

import com.api.contatos.dtos.ContatoDto;
import com.api.contatos.models.Contato;
import com.api.contatos.services.ContatoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/contato")
public class ContatoController {

    final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid ContatoDto contatoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoService.salvar(contatoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getContato(@PathVariable(value = "id") UUID id){
        Optional<Contato> contato = contatoService.getContato(id);
        if(contato.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contato não encontrado");

        return ResponseEntity.status(HttpStatus.OK).body(contato.get());
    }
}
