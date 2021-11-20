/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.repository;

import co.usa.cliclo3.reto3.crud.MessageCrudRepository;
import co.usa.cliclo3.reto3.model.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository mensajeCrudRepository;

    public List<Message> getAll(){return (List<Message>) mensajeCrudRepository.findAll();}

    public Optional<Message> getMessage(int id){return mensajeCrudRepository.findById(id);}

    public Message save(Message mensaje){return mensajeCrudRepository.save(mensaje);}

}
