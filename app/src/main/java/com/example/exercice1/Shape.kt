package com.example.exercice1

abstract class Shape(_color:String,_filled:Boolean){
    constructor():this("",false);

    private var color:String = _color
        get() = field
    set(value) {
        field = value
    }

    private var filled:Boolean = _filled
    set(value) {
        field = value
    }

    fun isFilled():Boolean = this.filled

    abstract open fun getArea():Double;
    abstract open fun getPerimeter():Double;
    abstract open fun ToString():String;


}