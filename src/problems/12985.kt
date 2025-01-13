package problems

/** https://school.programmers.co.kr/learn/courses/30/lessons/12985 */
//
class `12985` {
    fun solution(n: Int, a: Int, b: Int): Int {
        var mokA: Int = a - 1
        var mokB: Int = b - 1
        var count: Int = 0

        // 결승에서 만날 때 A == B
        while (mokA != mokB) {
            // 다음 라운드에서는 2의 몫의 번호를 가지게 된다.
            mokA = mokA / 2
            mokB = mokB / 2
            // 라운드 증가
            count ++
        }
        return count
    }
}