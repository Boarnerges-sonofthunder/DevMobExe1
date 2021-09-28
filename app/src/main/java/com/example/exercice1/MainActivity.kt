package com.example.exercice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cir = Circle();
        var c = cir.getArea()

        var cyl = Cylindre(1.0,"blue",4.0);
        var cyli = cyl.getVolume();

    }
}