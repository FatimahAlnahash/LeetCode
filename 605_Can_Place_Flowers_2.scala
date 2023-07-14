object Solution {
    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
        if (n == 0) return true
        var m = n
        var i = 0
        for (i <- 0 to flowerbed.length-1 ){
            if(flowerbed(i) == 0 && 
                (i == 0 || flowerbed(i-1) == 0) &&
                (i == flowerbed.length-1 || flowerbed(i+1) ==0)){
                    flowerbed(i) = 1
                    m = m - 1
                    if (m == 0) return true
            }
        }
        return false
    }
}
