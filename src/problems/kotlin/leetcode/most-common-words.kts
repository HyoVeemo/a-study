    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val words = paragraph.replace("\\W+".toRegex(), " ").lowercase(Locale.getDefault()).trim().split(" ")
        val hashs = hashMapOf<String, Int>()
        words.forEach { it ->
            var filtered = it.lowercase()
            if (!banned.any { ban -> ban == it }) {
                hashs.set(filtered, hashs.getOrDefault(filtered, 0) + 1)
            }
        }

//        println("!!!!!!!!!!!!!!!!")
//        println(hashs)

        return hashs.maxBy { it.value }.key
    }
