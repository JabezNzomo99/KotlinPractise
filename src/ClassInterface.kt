interface op{
    fun sum(n1:Int, n2:Int){println("Sum: "+(n1+n2))}
    fun div(n1:Int, n2:Int){println("Div: "+(n1/n2))}

}
class UserOp:op {//extend the interface
    //one must implement the methods of the interfcae
    override fun sum(n1: Int, n2: Int) {
        println("Sum:" + (n1 + n2))
    }

    override fun div(n1: Int, n2: Int) {
        println("Div:" + (n1 / n2))
    }
}
class AdminOp:op{
    override fun sum(n1: Int, n2: Int) {
        println("Sum:"+(n1+n2-2))
    }

    override fun div(n1: Int, n2: Int) {
        println("div:"+(n1/n2-2))
    }
}
class Manager:op{

}
fun main(args:Array<String>){
    var manager=Manager()
    manager.sum(23,45)
    manager.div(90,45)
}