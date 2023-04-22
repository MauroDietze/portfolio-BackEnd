package com.Portfolio.service;

import com.Portfolio.model.JobType;
import com.Portfolio.repository.JobTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobTypeService implements IJobTypeService {
    
    @Autowired
    public JobTypeRepository jobRepo;

    @Override
    public List<JobType> verJobType() {
        return jobRepo.findAll();
    }

    @Override
    public JobType buscarJobType(Long id) {
        return jobRepo.findById(id).orElse(null);
    }
    
}
