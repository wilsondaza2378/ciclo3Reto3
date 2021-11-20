/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Reservation;
import co.usa.cliclo3.reto3.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author asus
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll(){return reservationRepository.getAll();}

    public Optional<Reservation> getReserva(int id){
        return reservationRepository.getReservation(id);
    }

    public Reservation save(Reservation reserva){
        if(reserva.getIdReservation()!=null){
            Optional<Reservation> reservaAux=reservationRepository.getReservation((int) reserva.getIdReservation());
            if(reservaAux.isEmpty()){
                return reservationRepository.save(reserva);
            }else{
                return reserva;
            }
        }else {
            return reservationRepository.save(reserva);
        }
    }
}
