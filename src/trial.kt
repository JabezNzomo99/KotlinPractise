//Defining variables in kotlin

fun main(args: Array<String>)
    {
        val answer: Int
        answer=2
        println(max(1,2))
        println(name("Jabez"))
        println(answer)
        calculate(4,20)
        val items= listOf<String>("Jabez","Nzomo", "Magomere")
        for(item in items){
            print(item+"\n")
        }
        print(describe(2))
        for(x in 1..10 step 2){
            print(x)
        }
        print("The number of vowels in omondi is ${countVowels("jabez")}")

    }

fun max(a: Int, b:Int)= if (a>b) a else b
fun name(fName:String):String
    {
       return "Goodmorning "+fName
    }
fun calculate(a:Int,b:Int)
    {
        println("Sum: "+add(a,b))
        println("Sub: "+sub(a,b))
        println("Mul: "+mul(a,b))
        println("Div: "+div(a,b))
    }
fun describe(obj: Any): String =
        when (obj) {
            is Int          -> "Integer"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }
fun add(a:Int, b:Int)=a+b;
fun sub(a:Int, b:Int)=if(a>b)a-b else b-a;
fun mul(a:Int, b:Int)=a*b;
fun div(a:Int, b:Int)=a/b;
fun countVowels(str: String): Int{
    var count=0
    for(i in str) {
        if (i.equals('a') || i.equals('e') || i.equals('i') || i.equals('o') || i.equals('u')) {
            count++
        }
    }
    return  count
}
