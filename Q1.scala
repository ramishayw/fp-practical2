object Practical2 extends App {
    val k = 2  // scala does not support multiple variable assignments
    val i = 2  // each variable must be declared and assigned seperately
    val j = 2 
    val m = 5
    val n = 5
    val f = 12.0f // f represents a floating point number (just like java)
    val g = 4.0f
    val c = 'X'

    println(k + 12 * m) // answer = 62 according to bodmas
    println(m / j) // answer = 2 returns an integer value does not consider the decimal part nor round the value
    println(n % j) // answer = 1 remainder is 1
    println(m / j * j) // answer = 4 first m / j returns 2 and multiplied by 2 which is 4
    println(f + 10 * 5 + g) // answer = 66.0 no f at the end 
    println(++i * n) // error scala does not support ++ instead i = i + 1
}