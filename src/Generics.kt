class UserAdmins<T>(credit:T){
    init{
        println(credit)
    }

}
fun <T, F> multiply(n1:T, n2:F){
    return n1+n2
}

private operator fun <T, F> T.plus(n2: F) {

}

fun main(args:Array<String>){
    var userAdmin=UserAdmins<String>("Jabez")
    var intAdmin=UserAdmins<Int>(100)
    var mult=multiply<Double,Int>(12.555,1)
    println(mult.toString())

}