object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
        (word1, word2) match {
        case ("", w2) => w2
        case (w1, "") => w1
        case (w1, w2) =>
            print (w1.tail +", "+ w2.tail) 
            w1.head.toString + w2.head.toString + mergeAlternately(w1.tail, w2.tail)    
        }
    }
}
