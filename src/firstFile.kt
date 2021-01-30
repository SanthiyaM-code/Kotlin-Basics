import java.util.*

fun main(args:Array<String>)
{
    var sc=Scanner(System.`in`)
    println("Enter a")
    var a:Int=sc.nextInt()
    println("Enter b")
    var b:Int=sc.nextInt()
    println("Multiplication of $a and $b is ${multiplication(a,b)} ")

}

fun multiplication(a:Int,b:Int):Int
{
    return a*b
}

