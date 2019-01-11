
fun main(args: Array<String>){
    var n1:Int=10
    var n2:Int?
    var n2String:String="12"
    n2=n2String!!.toInt()
    var n2Float:Float?
    n2Float=n2String.toFloat()
    print("n1: $n1 \n")
    println("n2: $n2")
    println("n2Float: $n2Float")

    var pi:Double=Math.PI
    println("Double PI: $pi")
    var IntPi:Int=pi.toInt()
    println("Int PI: $IntPi")
}