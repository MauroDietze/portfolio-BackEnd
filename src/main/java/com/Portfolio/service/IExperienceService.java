package com.Portfolio.service;

import com.Portfolio.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List <Experience> seeExperience();
    public void newExperience(Experience exp);
    public void modifyExperience(Experience exp);
    public void deleteExperience(Long id);
    public Experience fyndExperience(Long id);
    
}
