import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';
/*import { PortfolioService } from '../../service/portfolio.service'*/;

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  /*iPortfolio:any; */
  persona: persona[] = [];
  constructor(public personaService:PersonaService) { }

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data=>{
      this.persona=data}
      )
    /*this.datosPortfolio.obtenerDatos().subscribe(data => {
      console.log(data);
      this.miPortfolio=data;
    });*/
  }

}
