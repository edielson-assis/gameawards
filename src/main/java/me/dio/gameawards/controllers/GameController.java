package me.dio.gameawards.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
 
    @Autowired
    private GameService service;
    
    @GetMapping
    public ResponseEntity<List<Game>> findAll() {
        List<Game> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id) {
        Game game = service.findById(id);
        return ResponseEntity.ok().body(game);
    }

    @PostMapping
    public ResponseEntity<Game> insert(@RequestBody Game game) {
        service.insert(game);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(game.getId()).toUri();
        return ResponseEntity.created(uri).body(game); 
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game game) {
        service.update(id, game);
        return ResponseEntity.ok().body(game);
    }

    @PatchMapping(value = "/{id}/vote")
    public ResponseEntity<Game> vote(@PathVariable Long id) {
        service.vote(id);
        return ResponseEntity.ok().build();
    }
}