package me.dio.gameawards.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.repositories.GameRepository;
import me.dio.gameawards.services.GameService;
import me.dio.gameawards.services.exceptions.BusinessException;
import me.dio.gameawards.services.exceptions.ResourceNotFoundException;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        return repository.findAll(Sort.by(Direction.DESC, "votes"));
    }

    @Override
    public Game findById(long id) {
        Optional<Game> game = repository.findById(id);
        return game.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @Override
    public Game insert(Game game) {
        if (Objects.nonNull(game.getId())) {
            throw  new BusinessException("Id is not null");
        } 
        return repository.save(game);        
    }

    @Override
    public void update(Long id, Game game) {
        Game gameDB = findById(id);
        if (gameDB.getId().equals(game.getId())) {
            repository.save(game);
        }
        else {
            throw new BusinessException("Id not found");
        }
    }

    @Override
    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @Override
    public void vote(Long id) {
        Game gameDB = findById(id);
        gameDB.setVotes(gameDB.getVotes() + 1);
        update(id, gameDB);        
    }    
}