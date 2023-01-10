import { Component, OnInit } from '@angular/core';
import { proyectos } from 'src/app/model/proyectos.model';
import { ProyectosService } from 'src/app/service/proyectos.service';


@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {
  proyectos:proyectos[] = [];
  constructor(public proyectosService:ProyectosService) { }

  ngOnInit(): void {
    this.proyectosService.getProyectos().subscribe(data3 => {
    
      this.proyectos=data3;
    });
  }

}
