package structure.tree;

/**
 * @Description
 * @Author wangliang
 * @Created 2019-08-02 10:56
 * @Version 1.0
 */
public class TreeNode {

    // 结点数据
    private int data;
    // 左结点
    private TreeNode left;
    // 右结点
    private TreeNode right;

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
