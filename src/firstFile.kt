import java.util.*

fun main(args :Array<String>)
{
    var student=TreeMap<String,Int>()

    student["Santhiya"]=501
    student["Srimathi"]=502

    for((name,rollno) in student)
    {
        println("$name,$rollno")
    }


}

