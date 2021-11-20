/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.repository;

import co.usa.cliclo3.reto3.crud.ClientCrudRepository;
import co.usa.cliclo3.reto3.model.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clienteCrudRepository;

    public List<Client> getAll(){return (List<Client>) clienteCrudRepository.findAll();}

    public Optional<Client> getCliente(int id){return clienteCrudRepository.findById(id);}

    public Client save(Client cliente){return clienteCrudRepository.save(cliente);}

}
