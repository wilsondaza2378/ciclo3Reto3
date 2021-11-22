package co.usa.cliclo3.reto3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.aspectj.bridge.Message;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="reservations")
public class Reservation implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status="created";
    
    
    @ManyToOne
    @JoinColumn(name="idCinema")
    @JsonIgnoreProperties({"reservations", "messages", "cinema"})
    private Cinema cinema;

    @ManyToOne
    @JoinColumn(name="client")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy="reservation")
    @JoinColumn(name="idScore")
    @JsonIgnoreProperties("reservation")
    public Score score;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

     
}