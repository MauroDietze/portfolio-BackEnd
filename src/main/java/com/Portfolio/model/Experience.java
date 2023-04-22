
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
public class Experience {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String company;
    private String position;
    private String description;
    private String job_type;
    private Year start;
    private Year end;
    
    public Experience (){
    }
    
    public Experience (
            Long id, 
            String company, 
            String position, 
            String description, 
            String job_type, 
            Year start, 
            Year end
    ){
        this.id = id;
        this.company = company;
        this.position = position;
        this.description = description;
        this.job_type = job_type;
        this.start = start;
        this.end = end;

    }
    
}
