
package com.portfolio.dana.Interface;

import com.portfolio.dana.Entity.Skills;
import java.util.List;




public interface ISkillsService {
    //traer lista 

 
    public List <Skills> getSkills();
    
    //Guardar
    public void saveSkills(Skills skills);
    
    //Eliminar
    public void deleteSkills (Long id);
    
    //Buscar
    public Skills findSkills (Long id);
}
