open class Operations(){
    public var ProcessName:String?=null
    open fun sum(n1: Int, n2: Int): Int{
        return n1+n2
    }

    fun div(n1: Int, n2: Int): Int{
        return n1/n2
    }

    fun mul(n1: Int, n2: Int): Int{
        return n1*n2
    }
}
class MultiOperations():Operations(){
    fun sub(n1: Int, n2: Int): Int{
        return n1-n2
    }
    override fun sum(n1: Int, n2: Int): Int{
        return n1+n2*3

    }

    fun GetName():String?{
       return ProcessName
    }
}


fun main(args: Array<String>){
    var op=Operations()
    var op2=MultiOperations()
    var sum=op.sum(10,15)
    println("Sum: $sum")
    sum=op2.sum(10,15)
    println("Sum: $sum")
    var div=op.div(12,11)
    println("Div: $div")
    var mul=op2.mul(13,15)
    println("Mul: $mul")
    var sub=op2.sub(20,15)
    println("Sub: $sub")
    println("ProcessName: ${op.ProcessName}")


}