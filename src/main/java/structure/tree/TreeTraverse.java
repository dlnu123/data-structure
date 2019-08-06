package structure.tree;

import java.util.Stack;

/**
 * @Description
 * @Author wangliang
 * @Created 2019-08-02 16:33
 * @Version 1.0
 */
public class TreeTraverse {

    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(4, null, null);
        TreeNode treeNode5 = new TreeNode(5, null, null);
        TreeNode treeNode6 = new TreeNode(6, null, null);
        TreeNode treeNode7 = new TreeNode(7, null, null);

        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
        TreeNode treeNode3 = new TreeNode(3, treeNode6, treeNode7);

        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode3);

        System.out.print("前序遍历结果（递归版）：");
        preRecursive(treeNode1);
        System.out.println();
        System.out.print("前序遍历结果（非递归）：");
        preNotRecursive(treeNode1);
        System.out.println("\n");
        System.out.print("中序遍历结果（递归版）：");
        midRecursive(treeNode1);
        System.out.println();
        System.out.print("中序遍历结果（非递归）：");
        midNotRecursive(treeNode1);
        System.out.println("\n");
        System.out.print("后序遍历结果（递归版）：");
        postRecursive(treeNode1);
        System.out.println();
        System.out.print("后序遍历结果（非递归）：");
        postNotRecursive(treeNode1);
    }

    /**
     * 前序遍历(递归版)
     * @param root
     */
    private static void preRecursive(TreeNode root) {
        System.out.print(root.getData() + "  ");
        if (root.getLeft() != null) {
            preRecursive(root.getLeft());
        }
        if (root.getRight() != null) {
            preRecursive(root.getRight());
        }
    }

    /**
     * 前序遍历(非递归版)
     * @param root
     */
    private static void preNotRecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root == null) {
            return;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            System.out.printf(treeNode.getData() + "  ");
            if (treeNode.getRight() != null) {
                stack.push(treeNode.getRight());
            }
            if (treeNode.getLeft() != null) {
                stack.push(treeNode.getLeft());
            }
        }
    }

    /**
     * 中序遍历(递归版)
     * @param root
     */
    private static void midRecursive(TreeNode root) {
        if (root.getLeft() != null) {
            midRecursive(root.getLeft());
        }
        System.out.print(root.getData() + "  ");
        if (root.getRight() != null) {
            midRecursive(root.getRight());
        }
    }

    /**
     * 中序遍历(非递归版)
     * @param root
     */
    private static void midNotRecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root == null) {
            return;
        }

        stack.push(root);
        TreeNode temp = root;
        while (!stack.isEmpty()) {
            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
                temp = temp.getLeft();
            } else {
                temp = stack.pop();
                System.out.print(temp.getData() + "  ");
                if (temp.getRight() != null) {
                    stack.push(temp.getRight());
                    temp = temp.getRight();
                }
            }
        }
    }

    /**
     * 后序遍历(递归版)
     * @param root
     */
    private static void postRecursive(TreeNode root) {
        if (root.getLeft() != null) {
            postRecursive(root.getLeft());
        }
        if (root.getRight() != null) {
            postRecursive(root.getRight());
        }
        System.out.print(root.getData() + "  ");
    }

    /**
     * 后序遍历(非递归版)
     * @param root
     */
    private static void postNotRecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root == null) {
            return;
        }

        stack.push(root);
        while (!stack.isEmpty()) {
            if (root.getLeft() != null) {

            }
        }
    }
}
