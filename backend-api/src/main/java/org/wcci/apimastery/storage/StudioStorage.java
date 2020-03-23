package org.wcci.apimastery.storage;

import org.wcci.apimastery.models.Game;
import org.wcci.apimastery.models.Studio;

import java.util.Collection;
import java.util.Optional;

public interface StudioStorage {
    Iterable<Studio> findAllStudios();
    Optional<Studio> findStudioById(Long id);
    Optional<Studio> findStudioByName(String name);
    Optional<Studio> findStudioByGame(Game game);
    void store(Studio studio);
}
