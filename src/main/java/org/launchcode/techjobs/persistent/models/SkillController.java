package org.launchcode.techjobs.persistent.models;

import org.launchcode.techjobs.persistent.models.data.EmployerRepository;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping
public class SkillController {

    @Autowired
    //skills repository?
//    private EmployerRepository employerRepository;
    private SkillRepository skillRepository
    // add index method
    @GetMapping
    public string index{
        model.addAttribute("skills", skills);
        //return? to employer index?  Ask Adam
    }


    @GetMapping("add")
    public String displayAddSkillForm(Model model) {
        model.addAttribute(new Employer());
        return "skills/add";

    }

    @PostMapping("add")
    public String processAddSkillForm(@ModelAttribute @Valid Skill newSkill,
                                         Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "skills/add";
        }
        //add method to add to the employerRepository
        skillRepository.saveOrUpdate(newEmployer)

        return "redirect:";
    }

    @GetMapping("view/{skillId}")
    public String displayViewSkill(Model model, @PathVariable int skillId) {
// completely lost here.
//        Optional optEmployer = null;
        optSkill = skillId.findByID(id)
        if (optSkill.isPresent()) {
            Skill skill = (Skill) optSkill.get();
            model.addAttribute("skill", skill);
            return "skills/view";
        } else {
            return "redirect:../";
        }
    }
}

}
