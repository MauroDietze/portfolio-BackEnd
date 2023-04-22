package com.Portfolio.service;

import com.Portfolio.model.User;
import com.Portfolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public List<User> verUser() {
        return userRepo.findAll();
    }

    @Override
    public void crearUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User buscarUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
}
