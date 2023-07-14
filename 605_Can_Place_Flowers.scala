object Solution {
    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
        val numZeroStart = flowerbed.mkString.takeWhile(_ == '0').size
        val numZeroEnd = flowerbed.mkString.reverse.takeWhile(_ == '0').size
        val numZeroMiddle = flowerbed.mkString.dropWhile(_ == '0').reverse
            .dropWhile(_ == '0').split('1')
            .map(n => (n.size - 1) / 2).sum

        if(flowerbed.mkString.contains('1'))
        (numZeroStart / 2 + numZeroEnd / 2 +numZeroMiddle) >= n
      else (flowerbed.size + 1) / 2 >= n
    }
}
