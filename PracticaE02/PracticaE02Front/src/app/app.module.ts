import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { VisitasAutobusComponent } from './visitas-autobus/visitas-autobus.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { ListadoAutobusesComponent } from './listado-autobuses/listado-autobuses.component';

@NgModule({
  declarations: [
    AppComponent,
    VisitasAutobusComponent,
    ListadoAutobusesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
