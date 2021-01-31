import java.util.*

//Scope Function
//with- return lambda and context is this

fun main()
{
    val p=Person()
    val nameAndDept:String=with(p){
        println(name)
        println(dept)
        "I am $name from $dept"
    }

    println(nameAndDept)
}

class Person
{
    var name:String="Santhiya"
    var dept:String="CSE"
}


