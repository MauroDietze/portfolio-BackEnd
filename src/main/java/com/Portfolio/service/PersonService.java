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
    public List<Person> seePersons() {
        return persoRepo.findAll();
    }

    @Override
    public void newPerson(Person per) {
        persoRepo.save(per);
    }
    
    @Override
    public void modifyPerson(Person per) {
        persoRepo.save(per);
    }

    @Override
    public void deletePerson(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Person fyndPerson(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
