import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MuebleComponent } from './component/mueble/mueble.component';
import { CompraComponent } from './component/compra/compra.component';

const routes: Routes = [

  {path :'', redirectTo:'/mueble', pathMatch:'full'},
  {path:'mueble', component: MuebleComponent},
  {path:'compra', component: CompraComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
