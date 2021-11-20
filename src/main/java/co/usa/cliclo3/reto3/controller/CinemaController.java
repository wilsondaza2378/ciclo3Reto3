/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.controller;

import co.usa.cliclo3.reto3.model.Cinema;
import co.usa.cliclo3.reto3.service.CinemaService;
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
@RequestMapping("/api/Cinema")
public class CinemaController {
    
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/all")
    public List<Cinema> getCinemas(){
        return cinemaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cinema> getCinema(@PathVariable("id") int id){
        return cinemaService.getCinema(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cinema save(@RequestBody Cinema sala){
        return (Cinema) cinemaService.save(sala);
    }



}
