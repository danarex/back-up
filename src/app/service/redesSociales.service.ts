import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { redesSociales } from '../model/redesSociales.model';

@Injectable({
  providedIn: 'root'
})
export class RedesSocialesService {
  URL="http://localhost:8080/redessociales/";
  constructor(private http:HttpClient) { }

    public getRedesSociales(): Observable <redesSociales[]>{
      return this.http.get<redesSociales[]>(this.URL + 'traer');
    
   }
}