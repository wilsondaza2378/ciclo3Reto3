/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.repository;

import co.usa.cliclo3.reto3.crud.ReservationCrudRepository;
import co.usa.cliclo3.reto3.model.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public class ReservationRepository {
   @Autowired
    private ReservationCrudRepository reservacionCrudRepository;

    public List<Reservation> getAll(){return (List<Reservation>) reservacionCrudRepository.findAll();}

    public Optional<Reservation> getReserva(int id){return reservacionCrudRepository.findById(id);}

    public Reservation save(Reservation msj){return reservacionCrudRepository.save(msj);}

    public Optional<Reservation> getReservation(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
