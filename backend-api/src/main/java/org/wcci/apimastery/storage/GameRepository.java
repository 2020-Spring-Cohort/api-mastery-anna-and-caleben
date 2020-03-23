package org.wcci.apimastery.storage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wcci.apimastery.models.Game;
import org.wcci.apimastery.models.Studio;

import java.util.Optional;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
    Optional<Game> findById(Long id);
    Optional<Game> findByStudio(Studio studio);
    Optional<Game> findByName(String name);
}
