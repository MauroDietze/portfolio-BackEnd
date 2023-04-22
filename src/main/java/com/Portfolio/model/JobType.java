
package com.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class JobType {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String name;

    
    public JobType (){
    }
    
    public JobType (
            Long id, 
            String name

    ){
        this.id = id;
        this.name = name;


    }
    
}
