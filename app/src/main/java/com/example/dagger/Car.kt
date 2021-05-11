package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine , wheels: Wheels){

    fun driveCar()
    {
        Log.e("Car","Driving Successfully");
    }

}