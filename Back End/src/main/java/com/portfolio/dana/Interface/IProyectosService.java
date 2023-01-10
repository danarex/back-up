
package com.portfolio.dana.Interface;

import com.portfolio.dana.Entity.Proyectos;
import java.util.List;




public interface IProyectosService {
    //traer lista 

 
    public List <Proyectos> getProyectos();
    
    //Guardar
    public void saveProyectos(Proyectos proyectos);
    
    //Eliminar
    public void deleteProyectos (Long id);
    
    //Buscar
    public Proyectos findProyectos (Long id);
}
