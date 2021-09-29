package com.example.exercice1

open class Circle(_radius:Double = 1.0, _color:String = "red") {
    constructor():this(0.0,"")
    constructor(radius:Double):this(radius,"red");

    protected var radius:Double
    get() = field
    init {
        this.radius = _radius
    }

    fun getArea():Double = Math.PI * Math.pow(this.radius,2.0);

    open fun monCercle() = "Il s'agit d'un ";

}