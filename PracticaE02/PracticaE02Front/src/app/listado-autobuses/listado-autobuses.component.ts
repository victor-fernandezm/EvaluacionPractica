import { Component } from '@angular/core';
import { AutobusServiceService } from '../autobus-service.service';
import { Autobus } from '../_model/autobus';

@Component({
  selector: 'app-listado-autobuses',
  templateUrl: './listado-autobuses.component.html',
  styleUrls: ['./listado-autobuses.component.css']
})
export class ListadoAutobusesComponent {
  private _autobuses: Autobus[] = [];
  public get autobuses(): Autobus[] {
    return this._autobuses;
  }

  constructor(private service: AutobusServiceService) {}

  ngOnInit() {
    this.service.getAutobuses().then(val => {
      val.forEach(res => {
        this._autobuses.push(Autobus.fromHttpResponse(res));
      })
    });
  }
}
