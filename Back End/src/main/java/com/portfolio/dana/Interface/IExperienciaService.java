
package com.portfolio.dana.Interface;

import com.portfolio.dana.Entity.Experiencia;
import java.util.List;




public interface IExperienciaService {
    //traer lista 

 
    public List <Experiencia> getExperiencia();
    
    //Guardar
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar
    public void deleteExperiencia (Long id);
    
    //Buscar
    public Experiencia findExperiencia (Long id);
}
