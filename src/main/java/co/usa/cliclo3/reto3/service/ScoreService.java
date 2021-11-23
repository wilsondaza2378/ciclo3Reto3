package co.usa.cliclo3.reto3.service;

import co.usa.cliclo3.reto3.model.Score;
import co.usa.cliclo3.reto3.repository.ScoreRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll() {
        return scoreRepository.getAll(); }

    public Optional<Score> getScore(int id){
        return scoreRepository.getScore(id);
    }

    public Score save(Score score){
        if(score.getIdScore()==null){
            return scoreRepository.save(score);
        }else {
            Optional<Score> scoreAux=scoreRepository.getScore(Score.getId());
            if(scoreAux.isEmpty()){
                return scoreRepository.save(score);
            }else{
                return score;
            }
        }
    }
}
