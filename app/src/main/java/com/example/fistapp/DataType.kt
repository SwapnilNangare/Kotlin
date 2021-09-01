package com.example.fistapp

fun main()
{
    println("Kotlin dataType")

    val myNum=5
    println("Int DataType :"+myNum)
    val myString="Swapnil"
    println("String DataType :"+myString)
    val myChareter='S'
    println("Charater DataType :"+myChareter)
    val myBoolean=true
    println("Boolean dataType :"+myBoolean)
    val myDouble=1.23
    println("Double DataType :"+myDouble)

/*
val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String
*/

    //Type Conversion
    //To convert a numeric data type to another type, you must use one of the following functions:
    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
    val ty:Double=12.56
    val y:Int=ty.toInt()
    println("type Conversion :$y")



}