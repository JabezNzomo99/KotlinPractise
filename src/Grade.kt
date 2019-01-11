
fun main(args: Array<String>){
    print("Enter the student average score: ")
    var score:Int= readLine()!!.toInt()
    print("The grade of the student is: ${grade(score)}")

}
fun grade(score:Int):String{
    when(score){
    in 80..100->{
         return "A"
     }
    in 70..80->{
        return "B+"
    }
    in 60..70->{
        return "B"
    } 
    in 50..60->{
        return "C+"
    }
    in 40..50->{
        return "C"
    }
    else-> return "Fail"
    }

}