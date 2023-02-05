package slidingWindow

fun smallestSubArrayGivenSum(array: IntArray, s: Int): Int {
    var startElement: Int
    var currentSum: Int = 0
    var minLength: Int = 0
    for (endElement in array.indices) {
        if (currentSum > s){
            startElement = array[endElement-minLength]
            currentSum-=startElement
            minLength--
        } else {
            minLength++
        }
        currentSum += array[endElement]
    }
    return minLength
}