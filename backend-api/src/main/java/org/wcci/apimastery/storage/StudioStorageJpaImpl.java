package org.wcci.apimastery.storage;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.models.Game;
import org.wcci.apimastery.models.Studio;

import java.util.Optional;

@Service
public class StudioStorageJpaImpl implements StudioStorage{
    private StudioRepository studioRepository;

    public StudioStorageJpaImpl(StudioRepository studioRepository) {
        this.studioRepository = studioRepository;
    }

    @Override
    public Iterable<Studio> findAllStudios() {
        return studioRepository.findAll();
    }

    @Override
    public Optional<Studio> findStudioById(Long id) {
        return studioRepository.findById(id);
    }

    @Override
    public Optional<Studio> findStudioByName(String name) {
        return studioRepository.findByName(name);
    }

    @Override
    public Optional<Studio> findStudioByGame(Game game) {
        return studioRepository.findStudioByGame(game);
    }

    @Override
    public void store(Studio studio) {
        studioRepository.save(studio);
    }
}
