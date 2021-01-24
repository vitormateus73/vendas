package io.github.vitormateus73.service;

import org.springframework.stereotype.Service;

import io.github.vitormateus73.model.Cliente;
import io.github.vitormateus73.repository.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService( ClientesRepository repository ){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}