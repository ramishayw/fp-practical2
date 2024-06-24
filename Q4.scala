object Practical2 extends App {
    val basePrice = 15.00
    val baseAttendance = 120
    val priceChange = 5.00
    val attendanceChange = 20
    val fixedCost = 500.00
    val varyingCostPerAttendee = 3.00

    // calculate the profit
    def calculateProfit(ticketPrice: Double): Double = {
      // number of attendees based on the price change
      val attendance = baseAttendance + ((basePrice - ticketPrice) / priceChange * attendanceChange)
      val revenue = ticketPrice * attendance // revenue
      val totalCost = fixedCost + (varyingCostPerAttendee * attendance) // total cost
      val profit = revenue - totalCost // profit
      profit
    }

    // range of ticket prices
    val minPrice = 0.00 
    val maxPrice = 100.00
    val step = 0.1

    // price that gives the maximum profit
    var bestPrice = basePrice
    var maxProfit = Double.MinValue
    var currentPrice = minPrice

    while (currentPrice <= maxPrice) {
      val profit = calculateProfit(currentPrice)
      if (profit > maxProfit) {
        maxProfit = profit
        bestPrice = currentPrice
      }
      currentPrice += step
    }

  println(f"The best ticket price is Rs $bestPrice%.2f")
}
