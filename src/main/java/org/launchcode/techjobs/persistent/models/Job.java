package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity {
    //below here where I change to Employer?
    @ManyToOne
    private Employer employer;
    private String skills;

    public Job() {
    }
//Replace Employer below?
    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer(){
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

}
    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//}
