export class educacion {
    id?:number;
    nombre:String;
    titulo:String;
    inicio:String;
    fin:String;
    img:String;

    constructor(nombre:String,titulo:String, img:String,inicio:String,fin:String) {
        this.nombre=nombre;
        this.titulo=titulo;
        this.img=img;
        this.inicio=inicio;
        this.fin=fin;
        
    }
}