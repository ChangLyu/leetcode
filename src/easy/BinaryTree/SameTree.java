package easy.BinaryTree;
//Given two binary trees, write a function to check if they are equal or not.
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null&&q!=null||p!=null&&q==null)return false;
        if(p.val==q.val)
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        return false;
       }
}
