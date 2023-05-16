import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter A:")
    var A=read.nextInt()
    println("Enter B:")
    var B=read.nextInt()
    println("Enter H:")
    var H=read.nextInt()

    var area=((A+B)/2)*H

    println("The area of the trapezium is $area")
}