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
fun main(args: Array<String>){
    var car=Car("BMW",2015,10000.00,105,"MicMaestro")
    println("Price of Car: ${car.getCarPrice()}")
    var car2=Car("Kia", 2014,800.00,120, "Nzomo")
}
