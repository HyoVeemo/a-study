/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun recur(node: TreeNode): Int{
        var count: Int = 1
        if(node.left != null){
            count += recur(node.left)
        }

        if(node.right != null){
            count += recur(node.right)
        }
        return count
    }
    fun countNodes(root: TreeNode?): Int {
        if(root == null){
            return 0
        }
        return recur(root)
    }
}