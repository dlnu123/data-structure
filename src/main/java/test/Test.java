package test;

import structure.tree.TreeNode;

import java.util.Stack;

/**
 * @Description
 * @Author wangliang
 * @Created 2019-08-06 14:37
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(null);
        System.out.println(stack.isEmpty());
    }
}
