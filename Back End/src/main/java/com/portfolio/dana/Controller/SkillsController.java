
package com.portfolio.dana.Controller;

import com.portfolio.dana.Entity.Skills;
import com.portfolio.dana.Interface.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class SkillsController {
    @Autowired ISkillsService  iskillsService;
    
    @GetMapping ("/skills/traer")
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    
    @PostMapping("/skills/crear")
    public String createSkills(@RequestBody Skills skills){
        iskillsService.saveSkills(skills);
        return"La skills fue creada correctamente";
    }
    
  
    @DeleteMapping("/skills/borrar/{id}")
    public String deleteSkills(@PathVariable Long id){
        iskillsService.deleteSkills(id);
     return "La Skills fue eliminada correctamente";
    
    }
    
    @PutMapping ("/skills/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre
                            
    ){
        
    Skills skills = iskillsService.findSkills(id);
    
    skills.setNombre(nuevoNombre);
    
   
    
    iskillsService.saveSkills(skills);
    return skills;
    }
    
    @GetMapping("/skills/traer/perfil")
    public Skills findSkills(){
        return iskillsService.findSkills((long)1);
    }
}
