package com.example.fistapp

fun main(){
    println("Arrays In Kotlin")


val car= arrayOf("Volvo", "BMW", "Ford", "Mazda") //Declaration of Arrays
    car[0]="Changed"
    println(car[0])  /* accessing elements of Arrays */
    println(car[1])
    println(car[2])
    println(car[3])
    println("Size of array")
    println("Size of array:"+car.size)


    println("Check if an Element Exists")
    if("BMW" in car)
        println("BMW exists")
    else
        println("BMW Not exists")







}