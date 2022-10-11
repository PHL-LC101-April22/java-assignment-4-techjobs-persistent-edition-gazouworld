package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    public String Description;
    public Skill () {

    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}