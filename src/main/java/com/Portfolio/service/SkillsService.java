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
    public List<Skills> seeSkills() {
        return skiRepo.findAll();
    }

    @Override
    public void newSkill(Skills ski) {
        skiRepo.save(ski);
    }
    
    @Override
    public void modifySkill(Skills ski) {
        skiRepo.save(ski);
    }

    @Override
    public void deleteSkill(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skills fyndSkill(Long id) {
        return skiRepo.findById(id).orElse(null);
    }
    
}
