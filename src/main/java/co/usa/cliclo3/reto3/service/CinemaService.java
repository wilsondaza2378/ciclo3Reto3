/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Cinema;
import co.usa.cliclo3.reto3.repository.CinemaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> getAll(){
        return cinemaRepository.getAll();
    }

    public Optional<Cinema> getCinema(int id){
        return cinemaRepository.getCinema(id);
    }
    
    public Cinema save(Cinema sala){
        if(sala.getId()==null){
            return cinemaRepository.save(sala);
        }else {
            Optional<Cinema> salaAux=cinemaRepository.getCinema(sala.getId());
            if(salaAux.isEmpty()){
                return cinemaRepository.save(sala);
            }else{
                return sala;
            }
        }
    }
}
