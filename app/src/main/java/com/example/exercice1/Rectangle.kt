package com.example.exercice1

open class Rectangle(_width:Double,_length:Double,_color:String,_filled:Boolean):Shape(_color,_filled) {
    constructor():this("",false,0.0,0.0);
    constructor(width:Double,length:Double):this("",false,width,length);
    constructor(color:String,filled:Boolean,width:Double,length:Double):this(width,length,color,filled)

    private var width:Double = _width
    get() = field
    set(value) {
        field = value
    }

    private var length:Double = _length
    get() = field
    set(value) {
        field = value
    }


    override fun getArea(): Double {
        TODO("Not yet implemented")
    }

    override fun getPerimeter(): Double {
        TODO("Not yet implemented")
    }

    override fun ToString(): String {
        TODO("Not yet implemented")
    }
}