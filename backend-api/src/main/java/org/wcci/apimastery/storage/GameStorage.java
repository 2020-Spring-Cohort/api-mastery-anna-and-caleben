package org.wcci.apimastery.storage;

import org.wcci.apimastery.models.Game;
import org.wcci.apimastery.models.Studio;

import java.util.Collection;
import java.util.Optional;

public interface GameStorage {
    Iterable<Game> findAllGames();
    Optional<Game> findGameById(Long id);
    Optional<Game> findGameByName(String name);
    Optional<Game> findGameByStudio(Studio studio);
    void store(Game game);
}
