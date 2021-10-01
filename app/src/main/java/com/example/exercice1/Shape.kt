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

    abstract fun getArea():Double;
    abstract fun getPerimeter():Double;
    abstract fun ToString():String;


}