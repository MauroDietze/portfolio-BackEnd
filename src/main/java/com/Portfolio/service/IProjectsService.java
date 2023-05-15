package com.Portfolio.service;

import com.Portfolio.model.Project;
import java.util.List;


public interface IProjectsService {
    
    public List <Project> seeProjects();
    public void newProject(Project per);
    public void modifyProject(Project per);
    public void deletProject(Long id);
    public Project FyndProject(Long id);
    
}
