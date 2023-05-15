package com.Portfolio.service;

import com.Portfolio.model.JobType;
import java.util.List;


public interface IJobTypeService {
    
    public List <JobType> seeJobType();
    public JobType fyndJobType(Long id);
    
}
