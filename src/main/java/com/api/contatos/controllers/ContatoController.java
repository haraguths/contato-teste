package com.api.contatos.controllers;

import com.api.contatos.dtos.ContatoDto;
import com.api.contatos.models.Contato;
import com.api.contatos.services.ContatoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
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
    public ResponseEntity<Contato> create(@RequestBody @Valid ContatoDto contatoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(contatoService.salvar(contatoDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> getContato(@PathVariable(value = "id") UUID id) {
        Optional<Contato> contato = contatoService.getContato(id);

        return contato.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContato(@PathVariable(value = "id") UUID id){
        try {
            contatoService.deleteContato(id);
            return ResponseEntity.ok("Contato excluído com sucesso");
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Contato não encontrado");
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> updateParcialContato(@PathVariable(value = "id") UUID id,
                                                @RequestBody @Valid ContatoDto contatoDto){
        try {
            contatoService.updateParcialContato(id, contatoDto);
            return ResponseEntity.ok("Contato atualizado com sucesso");
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Contato não encontrado");
        }
    }

}
