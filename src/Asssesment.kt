fun main() {
    introduction("Mandek",20)
    robot(guests=5)
    robot(guests = 12)
    robot(guests = 30)



}
fun introduction(name:String,age:Int) {
    var name=("Mandek")
    var age=(20)
    var detail=" my name is $name and i am $age years old"
    println(detail)


}

fun robot(guests:Int){
    when(guests) {
        1, 2, 3, 4, 5 -> println("guests are served milk")
        14, 13, 12, 10 -> println ("guests are served fanta orange")
        else-> println("everybody else gets a coca cola")
    }
    }

fun numbers(num1:Int,num2:Int) {
    var num1=23
    var num2=43
    var sum=23%43
    println(sum)



fun names(name:String,name2:String,name3:String){
    if (name>"five"){
        println("fatuma")
    }else
        println("mamukalauzi")

    }