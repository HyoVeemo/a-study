// 아이디어: 전부 lowerCase, replace 로 정리하고 비교하면 시간이 오래 걸릴 것
// 앞 인덱스와 뒤 인덱스를 유지하면서 문자열이 아닐 때 한칸 앞으로 이동하고 가운데에서 만날 때 까지 진행한다.
class Solution125 {
    fun isPalindrome(s: String): Boolean {
        var firstIndex = 0
        var lastIndex = s.length - 1

        while (firstIndex != lastIndex && firstIndex < s.length && lastIndex > 0) {
            val firstLetter: Char = s.get(firstIndex)
            println("firstLetter: $firstLetter, index: $firstIndex")

            val lastLetter: Char = s.get(lastIndex)
            println("lastLetter: $lastLetter, index: $lastIndex")
            println(lastLetter)
            when {
                !Character.isLetterOrDigit(firstLetter) -> firstIndex++
                !Character.isLetterOrDigit(lastLetter) -> lastIndex--
                else -> {
                    if (Character.toLowerCase(firstLetter).equals(Character.toLowerCase(lastLetter))) {
                        firstIndex++
                        lastIndex--
                        continue
                    } else {
                        return false
                    }
                }
            }
        }
        return true
    }
}

val solution = Solution125()
solution.isPalindrome("aa")
// troubleshooting
// 1.firstIndex, lastIndex 가 배열 크기를 벗어남