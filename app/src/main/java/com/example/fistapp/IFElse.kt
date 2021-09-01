package com.example.fistapp

fun main(){

println("If Else Statements")

    val x=10
    val y=10
    if(x>y) {

        println("X is Grater Than y ")
        println("if")
    }
    else if(x<y) {
        println("Y is Grater Than X ")
        println("else if")
    }
    else
    {
        println("X And X same")
        println("else")
    }
    //Another Example
    val time= 20
    if(time>44)
    {
        println("Good Moring")
    }
    else
    {
        println("Good Evening")
    }
    println("If..Else Expressions")
    val sn=11
    val ans=if(sn==12) //you can also use if..else statements as expressions (assign a value to a variable and return it):
    {
        "Same Ans"

    }
    else
    {
        "Ans Not same"
    }
       println(ans)
    //Note:You can omit the curly braces {} when if has only one statement:
    println("When Statement")
    val day=4
    val kk = when(day)
    {
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "Invalid day"
    }
    println("Your Day is:"+kk)

    //The when expression is similar to the switch statement in Java.
    //Instead of writing many if..else expressions,
     // you can use the when expression, which is much easier to read.
    //It is used to select one of many code blocks to be executed:


   //*********************************
    // While Loop
    println("While Loop")

    var i=0
    while (i<5)
    {
        println(i)
        i++         //Do not forget to increase the variable used in the condition, otherwise the loop will never end.
    }
    println("Do While Loop")
    var u=1
    do {
       println(u)
       u++
    }
        while (u<5)

        //  break and continue
      println(" break and continue")
    var j = 0
    while (j < 10) {
        println(j)
        j++
        if (j == 4) {
            break
        }

        println("Continuous statments")
        var i = 0
        while (i < 10) {
            if (i == 4) {
                i++
                continue
            }
            println(i)
            i++
        }
    }
       
}