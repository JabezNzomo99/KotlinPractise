fun main(args: Array<String>){
    var array:IntArray?
    array= intArrayOf(23,45,34,23,56,78,57)
    array.sort()
    println(LinearSearch(array,21))

}
//Implementation of linear search in kotlin
fun LinearSearch(array:IntArray, noToFind:Int):Boolean{
    for(i in array){
        if(i==noToFind) {
            return true
        }
    }
    return false
}