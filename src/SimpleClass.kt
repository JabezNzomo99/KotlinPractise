class Car(var type:String, var model:Int, var price:Double, var milesDriven: Int, var owner: String){//direct constructor by kotlin
    init {//The block of code is run when the class is created
        println("type: $type")
        println("model: $model")
        println("price: $price")
        println("miles driven: $milesDriven")
        println("owner: $owner")
    }
    fun getCarPrice():Double{
        return this.price-(this.milesDriven.toDouble()*10)
    }

}
