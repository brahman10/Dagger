package com.example.dagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car)
    {
        Log.e("Remote","Connected Successfully")
    }
}