


// 재귀함수로 새로 여는 것과 닫는것의 경우의 수를 모두 탐색해본다
// 3
//  (
//  ((      ()
// (()  (()
// (((   (()) (()(
//

class Solution22 {
    fun recursive (target: Int, leftCount: Int, rightCount: Int, vals: String): List<String>{
        val list = mutableListOf<String>()
        if(leftCount == target && leftCount-rightCount == 0){
            return listOf(vals)
        }

        else {
            if(leftCount == target){
                list+= recursive(target, leftCount, rightCount+1, vals + ")" )
            }
            else{
                list+= recursive(target, leftCount+1, rightCount, vals+"(")
                if(leftCount >rightCount){
                    list+= recursive(target, leftCount, rightCount+1, vals + ")")
                }
            }
        }
        return list
    }

    fun generateParenthesis(n: Int): List<String> {
        return recursive(n, 1, 0, "(")
    }

}