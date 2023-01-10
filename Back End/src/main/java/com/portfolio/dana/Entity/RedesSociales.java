
package com.portfolio.dana.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
public class RedesSociales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
   
    public RedesSociales(Long id, String nombre, String img) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        
    }

    public RedesSociales() {
    }

   
    
    @NotNull
    @Size(min=1, max=25, message="No cumple con la longitud")
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    

   
    @Size(min=1, max=100, message="No cumple con la longitud")
    private String img;
    


    
}
