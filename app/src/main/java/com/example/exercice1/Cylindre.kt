package com.example.exercice1

class Cylindre(_radius:Double,_color:String,_height:Double = 1.0):Circle(_radius) {
    constructor():this(0.0,"",0.0);
    constructor(radius:Double):this(radius,"",0.0);
    constructor(radius:Double,height:Double):this(radius,"",height);

    private var height:Double
    get() = field
    init {
        this.height = _height;

    }

    fun getVolume():Double = Math.PI * Math.pow(super.radius,2.0) * this.height;

    override fun toString(): String {
        return "Cylindre avec un volume de ${getVolume()} cm2";
    }
}