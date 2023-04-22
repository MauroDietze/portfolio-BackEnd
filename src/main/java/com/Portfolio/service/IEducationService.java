package com.Portfolio.service;

import com.Portfolio.model.Education;
import java.util.List;


public interface IEducationService {
    
    public List <Education> verEducation();
    public void crearEducation(Education per);
    public void borrarEducation(Long id);
    public Education buscarEducation(Long id);
    
}
