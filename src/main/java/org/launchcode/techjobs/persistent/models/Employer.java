package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "You must enter a location")
    @Size(max = 50, min = 4)
    public String location;

    public Employer (){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
//    @OneToMany
//    @JoinColumn(name="employer")
    //@JoinColumn verify name.
//    private List<job>= new Arraylist<>();


}
