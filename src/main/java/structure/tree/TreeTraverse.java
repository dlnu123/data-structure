package structure.tree;

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

        System.out.print("前序遍历结果：");
        pre(treeNode1);
        System.out.println();
        System.out.print("中序遍历结果：");
        mid(treeNode1);
        System.out.println();
        System.out.print("后序遍历结果：");
        last(treeNode1);
    }

    /**
     * 前序遍历
     * @param root
     */
    private static void pre(TreeNode root) {
        System.out.print(root.getData() + "  ");
        if (root.getLeft() != null) {
            pre(root.getLeft());
        }
        if (root.getRight() != null) {
            pre(root.getRight());
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    private static void mid(TreeNode root) {
        if (root.getLeft() != null) {
            mid(root.getLeft());
        }
        System.out.print(root.getData() + "  ");
        if (root.getRight() != null) {
            mid(root.getRight());
        }
    }

    /**
     * 后序遍历
     * @param root
     */
    private static void last(TreeNode root) {
        if (root.getLeft() != null) {
            last(root.getLeft());
        }
        if (root.getRight() != null) {
            last(root.getRight());
        }
        System.out.print(root.getData() + "  ");
    }
}
