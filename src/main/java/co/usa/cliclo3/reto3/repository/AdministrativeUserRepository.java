/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.repository;

import co.usa.cliclo3.reto3.crud.AdministrativeUserCrudRepository;
import co.usa.cliclo3.reto3.model.Administrative_User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public class AdministrativeUserRepository {
    
    @Autowired
    private AdministrativeUserCrudRepository administrativoCrudRepository;

    public List<Administrative_User> getAll(){
        return (List<Administrative_User>) administrativoCrudRepository.findAll();
    }

    public Optional<Administrative_User> getAdministrative_User(int id){
        return administrativoCrudRepository.findById(id);
    }

    public Administrative_User save(Administrative_User administrative){
        return administrativoCrudRepository.save(administrative);
    }
}
