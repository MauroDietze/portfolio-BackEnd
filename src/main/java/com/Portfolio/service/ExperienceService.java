package com.Portfolio.service;

import com.Portfolio.model.Experience;
import com.Portfolio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {
    
    @Autowired
    public ExperienceRepository expRepo;

    @Override
    public List<Experience> verExperience() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperience(Experience per) {
        expRepo.save(per);
    }

    @Override
    public void borrarExperience(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience buscarExperience(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
