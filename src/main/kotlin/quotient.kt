import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter a:")
    var a=read.nextInt()

    println("Enter b:")
    var b=read.nextInt()


    val quotient=a/b
    val modulus=a%b

    println("The quotient is ${quotient.toInt()} and the remainder is $modulus")
}