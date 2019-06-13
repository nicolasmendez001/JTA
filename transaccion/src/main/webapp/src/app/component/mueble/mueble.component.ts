import { Component, OnInit } from '@angular/core';
import { ServicioMuebleService } from 'src/app/services/servicio-mueble.service';
import { ModeloMueble } from 'src/app/model/ModeloMueble';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mueble',
  templateUrl: './mueble.component.html',
  styleUrls: ['./mueble.component.css'],
  providers: [ServicioMuebleService]
})
export class MuebleComponent implements OnInit {

  public listMuebles: Array<ModeloMueble>;

  constructor(private _serM:ServicioMuebleService,private router: Router) { }

  ngOnInit() {
    this.loadList();
  }

  public loadList() {
    this._serM.getListMueble().subscribe(
      res => {
        this.listMuebles = res;
        console.log(this.listMuebles);
        },
      error => console.log("No hay muebles disponible")
     );
  }

  public actionBuy(mueble:ModeloMueble) {
    sessionStorage.setItem('mueble', JSON.stringify(mueble));
    this.router.navigate(['/compra']);
  }

}
