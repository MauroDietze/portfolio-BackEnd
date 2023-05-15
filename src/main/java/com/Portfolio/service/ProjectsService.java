package com.Portfolio.service;

import com.Portfolio.model.Project;
import com.Portfolio.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService {
    
    @Autowired
    public ProjectsRepository proRepo;

    @Override
    public List<Project> seeProjects() {
        return proRepo.findAll();
    }
    
    @Override
    public void newProject(Project pro) {
        proRepo.save(pro);
    }

    @Override
    public void modifyProject(Project pro) {
        proRepo.save(pro);
    }

    @Override
    public void deletProject(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Project FyndProject(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
}
