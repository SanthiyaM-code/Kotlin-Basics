fun main(args:Array<String>)
{
    var values:List <Int> =  listOf<Int>(8,2,5,5,7,6)
    for (i in values)
    {
        print("$i ")
    }
    println(values[2])
    println(values.get(1))
    println(values.indexOf(5))
    println(values.lastIndexOf(5))



}

