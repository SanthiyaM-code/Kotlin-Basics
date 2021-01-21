fun main(args:Array<String>)
{
    var values:MutableList <Int> =  mutableListOf<Int>(8,2,5,5,7,6)
    for (i in values)
    {
        print("$i ")
    }
    values.add(1)
    values.add(2)
    values.add(3)


    println(values[2])
    println(values.get(1))
    println(values.indexOf(5))
    println(values.lastIndexOf(5))
    for (i in values)
    {print("$i ")}



}

