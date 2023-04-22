package com.Portfolio.service;

import com.Portfolio.model.Projects;
import java.util.List;


public interface IProjectsService {
    
    public List <Projects> verProjects();
    public void crearProjects(Projects per);
    public void borrarProjects(Long id);
    public Projects buscarProjects(Long id);
    
}
