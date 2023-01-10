
package com.portfolio.dana.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
public Skills(Long id, String nombre){
        this.id = id;
        this.nombre= nombre;
        
} 

public Skills(){

}

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String nombre;


    
}
