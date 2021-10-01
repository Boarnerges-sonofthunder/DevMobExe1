package com.example.exercice1

open class Circle(_radius:Double = 1.0,_color:String,_filled:Boolean):Shape(_color,_filled) {
    constructor():this(0.0,"",false);
    constructor(radius:Double):this(radius,"red",false);


    protected var radius:Double
    get() = field
    init {
        this.radius = _radius
    }

    override fun getArea(): Double {
        return Math.PI * Math.pow(this.radius,2.0);
    }

    //fun getArea():Double = Math.PI * Math.pow(this.radius,2.0);

    override fun getPerimeter(): Double {
        TODO("Not yet implemented")
    }

    override fun ToString(): String {
        TODO("Not yet implemented")
    }

}