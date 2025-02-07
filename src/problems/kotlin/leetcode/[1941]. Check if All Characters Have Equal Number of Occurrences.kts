class `1941` {
    fun areOccurrencesEqual(s: String): Boolean {
        val chars = s.toSet()
        val occurrences = hashMapOf<Char, Int>()
        for (i in chars.indices) {
            occurrences.put(s.get(i), occurrences.getOrDefault(i, 0) + 1)
        }

        return occurrences.values.toSet().size == 1
    }
}