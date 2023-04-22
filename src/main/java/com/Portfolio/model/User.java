
package com.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long iduser;
    private String name;
    private String password;
    
    public User (){
    }
    
    public User (
            Long iduser, 
            String name, 
            String password 

    ){
        this.iduser = iduser;
        this.name = name;
        this.password = password;

    }
    
}
