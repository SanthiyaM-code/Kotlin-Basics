import java.util.*

//Scope Function
//also- return context and context is it
class Person
{
    var name:String=""
    var dept:String="CSE"
}


fun main()
{
    val p=Person().also{
        it.name="Sandy"
        it.dept="CSE"
    }
    with(p){
        println(name)
        println(dept)
    }

}



