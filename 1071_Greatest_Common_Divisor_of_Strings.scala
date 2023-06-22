object Solution {
    def gcdOfStrings(str1: String, str2: String): String = {
        println("str1: " + str1 + " | str2: " + str2)
        
        if (str1 + str2 != str2 + str1) ""
        else if (str1 == str2) str1
        else if (str1.length > str2.length) {
            gcdOfStrings(str1.replaceFirst(str2, ""), str2)
        } else {
            gcdOfStrings(str2.replaceFirst(str1, ""), str1)
        }
    }
}
