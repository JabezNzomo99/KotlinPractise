import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>){
    println("Write text to write to file")
    var string:String= readLine().toString()
    WriteToFile<String>(string)
    println("File Contents: ${readFile("test.txt")}")

}
fun <T> WriteToFile(message: T){
    try{
        var fo=FileWriter("test.txt", true)
        fo.write(message.toString()+"\n")
        fo.close()
    }catch (ex: Exception){
        println(ex.message)
    }

}
fun readFile(fileName: String):String?{
    var data:String?=null
    try{
        var fo=FileReader(fileName)
        data=fo.readText()
        return data
    }catch(exception: Exception){
        println("Exception: ${exception.message}")

    }
    return data
}
