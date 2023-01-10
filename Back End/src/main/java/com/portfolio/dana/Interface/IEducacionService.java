
package com.portfolio.dana.Interface;

import com.portfolio.dana.Entity.Educacion;
import java.util.List;




public interface IEducacionService {
    //traer lista 

 
    public List <Educacion> getEducacion();
    
    //Guardar
    public void saveEducacion(Educacion educacion);
    
    //Eliminar
    public void deleteEducacion (Long id);
    
    //Buscar
    public Educacion  findEducacion (Long id);
}
