package com.Portfolio.Controller;

import com.Portfolio.model.Education;
import com.Portfolio.model.Experience;
import com.Portfolio.model.JobType;
import com.Portfolio.model.Person;
import com.Portfolio.model.Projects;
import com.Portfolio.model.Skills;
import com.Portfolio.model.User;
import com.Portfolio.service.IEducationService;
import com.Portfolio.service.IExperienceService;
import com.Portfolio.service.IJobTypeService;
import com.Portfolio.service.IPersonService;
import com.Portfolio.service.IProjectsService;
import com.Portfolio.service.ISkillsService;
import com.Portfolio.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    private IUserService userServ;
    
    @Autowired
    private IPersonService persoServ;
    
    @Autowired
    private IEducationService eduServ;
    
    @Autowired
    private IExperienceService expServ;
    
    @Autowired
    private IJobTypeService jobServ;
    
    @Autowired
    private IProjectsService proServ;
    
    @Autowired
    private ISkillsService skiServ;
    
    
    // -----------  User -----------//
    @PostMapping("/new/user")
    public void agregarUser (@RequestBody User user)   {
        userServ.crearUser(user);
    }
    
    @PutMapping("/modificar/user/{id}")
    public void modificarUser (@RequestBody User user)   {
        userServ.crearUser(user);
    }
    
    @GetMapping("/ver/user")
    @ResponseBody
    public List<User> verUser() {
        return userServ.verUser();
    }
    
    @DeleteMapping ("/delete/user/{id}")
    public void borrarUser(@PathVariable Long id) {
        userServ.borrarUser(id);
    }
    
    // -----------  Person -----------//
    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Person pers)   {
        persoServ.crearPersona(pers);
    }
    
    @PutMapping("/modificar/persona/{id}")
    public void modificarPersona (@RequestBody Person pers)   {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Person> verPersonas() {
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/person/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    // -----------  Education -----------//
    @PostMapping("/new/education")
    public void agregarEducation (@RequestBody Education edu)   {
        eduServ.crearEducation(edu);
    }
    
    @PutMapping("/modificar/education/{id}")
    public void modificarEducation (@RequestBody Education edu)   {
        eduServ.crearEducation(edu);
    }
    
    @GetMapping("/ver/education")
    @ResponseBody
    public List<Education> verEducation() {
        return eduServ.verEducation();
    }
    
    @DeleteMapping ("/delete/education/{id}")
    public void borrarEducation(@PathVariable Long id) {
        eduServ.borrarEducation(id);
    }
    
    
    // -----------  Experience -----------//
    @PostMapping("/new/experience")
    public void agregarExperience (@RequestBody Experience edu)   {
        expServ.crearExperience(edu);
    }
    
    @PutMapping("/modificar/experience/{id}")
    public void modificarExperience (@RequestBody Experience edu)   {
        expServ.crearExperience(edu);
    }
    
    @GetMapping("/ver/experience")
    @ResponseBody
    public List<Experience> verExperience() {
        return expServ.verExperience();
    }
    
    @DeleteMapping ("/delete/experience/{id}")
    public void borrarExperience(@PathVariable Long id) {
        expServ.borrarExperience(id);
    }
    
    
    // -----------  JobType -----------//
    @GetMapping("/ver/job_type")
    @ResponseBody
    public List<JobType> verJobType() {
        return jobServ.verJobType();
    }
    
    @GetMapping("/ver/job_type/{id}")
    public void buscarJobType(@PathVariable Long id) {
        jobServ.buscarJobType(id);
    }
    
    // -----------  Projects -----------//
    
    @PostMapping("/new/project")
    public void agregarProjects (@RequestBody Projects pro)   {
        proServ.crearProjects(pro);
    }
    
    @PutMapping("/modificar/project/{id}")
    public void modificarProyects (@RequestBody Projects pro)   {
        proServ.crearProjects(pro);
    }
    
    @GetMapping("/ver/projects")
    @ResponseBody
    public List<Projects> verProjects() {
        return proServ.verProjects();
    }
    
    @DeleteMapping ("/delete/project/{id}")
    public void borrarProjects(@PathVariable Long id) {
        proServ.borrarProjects(id);
    }
    
    
    // -----------  Skills -----------//
    
    @PostMapping("/new/skill")
    public void agregarSkills (@RequestBody Skills ski)   {
        skiServ.crearSkills(ski);
    }
    
    @PutMapping("/modificar/skill/{id}")
    public void modificarSkills (@RequestBody Skills ski)   {
        skiServ.crearSkills(ski);
    }
    
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skills> verSkills() {
        return skiServ.verSkills();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void borrarSkills(@PathVariable Long id) {
        skiServ.borrarSkills(id);
    }
}
