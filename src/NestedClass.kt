
class Outer{//  outer class
    private val name:String?=null
    inner class Nested{//inner class,in order to access private properties the key word inner must be explicitly stated
        fun Show(){
            println(name)
        }
    }


}