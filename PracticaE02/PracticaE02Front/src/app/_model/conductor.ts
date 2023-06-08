export type HTTPConductorResponse = {dni: string, nombre: string};
export class Conductor {

    private _dni: string;
    public get dni(): string {
        return this._dni;
    }
    public set dni(value: string) {
        this._dni = value;
    }
    private _nombre: string;
    public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }

    constructor(dni: string, nombre: string) {
        this._dni = dni;
        this._nombre = nombre;
    }

    public static fromHttpResponse(obj: HTTPConductorResponse): Conductor {
        return new Conductor(obj.dni, obj.nombre);
    }
    
}