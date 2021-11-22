package co.usa.cliclo3.reto3.repository;

import co.usa.cliclo3.reto3.crud.CategoryCrudRepository;
import co.usa.cliclo3.reto3.crud.ScoreCrudRepository;
import co.usa.cliclo3.reto3.model.Category;
import co.usa.cliclo3.reto3.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ScoreRepository {

    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }

    public Optional<Score> getCategory(int id){
        return scoreCrudRepository.findById(id);
    }

    public Score save(Score score){
        return scoreCrudRepository.save(score);
    }

    public Optional<Score> getScore(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
