abstract class CreditCard(){
    fun CreditID():String{
        return "246429fge"
    }
}
class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreditID()
    }
}
fun main(args: Array<String>){


}