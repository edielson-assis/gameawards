package me.dio.diogameawards.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import me.dio.diogameawards.domain.model.Game;
import me.dio.diogameawards.repositories.GameRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Game g1 = new Game(null, "The Division", "RPG mode", "", 0);

        gameRepository.save(g1);        
    }    
}