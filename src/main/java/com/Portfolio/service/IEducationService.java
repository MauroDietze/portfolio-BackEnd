package com.Portfolio.service;

import com.Portfolio.model.Education;
import java.util.List;


public interface IEducationService {
    
    public List <Education> seeEducation();
    public void newEducation(Education edu);
    public void modifyEducation(Education edu);
    public void deleteEducation(Long id);
    public Education fyndEducation(Long id);
    
}
