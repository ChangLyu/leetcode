package easy.BinaryTree;

public class ReverseBinaryTree {
	 public TreeNode invertTree(TreeNode root) {
	        
	        if(root==null){
	            return root;
	        }else{
	        TreeNode temp= root.left;
	        root.left=invertTree(root.right);
	        root.right=invertTree(temp);
	        
	        return root;
	        }
	        
	    }
}
