fun main(args: Array<String>){
    var map=HashMap<Int, String>()
    map.put(1, "jabez")
    map.put(2, "nzomo")
    map.put(3, "magomwere")
    println(map)
    for(key in map.keys){
        println("$key:"+ map.get(key))
    }

}