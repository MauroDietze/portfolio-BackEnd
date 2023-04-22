package com.Portfolio.service;

import com.Portfolio.model.Person;
import com.Portfolio.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {
    
    @Autowired
    public PersonRepository persoRepo;

    @Override
    public List<Person> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Person per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Person buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
