import { NgModule, inject } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListadoAutobusesComponent } from './listado-autobuses/listado-autobuses.component';
import { VisitasAutobusComponent } from './visitas-autobus/visitas-autobus.component';

const routes: Routes = [
    {path: '' , component: ListadoAutobusesComponent},
    {path: 'visitas/:matricula', component: VisitasAutobusComponent}
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }