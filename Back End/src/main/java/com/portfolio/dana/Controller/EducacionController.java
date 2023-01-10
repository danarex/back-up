
package com.portfolio.dana.Controller;

import com.portfolio.dana.Entity.Educacion;
import com.portfolio.dana.Interface.IEducacionService;
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
public class EducacionController {
    @Autowired IEducacionService  ieducacionService;
    
    @GetMapping ("/educacion/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return"La educacion fue creada correctamente";
    }
    
  
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
     return "La Educacion fue eliminada correctamente";
    
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("titulo") String nuevoTitulo,
                            @RequestParam("inicio") String nuevoInicio,                           
                            @RequestParam("fin") String nuevoFin,
                            @RequestParam("img") String nuevoImg
                            
    ){
        
    Educacion educacion = ieducacionService.findEducacion(id);
    
    educacion.setNombre(nuevoNombre);
    educacion.setTitulo(nuevoTitulo);
    educacion.setInicio(nuevoInicio);
    educacion.setImg(nuevoImg);
    educacion.setFin(nuevoFin);
   
    
    ieducacionService.saveEducacion(educacion);
    return educacion;
    }
    
    @GetMapping("/educacion/traer/perfil")
    public Educacion findEducacion(){
        return ieducacionService.findEducacion((long)1);
    }
}
