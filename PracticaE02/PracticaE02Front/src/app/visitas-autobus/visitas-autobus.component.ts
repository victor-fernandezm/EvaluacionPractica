import { Component } from '@angular/core';
import { AutobusServiceService } from '../autobus-service.service';
import { Autobus, HTTPAutobusResponse } from '../_model/autobus';
import { HTTPVisitaResponse, HTTPVisitasResponse, Visita } from '../_model/visitas';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-visitas-autobus',
  templateUrl: './visitas-autobus.component.html',
  styleUrls: ['./visitas-autobus.component.css']
})
export class VisitasAutobusComponent {
  public matricula: string;
  public visitas: Visita[] = [];

  constructor(private service: AutobusServiceService, private router: Router, private route: ActivatedRoute) {
    this.matricula = route.snapshot.params["matricula"];
    service.getVisitasByAutobus(this.matricula).then(val => {
      let visitas: HTTPVisitaResponse[] = val as HTTPVisitaResponse[];
      visitas.forEach(visita => {
        this.visitas.push(Visita.fromHttpResponse(visita as HTTPVisitaResponse));
      })
    });
  }

  // public loadBus(): void {
  //   if(this.matricula) {
  //     this.service.getAutobus(this.matricula).then(val => {
  //       this.bus = Autobus.fromHttpResponse(val as HTTPAutobusResponse);
  //       // this. = val as HTTPAutobusResponse;
  //     }, reason => {
  //       console.warn(reason)
  //     });
  //     // console.log(this.bus)
  //   }else {
  //     console.error("Error, matricula is " + this.matricula);
  //   }
  // }

  
  // public loadVisitas(): void {
  //   if(this.matricula) {
  //     this.service.getVisitasByAutobus(this.matricula).then(val => {
  //       let visitas: HTTPVisitasResponse = val as HTTPVisitasResponse;
  //       this.visitas = [];
  //       visitas.forEach(visita => {
  //         this.visitas.push(Visita.fromHttpResponse(visita as HTTPVisitaResponse));
  //       })
  //     }, reason => {
  //       console.warn(reason)
  //     });
  //     // console.log(this.bus)
  //   }else {
  //     console.error("Error, matricula is " + this.matricula);
  //   }
  // }
}
