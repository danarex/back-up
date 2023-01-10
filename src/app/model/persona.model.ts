export class persona {
    id?:number;
    nombre:String;
    apellido:String;
    img:String;
    email:String;
    sobreMi:String;
    ubicacion:String;

    constructor(nombre:String,apellido:String, img:String,email:String,sobreMi:String,ubicacion:String) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.img=img;
        this.email=email;
        this.sobreMi=sobreMi;
        this.ubicacion=ubicacion;
        
    }
}