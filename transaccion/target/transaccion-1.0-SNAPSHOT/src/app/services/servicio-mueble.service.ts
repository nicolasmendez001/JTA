import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { ModeloMueble } from '../model/ModeloMueble';
import { ModeloCompra } from '../model/ModeloCompra';

@Injectable({
  providedIn: 'root'
})
export class ServicioMuebleService {

  constructor(private http: HttpClient) { }

  public saveCompra(compra:ModeloCompra):Observable<string> {
    return this.http.post<string>( "http://192.168.43.152:17129/transaccion/web/Compra/saveCompra",compra);
  }

  public getListMueble(): Observable<ModeloMueble[]> {
    return this.http.get<ModeloMueble[]>( "http://192.168.43.152:17129/transaccion/web/Producto");

  }
}
