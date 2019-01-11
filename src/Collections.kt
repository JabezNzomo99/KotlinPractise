fun main(args: Array<String>){
    var map= hashMapOf(1 to "Hussein")
    var array=Array<String>(4){""}
    var list= listOf<String>()
    list= mutableListOf("jb","we")
    var data= arrayListOf<String>()
    var set= mutableSetOf(1,2,3,4,4,55,78)
    set.add(74)
    var newlist= listOf(set.sorted())
    for(element in newlist){
        println(element)
    }


}