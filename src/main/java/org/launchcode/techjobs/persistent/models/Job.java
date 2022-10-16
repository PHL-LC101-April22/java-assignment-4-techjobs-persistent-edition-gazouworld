package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;
//above added

@Entity
//section 3
    public class Job extends AbstractEntity {
    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List<Skill> skills;

    public Job() {
    }
//Replace Employer below?
//    public Job(Employer anEmployer, String someSkills) {

//   section 3
    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        //section 4
        this.skills = someSkills;
    }
    //Getters and Setters

    public Employer getEmployer(){
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

   public List<Skill> getSkills (){
       return skills;
   }
   public void setSkills(List<Skill> skills){
       this.skills = skills;
   }

}
