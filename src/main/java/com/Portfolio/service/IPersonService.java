package com.Portfolio.service;

import com.Portfolio.model.Person;
import java.util.List;


public interface IPersonService {
    
    public List <Person> verPersonas();
    public void crearPersona(Person per);
    public void borrarPersona(Long id);
    public Person buscarPersona(Long id);
    
}
