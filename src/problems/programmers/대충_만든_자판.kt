class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        for(str in targets){
            var count = 0;
            var flag = 1;
            for(char in str){
                var index: Int? = null ;
                for(key in keymap){
                    var keymapIndex = key.indexOf(char)
//                    println("${char}, ${keymap.contentToString()} , ${keymapIndex}")
                    if(keymapIndex < 0){
                        continue
                    }
                    if(index == null){
                        index = keymapIndex +1
                    }
                    if(index !== null && index > keymapIndex){
                        index = keymapIndex +1
                    }
                }
                count += index ?: 0
                if(index == null){
                    flag= 0
                }
            }

            if(count > 0 && flag == 1 ) answer += count else answer += -1

//            println("count: ${count}")

        }

        return answer
    }
}