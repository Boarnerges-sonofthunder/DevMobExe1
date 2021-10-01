package com.example.exercice1

class Square(_width:Double,_length:Double,_color:String,_filled:Boolean):Rectangle(_width,_length,_color,_filled) {
    constructor():this(0.0,0.0,"",false)
    constructor(side:Double):this(side,0.0,"",false)
    constructor(side:Double,color:String,filled:Boolean):this(side,0.0,color,filled)

    private var side:Double = 0.0
    get() = field
    set(value) {
        field =value
    }

    fun setWidth():Double = this.setWidth()
    fun setLength():Double = this.setLength()
    override fun ToString(): String {
        return super.ToString()
    }
}