package com.Portfolio.service;

import com.Portfolio.model.JobType;
import java.util.List;


public interface IJobTypeService {
    
    public List <JobType> verJobType();
    public JobType buscarJobType(Long id);
    
}
