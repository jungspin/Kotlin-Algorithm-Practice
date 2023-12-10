
fun main() {
    /**
     * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
     * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
     * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
     */
    print(solution2(626331))

}

fun solution(num: Int): Int {
    if (num == 1) return 0

    var count = 0

    var number: Long = num.toLong()

    while (number != 0L) {
        if (count > 500) break

        if (number % 2 == 0L)  number /= 2
        else number = number * 3 + 1

        count++

        if (number == 1L) break
        println(number)
    }

    return if (number != 1L) -1 else count

}

fun solution2(num: Int): Int = process(num.toLong(), 0)

tailrec fun process(num: Long, count: Int): Int {
    return when {
        count > 500 -> -1
        num == 1L -> 0
        else -> process(
            num = if (num % 2 == 0L) num / 2 else num * 3 + 1,
            count = count + 1
        )
    }
}
