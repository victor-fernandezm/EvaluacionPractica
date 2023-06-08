import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Autobus, HTTPAutobusResponse } from './_model/autobus';
import { HTTPVisitaResponse, HTTPVisitasResponse } from './_model/visitas';

const BASE_URL: string = "http://localhost:4201";

@Injectable({
  providedIn: 'root'
})
export class AutobusServiceService {

  constructor(private httpClient: HttpClient) { }

  public async getAutobus(matricula: string): Promise<HTTPAutobusResponse> {
    let res!: HTTPAutobusResponse;
    await this.httpClient.get(BASE_URL + "/autobuses/get/" + matricula).forEach(r => {
      res = r as HTTPAutobusResponse;
    });

    return res;
  }

  
  public async getAutobuses(): Promise<HTTPAutobusResponse[]> {
    let res!: HTTPAutobusResponse[];
    await this.httpClient.get(BASE_URL + "/autobuses/list").forEach(r => {
      res = r as HTTPAutobusResponse[];
    });

    return res;
  }

  
  public async getVisitasByAutobus(matricula: string): Promise<HTTPVisitaResponse[]> {
    let res!: HTTPVisitaResponse[];
    await this.httpClient.get(BASE_URL + "/autobuses/get/" + matricula + "/visitas").forEach(r => {
      res = r as HTTPVisitaResponse[];
    });

    return res;
  }
}
