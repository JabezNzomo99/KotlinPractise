import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>){
    var arrayInt= Array<Int>(5){0}
    arrayInt[3]=55
    println("Array: ${printIntArray(arrayInt )}")
    var arrayStr:Array<String>?
    arrayStr=Array<String>(4){""}
    for(index in 0 until  arrayStr.size){
        println("Enter $index element: ")
        arrayStr[index]= readLine()!!
    }
    print("--------STRING ARRAY OUTPUT---------- \n")
    printStringArray(arrayStr)

}
fun printIntArray(array: Array<Int>){
    for(element in array){
        println(element)
    }
    //implementation of the above method
//    for(i in 0..array.size-1){
//        print(array[i])
//    }

}
fun printStringArray(array: Array<String>){
    for(i in array){
        println(i)
    }
}
