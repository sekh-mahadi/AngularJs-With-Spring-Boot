import{Shape} from './Shape'

export class Rectangle extends Shape{

    calculateArea(): number {
       return this._width*this._length;
    }

    constructor(theX:number, theY: number,
         private _length:number,private _width:number){
        super(theX, theY);
    }

  
    public get width() : number {
        return this._width;
    }
    
    public set width(value : number) {
        this._width = value;
    }
    public get length() : number {
        return this._length;
    }
    
    public set length(value : number) {
        this._length = value;
    }
    getInfo():string{
        return super.getInfo()+ `, legth=${this._length}, width=${this._width}`;
    }
}