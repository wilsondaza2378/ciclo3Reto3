/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.crud;

import co.usa.cliclo3.reto3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author asus
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}
