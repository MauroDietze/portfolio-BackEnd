
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
public class Education {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long ideducation;
    private String school;
    private String title;
    private String img;
    private String career;
    private Long score;
    private Year start;
    private Year end;
    
    public Education (){
    }
    
    public Education (
            Long ideducation, 
            String school, 
            String title, 
            String img, 
            String career, 
            Long score, 
            Year start, 
            Year end
    ){
        this.ideducation = ideducation;
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.score = score;
        this.start = start;
        this.end = end;

    }
    
}
