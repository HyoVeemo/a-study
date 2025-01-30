package problems.programmers
import java.util.*

fun isValid(s: String): Boolean {
    var stack = Stack<String>()

    if(s.first().toString() == "}" || s.first().toString() == ")" || s.first().toString() == "]") return false

    for (char in s) {
        if ((char.toString() == "[" || char.toString() == "{" || char.toString() == "(")) stack.push(char.toString())
        if (stack.isNotEmpty() && ((char.toString() == "]" && stack.peek() == "[") || (char.toString() == ")" && stack.peek() == "(") || (char.toString() == "}" && stack.peek() == "{"))) stack.pop()
    }

    return stack.isEmpty()
}

fun rotate(s: String): String {
    return s.substring(1) + s.first()
}

class `76502` {
    fun solution(s: String): Int {
        var newStr = s;
        var count: Int = 0;
//        println(isValid(newStr))

        for (i in 0..s.length - 1) {
            if (isValid(newStr)) count++
            newStr = rotate(newStr)
        }

        return if (count > s.length) 0 else count
    }
}
