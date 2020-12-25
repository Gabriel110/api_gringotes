package com.banco.gringotes.controller.dto;

import com.banco.gringotes.models.Cliente;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.NotBlank;


public class ClienteForm {
    @NotNull @NotBlank
    private String nome;
    @NotNull @NotBlank
    private String email;
    @NotNull
    private Long cpf;
    @NotNull @NotBlank
    private String nascimento;

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

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Cliente converter(){
        return new Cliente(nome,email,cpf,nascimento);
    }
}
