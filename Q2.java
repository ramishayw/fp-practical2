public class Q2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        float k = 4.3f;
        
        // System.out.println( - -b * a + c *d - -); // syantax error - - have to be in merged form -- 
        System.out.println(a++);   // answer = 2 prints the value of a first and then increments the value of a, in the next line if print a it returns 3
        // System.out.println(-2 * ( g - k ) +c); // g is not declared therefore compilation error
        System.out.println(c=c++); // c++ prints the value of c it stores in c therefore c remains unchanged
        System.out.println(c=++c*a++); // answer = 15 c starts with the initial value of 5 and a starts eith an initial value of 3 then 5*3 gives the answer 15
    }
}