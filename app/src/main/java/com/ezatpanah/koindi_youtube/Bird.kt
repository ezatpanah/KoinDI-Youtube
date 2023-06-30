package com.ezatpanah.koindi_youtube

class Bird(private val fly: Fly, private val eat: Eat) {
    fun birdDesc(): String = fly.birdFly() + "\n" + eat.birdEatFood()
}

class Eat {
    fun birdEatFood(): String = "The parrot eats food"
}

class Fly {
    fun birdFly(): String = "The parrot flies"
}