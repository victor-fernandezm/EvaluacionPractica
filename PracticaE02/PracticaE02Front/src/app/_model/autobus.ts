export type HTTPAutobusResponse = {matricula: string, a_fabricacion: number};
export class Autobus {

    private _matricula: string;
    public get matricula(): string {
        return this._matricula;
    }
    public set matricula(value: string) {
        this._matricula = value;
    }
    private _anioFabricacion: number;
    public get anioFabricacion(): number {
        return this._anioFabricacion;
    }
    public set anioFabricacion(value: number) {
        this._anioFabricacion = value;
    }

    constructor(matricula: string, a_fabricacion: number) {
        this._matricula = matricula;
        this._anioFabricacion = a_fabricacion;
    }

    public static fromHttpResponse(obj: HTTPAutobusResponse): Autobus {
        return new Autobus(obj.matricula, obj.a_fabricacion);
    }
    
}