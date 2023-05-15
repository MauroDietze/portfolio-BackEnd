package com.Portfolio.service;

import com.Portfolio.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List <Skills> seeSkills();
    public void newSkill(Skills per);
    public void modifySkill(Skills per);
    public void deleteSkill(Long id);
    public Skills fyndSkill(Long id);
    
}
