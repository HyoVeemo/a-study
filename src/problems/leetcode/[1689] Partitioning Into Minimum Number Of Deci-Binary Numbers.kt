package problems.leetcode

class `Partitioning Into Minimum Number Of Deci-Binary Numbers` {
        fun minPartitions(n: String): Int {
            val chars = n.toCharArray()

            var max = '0'
            chars.forEach{ it ->
                if(max.code < it.code) max = it
                if(max == '9') return max.code - '0'.code
            }
            return max.code - '0'.code
        }
 }