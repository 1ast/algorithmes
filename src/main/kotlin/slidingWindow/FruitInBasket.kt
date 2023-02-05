package slidingWindow

fun fruitInBasket(fruitTree: CharArray, numOfBasket: Int): Int{
    var maxLength = -1
    val currentMap = hashMapOf<Char, Int>()
    for (end in fruitTree.indices){
        if (!currentMap.containsKey(fruitTree[end]) && end > numOfBasket-1){
            val start = end-numOfBasket
            currentMap.remove(fruitTree[start])
        }
            currentMap[fruitTree[end]] = currentMap.getOrDefault(fruitTree[end], 0)+1
        maxLength = currentMap.values.sum().coerceAtLeast(maxLength)
    }
    return maxLength
}