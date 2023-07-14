package com.Portfolio.Controller;

import com.Portfolio.model.Education;
import com.Portfolio.model.Experience;
import com.Portfolio.model.JobType;
import com.Portfolio.model.Person;
import com.Portfolio.model.Project;
import com.Portfolio.model.Skills;
/*import com.Portfolio.model.User;*/
import com.Portfolio.service.IEducationService;
import com.Portfolio.service.IExperienceService;
import com.Portfolio.service.IJobTypeService;
import com.Portfolio.service.IPersonService;
import com.Portfolio.service.IProjectsService;
import com.Portfolio.service.ISkillsService;
import jakarta.annotation.security.PermitAll;
/*import com.Portfolio.service.IUserService;*/
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://192.168.0.11:9004")
public class controller {
    
    /*
    @Autowired
    private IUserService userServ;
    */
    
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
    
    
    /*
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
    */

    // -----------  Person -----------//
    @PermitAll
    @PostMapping("/new/persona")
    @ResponseBody
    public void agregarPersona (@RequestBody Person pers)   {
        persoServ.newPerson(pers);
    }
    
    @PermitAll
    @PutMapping("/modify/person/{id}")
    @ResponseBody
    public void modificarPersona (@PathVariable Long id, @RequestBody Person pers){
        persoServ.modifyPerson(pers);
    }
    
    @PermitAll
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Person> verPersonas() {
        return persoServ.seePersons();
    }
    
    @DeleteMapping ("/delete/person/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.deletePerson(id);
    }
    
    // -----------  Education -----------//
    @PermitAll
    @PostMapping("/new/education")
    @ResponseBody
    public void newEducation (@RequestBody Education edu)   {
        eduServ.newEducation(edu);
    }
    
    @PermitAll
    @PutMapping("/modify/education/{id}")
    @ResponseBody
    public void modifyEducation (@RequestBody Education edu)   {
        eduServ.newEducation(edu);
    }
    
    @PermitAll
    @GetMapping("/ver/education")
    @ResponseBody
    public List<Education> verEducation() {
        return eduServ.seeEducation();
    }
    
    @DeleteMapping ("/delete/education/{id}")
    public void borrarEducation(@PathVariable Long id) {
        eduServ.deleteEducation(id);
    }
    
    
    // -----------  Experience -----------//
    @PermitAll
    @PostMapping("/new/experience")
    @ResponseBody
    public void newExperience (@RequestBody Experience exp)   {
        expServ.newExperience(exp);
    }
    
    @PermitAll
    @PutMapping("/modify/experience/{id}")
    @ResponseBody
    public void modifyExperience (@RequestBody Experience exp)   {
        expServ.newExperience(exp);
    }
    
    @PermitAll
    @GetMapping("/ver/experience")
    @ResponseBody
    public List<Experience> verExperience() {
        return expServ.seeExperience();
    }
    
    @PermitAll
    @DeleteMapping ("/delete/experience/{id}")
    @ResponseBody
    public void borrarExperience(@PathVariable Long id) {
        expServ.deleteExperience(id);
    }
    
    
    // -----------  JobType -----------//
    @PermitAll
    @GetMapping("/ver/jobtype")
    @ResponseBody
    public List<JobType> verJobType() {
        return jobServ.seeJobType();
    }
    
    @GetMapping("/ver/job_type/{id}")
    public void buscarJobType(@PathVariable Long id) {
        jobServ.fyndJobType(id);
    }
    
    // -----------  Projects -----------//
    
    @PermitAll
    @PostMapping("/new/project")
    public void newProject (@RequestBody Project pro)   {
        proServ.newProject(pro);
    }
    
    @PermitAll
    @PutMapping("/modify/project/{id}")
    public void modifyProyect (@RequestBody Project pro)   {
        proServ.modifyProject(pro);
    }
    
    @PermitAll
    @GetMapping("/ver/projects")
    @ResponseBody
    public List<Project> seeProjects() {
        return proServ.seeProjects();
    }
    
    @PermitAll
    @DeleteMapping ("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id) {
        proServ.deletProject(id);
    }
    
    
    // -----------  Skills -----------//
    
    @PostMapping("/new/skill")
    public void newSkill (@RequestBody Skills ski)   {
        skiServ.newSkill(ski);
    }
    
    @PutMapping("/modify/skill/{id}")
    public void modifySkill (@RequestBody Skills ski)   {
        skiServ.newSkill(ski);
    }
    
    @PermitAll
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skills> seeSkills() {
        return skiServ.seeSkills();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skiServ.deleteSkill(id);
    }
}
