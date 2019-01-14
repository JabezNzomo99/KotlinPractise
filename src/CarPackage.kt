import com.example.cars.*
fun main(args: Array<String>){
    var car=Car("BMW",2015,10000.00,105,"MicMaestro")
    println("Price of Car: ${car.getCarPrice()}")
    var car2=Car("Kia", 2014,800.00,120, "Nzomo")
    println("Owner of car 2: ${car2.owner}")
    var car3=MyCar()
    car3.ShowInfo()
}
