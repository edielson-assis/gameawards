package me.dio.gameawards.services;

import java.util.List;

import me.dio.gameawards.domain.model.Game;

public interface GameService {
    
    List<Game> findAll();

    Game findById(long id);
    
    Game insert(Game game);
    
    void update(Long id, Game game);
    
    void delete(Long id);

    void vote(Long id);
}