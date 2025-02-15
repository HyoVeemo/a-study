/**
 * 덧셈하여 타겟을 만들 수 있는 두 숫자의 인덱스를 반환한다.
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            map[nums[i]] = i
        }

        for (i in nums.indices) {
            val complement = target - nums[i] // 보수
            // hint!: hashMap 에는 for문의 순서 상 겹치는 숫자가 있으면 뒤에 저장됨
            if (map.containsKey(complement) && map[complement] != i) {
                return intArrayOf(i, map[complement]!!)
            }
        }
        // In case there is no solution, return an empty array
        return intArrayOf()
    }
}

val solution = Solution()
val result = solution.twoSum(intArrayOf(1, 3, 3), 6)
println("two sums")
println(result.contentToString())