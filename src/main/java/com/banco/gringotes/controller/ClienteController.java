package com.banco.gringotes.controller;

import com.banco.gringotes.controller.dto.ClienteDto;
import com.banco.gringotes.controller.dto.ClienteForm;
import com.banco.gringotes.models.Cliente;
import com.banco.gringotes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteDto> lista(){
        List<Cliente> clientes = clienteRepository.findAll();
        return ClienteDto.converter(clientes);
    }
    @PostMapping
    public void cadastrar(@RequestBody @Valid ClienteForm form){
        Cliente cliente = form.converter();
        clienteRepository.save(cliente);
    }
}
