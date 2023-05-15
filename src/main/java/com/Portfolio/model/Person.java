
package com.Portfolio.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Person {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    
    private String firstname;
    private String lastname;
    private String address;
    private Date birthdate;
    private String nationality;
    private Long phone;
    private String email;
    private String ocupation;
    private String about_me;
    private String url_image;
    private String image_background_header;
    
    public Person (){
    }
    
    public Person (
            Long id, 
            String firstname, 
            String lastname, 
            String address, 
            Date birthdate, 
            String nationality, 
            Long phone, 
            String email, 
            String ocupation, 
            String about_me, 
            String url_image,
            String image_background_header
    ){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.birthdate = birthdate;
        this.nationality = nationality;
        this.phone = phone;
        this.email = email;
        this.ocupation = ocupation;
        this.about_me = about_me;
        this.url_image = url_image;
        this.image_background_header = image_background_header;
    }
}
