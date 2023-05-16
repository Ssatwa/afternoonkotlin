import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter radius:")
    var radius=read.nextFloat()

    val pi=3.14

    var area=pi*radius*radius

    println("The area of the circle is $area")
    println(area.toInt())
}