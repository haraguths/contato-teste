package com.api.contatos.repositories;

import com.api.contatos.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContatoRepository extends JpaRepository<Contato, UUID> {
}
