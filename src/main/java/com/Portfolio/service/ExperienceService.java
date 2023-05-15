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
    public List<Experience> seeExperience() {
        return expRepo.findAll();
    }

    @Override
    public void newExperience(Experience per) {
        expRepo.save(per);
    }
    
    @Override
    public void modifyExperience(Experience per) {
        expRepo.save(per);
    }

    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience fyndExperience(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
