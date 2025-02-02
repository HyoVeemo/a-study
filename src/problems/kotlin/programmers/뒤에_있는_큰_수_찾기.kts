import java.util.Stack

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size)

        val stack = Stack<Int>()
        answer[numbers.size - 1] = -1

        for (i in numbers.size - 2 downTo 0) {
//            println("i= ${i}")
            if (numbers[i] < numbers[i + 1]) // 바로 옆 숫자보다 현재 숫자가 크면
            {
//                println("BIGGER found, i:$i, j:${i+1}, val: ${numbers[i]}, val+: ${numbers[i+1]}")
                // 가까운 큰 수가 있음
                stack.push(numbers[i + 1])
                answer[i] = numbers[i + 1]
            } else {
                var isFound = false
                while (stack.isNotEmpty()) {
//                println("i: $i, stack: ${stack.toString()}")
                    val now = stack.peek()
                    if (now > numbers[i]) {

//                        println("ANSWER FOUND, i: $i, stack: ${stack.toString()}")
                        answer[i] = now
                        isFound = true
                        break
                    } else {
                        stack.pop()
                    }
                }

//                println("NOT FOUND, i: $i, stack: ${stack.toString()}")
                if (!isFound) answer[i] = -1
            }

        }
        return answer
    }
}