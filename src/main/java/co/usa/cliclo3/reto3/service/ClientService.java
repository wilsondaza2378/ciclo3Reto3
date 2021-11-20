/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Client;
import co.usa.cliclo3.reto3.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Optional<Client> getCliente(int id) {
        return clientRepository.getCliente(id);
    }

    public Client save(Client cliente) {
        if (cliente.getIdClient() == null) {
            return clientRepository.save(cliente);
        } else {
            Optional<Client> clienteAux = clientRepository.getCliente(cliente.getIdClient());
            if (clienteAux.isEmpty()) {
                return clientRepository.save(cliente);
            } else {
                return cliente;
            }
        }
    }

}
