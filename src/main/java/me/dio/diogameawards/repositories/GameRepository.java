package me.dio.diogameawards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.diogameawards.domain.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {  
}