package org.wcci.apimastery.storage;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.models.Game;
import org.wcci.apimastery.models.Studio;

import java.util.Collection;
import java.util.Optional;

@Service
public class GameStorageJpaImpl implements GameStorage {
    private GameRepository gameRepository;

    public GameStorageJpaImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Iterable<Game> findAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Optional<Game> findGameById(Long id) {
        return gameRepository.findById(id);
    }

    @Override
    public Optional<Game> findGameByName(String name) {
        return gameRepository.findByName(name);
    }

    @Override
    public Optional<Game> findGameByStudio(Studio studio) {
        return gameRepository.findByStudio(studio);
    }

    @Override
    public void store(Game game) {
        gameRepository.save(game);
    }
}
