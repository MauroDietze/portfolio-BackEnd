package com.Portfolio.service;

import com.Portfolio.model.Experience;
import java.util.List;


public interface IExperienceService {
    
    public List <Experience> verExperience();
    public void crearExperience(Experience per);
    public void borrarExperience(Long id);
    public Experience buscarExperience(Long id);
    
}
