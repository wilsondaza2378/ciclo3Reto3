/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.controller;

import co.usa.cliclo3.reto3.model.Message;
import co.usa.cliclo3.reto3.service.MessageService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@RestController
@RequestMapping("/api/Message")
public class MessageController {
    
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getMensajes(){
        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMensaje(@PathVariable("id") int id){
        return messageService.getMensaje(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message msj){
        return (Message) messageService.save(msj);
    }

}
