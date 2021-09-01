package com.example.fistapp
fun main()
{
    println("kotlin Operators")
   /*       Arithmetic operators
            Assignment operators
            Comparison operators
            Logical operators
    */
    println("Arithmetic operators")

    val x=12
    val y=10
    var a=10

    println("Addition :"+ (x+y))
    println("Subtraction :"+(x-y))
    println("Multiplication :"+(x*y))
    println("Division :"+(x/y))
    println("Modulus :"+(x%y))
    println("Modulus :"+(x%y))
    println("Increment :"+(++a))
    println("Decrement :"+(--a))

//Assignment operators
    println("Assignment operators")
    var b=10
    var c=5
    println("Assignment ="+a)
    b+=12;
    println("+=:"+b)
    b-=12;
    println("-=:"+b)
    b*=12;
    println("*=:"+b)
    b/=12;
    println("/=:"+b)
    b%=12;
    println("%=:"+b)

   //Comparison Operators
   println("Comparison Operators")
    var j=10
    var k=23
    println("==:"+(j==k))
    println("!=:"+(j!=k))
    println(">:"+(j>k))
    println("<:"+(j<k))
    println(">=:"+(j>=k))
    println("<=:"+(j<=k))

   //Logical Operators
    println("Logical Operators")
    var m = 5
    println(m > 3 && m < 10) //Returns true if both statements are true
    println(m > 3 || m < 10) //Returns true if one of the statements is true

    var myBool = true
    println(!myBool) //Reverse the result, returns false if the result is true

}


