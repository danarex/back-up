import { Component, OnInit } from '@angular/core';
import { PersonaService } from 'src/app/service/persona.service';
import { PortfolioService } from '../../service/portfolio.service';
import { persona } from 'src/app/model/persona.model';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  /*miPortfolio:any;*/
  persona:persona[] = [];
  constructor(private personaService:PersonaService) { }

  ngOnInit(): void {
    /*this.datosPortfolio.obtenerDatos().subscribe(data => {
      console.log(data);
      this.miPortfolio=data;
    });*/

    this.personaService.getPersona().subscribe(data8=>{
      this.persona=data8}
      )
  }

}
