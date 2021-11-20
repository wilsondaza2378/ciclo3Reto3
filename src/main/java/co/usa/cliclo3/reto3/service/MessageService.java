/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Message;
import co.usa.cliclo3.reto3.repository.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message> getMensaje(int id){
        return messageRepository.getMessage(id);}

    public Message save(Message msj){
        if(msj.getIdMessage()==null){
            return messageRepository.save(msj);
        }else {
            Optional<Message> msjAux=messageRepository.getMessage(msj.getIdMessage());
            if(msjAux.isEmpty()){
                return messageRepository.save(msj);
            }else{
                return msj;
            }
        }
    }

}
