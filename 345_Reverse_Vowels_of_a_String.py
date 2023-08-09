class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ['a','e','i','o','u', 'A', 'E', 'I','O','U']
        letters = []
        index = []
        sList = list(s)
        size = len(sList)
        for i in range(0, size):
            if vowels.count(sList[i]) > 0 : 
                letters.append(sList[i])

        results = []
        counter = len(letters)-1

        for y in range(0, size):
            if sList[y] in vowels:
                results.append(letters[counter])
                counter = (counter - 1)
            else:
                results.append(sList[y])
        mystring=''
        for x in results:
            mystring+=x
        return str(mystring)
