package slidingWindow

fun longestSubstringWithDistinctCharacters(string: String, k: Int): Int{
    val charactersUsing = hashMapOf<Char, Int>()
    var startCharPos: Int = 0
    var maxLength: Int = 0
    var currentLength: Int = 0
    for (endCharPos in string.indices){
        val endChar = string[endCharPos]
        charactersUsing.put(endChar, charactersUsing.getOrDefault(endChar, 0) + 1)
        while (charactersUsing.size > k) {
            val startChar = string[startCharPos]
            charactersUsing.put(startChar, charactersUsing.get(startChar)?.minus(1) ?: 0)
            if (charactersUsing.get(startChar) == 0) {
                charactersUsing.remove(startChar)
            }
            startCharPos++
        }
        currentLength = endCharPos - startCharPos + 1
        if (maxLength < currentLength) {
            maxLength = currentLength
        }
    }
    return maxLength
}


