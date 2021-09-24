package com.example.exercice1

abstract class Circle(_radius:Double = 1.0, _color:String = "red") {
    constructor(radius:Double,color:Double):this(radius,"red")

    open val radius:Double
    get()= field
    init {
        this.radius = _radius;
    }

    fun getArea():Double = Math.PI * Math.pow(this.radius,2.0);

    abstract override fun toString():String;

}