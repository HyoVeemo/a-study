/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var diameterOfBinaryTree = function (root) {
    // 아이디어: 하위 그래프의 left, right 높이를 기록한다.
    // 가장 큰 left + right 가 해당 그래프의 지름이다.
    // 어떻게 기록 할거냐면... 재귀 할때 해당 함수에 지역 변수로 저장
    let max = 0

    const recur = function (node) {
        if (node == null) {
            return 1
        }

        let left = 0
        let right = 0
        if (node.left) {
            left = recur(node.left)
        }
        if (node.right) {
            right = recur(node.right)
        }
        if (max < left + right) { max = left + right }

        return (left > right ? left : right) + 1
    }

    recur(root)

    return max
};