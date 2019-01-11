import java.util.*

fun main(args:Array<String>) {
    print("Enter your year of birth: ")
    var age:Int= readLine()!!.toInt()
    print("Your age is "+(Calendar.getInstance().get(Calendar.YEAR)-age))

}

//class Caclulator{
//    var a:Int?=null
//    var b:Int? = null
//    fun Calculator(x:Int,y:Int){
//      this!!.a=x
//      this!!.b=y
//    }
//    fun add():Int{
//        return a+b
//    }
//}

