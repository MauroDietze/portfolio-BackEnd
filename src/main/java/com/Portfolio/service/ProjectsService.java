package com.Portfolio.service;

import com.Portfolio.model.Projects;
import com.Portfolio.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService {
    
    @Autowired
    public ProjectsRepository proRepo;

    @Override
    public List<Projects> verProjects() {
        return proRepo.findAll();
    }

    @Override
    public void crearProjects(Projects pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProjects(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Projects buscarProjects(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
}
