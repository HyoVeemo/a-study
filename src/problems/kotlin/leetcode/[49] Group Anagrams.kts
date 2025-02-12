// 아이디어:  sort 한 후 결과를 key 로 hash 에 넣은 다음에 리스트로 다시 풀기
class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = hashMapOf<String, MutableList<String>>()
        strs.forEach { it ->
            val sorted = it.toCharArray().sorted().toString()
            val existing = hashMap.getOrDefault(sorted, mutableListOf())
            existing.add(it)
            hashMap.set(sorted, existing)

        }
        return hashMap.values.toList()
    }
}

val solution = Solution()
println(solution.groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")))