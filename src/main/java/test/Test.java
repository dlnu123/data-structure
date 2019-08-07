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

        /**
         * 在不借助第三个变量的情况下，如何交换两个数字？
         */
        int a = 2;
        int b = 3;
        // 通过简单的加减运算（这种方法有个问题，如果a、b非常大，两个数相加之后会超出int的范围）
//        a = a + b;
//        b = a - b;
//        a = a - b;

        // 通过异或位运算（不用担心超出int范围的问题）
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
