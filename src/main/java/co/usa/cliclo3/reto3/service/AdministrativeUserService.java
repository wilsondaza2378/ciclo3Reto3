/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Administrative_User;
import co.usa.cliclo3.reto3.model.Category;
import co.usa.cliclo3.reto3.repository.AdministrativeUserRepository;
import co.usa.cliclo3.reto3.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class AdministrativeUserService {
    @Autowired
    private AdministrativeUserRepository administrative_UserRepository;

    public List<Administrative_User> getAll(){
        return administrative_UserRepository.getAll();
    }

    public Optional<Administrative_User> getAdministrative_User(int id){
        return administrative_UserRepository.getAdministrative_User(id);
    }

    public Administrative_User save(Administrative_User administrative){
        if(administrative.getIdAdministrative()==null){
            return administrative_UserRepository.save(administrative);
        }else {
            Optional<Administrative_User> Administrative_UserAux=administrative_UserRepository.getAdministrative_User(administrative.getIdAdministrative());
            if(Administrative_UserAux.isEmpty()){
                return administrative_UserRepository.save(administrative);
            }else{
                return administrative;
            }
        }
    }

}
