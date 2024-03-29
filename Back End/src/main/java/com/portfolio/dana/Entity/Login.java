
package com.portfolio.dana.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
   
    public Login(Long id, String nombre,String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
      
    }

    public Login() {
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

    
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    
    
    
    
    @Size(min=10, max=25, message="No cumple con la longitud")
    private String email;
    
  

    
}
