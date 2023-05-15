package com.Portfolio.service;

import com.Portfolio.model.Person;
import java.util.List;


public interface IPersonService {
    
    public List <Person> seePersons();
    public void newPerson(Person per);
    public void modifyPerson(Person per);
    public void deletePerson(Long id);
    public Person fyndPerson(Long id);
    
}
