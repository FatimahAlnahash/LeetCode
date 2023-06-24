object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
        var greatest = candies.reduceLeft(_ max _)
        var result : Array[Boolean] = Array[Boolean]()
        println("greatest: " + greatest)
        candies.map(x => if(x+extraCandies >= greatest) result = result :+ true else result = result :+ false)
        result.toList
    }
}
