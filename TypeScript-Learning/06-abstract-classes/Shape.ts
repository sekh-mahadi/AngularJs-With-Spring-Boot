export abstract class Shape{
     
    constructor(private _x:number,private _y: number){

    } 
    public get x() : number {
        return this._x;
    }
 
    public set x(value : number) {
        this._x = value;
    }
    
    public get y() : number {
        return this._y;
    }

    public set y(value : number) {
        this._y = value;
    }

    getInfo():string{
        return `X=${this._x}, Y=${this._y}`;
    }
    abstract calculateArea(): number;
}