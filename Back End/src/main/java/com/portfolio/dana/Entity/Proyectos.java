
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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
public Proyectos(Long id, String nombre, String descripcion, String fecha, String link, String img){
        this.id = id;
        this.nombre= nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.link = link;
        this.img = img;
} 

public Proyectos(){

}

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String nombre;

@NotNull
@Size(min=1, max=200, message="No cumple con la longitud")
private String descripcion;

@NotNull
@Size(min=1, max=25, message="No cumple con la longitud")
private String fecha;


@Size(min=1, max=100, message="No cumple con la longitud")
private String link;


@Size(min=1, max=100, message="No cumple con la longitud")
private String img;
    
}
