export class experiencia {
    id?:number;
    nombre:String;
    puesto:String;
    inicio:String;
    fin:String;
    img:String;

    constructor(nombre:String,puesto:String, img:String,inicio:String,fin:String) {
        this.nombre=nombre;
        this.puesto=puesto;
        this.img=img;
        this.inicio=inicio;
        this.fin=fin;
         
        
    }
}