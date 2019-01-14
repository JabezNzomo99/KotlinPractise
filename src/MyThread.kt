
fun main(args: Array<String>){
    var t1=thread("thread 1")
    t1.start() //run it as a thread and not as a method

    var t2=thread("thread 2")
    t2.start()

    var t3=thread("thread 3")
    t3.start()

    t3.join()
    println("thread is run")
}
class thread: Thread{
    var threadName:String?=null
    constructor(ThreadName: String) : super(){
        this.threadName=ThreadName
        println("${this.threadName} is started")
    }

    override fun run() {
        //Write thread
        var count=0
        while(count<10){
            println("$threadName Count: $count")
            count++
            try{
                Thread.sleep(1000)
            }catch (ex:Exception){
                println(ex.message)
            }

        }
    }
}