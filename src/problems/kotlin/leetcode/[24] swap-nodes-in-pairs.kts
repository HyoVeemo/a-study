class ListNode(var `val`: Int) { var next: ListNode? = null }
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution24 {

    fun recur(parent: ListNode){
        val first = parent.next
        val second = parent.next.next
        val third = parent.next.next.next

        first.next = third
        second.next = first
        parent.next = second
        if(first.next?.next != null){
            recur(first)
        }

    }
    fun swapPairs(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head
        if(dummy.next?.next != null){
            recur(dummy)
        }

        return dummy.next
    }
}