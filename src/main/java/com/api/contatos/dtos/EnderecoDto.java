package com.api.contatos.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public class EnderecoDto {

    private UUID id;
    @NotNull
    private Long numero;
    @Size(max=255)
    @NotBlank
    private String rua;
    @NotEmpty
    private String cep;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCEP() {
        return cep;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }
}
