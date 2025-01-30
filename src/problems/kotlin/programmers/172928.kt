class Solution {
//    fun solution(park: Array<String>, routes: Array<String>): IntArray {
//        val w = park.size
//        val h = park[0].split("").size
//        var directionMap = mapOf(
//            "E" to intArrayOf(0,1),
//            "W" to intArrayOf(0,-1),
//            "S" to intArrayOf(1,0),
//            "N" to intArrayOf(-1,0),
//        )
//        var location = intArrayOf(0, 0)
//        for( i in 0..routes.size-1){
//            var routeArray = routes[i].split(" ")
//
//            if((directionMap.get(routeArray[0]) == null){
//                continue
//            }
//            var direction = if (directionMap.get(routeArray[0]) != null) directionMap.get(routeArray[0]) else intArrayOf(0,0)
//
//            var newDirection = intArrayOf(ifdirection[0].toInt())
//            direction?.map{ i.toInt() * routeArray[1].toInt() }
//
//            if(location[0] + newDirection[0] <0 ||location[1]+ newDisrection[1]<0){
//                // 공원 벗어남
//                continue
//            }
//
//            if(location[0] +newDirection[0]>h-1 || location[1] +newDirection[1]<w-1){
//                // 공원 벗어남
//                continue
//            }
//
//            location[0] += newDirection[0]
//            location[1] += newDirection[1]
//
//        }
//
//
//        var answer: IntArray = intArrayOf()
//        return answer
//    }

    fun solution2(num: Int, total: Int): IntArray {
        var answer = emptyList<Int>()
        // 초기화
        for(i in 0..num) {
            answer = answer.plus(total-i)
        }
        // 배열의 합이 total 이 될때까지 배열을 1감소시키고 다시 합쳐봄
        println(answer.sum())
        while(answer.sum() == total){
            answer = answer.map { i -> i-1 }
        }
        return answer.sorted().toIntArray()
    }
    fun solution3(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in 1 .. k){
            println(i);
            if (answer.size < k){
                answer.plus(score)
            }
        }
        return answer.toIntArray()
    }
}
//println(solutions.solution(arrayOf("SOO","OOO","OOO"), arrayOf("E 2","S 2","W 1")))
//println(solutions.solution2(3,12).toString()