
package com.portfolio.dana.Controller;

import com.portfolio.dana.Entity.Experiencia;
import com.portfolio.dana.Interface.IExperienciaService;
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
public class ExperienciaController {
    @Autowired IExperienciaService  iexperienciaService;
    
    @GetMapping ("/experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return"La experiencia fue creada correctamente";
    }
    
  
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
     return "La Experiencia fue eliminada correctamente";
    
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("puesto") String nuevoPuesto,
                            @RequestParam("img") String nuevoImg,
                            @RequestParam("inicio") String nuevoInicio,
                            @RequestParam("fin") String nuevoFin
    ){
        
    Experiencia experiencia = iexperienciaService.findExperiencia(id);
    
    experiencia.setNombre(nuevoNombre);
    experiencia.setPuesto(nuevoPuesto);
    experiencia.setImg(nuevoImg);
    experiencia.setInicio(nuevoInicio);
    experiencia.setFin(nuevoFin);
   
    
    iexperienciaService.saveExperiencia(experiencia);
    return experiencia;
    }
    
    @GetMapping("/experiencia/traer/perfil")
    public Experiencia findExperiencia(){
        return iexperienciaService.findExperiencia((long)1);
    }
}
