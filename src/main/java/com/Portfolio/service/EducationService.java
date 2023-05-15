package com.Portfolio.service;

import com.Portfolio.model.Education;
import com.Portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService {
    
    @Autowired
    public EducationRepository eduRepo;

    @Override
    public List<Education> seeEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void newEducation(Education edu) {
        eduRepo.save(edu);
    }
    
    @Override
    public void modifyEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Education fyndEducation(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
