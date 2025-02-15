class `Palindrome Number` {
    fun isPalindrome(x: Int): Boolean {
        var xx = x
        if(x<0){
            return false
        }else if(x==0) {
            return true
        }else{
            val digits = mutableListOf<Int>()
            while( xx > 0) {
               digits += xx%10
               xx = xx/10
            }
            // println(digits.toString())
            for( i in 0 until digits.size/2){
                // println(i)
                if(digits[i] != digits[digits.size - 1-i]){
                    return false
                }
            }
            return true
        }
    }
}
