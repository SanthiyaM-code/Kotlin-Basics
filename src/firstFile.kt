import java.util.*

//Scope Function
//let- return context and context is it



fun main()
{
    val name:String?="Sandy"

    name?.let {
        println(it.reversed())
        println(it.capitalize())
    }

}



