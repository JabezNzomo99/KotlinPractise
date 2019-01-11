
fun main(args: Array<String>){
    var title=" Welcome to nairobi \n"
    print("Second Char:"+title[1])
    for(i in title){
        println(i)
    }
    print(title.toUpperCase())
    var array:List<String>?
    array=title.split(" ")
    print(title.split(" "))
    println(title.trim()) //trim removes any spaces before and after the string text
}