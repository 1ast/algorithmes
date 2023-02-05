package slidingWindow

fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
    var currentSum = 0
    var result = 0
    for(endNum in arr.indices){
        currentSum += arr[endNum]
        if (endNum >= k-1){
            if (endNum-k > -1) {
                val startNum = endNum - k
                currentSum -= arr[startNum]
            }
            val currentAverage: Double = currentSum/(k).toDouble()
            if(currentAverage >= threshold.toDouble()){
                result++
            }
        }
    }
    return result
}