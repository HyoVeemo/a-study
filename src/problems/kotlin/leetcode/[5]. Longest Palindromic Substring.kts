//5. Longest Palindromic Substring
// 아이디어 : 2중 for 문
// 하나는 시작점의 알파벳을 기억하고 마지막까지 가면서 본인으로 끝나는 palindrom 을 찾는다
// palindrom 을 판별하는 기준은 deque 에 쌓은 문자열을 1개 혹은 0 개 남을 때까지 양쪽에서 빼내서 동일한 것
// 찾으면, palindrom 을 그 알파벳만 남기고 substring 을 따로 저장해놓고.
// 전체 문자열에서 palindrom 을 양끝 알파벳(1개) 로 교체한다.
// 1차 for문이 끝나면 인덱스를 하나 증가 시킨다....
//class Solution {
//    fun longestPalindrome(s: String): String {
//        var index = 0
//        while (index < s.length) {
//            val deque = ArrayDeque<Char>()
//            println("outer: ${s.get(index)}")
//            deque.add(s[index])
//            for (i in index + 1 until s.length) {
//                deque.add(s[i])
//                if (s[i].equals(s[index])) {
//                    val copy = deque.map { }
//                }
//            }
//            println(index)
//            index++
//        }
//        return s
//    }
//}

class Solution {
    var maxlen = 0
    var leftIndex = 0

    fun extend(s: String, left: Int, right: Int): Unit {
        var varLeft = left
        var varRight = right
        while (varLeft >= 0 && varRight < s.length && s.get(varLeft) == s.get(varRight)) {
            varLeft--
            varRight++
        }

        if (maxlen < varRight - varLeft - 1) {
            maxlen = varRight - varLeft - 1
            leftIndex = varLeft
        }
        return
    }

    fun longestPalindrome(s: String): String {
        if (s.length <= 1) return s
        for (i in 0 until s.length - 1) {
            extend(s, i, i + 1) // 2칸 짜리
            extend(s, i, i + 2) // 3칸 짜리
        }

//        println(leftIndex)
        return s.substring(
            leftIndex + 1, leftIndex + 1 + maxlen
        )
    }
}


val solution = Solution()
val result = solution.longestPalindrome("bb")
println(result)