class `ReverseString` {
    fun reverseString(s: CharArray): Unit {
        for (i in 0 until s.size / 2) {
            s[i] = s[s.size - 1 - i].also { s[s.size - 1 - i] = s[i] }
        }
    }
}

val solution = ReverseString()

solution.reverseString(
    charArrayOf(
        'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a',
        'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'
    )
)
