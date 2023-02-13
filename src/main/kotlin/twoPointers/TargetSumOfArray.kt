fun targetSumOfArray(array: IntArray, target: Int): IntArray {
    var startPointer = 0
    var endPointer: Int = array.size - 1
    while (startPointer < endPointer) {
        if (array[endPointer] + array[startPointer] == target) {
            return intArrayOf(startPointer, endPointer)
        }
        if (array[endPointer] + array[startPointer] > target) {
            endPointer--
        } else {
            startPointer++
        }
    }
    return intArrayOf(-1, -1)
}