package problems.programmers

import java.util.*



class `154539` {
    /**
     * Number 를 순회 하면서 해당 index 보다 큰 수가 있으면 그 중에 가장 큰 수를 배열에 추가하고 없으면 -1를 추가한다
     *  max 는 index 수 , max 가 index 수보다 같거   나 작으면 -1, it 이 max 보다 크면 교체
     *  시간 초과로 이 방법으로 접근하면 안된다
     */
//    fun solution(numbers: IntArray): IntArray {
//        var answer: IntArray = intArrayOf()
//        var maxIndex = numbers.size - 1
//
//        for( i in 0 until maxIndex){
//            for (j in i+1 ..maxIndex){
//                if(numbers[j] > numbers[i]) {
//                    if(answer.size < i+1 ) answer += numbers[j]
//                    break
//                }
//            }
//            if (answer.size < i+1 ) answer += -1
//        }
//
//        answer += -1
//        return answer
//    }
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size)

        val stack = Stack<Int>()
        answer[numbers.size-1] = -1

        for (i in numbers.size - 2 downTo 0) {
//            println("i= ${i}")
            if (numbers[i] < numbers[i + 1]) // 바로 옆 숫자보다 현재 숫자가 크면
            {
//                println("BIGGER found, i:$i, j:${i+1}, val: ${numbers[i]}, val+: ${numbers[i+1]}")
                // 가까운 큰 수가 있음
                stack.push(numbers[i+1])
                answer[i] = numbers[i+1]
            } else {
                var isFound = false
                while(stack.isNotEmpty()){
//                println("i: $i, stack: ${stack.toString()}")
                    val now = stack.peek()
                    if(now > numbers[i]){

//                        println("ANSWER FOUND, i: $i, stack: ${stack.toString()}")
                        answer[i]=  now
                        isFound = true
                        break
                    } else{
                        stack.pop()
                    }
                }

//                println("NOT FOUND, i: $i, stack: ${stack.toString()}")
                if(!isFound) answer[i] =  -1
            }

        }
        return answer
    }
}