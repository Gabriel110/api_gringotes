package com.banco.gringotes.controller.dto;

import com.banco.gringotes.models.Cliente;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteDto {
    private Long id;
    private String nome;
    private String email;
    private Long cpf;
    private String nascimento;

    public ClienteDto(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
        this.cpf = cliente.getCpf();
        this.nascimento = cliente.getNascimento();
    }
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Long getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }
    public static List<ClienteDto> converter(List<Cliente> clientes){
        return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
    }
}
