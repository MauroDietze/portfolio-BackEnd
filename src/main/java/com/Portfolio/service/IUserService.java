package com.Portfolio.service;

import com.Portfolio.model.User;
import java.util.List;


public interface IUserService {
    
    public List <User> verUser();
    public void crearUser(User user);
    public void borrarUser(Long id);
    public User buscarUser(Long id);
    
}
