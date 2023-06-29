package com.api.contatos.dtos;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public class ContatoDto {

    @NotBlank
    @Size(max=255)
    private String nome;
    @Size(max=255)
    private String email;
    @NotBlank
    @Size(max=11)
    private String telefone;
    @Column(nullable = true)
    private LocalDate dataNascimento;
    @Valid
    private List<EnderecoDto> enderecos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<EnderecoDto> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDto> enderecos) {
        this.enderecos = enderecos;
    }
}
