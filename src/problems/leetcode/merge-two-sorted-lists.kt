
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 * dummy pointer 를 활용해서 해결한다.
 */
class Solution {
    fun mergeTwoLists( l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        var headNode: ListNode = ListNode(0)
        var cur = headNode


        while (list1 != null && list2 != null){
            if(list1.`val` <= list2.`val`) {
                cur.next = list1
                list1 = list1.next
            }
            else  {
                cur.next = list2
                list2 = list2.next
            }
            cur = cur.next

        }


        if(list1 != null) cur.next = list1
        if(list2 != null) cur.next = list2
        return headNode.next
    }
}