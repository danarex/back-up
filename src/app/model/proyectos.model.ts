export class proyectos {
    id?:number;
    nombre:String;
    descripcion:String;
    img:String;
    fecha:String;
    link:String;

    constructor(nombre:String,descripcion:String, img:String,fecha:String,link:String) {
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.img=img;
        this.fecha=fecha;
        this.link=link;
        
    }
}