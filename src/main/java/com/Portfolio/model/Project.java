
package com.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Year;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idachivements;
    private String name;
    private String description;
    private Year date;
    private String link;
    

    
    public Project (){
    }
    
    public Project (
            Long idachivements, 
            String name,
            String description,
            Year date,
            String link
    ){
        this.idachivements = idachivements;
        this.name = name;
        this.description = description;
        this.date = date;
        this.link = link;


    }
    
}
