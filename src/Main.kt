fun main()
{
    val double:(Int)->Int={x->x*2}
    println(double(4))

    val numbers=listOf(1,2,3)
    val dn=numbers.map{it*2}
    println(dn)

}