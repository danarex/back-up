import { Component, OnInit } from '@angular/core';
/*import { PortfolioService } from '../../service/portfolio.service';*/
import { PersonaService } from 'src/app/service/persona.service';
import { persona } from 'src/app/model/persona.model';
import { EducacionService } from 'src/app/service/educacion.service';
import { educacion } from 'src/app/model/educacion.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';
import { experiencia } from 'src/app/model/experiencia.model';


@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {
  /*miPortfolio:any;*/
  persona:persona[]= []; 
  educacion:educacion[]= [];
  experiencia:experiencia[]= [];
  constructor(private personaService:PersonaService, private educacionService:EducacionService, private experienciaService:ExperienciaService) { }

  ngOnInit(): void {
    /*this.datosPortfolio.obtenerDatos().subscribe(data => {
      this.miPortfolio=data;
    });*/
    this.personaService.getPersona().subscribe(data5=>{
      this.persona=data5}
      );
      this.experienciaService.getExperiencia().subscribe(data2 => {
        this.experiencia=data2;
      });  

      this.educacionService.getEducacion().subscribe(data7 => {
        this.educacion=data7;
      });

    
  }

}
