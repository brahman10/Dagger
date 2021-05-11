package com.example.dagger

import dagger.Component

@Component
interface CarComponent {

    fun inject(mainActivity: MainActivity)
}