import { Autobus, HTTPAutobusResponse } from "./autobus";
import { Conductor, HTTPConductorResponse } from "./conductor";
import { HTTPLugarResponse, Lugar } from "./lugar";

export type HTTPVisitaResponse = {id: number, f_visita: string, autobus: HTTPAutobusResponse, conductor: HTTPConductorResponse, lugar: HTTPLugarResponse};
export type HTTPVisitasResponse = Array<HTTPVisitaResponse>;
export class Visita {

    private _fechaVisita: string;
    public get fechaVisita(): string {
        return this._fechaVisita;
    }
    public set fechaVisita(value: string) {
        this._fechaVisita = value;
    }

    private _autobus: Autobus;
    public get autobus(): Autobus {
        return this._autobus;
    }
    public set autobus(value: Autobus) {
        this._autobus = value;
    }
    
    private _conductor: Conductor;
    public get conductor(): Conductor {
        return this._conductor;
    }
    public set conductor(value: Conductor) {
        this._conductor = value;
    }

    private _lugar: Lugar;
    public get lugar(): Lugar {
        return this._lugar;
    }
    public set lugar(value: Lugar) {
        this._lugar = value;
    }

    constructor(fechaVisita: string, autobus: Autobus, conductor: Conductor, lugar: Lugar) {
        this._fechaVisita = fechaVisita;
        this._autobus = autobus;
        this._conductor = conductor;
        this._lugar = lugar;
    }

    public static fromHttpResponse(obj: HTTPVisitaResponse): Visita {
        return new Visita(obj.f_visita, Autobus.fromHttpResponse(obj.autobus), Conductor.fromHttpResponse(obj.conductor), Lugar.fromHttpResponse(obj.lugar));
    }
    
}