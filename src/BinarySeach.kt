fun main(args: Array<String>){
    var sortedArray: IntArray?
    sortedArray= intArrayOf(90,80,10,40,50,70,60)
    sortedArray.sort()
    print(BinarySeach(sortedArray,0,sortedArray.size-1,70))
}
fun BinarySeach(sortedArray:IntArray, first:Int, last:Int, noToFind:Int):Boolean{
    if(last>=first){
        val middle:Int?
        middle=first+(last-first)/2
        if(sortedArray[middle]==noToFind){
            return true
        }else if(sortedArray[middle]>noToFind){
            return BinarySeach(sortedArray,first,middle-1,noToFind)
        }else if(sortedArray[middle]<noToFind){
            return BinarySeach(sortedArray,middle+1,last,noToFind)
        }
    }
    return false
}