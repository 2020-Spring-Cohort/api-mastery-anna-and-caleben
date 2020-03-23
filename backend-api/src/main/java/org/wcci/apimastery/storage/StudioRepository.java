package org.wcci.apimastery.storage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wcci.apimastery.models.Game;
import org.wcci.apimastery.models.Studio;

import java.util.Optional;

@Repository
public interface StudioRepository extends CrudRepository<Studio, Long> {
        Optional<Studio> findById(Long id);
        Optional<Studio> findByName(String name);
    Optional<Studio> findStudioByGame(Game game);
}
