package com.Portfolio.service;

import com.Portfolio.model.Skills;
import com.Portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skiRepo;

    @Override
    public List<Skills> verSkills() {
        return skiRepo.findAll();
    }

    @Override
    public void crearSkills(Skills ski) {
        skiRepo.save(ski);
    }

    @Override
    public void borrarSkills(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skiRepo.findById(id).orElse(null);
    }
    
}
