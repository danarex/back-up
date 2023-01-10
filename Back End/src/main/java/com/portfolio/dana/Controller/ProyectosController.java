
package com.portfolio.dana.Controller;

import com.portfolio.dana.Entity.Proyectos;
import com.portfolio.dana.Interface.IProyectosService;
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
public class ProyectosController {
    @Autowired IProyectosService  iproyectosService;
    
    @GetMapping ("/proyectos/traer")
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
        return"La proyectos fue creada correctamente";
    }
    
  
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
        iproyectosService.deleteProyectos(id);
     return "La Proyectos fue eliminada correctamente";
    
    }
    
    @PutMapping ("/proyectos/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("descripcion") String nuevoDescripcion,
                            @RequestParam("fecha") String nuevoFecha,
                            @RequestParam("img") String nuevoImg,
                            @RequestParam("link") String nuevoLink
    ){
        
    Proyectos proyectos = iproyectosService.findProyectos(id);
    
    proyectos.setNombre(nuevoNombre);
    proyectos.setDescripcion(nuevoDescripcion);
    proyectos.setFecha(nuevoFecha);
    proyectos.setImg(nuevoImg);
    proyectos.setLink(nuevoLink);
   
    
    iproyectosService.saveProyectos(proyectos);
    return proyectos;
    }
    
    @GetMapping("/proyectos/traer/perfil")
    public Proyectos findProyectos(){
        return iproyectosService.findProyectos((long)1);
    }
}
