
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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
public Educacion(Long id, String nombre, String titulo, String inicio, String fin, String img){
        this.id = id;
        this.nombre= nombre;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.img = img;
} 

public Educacion(){

}

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String nombre;

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String titulo;

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String inicio;

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String fin;


@Size(min=1, max=100, message="No cumple con la longitud")
private String img;
    
}
