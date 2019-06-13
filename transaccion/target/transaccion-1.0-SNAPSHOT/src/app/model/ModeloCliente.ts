import { ModeloTarjeta } from './ModeloTarjeta';

export class ModeloCliente {
    id:number;
    nombre:string;
    numeroDocumento:string;
    tarjeta:ModeloTarjeta;

    constructor() {
        this.tarjeta = new ModeloTarjeta();
    
    }
}