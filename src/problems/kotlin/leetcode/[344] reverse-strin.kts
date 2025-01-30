class `ReverseString` {
    fun reverseString(s: CharArray): Unit {
        println(s.size)
        for (i in 0 until s.size / 2) {
            println(i)
            val temp = s[i]
            s[i] = s[s.size - 1 - i]
            s[s.size - 1 - i] = temp
        }
        println(s)
    }
}

val solution = ReverseString()

solution.reverseString(
    charArrayOf(
        'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a',
        'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'
    )
)
