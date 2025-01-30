class `find-the-prefix-common-array-of-two-arrays.kts` {
    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        val resultArray = IntArray(A.size)
        for( i in 0 until A.size){
            // println("i: ${A[i]}")
            for( j in 0 .. i){
                for(x in  0..i){
                    // println("j: ${B[j]}")
                    if(A[j] == B[x]){
                        resultArray[i]+=1
                    }

                }
            }
        }
        return resultArray
    }
}