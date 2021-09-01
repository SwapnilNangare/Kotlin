package com.example.fistapp
fun main()
{
    println("String and Function of String")

    //declaration of String

    var st="Swapnil"
    println("String Name is :"+st)
    var txt:String="NANA"
    println("String Name is :"+txt)

    // Access a String using index number
    println(txt[0]) //N
    println(txt[1]) //A
    println(txt[2]) //N

  //String Length
    println("Length of String is:"+st.length)
    println("toUpperCase:"+st.toUpperCase())
    println("toLowerCase:"+st.toLowerCase())
    println("Comparing Strings")
    var str1="Swapnil"
    var str2="NANA"
    println("Comparing String:"+(str1.compareTo(str2)))
    println("Finding a String in a String")
    var str3="i am swapnil i am best Person"
    println(str3.indexOf("am"))
    //Quotes Inside a String
    println("Quotes Inside a String")
    var txt1 = "It's alright"
    var txt2 = "That's great"
    println(txt1)
    println(txt2)
    //String Concatenation
    println("String Concatenation")
    println("Concatenation:"+txt1+" "+txt2)
    println("using pluse:"+txt1.plus(txt2)) //using plus methods
    //String Templates/Interpolation
    println("String Templates/Interpolation")
    var firstName = "Swapnil"
    var lastName = "Nangare"
    println("My name is: $firstName $lastName")
    println(firstName.substring(2,5))

      // Booleans
    println(" Booleans")
    val one=true
    val two=false
    println(one)
    println(two)
    //expression
    println("expression")
    val x = 10
    val y = 9
    println(x > y) //true
    println(10 == 15);//false



}
