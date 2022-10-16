package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;import java.util.ArrayList;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank (message = "You must enter a location")
    @Size(max = 50, min = 4)
    private String location;



    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs= new ArrayList<>();

    public Employer(String location){
        this.location = location;
    }
    public Employer(){}

    public String getLocation() {

        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
