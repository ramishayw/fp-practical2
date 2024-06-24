object Practical2 extends App {
    def takeHomeSalary(normalHours:Int, otHours:Int):Double = {
        val normal = 250
        val ot = 85
        val weeklyTax = 12
        val monthlySalary = 4 * (normalHours * normal + otHours * ot) * (100 - weeklyTax) / 100.0

        monthlySalary
    }

    val salary = takeHomeSalary(40, 30);
    println(s"The montly salary employee recieves is: Rs. $salary")
}