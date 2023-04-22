package com.Portfolio.service;

import com.Portfolio.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List <Skills> verSkills();
    public void crearSkills(Skills per);
    public void borrarSkills(Long id);
    public Skills buscarSkills(Long id);
    
}
