import java.util.*

//Scope Function
//with- return lambda and context is this
class Person
{
    var name:String=""
    var dept:String="CSE"
}


fun main()
{
    val p=Person().apply {
        name="Sandy"
        dept="CSE"
    }
    with(p){
        println(name)
        println(dept)
    }

}



