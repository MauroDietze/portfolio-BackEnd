
package com.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idskills;
    private String name;
    private String type;
    private String progress;
    
    public Skills (){
    }
    
    public Skills (
            Long idskills, 
            String name, 
            String type, 
            String progress

    ){
        this.idskills = idskills;
        this.name = name;
        this.type = type;
        this.progress = progress;
    }
    
}
