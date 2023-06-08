export type HTTPLugarResponse = {id_lugar: string, nombre: string};
export class Lugar {

    private _id: string;
    // public get id(): string {
    //     return this._id;
    // }
    // public set id(value: string) {
    //     this._id = value;
    // }

    private _nombre: string;
    public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }

    constructor(id: string, nombre: string) {
        this._id = id;
        this._nombre = nombre;
    }

    public static fromHttpResponse(obj: HTTPLugarResponse): Lugar {
        return new Lugar(obj.id_lugar, obj.nombre);
    }
    
}