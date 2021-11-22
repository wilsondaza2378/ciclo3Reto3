package co.usa.cliclo3.reto3.crud;

import co.usa.cliclo3.reto3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}
