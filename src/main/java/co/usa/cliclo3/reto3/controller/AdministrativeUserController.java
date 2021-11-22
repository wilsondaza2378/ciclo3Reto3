/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.controller;

import co.usa.cliclo3.reto3.model.Administrative_User;
import co.usa.cliclo3.reto3.service.AdministrativeUserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/Admin")
public class AdministrativeUserController {
    
    @Autowired
    private AdministrativeUserService administrativeUserService;
    
    @GetMapping("/all")
    public List<Administrative_User> getAdministratives(){
        return administrativeUserService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Administrative_User> getAdministrative(@PathVariable("id") int id){
        return administrativeUserService.getAdministrative_User(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrative_User save(@RequestBody Administrative_User administrative_User){
        return administrativeUserService.save(administrative_User);
    
}
    
}