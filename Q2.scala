object Practical2 extends App {
    val a = 2;
    val b = 3;
    val c = 4;
    val d = 5;
    val k = 4.3f;

    println( - -b * a + c *d - -); // invalid sequence cant have space in beteen without any expression
    println(a++);   // invalid syntax
    println(-2 * ( g - k ) +c); // g is not declared therefore compulation error
    println(c=c++); // invalid syntax instead c = c + 1
    println(c=++c*a++); // invalid syntax
}