class `reorder-logs` {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
        val pair = logs.partition { str ->
            str.split(' ').get(1).get(0).isDigit()
        }

        // 문자열
        val letter = pair.second.sortedWith(
            Comparator { s1: String, s2: String ->
                val s1AfterSpace = s1.split(" ", limit = 2)
                val s2AfterSpace = s2.split(" ", limit = 2)
                val result = s1AfterSpace[1].compareTo(s2AfterSpace[1])
                if (result == 0) {
                    s1AfterSpace[0].compareTo(s2AfterSpace[0])
                } else {
                    result
                }
            }
        ).toMutableList()

        letter.addAll(pair.first)
        return letter.toTypedArray()

    }
}

val solution = `reorder-logs`()
println(
    solution.reorderLogFiles(
        listOf("dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero").toTypedArray<String>()
    ).contentToString()
)
