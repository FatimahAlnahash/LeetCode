class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged = ""
        c1=0
        c2=0
        while (c1 < len(word1) or c2 < len(word2)) :
            if c1 < len(word1) and c2 < len(word2) :
                merged = merged + word1[c1] + word2[c2]
                print("here1 " + str(c1) + ", " + str(c2))
                print("merged1: "+ merged)
            elif c1 < len(word1) and c2 >= len(word2) :
                letter1 = c1
                merged = merged + word1[letter1:]
                print ("merged2: " + merged)
                print("here2 " + str(c1) + ", " + str(c2))
                break
            elif c1 >= len(word1) and c2 < len(word2) :
                letter2 = c2
                merged = merged + word2[letter2:]
                print ("merged3: " + merged)
                print("here3 " + str(c1) + ", " + str(c2))
                break
            c1=c1+1
            c2=c2+1

        return merged

    str = mergeAlternately("cefee", "cf","eee")
    print(str)
