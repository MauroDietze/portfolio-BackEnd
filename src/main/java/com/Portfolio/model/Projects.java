
package com.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Projects {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idachivements;
    private String name;
    private String description;

    
    public Projects (){
    }
    
    public Projects (
            Long idachivements, 
            String name,
            String description
    ){
        this.idachivements = idachivements;
        this.name = name;
        this.description = description;


    }
    
}
