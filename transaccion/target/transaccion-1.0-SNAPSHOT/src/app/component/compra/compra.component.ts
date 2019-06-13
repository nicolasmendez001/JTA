import { Component, OnInit } from '@angular/core';
import { ModeloMueble } from 'src/app/model/ModeloMueble';
import { Router } from '@angular/router';
import { ModeloCliente } from 'src/app/model/ModeloCliente';
import { ModeloCompra } from 'src/app/model/ModeloCompra';
import { ServicioMuebleService } from 'src/app/services/servicio-mueble.service';

@Component({
  selector: 'app-compra',
  templateUrl: './compra.component.html',
  styleUrls: ['./compra.component.css'],
  providers: [ServicioMuebleService]
})
export class CompraComponent implements OnInit {

  public producto: ModeloMueble;
  public unidades: Array<number>;
  public cliente : ModeloCliente;
  public compra : ModeloCompra;
  

  constructor(private router: Router,private serve:ServicioMuebleService) {

    if (sessionStorage.getItem('mueble')) {
      this.producto = JSON.parse(sessionStorage.getItem( 'mueble'));
      console.log(this.producto);
      this.unidades = new Array<number>();
      for (let i = 0; i < this.producto.unidadDisponible; i++) {
        this.unidades.push(i+1);
        
      }
    } else {
      this.producto = new ModeloMueble();
    }

    this.cliente = new ModeloCliente();
    this.compra = new ModeloCompra();

   }
   

  ngOnInit() {
  }

  public saveBuy() {
    this.compra.cliente = this.cliente;
    this.compra.producto = this.producto;
    console.log(this.compra);
    this.serve.saveCompra(this.compra).subscribe(
      res => {alert(res),
              console.log(res);
              },
      err => {alert('Error al realizar la transacción  '+err.error),
                console.log(err.error);
                
            
                }
    );
  }
}
