import java.util.*
class Person(var name:String, var age:Int):Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return  this.age-other.age
    }

}

fun main(args: Array<String>){
    var listofNames=ArrayList<Person>()
    listofNames.add(Person("Jabez",21))
    listofNames.add(Person("Flo",23))
    listofNames.add(Person("Joy", 20))
    println("Before Sort")
    for(person in listofNames){
        println("Name : ${person.name}")
        println("Age : ${person.age}")
    }
    println("After Sort")
    Collections.sort(listofNames)
    for(person in listofNames){
        println("Name : ${person.name}")
        println("Age : ${person.age}")
    }

}
