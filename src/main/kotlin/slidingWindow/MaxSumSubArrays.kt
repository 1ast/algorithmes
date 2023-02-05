package slidingWindow

fun maxSumOfSubArrays(array: IntArray, k: Int): Int{
    var maxSum = 0
    var nowSum = 0
    var startElement: Int
    for (endElement in array.indices){
        nowSum += array[endElement]
        if (endElement > k-1) {
            startElement = array[endElement-k]
            nowSum -= startElement
        }
        if (maxSum < nowSum) {
            maxSum = nowSum
        }
    }
    return maxSum
}