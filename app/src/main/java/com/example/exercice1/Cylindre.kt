package com.example.exercice1

class Cylindre(_radius:Double,_color:String,_height:Double = 1.0):Circle(_radius,_color) {
    constructor(radius:Double):this(radius,"red",1.0);
    constructor(radius:Double,height:Double):this(radius,"red",height);

    private var height:Double
    get() = field
    init {
        this.height = _height;

    }

    fun getVolume():Double = Math.PI * Math.pow(Circle.radius,2.0) * this.height;

    override fun toString(): String {
        TODO("Not yet implemented")
    }
}