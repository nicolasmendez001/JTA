import { ModeloCliente } from './ModeloCliente';
import { ModeloMueble } from './ModeloMueble';

export class ModeloCompra {
    id:number;
    cliente: ModeloCliente;
    numeroUnidades : number;
    producto : ModeloMueble;
    
    
    
}