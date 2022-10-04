package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "You must enter a location")
    @Size(min = 25)
    public String location;

    public Employer (){

    }






}
